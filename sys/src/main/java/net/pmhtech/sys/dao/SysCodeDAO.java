package net.pmhtech.sys.dao;

import java.util.List;
import java.util.Map;


import net.pmhtech.sys.domain.SysCode;

public interface SysCodeDAO {

	int insert(SysCode sysCode) throws Exception;
	int update(SysCode sysCode) throws Exception;
	List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
	List<Map<String,?>> selectLocaleList(Map<String,?> paramMap) throws Exception;
	
	
}
