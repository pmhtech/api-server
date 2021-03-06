package net.pmhtech.sys.code.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.pmhtech.sys.code.dao.SysCodeDAO;
import net.pmhtech.sys.code.domain.SysCode;


@Repository("sysCodeDAO")
public class SysCodeMyBatis implements SysCodeDAO{

	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public int insert(SysCode sysCode) throws Exception {
		return sqlSession.update("SysCode.insert",sysCode);
	}

	@Override
	public int update(SysCode sysCode) throws Exception {
		return sqlSession.update("SysCode.update",sysCode);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception { 
		return sqlSession.selectList("SysCode.selectList",paramMap);
	}
	@Override
	public List<Map<String, ?>> selectLocaleList(Map<String, ?> paramMap) throws Exception { 
		return sqlSession.selectList("SysCode.selectLocaleList",paramMap);
	}
}
