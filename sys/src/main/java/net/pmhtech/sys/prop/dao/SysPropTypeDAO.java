package net.pmhtech.sys.prop.dao;

import java.util.List;
import java.util.Map;

import net.pmhtech.sys.prop.domain.SysPropType;

public interface SysPropTypeDAO {

	int insert(SysPropType sysPropType) throws Exception;
	int update(SysPropType sysPropType) throws Exception;
	int delete(Map<String,?> paramMap) throws Exception;
	List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
	
}
