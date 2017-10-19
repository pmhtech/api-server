package net.pmhtech.mon.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.pmhtech.mon.conn.service.AbstractConnector;
import net.pmhtech.mon.dao.LogMstDAO;
import net.pmhtech.mon.domain.LogMst;
import net.pmhtech.mon.service.MoniterService;

@Service("moniterService")
public class MoniterServiceImpl implements MoniterService{

	
	@Resource(name="afreecaConnector")
	private AbstractConnector afreecaConnector;
	
	
	@Resource(name="logMstDAO")
	private LogMstDAO logMstDAO;

	@Override
	public void startLogging() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doLogging() throws Exception {
		List<LogMst> listLogMst = afreecaConnector.getRawDatas("KCM");
		for(LogMst tempLogMst : listLogMst){
			logMstDAO.insert(tempLogMst);
		}
		
		List<LogMst> a = afreecaConnector.getRawDatas("종족 최강");
		for(LogMst aa : a){
			logMstDAO.insert(aa);
		}
		
		List<LogMst> c = afreecaConnector.getRawDatas("종족");
		for(LogMst cc : c){
			logMstDAO.insert(cc);
		}
		
		List<LogMst>  b = afreecaConnector.getRawDatas("종최");
		for(LogMst bb : b){
			logMstDAO.insert(bb);
		}
		
		List<LogMst>  g = afreecaConnector.getRawDatas("나는김윤중");
		for(LogMst gg : g){
			logMstDAO.insert(gg);
		}
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
