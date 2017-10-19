package net.pmhtech.scheduler;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import net.pmhtech.mon.service.MoniterService;


@Component
public class MoniterScheduler { 
	
	@Resource(name="moniterService")
	private MoniterService moniterService;
	
	@Scheduled(fixedDelay=1000*60)
    public void getLiveData(){
		try{
			moniterService.doLogging();
			
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

