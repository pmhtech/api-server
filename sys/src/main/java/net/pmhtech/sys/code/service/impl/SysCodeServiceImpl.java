package net.pmhtech.sys.code.service.impl;


import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.pmhtech.sys.code.dao.SysCodeDAO;
import net.pmhtech.sys.code.domain.SysCode;
import net.pmhtech.sys.code.service.SysCodeService;
import net.pmhtech.util.CollectionUtils;

@Service("sysCodeService")
@Transactional
public class SysCodeServiceImpl implements SysCodeService{

	@Resource(name = "sysCodeDAO")
	private SysCodeDAO sysCodeDAO;
	
	@Override
	public int createSysCode(SysCode sysCode, List<Map<String, ?>> listSysCodeLocale) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifySysCode(SysCode sysCode, List<Map<String, ?>> listSysCodeLocale) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		
		List<Map<String, ?>> sysCodes =  sysCodeDAO.selectList(paramMap);
		List<Map<String, ?>> localeList =  sysCodeDAO.selectLocaleList(paramMap);
		
		for(Map hashMap : sysCodes){
			String CODE = (String) hashMap.get("CODE");
			List<Map<String, ?>> tempList = CollectionUtils.getMatchedKey(localeList, "CODE", CODE);
			hashMap.put("LANGUAGE", tempList);
		}
	
		
		return sysCodes;
	}
}
