package net.pmhtech.sys.role.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.pmhtech.sys.menu.dao.SysMenuCodeDAO;
import net.pmhtech.sys.menu.domain.SysMenuCode;
import net.pmhtech.sys.role.dao.SysRoleLocaleDAO;
import net.pmhtech.sys.role.domain.SysRoleLocale;


@Repository("sysRoleLocaleDAO")
public class SysRoleLocaleMyBatis  implements SysRoleLocaleDAO{

	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int insert(SysRoleLocale sysRoleLocale) throws Exception {
		return sqlSession.insert("SysRoleLocale.insert",sysRoleLocale);
	}
	@Override
	public int update(SysRoleLocale sysRoleLocale) throws Exception {
		return sqlSession.update("SysRoleLocale.update",sysRoleLocale);
	}

	@Override
	public int delete(Map<String, ?> paramMap) throws Exception {
		return sqlSession.delete("SysRoleLocale.delete",paramMap);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		return sqlSession.selectList("SysRoleLocale.selectList",paramMap);
	}

}
