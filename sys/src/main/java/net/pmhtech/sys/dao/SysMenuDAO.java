package net.pmhtech.sys.dao;

import java.util.List;
import java.util.Map;

import net.pmhtech.sys.domain.SysMenu;

public interface SysMenuDAO {

	int insert(SysMenu sysMenu) throws Exception;
	int update(SysMenu sysMenu) throws Exception;
	int delete(Map<String,?> paramMap) throws Exception;
	List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
	
}
