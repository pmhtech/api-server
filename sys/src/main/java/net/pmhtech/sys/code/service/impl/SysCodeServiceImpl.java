package net.pmhtech.sys.code.service.impl;


import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.pmhtech.sys.code.dao.SysCodeDAO;
import net.pmhtech.sys.code.dao.SysCodeLocaleDAO;
import net.pmhtech.sys.code.domain.SysCode;
import net.pmhtech.sys.code.domain.SysCodeLocale;
import net.pmhtech.sys.code.service.SysCodeService;
import net.pmhtech.util.CollectionUtils;

@Service("sysCodeService")
@Transactional
public class SysCodeServiceImpl implements SysCodeService{

	@Resource(name = "sysCodeDAO")
	private SysCodeDAO sysCodeDAO;
	
	@Resource(name = "sysCodeLocaleDAO")
	private SysCodeLocaleDAO sysCodeLocaleDAO;


	@Override
	public int createSysCode(List<Map<String, ?>> listSysCodeLocale) throws Exception {
		
		
		Iterator<Map<String, ?>> iter =listSysCodeLocale.iterator();
		SysCode sysCode = new SysCode();
		
		BeanUtils.copyProperties(sysCode, listSysCodeLocale.get(0));
		sysCodeDAO.insert(sysCode);
		
		while(iter.hasNext()){
			Map<String,?> map = iter.next();
			
			SysCodeLocale sysCodeLocale= new SysCodeLocale();
			
			
			BeanUtils.copyProperties(sysCodeLocale, map);
			
			sysCodeLocaleDAO.insert(sysCodeLocale);
		}
		
		return 0;
	}



	@Override
	public int modifySysCode(List<Map<String, ?>> listSysCodeLocale) throws Exception {
		
		
		
		SysCode sysCode = new SysCode();
		BeanUtils.copyProperties(sysCode, listSysCodeLocale.get(0));
		sysCodeDAO.update(sysCode);
		
		Iterator<Map<String, ?>> iter =listSysCodeLocale.iterator();
		
		while(iter.hasNext()){
			Map<String,?> map = iter.next();
			SysCodeLocale sysCodeLocale= new SysCodeLocale();
			
			
			BeanUtils.copyProperties(sysCodeLocale, map);
			sysCodeLocaleDAO.update(sysCodeLocale);
		}
		
		return 0;
	}
	
	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		
		List<Map<String, ?>> sysCodes =  sysCodeDAO.selectList(paramMap);
		List<Map<String, ?>> localeList =  sysCodeDAO.selectLocaleList(paramMap);
		
		for(Map hashMap : sysCodes){
			String CODE = (String) hashMap.get("CODE");
			List<Map<String, ?>> tempList = CollectionUtils.getMatchedKey(localeList, "CODE", CODE);
			
			Map<String,Object> localeMap = new HashMap<String,Object>();
			
			for(Map map : tempList){
				localeMap.put((String) map.get("LOCALE_CD"),map);
			}
			hashMap.put("LANGUAGE", localeMap);
		}
	
		
		return sysCodes;
	}
}
