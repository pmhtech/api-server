package net.pmhtech.sys.role.dao;

import java.util.List;
import java.util.Map;

import net.pmhtech.sys.role.domain.SysRole;

public interface SysRoleDAO {

	int insert(SysRole sysRole) throws Exception;
	int delete(Map<String,?> paramMap) throws Exception;
	List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
	
	
}
