package net.pmhtech.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class LoggingScheduler {

	//1분마다 실행
	@Scheduled( cron="0 0/1 * 1/1 * ? *")
	public void Test1(){
		System.out.println("1111분 마다 실");
		
	}
}
