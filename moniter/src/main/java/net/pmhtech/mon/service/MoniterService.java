package net.pmhtech.mon.service;

import java.util.List;
import java.util.Map;

public interface MoniterService {

	
	public void startLogging() throws Exception;
	public void doLogging() throws Exception;
	public void stopLogging() throws Exception;
	
	public List<Map<String,Object>> getProgram() throws Exception;
	public List<Map<String,Object>> getLiveData() throws Exception;
	
	
	
}
