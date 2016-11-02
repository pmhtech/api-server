package net.pmhtech.user.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import net.pmhtech.configure.SysMyBatisDAO;
import net.pmhtech.user.dao.UserMstDAO;
import net.pmhtech.user.domain.UserMst;

@Repository("userMstDAO")
public class UserMstMyBatis extends SysMyBatisDAO implements UserMstDAO{

	@Override
	public int insert(UserMst userMst) throws Exception {
		return this.getSqlSession().update("UserMst.insert",userMst);
	}

	@Override
	public int update(UserMst userMst) throws Exception {
		return this.getSqlSession().update("UserMst.update",userMst);
	}

	@Override
	public int delete(Map<String, ?> paramMap) throws Exception {
		return this.getSqlSession().delete("UserMst.delete",paramMap);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		return this.getSqlSession().selectList("UserMst.selectList",paramMap);
	}
	
	@Override
	public List<Map<String, ?>> selectLogin(Map<String, ?> paramMap) throws Exception {
		return this.getSqlSession().selectList("UserMst.selectLogin",paramMap);
	}

}
