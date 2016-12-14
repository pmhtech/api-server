package net.pmhtech.sys.role.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.pmhtech.sys.role.dao.SysRolePageDAO;
import net.pmhtech.sys.role.domain.SysRolePage;


@Repository("sysRolePageDAO")
public class SysRolePageMyBatis  implements SysRolePageDAO{

	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int insert(SysRolePage sysRolePage) throws Exception {
		return sqlSession.update("SysRolePage.insert",sysRolePage);
	}

	@Override
	public int delete(Map<String, ?> paramMap) throws Exception {
		return sqlSession.delete("SysRolePage.delete",paramMap);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		return sqlSession.selectList("SysRolePage.selectList",paramMap);
	}
	

}
