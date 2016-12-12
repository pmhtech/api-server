package net.pmhtech.sys.role.dao;

import java.util.List;
import java.util.Map;

import net.pmhtech.sys.role.domain.SysRoleAuth;

public interface SysRoleAuthDAO {

	int insert(SysRoleAuth sysRoleAuth) throws Exception;
	int delete(Map<String,?> paramMap) throws Exception;
	List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
	
	
}
