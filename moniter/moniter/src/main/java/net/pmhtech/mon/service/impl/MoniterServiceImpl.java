package net.pmhtech.mon.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.pmhtech.mon.conn.service.AbstractConnector;
import net.pmhtech.mon.service.MoniterService;

@Service("moniterService")


public class MoniterServiceImpl implements MoniterService{

	
	@Resource(name="afreecaConnector")
	private AbstractConnector afreecaConnector;

	@Override
	public void startLogging() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doLogging() throws Exception {

		afreecaConnector.getRawDatas("스타");
		
	}

	@Override
	public void stopLogging() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Map<String, Object>> getProgram() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getLiveData() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
