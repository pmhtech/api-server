package net.pmhtech.sys.code.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.pmhtech.sys.code.dao.SysCodeDAO;
import net.pmhtech.sys.code.dao.SysCodeGroupDAO;
import net.pmhtech.sys.code.domain.SysCode;
import net.pmhtech.sys.code.domain.SysCodeGroup;


@Repository("sysCodeGroupDAO")
public class SysCodeGroupMyBatis  implements SysCodeGroupDAO{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public int insert(SysCodeGroup sysCode) throws Exception {
		return sqlSession.update("SysCodeGroup.insert",sysCode);
	}

	@Override
	public int update(SysCodeGroup sysCode) throws Exception {
		return sqlSession.update("SysCodeGroup.update",sysCode);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception { 
		return sqlSession.selectList("SysCodeGroup.selectList",paramMap);
	}

	@Override
	public List<Map<String, ?>> selectLocaleList(Map<String, ?> paramMap) throws Exception {
		return sqlSession.selectList("SysCodeGroup.selectLocaleList",paramMap);
	}
	


}
