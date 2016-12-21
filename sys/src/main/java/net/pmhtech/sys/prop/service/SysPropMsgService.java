package net.pmhtech.sys.prop.service;

import java.util.List;
import java.util.Map;

public interface SysPropMsgService {

	public int createSysPropMsg(Map<String,?> paramMap) throws Exception;
	public int moidfySysPropMsg(Map<String,?> paramMap) throws Exception;
	public int removeSysPropMsg(Map<String,?> paramMap) throws Exception;
	public List<Map<String,?>> selectList(Map<String,?> paramMap) throws Exception;
}
