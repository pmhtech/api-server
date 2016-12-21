package net.pmhtech.sys.prop.dao;

import java.util.List;
import java.util.Map;

import net.pmhtech.sys.prop.domain.SysPropPage;

public interface SysPropPageDAO {


	int insert(SysPropPage sysPropPage) throws Exception;
	int update(SysPropPage sysPropPage) throws Exception;
	int delete(Map<String,?> paramMap) throws Exception;
	List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
}
