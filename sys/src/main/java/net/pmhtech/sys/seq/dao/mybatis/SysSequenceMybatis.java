package net.pmhtech.sys.seq.dao.mybatis;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.pmhtech.sys.seq.dao.SysSequenceDAO;
import net.pmhtech.sys.seq.domain.SysSequence;

@Repository("sysSequenceDAO")
public class SysSequenceMybatis implements SysSequenceDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	
	public int insert(SysSequence sysSequenceVO) throws Exception {
		return sqlSession.update("SysSequence.insert", sysSequenceVO);
	}
	public String selectMaxSequence(Map<String,?> paramMap) throws Exception {
		return sqlSession.selectOne("SysSequence.selectMaxSequence", paramMap);
	}

}
