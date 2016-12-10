package net.pmhtech.sys.menu.dao;

import java.util.List;
import java.util.Map;

import net.pmhtech.sys.menu.domain.SysMenuCode;

public interface SysMenuCodeDAO {

	int insert(SysMenuCode sysMenuCode) throws Exception;
	int delete(Map<String,?> paramMap) throws Exception;
	List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
	
}
