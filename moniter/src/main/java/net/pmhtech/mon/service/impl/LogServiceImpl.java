package net.pmhtech.mon.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.pmhtech.mon.conn.service.AbstractConnector;
import net.pmhtech.mon.domain.LogMst;
import net.pmhtech.mon.service.LogService;
import net.pmhtech.mon.service.MoniterService;

@Service("logService")
public class LogServiceImpl implements LogService{

	
	@Resource(name="afreecaConnector")
	private AbstractConnector afreecaConnector;

	@Override
	public int insertLog(LogMst logMst) throws Exception {

		afreecaConnector.getRawDatas("종최 종족최강전");
		
		
		return 0;
	}

	
	
	
}
