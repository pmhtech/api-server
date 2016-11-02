package net.pmhtech.user.dao;

import java.util.List;
import java.util.Map;

import net.pmhtech.user.domain.UserMst;

public interface UserMstDAO {
	int insert(UserMst userMst) throws Exception;
	int update(UserMst userMst) throws Exception;
	int delete(Map<String,?> paramMap) throws Exception;
	List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
	List<Map<String, ?>> selectLogin(Map<String, ?> paramMap) throws Exception;
}
