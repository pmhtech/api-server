package net.pmhtech.sys.role.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.pmhtech.sys.menu.dao.SysMenuCodeDAO;
import net.pmhtech.sys.menu.domain.SysMenuCode;
import net.pmhtech.sys.role.dao.SysRoleDAO;
import net.pmhtech.sys.role.domain.SysRole;


@Repository("sysRoleDAO")
public class SysRoleMyBatis  implements SysRoleDAO{

	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int insert(SysRole sysRole) throws Exception {
		return sqlSession.update("SysRole.insert",sysRole);
	}
	@Override
	public int update(SysRole sysRole) throws Exception {
		return sqlSession.update("SysRole.update",sysRole);
	}
	@Override
	public int delete(Map<String, ?> paramMap) throws Exception {
		return sqlSession.delete("SysRole.delete",paramMap);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		return sqlSession.selectList("SysRole.selectList",paramMap);
	}

	@Override
	public List<Map<String, ?>> selectLocaleList(Map<String, ?> paramMap) throws Exception {
		return sqlSession.selectList("SysRole.selectLocaleList",paramMap);
	}

	

}
