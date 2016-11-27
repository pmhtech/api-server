package net.pmhtech.sys.service.impl;


import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import net.pmhtech.sys.dao.SysCodeDAO;
import net.pmhtech.sys.domain.SysCode;
import net.pmhtech.sys.service.SysCodeService;

@Service("sysCodeService")
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
	public List<Map<String, ?>> select(Map<String, ?> paramMap) throws Exception {
		return sysCodeDAO.select(paramMap);
	}
}
