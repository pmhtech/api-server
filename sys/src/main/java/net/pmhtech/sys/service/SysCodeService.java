package net.pmhtech.sys.service;

import java.util.List;
import java.util.Map;



import net.pmhtech.sys.domain.SysCode;

public interface SysCodeService {
	
	public int insert(SysCode sysCode) throws Exception;
	public int update(SysCode sysCode) throws Exception;
	public int delete(Map<String,?> paramMap) throws Exception;
	public List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
	public Map<String,?> selectSysCodeGroup(Map<String,?> paramMap) throws Exception;
}
