package net.pmhtech.sys.prop.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.pmhtech.sys.prop.dao.SysPropMsgDAO;
import net.pmhtech.sys.prop.domain.SysPropMsg;

@Repository("sysPropMsgDAO")
public class SysPropMsgMyBatis implements SysPropMsgDAO{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insert(SysPropMsg sysPropMsg) throws Exception {
		return sqlSession.update("SysPropMsg.insert",sysPropMsg);
	}

	@Override
	public int update(SysPropMsg sysPropMsg) throws Exception {
		return sqlSession.update("SysPropMsg.update",sysPropMsg);
	}

	@Override
	public int delete(Map<String, ?> paramMap) throws Exception {
		return sqlSession.delete("SysPropMsg.delete",paramMap);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		return sqlSession.selectList("SysPropMsg.selectList",paramMap);
	}

	
}
