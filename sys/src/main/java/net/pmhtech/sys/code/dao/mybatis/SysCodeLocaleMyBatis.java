package net.pmhtech.sys.code.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.pmhtech.sys.code.dao.SysCodeDAO;
import net.pmhtech.sys.code.dao.SysCodeLocaleDAO;
import net.pmhtech.sys.code.domain.SysCode;
import net.pmhtech.sys.code.domain.SysCodeLocale;


@Repository("sysCodeLocaleDAO")
public class SysCodeLocaleMyBatis  implements SysCodeLocaleDAO{

	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public int insert(SysCodeLocale sysCode) throws Exception {
		return sqlSession.update("SysCodeLocale.insert",sysCode);
	}

	@Override
	public int update(SysCodeLocale sysCode) throws Exception {
		return sqlSession.update("SysCodeLocale.update",sysCode);
	}

	@Override
	public List<Map<String, ?>> selectSysCodeMap(Map<String, ?> paramMap) throws Exception { 
		return sqlSession.selectList("SysCodeLocale.selectSysCodeMap",paramMap);
	}

	@Override
	public List<Map<String, ?>> selectLocaleList(Map<String, ?> paramMap) throws Exception {
		return sqlSession.selectList("SysCodeLocale.selectLocaleList",paramMap);
	}
}
