package net.pmhtech.sys.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import net.pmhtech.sys.domain.SysCode;


public interface SysCodeLocaleService {
	public Map<String,?> selectSysCodeMap(Map<String, ?> paramMap) throws Exception;
	public List<Map<String,?>> selectLocaleComment(Map<String, ?> paramMap) throws Exception;
	
}
