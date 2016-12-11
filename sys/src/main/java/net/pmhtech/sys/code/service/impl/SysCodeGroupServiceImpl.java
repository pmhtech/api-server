package net.pmhtech.sys.code.service.impl;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import net.pmhtech.sys.code.dao.SysCodeDAO;
import net.pmhtech.sys.code.dao.SysCodeGroupDAO;
import net.pmhtech.sys.code.dao.SysCodeLocaleDAO;
import net.pmhtech.sys.code.domain.SysCode;
import net.pmhtech.sys.code.domain.SysCodeGroup;
import net.pmhtech.sys.code.domain.SysCodeLocale;
import net.pmhtech.sys.code.service.SysCodeGroupService;
import net.pmhtech.util.CollectionUtils;

@Service("sysCodeGroupService")
public class SysCodeGroupServiceImpl implements SysCodeGroupService{

	@Resource(name = "sysCodeGroupDAO")
	private SysCodeGroupDAO sysCodeGroupDAO;

	@Resource(name = "sysCodeDAO")
	private SysCodeDAO sysCodeDAO;
	
	@Resource(name = "sysCodeLocaleDAO")
	private SysCodeLocaleDAO sysCodeLocaleDAO;
	
	@Override
	public int createSysCodeGroup(SysCodeGroup sysCodeGroup,SysCode sysCodeVO, List<Map<String, ?>> listSysCodeLocale) throws Exception {

		sysCodeGroupDAO.insert(sysCodeGroup);
		sysCodeDAO.insert(sysCodeVO);
		
		int count = 0;
		for(Map<String,?> hashMap : listSysCodeLocale){
			SysCodeLocale tempVO = new SysCodeLocale();
			BeanUtils.copyProperties(tempVO, hashMap);
			count+=sysCodeLocaleDAO.insert(tempVO);
		}
		return count;
	}

	@Override
	public int modifySysCodeGroup(SysCodeGroup sysCodeGroup, SysCode sysCodeVO,List<Map<String, ?>> listSysCodeLocale) throws Exception {
		sysCodeGroupDAO.update(sysCodeGroup);
		sysCodeDAO.update(sysCodeVO);
		
		int count = 0;
		for(Map<String,?> hashMap : listSysCodeLocale){
			SysCodeLocale tempVO = new SysCodeLocale();
			BeanUtils.copyProperties(tempVO, hashMap);
			count+=sysCodeLocaleDAO.update(tempVO);
		}
		return count;
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		
		List<Map<String, ?>> sysCodeGroups =  sysCodeGroupDAO.selectList(paramMap);
		List<Map<String, ?>> localeList =  sysCodeGroupDAO.selectLocaleList(paramMap);
	
		for(Map hashMap : sysCodeGroups){
			String PRE_CD = (String) hashMap.get("PRE_CD");
			List<Map<String, ?>> tempList = CollectionUtils.getMatchedKey(localeList, "PRE_CD", PRE_CD);
			
			Map<String,Object> localeMap = new HashMap<String,Object>();
			
			for(Map map : tempList){
				localeMap.put((String) map.get("LOCALE_CD"),map);
			}
			hashMap.put("LANGUAGE", localeMap);
		}
		return sysCodeGroups;
	}

	

	
}
