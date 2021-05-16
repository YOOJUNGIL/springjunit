package com.myalley.junit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class JunitApplication implements ApplicationListener<ApplicationReadyEvent> {

    public static void main(String[] args) {
        SpringApplication.run(JunitApplication.class, args);
    }
    
    /**
     * 이벤트를 잡을 수 있음
     * Application이 실행될 때 기본적인 값을 셋팅하거나 원복하는 부분이 있다면 여기서 처리할 수 있다.
     */
	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		// TODO Auto-generated method stub
		if(log.isDebugEnabled()) {
			log.debug("Event Listen Start...");
		}
	}

}
