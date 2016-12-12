package net.pmhtech.sys.role.dao;

import java.util.List;
import java.util.Map;

import net.pmhtech.sys.role.domain.SysRoleLocale;

public interface SysRoleLocaleDAO {

	int insert(SysRoleLocale sysRoleLocale) throws Exception;
	int update(SysRoleLocale sysRoleLocale) throws Exception;
	int delete(Map<String,?> paramMap) throws Exception;
	List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
	
	
}
