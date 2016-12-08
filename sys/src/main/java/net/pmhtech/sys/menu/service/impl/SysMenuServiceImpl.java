package net.pmhtech.sys.menu.service.impl;


import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import net.pmhtech.sys.menu.dao.SysMenuDAO;
import net.pmhtech.sys.menu.domain.SysMenu;
import net.pmhtech.sys.menu.service.SysMenuService;

@Service("sysMenuService")
public class SysMenuServiceImpl implements SysMenuService{

	@Resource(name = "sysMenuDAO")
	private SysMenuDAO sysMenuDAO;
	
	@Override
	public int insert(SysMenu sysMenu) throws Exception {
		return sysMenuDAO.insert(sysMenu);
	}

	@Override
	public int update(SysMenu sysMenu) throws Exception {
		return sysMenuDAO.update(sysMenu);
	}

	@Override
	public int delete(Map<String, ?> paramMap) throws Exception {
		return sysMenuDAO.delete(paramMap);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		return sysMenuDAO.selectList(paramMap);
	}

	
}
