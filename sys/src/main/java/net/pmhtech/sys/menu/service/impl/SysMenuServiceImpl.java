package net.pmhtech.sys.menu.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import net.pmhtech.sys.menu.dao.SysMenuCodeDAO;
import net.pmhtech.sys.menu.dao.SysMenuDAO;
import net.pmhtech.sys.menu.dao.SysMenuLocaleDAO;
import net.pmhtech.sys.menu.domain.SysMenu;
import net.pmhtech.sys.menu.domain.SysMenuCode;
import net.pmhtech.sys.menu.domain.SysMenuLocale;
import net.pmhtech.sys.menu.service.SysMenuService;
import net.pmhtech.util.CollectionUtils;

@Service("sysMenuService")
public class SysMenuServiceImpl implements SysMenuService{

	@Resource(name = "sysMenuDAO")
	private SysMenuDAO sysMenuDAO;
	
	@Resource(name="sysMenuCodeDAO")
	private SysMenuCodeDAO sysMenuCodeDAO;
	
	@Resource(name="sysMenuLocaleDAO")
	private SysMenuLocaleDAO sysMenuLocaleDAO;
	

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		
		List<Map<String, ?>> sysMenus =  sysMenuDAO.selectList(paramMap);
		List<Map<String, ?>> localeList =  sysMenuDAO.selectLocaleList(paramMap);
		
		for(Map hashMap : sysMenus){
			String MENU_ID = (String) hashMap.get("MENU_ID");
			List<Map<String, ?>> tempList = CollectionUtils.getMatchedKey(localeList, "MENU_ID", MENU_ID);
			
			Map<String,Object> localeMap = new HashMap<String,Object>();
			
			for(Map map : tempList){
				localeMap.put((String) map.get("LOCALE_CD"),map);
			}
			hashMap.put("LANGUAGE", localeMap);
			
		}
		return sysMenus;
	}

	@Override
	public int createSysMenu(Map<String, ?> sysMenuMap, List<Map<String, ?>> listSysMenuLocales,
		List<Map<String, ?>> listSysMenuCodes) throws Exception {
		SysMenu sysMenu = new SysMenu();
		BeanUtils.copyProperties(sysMenu, sysMenuMap);
		
		int count = sysMenuDAO.insert(sysMenu);
		sysMenuCodeDAO.delete(sysMenuMap);
		
		for(Map<String,?> map : listSysMenuCodes){
			SysMenuCode sysMenuCode = new SysMenuCode();
			BeanUtils.copyProperties(sysMenuCode, map);
			sysMenuCodeDAO.insert(sysMenuCode);
		}
		
		for(Map<String,?> map : listSysMenuLocales){
			SysMenuLocale sysMenuLocale = new SysMenuLocale();
			BeanUtils.copyProperties(sysMenuLocale, map);
			sysMenuLocaleDAO.insert(sysMenuLocale);
		}
		
		return count;
	}
	

	@Override
	public int modifySysMenu(Map<String, ?> sysMenuMap, List<Map<String, ?>> listSysMenuLocales,
			List<Map<String, ?>> listSysMenuCodes) throws Exception {
		SysMenu sysMenu = new SysMenu();
		BeanUtils.copyProperties(sysMenu, sysMenuMap);
		
		int count = sysMenuDAO.update(sysMenu);
		sysMenuCodeDAO.delete(sysMenuMap);
		
		for(Map<String,?> map : listSysMenuCodes){
			SysMenuCode sysMenuCode = new SysMenuCode();
			BeanUtils.copyProperties(sysMenuCode, map);
			sysMenuCodeDAO.insert(sysMenuCode);
		}
		
		for(Map<String,?> map : listSysMenuLocales){
			SysMenuLocale sysMenuLocale = new SysMenuLocale();
			BeanUtils.copyProperties(sysMenuLocale, map);
			sysMenuLocaleDAO.update(sysMenuLocale);
		}
		
		return count;
	}
}
