package com.iqmsoft.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


@Service
public class UserService {

  private Logger logger= LoggerFactory.getLogger(UserService.class);

  @Async
  public void task1(){
	 try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
     logger.info("This is task1."+System.currentTimeMillis());
  }

  @Async
  public void task2(){
    try {
      Thread.sleep(50000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    logger.info("This is task2."+System.currentTimeMillis());
  }

  @Async
  public void task3(){
	  try {
		Thread.sleep(30000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    logger.info("This is task3."+System.currentTimeMillis());
  }
}
