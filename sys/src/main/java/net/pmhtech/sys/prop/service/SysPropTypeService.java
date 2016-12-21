package net.pmhtech.sys.prop.service;

import java.util.List;
import java.util.Map;

public interface SysPropTypeService {

	public int createSysPropType(Map<String,?> paramMap) throws Exception;
	public int modifySysPropType(Map<String,?> paramMap) throws Exception;
	public int removeSysPropType(Map<String,?> paramMap) throws Exception;
	public List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
}
