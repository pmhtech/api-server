package net.pmhtech.sys.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.pmhtech.sys.dao.SysMenuDAO;
import net.pmhtech.sys.domain.SysMenu;


@Repository("sysMenuDAO")
public class SysMenuMyBatis  implements SysMenuDAO{

	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public int insert(SysMenu sysMenu) throws Exception {
		return sqlSession.update("SysMenu.insert",sysMenu);
	}

	@Override
	public int update(SysMenu sysMenu) throws Exception {
		return sqlSession.update("SysMenu.update",sysMenu);
	}

	@Override
	public int delete(Map<String, ?> paramMap) throws Exception {
		return sqlSession.delete("SysMenu.delete",paramMap);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception { 
		return sqlSession.selectList("SysMenu.selectList",paramMap);
	}


}
