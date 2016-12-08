package net.pmhtech.sys.code.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import net.pmhtech.sys.code.domain.SysCode;


public interface SysCodeLocaleService {
	public Map<String,?> selectSysCodeMap(Map<String, ?> paramMap) throws Exception;
	
}
