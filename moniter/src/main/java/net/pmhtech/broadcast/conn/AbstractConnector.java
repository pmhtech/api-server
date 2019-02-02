package net.pmhtech.broadcast.conn;

import java.net.URL;
import java.util.List;
import java.util.Map;

import net.pmhtech.broadcast.log.domain.LogMst;

public interface AbstractConnector {

	public URL getURL(String keyword);
	public List<LogMst> getRawDatas(String keyword);
	public Map<String,?> getLiveDatas(String keyword);

}
