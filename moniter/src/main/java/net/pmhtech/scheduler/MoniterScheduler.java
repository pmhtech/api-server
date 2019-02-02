package net.pmhtech.scheduler;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import net.pmhtech.broadcast.log.service.MoniterService;


@Component
public class MoniterScheduler { 
	
	@Autowired
	private MoniterService moniterService;
	
	@Scheduled(fixedDelay=1000*5)
    public void getLiveData(){
		try{
			moniterService.doLogging();
			
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

