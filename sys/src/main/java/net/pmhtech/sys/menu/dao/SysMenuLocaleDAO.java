package net.pmhtech.sys.menu.dao;

import java.util.List;
import java.util.Map;

import net.pmhtech.sys.menu.domain.SysMenuLocale;

public interface SysMenuLocaleDAO {

	int insert(SysMenuLocale sysMenuLocale) throws Exception;
	int update(SysMenuLocale sysMenuLocale) throws Exception;
	List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
	
}
