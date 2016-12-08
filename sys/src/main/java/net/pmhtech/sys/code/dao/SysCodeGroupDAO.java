package net.pmhtech.sys.code.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import net.pmhtech.sys.code.domain.SysCode;
import net.pmhtech.sys.code.domain.SysCodeGroup;


public interface SysCodeGroupDAO {

	int insert(SysCodeGroup sysCodeGroup) throws Exception;
	int update(SysCodeGroup sysCodeGroup) throws Exception;
	List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
	List<Map<String,?>> selectLocaleList(Map<String,?> paramMap) throws Exception;
	
	
}
