package net.pmhtech.mon.dao.mybatis;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.pmhtech.mon.dao.LogMstDAO;
import net.pmhtech.mon.domain.LogMst;

@Repository("logMstDAO")
public class LogMstMyBatis implements LogMstDAO{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	@Override
	public int insert(LogMst logMst) throws Exception {
		return sqlSession.update("LogMst.insert", logMst);
	}
	
}
