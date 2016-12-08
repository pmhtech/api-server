package net.pmhtech.sys.code.dao;

import java.util.List;
import java.util.Map;

import net.pmhtech.sys.code.domain.SysCodeLocale;

public interface SysCodeLocaleDAO {

	int insert(SysCodeLocale sysCodeLocale) throws Exception;
	int update(SysCodeLocale sysCodeLocale) throws Exception;
	List<Map<String,?>> selectSysCodeMap(Map<String,?> paramMap) throws Exception;
	List<Map<String,?>> selectLocaleList(Map<String,?> paramMap) throws Exception;
	
	
}
