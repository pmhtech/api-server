package net.pmhtech.sys.prop.service;

import java.util.List;
import java.util.Map;

public interface SysPropPageService {

	public int createSysPropPage(Map<String, Object> paramMap, List<Map<String,?>> listSysPageLocale) throws Exception;
	public Map<String,List<?>> selectList(Map<String,?> paramMap) throws Exception;
}
