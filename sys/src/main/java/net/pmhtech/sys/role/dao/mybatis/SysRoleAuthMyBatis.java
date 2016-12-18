package net.pmhtech.sys.role.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.pmhtech.sys.code.domain.SysCode;
import net.pmhtech.sys.menu.dao.SysMenuCodeDAO;
import net.pmhtech.sys.menu.domain.SysMenuCode;
import net.pmhtech.sys.role.dao.SysRoleAuthDAO;
import net.pmhtech.sys.role.domain.SysRoleAuth;


@Repository("sysRoleAuthDAO")
public class SysRoleAuthMyBatis  implements SysRoleAuthDAO{

	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int insert(SysRoleAuth sysRoleAuth) throws Exception {
		return sqlSession.update("SysRoleAuth.insert",sysRoleAuth);
	}

	@Override
	public int delete(String USER_AUTH) throws Exception {
		return sqlSession.delete("SysRoleAuth.delete",USER_AUTH);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		return sqlSession.selectList("SysRoleAuth.selectList",paramMap);
	}

	@Override
	public List<Map<String, ?>> selectPreview(List<String> listString) throws Exception {
		return sqlSession.selectList("SysRoleAuth.selectPreview",listString);
	}

}
