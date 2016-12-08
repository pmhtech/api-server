package net.pmhtech.sys.code.service;

import java.util.List;
import java.util.Map;


public interface SysCodeService {
	
	public int createSysCode(List<Map<String,?>> listSysCodeLocale) throws Exception;
	public int modifySysCode(List<Map<String,?>> listSysCodeLocale) throws Exception;
	
	public List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
	
}
