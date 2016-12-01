package net.pmhtech.user.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.pmhtech.user.dao.UserMstDAO;
import net.pmhtech.user.domain.UserMst;

@Repository("userMstDAO")
public class UserMstMyBatis  implements UserMstDAO{

	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public int insert(UserMst userMst) throws Exception {
		return sqlSession.update("UserMst.insert",userMst);
	}

	@Override
	public int update(UserMst userMst) throws Exception {
		return sqlSession.update("UserMst.update",userMst);
	}

	@Override
	public int delete(Map<String, ?> paramMap) throws Exception {
		return sqlSession.delete("UserMst.delete",paramMap);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		return sqlSession.selectList("UserMst.selectList",paramMap);
	}
	
	@Override
	public List<Map<String, ?>> selectLogin(Map<String, ?> paramMap) throws Exception {
		return sqlSession.selectList("UserMst.selectLogin",paramMap);
	}

}
