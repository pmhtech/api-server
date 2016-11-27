package net.pmhtech.sys.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import net.pmhtech.sys.domain.SysCode;
import net.pmhtech.sys.domain.SysCodeLocale;

public interface SysCodeLocaleDAO {

	int insert(SysCodeLocale sysCodeLocale) throws Exception;
	int update(SysCodeLocale sysCodeLocale) throws Exception;
	List<Map<String,?>> select(Map<String,?> paramMap) throws Exception;
	
}
