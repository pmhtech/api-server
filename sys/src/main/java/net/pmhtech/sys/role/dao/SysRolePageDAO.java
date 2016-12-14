package net.pmhtech.sys.role.dao;

import java.util.List;
import java.util.Map;

import net.pmhtech.sys.role.domain.SysRole;
import net.pmhtech.sys.role.domain.SysRolePage;

public interface SysRolePageDAO {

	int insert(SysRolePage sysRolePage) throws Exception;
	int delete(Map<String,?> paramMap) throws Exception;
	List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
}
