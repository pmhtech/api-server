package net.pmhtech.sys.menu.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.pmhtech.sys.menu.dao.SysMenuCodeDAO;
import net.pmhtech.sys.menu.dao.SysMenuDAO;
import net.pmhtech.sys.menu.domain.SysMenu;
import net.pmhtech.sys.menu.domain.SysMenuCode;


@Repository("sysMenuCodeDAO")
public class SysMenuCodeMyBatis  implements SysMenuCodeDAO{

	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public int insert(SysMenuCode sysMenuCode) throws Exception {
		return sqlSession.update("SysMenuCode.insert",sysMenuCode);
	}

	@Override
	public int delete(Map<String, ?> paramMap) throws Exception {
		return sqlSession.delete("sysMenuCode.delete",paramMap);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception { 
		return sqlSession.selectList("sysMenuCode.selectList",paramMap);
	}
}
