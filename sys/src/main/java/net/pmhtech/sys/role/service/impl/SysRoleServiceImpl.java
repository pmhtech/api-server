package net.pmhtech.sys.role.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import net.pmhtech.sys.role.dao.SysRoleDAO;
import net.pmhtech.sys.role.dao.SysRoleLocaleDAO;
import net.pmhtech.sys.role.dao.SysRolePageDAO;
import net.pmhtech.sys.role.domain.SysRole;
import net.pmhtech.sys.role.domain.SysRoleLocale;
import net.pmhtech.sys.role.domain.SysRolePage;
import net.pmhtech.sys.role.service.SysRoleService;
import net.pmhtech.sys.seq.service.SysSequenceService;
import net.pmhtech.util.CollectionUtils;

@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService{

	@Resource(name="sysRoleDAO")
	private SysRoleDAO sysRoleDAO;
	
	@Resource(name="sysRoleLocaleDAO")
	private SysRoleLocaleDAO sysRoleLocaleDAO;
	
	@Resource(name="sysRolePageDAO")
	private SysRolePageDAO sysRolePageDAO;
	
	@Resource(name="sysSequenceService")
	private SysSequenceService sysSequenceService;

	@Override
	public List<Map<String, ?>> selectSysRole(Map<String, ?> paramMap) throws Exception {

		List<Map<String, ?>> sysRoles =  sysRoleDAO.selectList(paramMap);
		List<Map<String, ?>> localeList =  sysRoleDAO.selectLocaleList(paramMap);
		
		for(Map hashMap : sysRoles){
			String ROLE_ID = (String) hashMap.get("ROLE_ID");
			List<Map<String, ?>> tempList = CollectionUtils.getMatchedKey(localeList, "ROLE_ID", ROLE_ID);
			
			Map<String,Object> localeMap = new HashMap<String,Object>();
			
			for(Map map : tempList){
				localeMap.put((String) map.get("LOCALE_CD"),map);
			}
			hashMap.put("LANGUAGE", localeMap);
			
		}
		return sysRoles;
	}

	@Override
	public List<Map<String, ?>> selectSysRolePage(Map<String, ?> paramMap) throws Exception {
		return sysRolePageDAO.selectList(paramMap);
	}
	

	@Override
	public int createSysRole(Map<String, ?> sysRoleMap, List<Map<String, ?>> listSysRoleLocale,
			List<Map<String, ?>> listSysRolePage) throws Exception {

		
		SysRole sysRole = new SysRole();
		BeanUtils.copyProperties(sysRole, sysRoleMap);
		String ROLE_ID = sysSequenceService.getSequence(sysRole);
		
		sysRole.setROLE_ID(ROLE_ID);
		int count = sysRoleDAO.update(sysRole);
		
		
		for(Map<String,?> tempMap :listSysRoleLocale){
			SysRoleLocale sysRoleLocale = new SysRoleLocale();
			BeanUtils.copyProperties(sysRole, tempMap);
	
			sysRoleLocaleDAO.update(sysRoleLocale);
		}
		
		sysRolePageDAO.delete(sysRoleMap);
		
		for(Map<String,?> tempMap :listSysRolePage){
			SysRolePage sysRolePage = new SysRolePage();
			BeanUtils.copyProperties(sysRole, tempMap);
			sysRolePageDAO.insert(sysRolePage);
		}
		return count;
	}

	@Override
	public int modifySysRole(Map<String, ?> sysRoleMap, List<Map<String, ?>> listSysRoleLocale,
			List<Map<String, ?>> listSysRolePage) throws Exception {
		SysRole sysRole = new SysRole();
		BeanUtils.copyProperties(sysRole, sysRoleMap);
		
		int count = sysRoleDAO.insert(sysRole);
		
		
		for(Map<String,?> tempMap :listSysRoleLocale){
			SysRoleLocale sysRoleLocale = new SysRoleLocale();
			BeanUtils.copyProperties(sysRole, tempMap);
			sysRoleLocaleDAO.insert(sysRoleLocale);
		}
		
		for(Map<String,?> tempMap :listSysRolePage){
			SysRolePage sysRolePage = new SysRolePage();
			BeanUtils.copyProperties(sysRole, tempMap);
			sysRolePageDAO.insert(sysRolePage);
		}
		return count;
	}

	@Override
	public List<Map<String, ?>> removeSysRole(Map<String, ?> paramMap) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
