package net.pmhtech.sys.file.dao;

import java.util.List;
import java.util.Map;


import net.pmhtech.sys.file.domain.SysFile;

public interface SysFileDAO {

	public int insert(SysFile sysFile) throws Exception;

	public int update(SysFile sysFile) throws Exception;

	public int delete(Map<String, Object> paramMap) throws Exception;

	public List<Map<String, ?>> selectList(Map<String, ?> paramMap)throws Exception;
}
