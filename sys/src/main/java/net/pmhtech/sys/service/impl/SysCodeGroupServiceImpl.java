package net.pmhtech.sys.service.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import net.pmhtech.sys.dao.SysCodeDAO;
import net.pmhtech.sys.dao.SysCodeGroupDAO;
import net.pmhtech.sys.dao.SysCodeLocaleDAO;
import net.pmhtech.sys.domain.SysCode;
import net.pmhtech.sys.domain.SysCodeGroup;
import net.pmhtech.sys.service.SysCodeGroupService;
import net.pmhtech.sys.service.SysCodeLocaleService;
import net.pmhtech.sys.service.SysCodeService;
@Service("sysCodeGroupService")
public class SysCodeGroupServiceImpl implements SysCodeGroupService{

	@Resource(name = "sysCodeGroupDAO")
	private SysCodeGroupDAO sysCodeGroupDAO;

	@Override
	public int createSysCodeGroup(SysCodeGroup sysCodeGroup, List<Map<String, ?>> listSysCodeLocale) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifySysCodeGroup(SysCodeGroup sysCodeGroup, List<Map<String, ?>> listSysCodeLocale) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, ?>> select(Map<String, ?> paramMap) throws Exception {
		return sysCodeGroupDAO.select(paramMap);
	}

	

	
}
