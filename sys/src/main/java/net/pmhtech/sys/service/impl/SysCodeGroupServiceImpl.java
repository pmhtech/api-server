package net.pmhtech.sys.service.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import net.pmhtech.sys.dao.SysCodeDAO;
import net.pmhtech.sys.dao.SysCodeGroupDAO;
import net.pmhtech.sys.dao.SysCodeLocaleDAO;
import net.pmhtech.sys.domain.SysCode;
import net.pmhtech.sys.domain.SysCodeGroup;
import net.pmhtech.sys.domain.SysCodeLocale;
import net.pmhtech.sys.service.SysCodeGroupService;

import net.pmhtech.user.exception.UserNotFoundException;

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
	public int modifySysCodeGroup(SysCodeGroup sysCodeGroup, List<Map<String, ?>> listSysCodeLocale) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		return sysCodeGroupDAO.selectList(paramMap);
	}

	

	
}
