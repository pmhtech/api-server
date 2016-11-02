package net.pmhtech.user.service;

import java.util.List;
import java.util.Map;

import net.pmhtech.user.domain.UserMst;

public interface UserMstService {
	
	
	public int insert(UserMst userMst) throws Exception;
	public int update(UserMst userMst) throws Exception;
	public int delete(Map<String,?> paramMap) throws Exception;
	public List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
}
