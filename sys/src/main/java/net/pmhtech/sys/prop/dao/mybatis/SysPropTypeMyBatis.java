package net.pmhtech.sys.prop.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.pmhtech.sys.prop.dao.SysPropTypeDAO;
import net.pmhtech.sys.prop.domain.SysPropType;

@Repository("sysPropTypeDAO")
public class SysPropTypeMyBatis implements SysPropTypeDAO{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insert(SysPropType sysPropType) throws Exception {
		return sqlSession.update("SysPropType.insert",sysPropType);
	}

	@Override
	public int update(SysPropType sysPropType) throws Exception {
		return sqlSession.update("SysPropType.insert",sysPropType);
	}

	@Override
	public int delete(Map<String, ?> paramMap) throws Exception {
		return sqlSession.delete("SysPropType.delete",paramMap);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		return sqlSession.selectList("SysPropType.selectList",paramMap);
	}

	
}
