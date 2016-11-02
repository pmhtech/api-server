package net.pmhtech.sys.service;

import java.util.List;
import java.util.Map;

import net.pmhtech.sys.domain.SysMenu;

public interface SysMenuService {
	
	public int insert(SysMenu sysMenu) throws Exception;
	public int update(SysMenu sysMenu) throws Exception;
	public int delete(Map<String,?> paramMap) throws Exception;
	public List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
}
