package net.pmhtech.sys.role.service;

import java.util.List;
import java.util.Map;

import net.pmhtech.sys.role.domain.SysRoleAuth;

public interface SysRoleAuthService {

	public List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
	public List<Map<String,?>> selectPreview(List<String> listString) throws Exception;
	public int createSysRoleAuth(String USER_AUTH,List<Map<String,?>> listSysRoleAuth) throws Exception;
}
