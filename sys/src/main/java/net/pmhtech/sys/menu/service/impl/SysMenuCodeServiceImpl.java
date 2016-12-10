package net.pmhtech.sys.menu.service.impl;


import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import net.pmhtech.sys.menu.dao.SysMenuCodeDAO;
import net.pmhtech.sys.menu.dao.SysMenuDAO;
import net.pmhtech.sys.menu.domain.SysMenu;
import net.pmhtech.sys.menu.service.SysMenuCodeService;
import net.pmhtech.sys.menu.service.SysMenuService;

@Service("sysMenuCodeService")
public class SysMenuCodeServiceImpl implements SysMenuCodeService{

	@Resource(name = "sysMenuCodeDAO")
	private SysMenuCodeDAO sysMenuCodeDAO;

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		return sysMenuCodeDAO.selectList(paramMap);
	}

	
	


	
}
