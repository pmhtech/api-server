package net.pmhtech.sys.menu.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.pmhtech.sys.menu.dao.SysMenuLocaleDAO;
import net.pmhtech.sys.menu.domain.SysMenuLocale;


@Repository("sysMenuLocaleDAO")
public class SysMenuLocaleMyBatis  implements SysMenuLocaleDAO{

	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int insert(SysMenuLocale sysMenuLocale) throws Exception {
		return sqlSession.update("SysMenuLocale.insert",sysMenuLocale);
	}

	@Override
	public int update(SysMenuLocale sysMenuLocale) throws Exception {
		return sqlSession.update("SysMenuLocale.update",sysMenuLocale);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		return sqlSession.selectList("SysMenuLocale.selectList",paramMap);
	}
	



}
