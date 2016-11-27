package net.pmhtech.sys.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import net.pmhtech.sys.domain.SysCode;
import net.pmhtech.sys.domain.SysCodeGroup;


public interface SysCodeGroupDAO {

	int insert(SysCodeGroup sysCodeGroup) throws Exception;
	int update(SysCodeGroup sysCodeGroup) throws Exception;
	List<Map<String,?>> select(Map<String,?> paramMap) throws Exception;
	
}
