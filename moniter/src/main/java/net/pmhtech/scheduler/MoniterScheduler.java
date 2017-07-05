package net.pmhtech.scheduler;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("moniterSceduler")
public class MoniterScheduler { 
	
	
    public void getLiveData(){
		try{
			System.out.println("1111분");
			
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

