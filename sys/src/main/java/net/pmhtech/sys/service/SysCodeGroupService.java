package net.pmhtech.sys.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import net.pmhtech.sys.domain.SysCode;
import net.pmhtech.sys.domain.SysCodeGroup;


public interface SysCodeGroupService {
	
	public int createSysCodeGroup(SysCodeGroup sysCodeGroup, List<Map<String,?>> listSysCodeLocale) throws Exception;
	public int modifySysCodeGroup(SysCodeGroup sysCodeGroup, List<Map<String,?>> listSysCodeLocale) throws Exception;
	
	public List<Map<String,?>> select(Map<String,?> paramMap) throws Exception;
	
}
