package net.pmhtech.mon.conn.service;

import java.net.URL;
import java.util.List;
import java.util.Map;

import net.pmhtech.mon.domain.LogMst;

public interface AbstractConnector {

	public URL getURL(String keyword) throws Exception;
	public List<LogMst> getRawDatas(String keyword) throws Exception;
	public Map<String,?> getLiveDatas(String keyword) throws Exception;

}
