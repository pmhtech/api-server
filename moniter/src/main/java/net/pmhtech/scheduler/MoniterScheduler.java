package net.pmhtech.scheduler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.pmhtech.mon.service.MoniterService;

@Service("moniterSceduler")
public class MoniterScheduler { 
	
	@Resource(name="moniterService")
	private MoniterService moniterService;
	
    public void getLiveData(){
		try{
			moniterService.doLogging();
			
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

