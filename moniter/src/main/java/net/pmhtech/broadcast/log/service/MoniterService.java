package net.pmhtech.broadcast.log.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.pmhtech.broadcast.conn.AbstractConnector;
import net.pmhtech.broadcast.log.dao.LogMstDao;
import net.pmhtech.broadcast.log.domain.LogMst;

@Service
public class MoniterService {

	@Resource(name="afreecaConnector")
	private AbstractConnector afreecaConnector;
	
	
	@Autowired
	private LogMstDao logMstDao;
	
	
	public void doLogging() {

		List<LogMst> listLogMst = afreecaConnector.getRawDatas("스타");
		
		
		for(LogMst logMst : listLogMst) {
			
			logMstDao.insert(logMst);
			
		}
		
		
		
		
		
	}

}
