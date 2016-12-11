package net.pmhtech.sys.menu.service;

import java.util.List;
import java.util.Map;

public interface SysMenuService {
	
	public int createSysMenu(Map<String, ?> sysMenuMap, List<Map<String, ?>> listSysMenuLocales, List<Map<String, ?>> listSysMenuCodes) throws Exception;
	public int modifySysMenu(Map<String, ?> sysMenuMap, List<Map<String, ?>> listSysMenuLocales, List<Map<String, ?>> listSysMenuCodes) throws Exception;
	public List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
	
}
