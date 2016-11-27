package net.pmhtech.sys.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import net.pmhtech.sys.domain.SysCode;

public interface SysCodeDAO {

	int insert(SysCode sysCode) throws Exception;
	int update(SysCode sysCode) throws Exception;
	List<Map<String,?>> select(Map<String,?> paramMap) throws Exception;
	
}
