package net.pmhtech.sys.prop.service;

import java.util.List;
import java.util.Map;

public interface SysPropPageService {

	public int createSysPropPage(Map<String,?> paramMap) throws Exception;
	public int modifySysPropPage(Map<String,?> paramMap) throws Exception;
	public int removeSysPropPage(Map<String,?> paramMap) throws Exception;
	public List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
}
