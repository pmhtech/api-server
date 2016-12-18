package net.pmhtech.sys.role.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import net.pmhtech.sys.role.dao.SysRoleAuthDAO;
import net.pmhtech.sys.role.domain.SysRoleAuth;
import net.pmhtech.sys.role.service.SysRoleAuthService;

@Service("sysRoleAuthService")
public class SysRoleAuthServiceImpl implements SysRoleAuthService{

	@Resource(name="sysRoleAuthDAO")
	private SysRoleAuthDAO sysRoleAuthDAO;
	
	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
			return sysRoleAuthDAO.selectList(paramMap);
	}

	@Override
	public int createSysRoleAuth(String USER_AUTH,List<Map<String,?>> listSysRoleAuth) throws Exception {

		sysRoleAuthDAO.delete(USER_AUTH);
		
		for(Map<String,?> map : listSysRoleAuth){
			SysRoleAuth sysRoleAuth = new SysRoleAuth();
			
			BeanUtils.copyProperties(sysRoleAuth, map);
			sysRoleAuthDAO.insert(sysRoleAuth);	
		}
		
		
		
		
		
		return 0;
	}

	@Override
	public List<Map<String, ?>> selectPreview(List<String> listString) throws Exception {
		return sysRoleAuthDAO.selectPreview(listString);
		
	}

}
