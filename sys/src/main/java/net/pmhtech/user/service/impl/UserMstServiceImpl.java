package net.pmhtech.user.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.pmhtech.user.dao.UserMstDAO;
import net.pmhtech.user.domain.UserMst;
import net.pmhtech.user.service.UserMstService;

@Service("userMstService")
public class UserMstServiceImpl implements UserMstService{

	@Resource(name="userMstDAO")
	private UserMstDAO userMstDAO;

	@Override
	public int insert(UserMst userMst) throws Exception {
		
		return userMstDAO.insert(userMst);
	}

	@Override
	public int update(UserMst userMst) throws Exception {
		
		return userMstDAO.update(userMst);
	}

	@Override
	public int delete(Map<String, ?> paramMap) throws Exception {
		return userMstDAO.delete(paramMap);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		return userMstDAO.selectList(paramMap);
	}

}
