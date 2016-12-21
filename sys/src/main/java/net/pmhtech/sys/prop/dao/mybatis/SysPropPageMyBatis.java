package net.pmhtech.sys.prop.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.pmhtech.sys.prop.dao.SysPropPageDAO;
import net.pmhtech.sys.prop.domain.SysPropPage;

@Repository("sysPropPageDAO")
public class SysPropPageMyBatis implements SysPropPageDAO{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insert(SysPropPage sysPropPage) throws Exception {
		return sqlSession.update("SysPropPage.insert",sysPropPage);
	}

	@Override
	public int update(SysPropPage sysPropPage) throws Exception {
		return sqlSession.update("SysPropPage.update",sysPropPage);
	}

	@Override
	public int delete(Map<String, ?> paramMap) throws Exception {
		return sqlSession.delete("SysPropPage.delete",paramMap);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		return sqlSession.selectList("SysPropPage.selectList",paramMap);
	}
}
