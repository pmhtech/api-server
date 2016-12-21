package net.pmhtech.sys.prop.dao;

import java.util.List;
import java.util.Map;

import net.pmhtech.sys.prop.domain.SysPropMsg;

public interface SysPropMsgDAO {

	int insert(SysPropMsg sysPropMsg) throws Exception;
	int update(SysPropMsg sysPropMsg) throws Exception;
	int delete(Map<String,?> paramMap) throws Exception;
	List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
	
}
