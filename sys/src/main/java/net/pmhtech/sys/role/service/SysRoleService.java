package net.pmhtech.sys.role.service;

import java.util.List;
import java.util.Map;

public interface SysRoleService {

	public List<Map<String,?>> selectSysRole(Map<String,?> paramMap) throws Exception;
	public List<Map<String,?>> selectSysRolePage(Map<String,?> paramMap) throws Exception;
	public int createSysRole (Map<String,?> sysRole, List<Map<String,?>> listSysRoleLocale,List<Map<String,?>> listSysRolePage) throws Exception;
	public int modifySysRole (Map<String,?> sysRole, List<Map<String,?>> listSysRoleLocale,List<Map<String,?>> listSysRolePage) throws Exception;
	public List<Map<String,?>> removeSysRole(Map<String,?> paramMap) throws Exception;
}
