package net.pmhtech.sys.menu.service;

import java.util.List;
import java.util.Map;

import net.pmhtech.sys.menu.domain.SysMenu;

public interface SysMenuCodeService {
	
	public List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
}
