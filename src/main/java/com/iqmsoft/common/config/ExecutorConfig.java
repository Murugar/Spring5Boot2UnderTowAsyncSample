package com.iqmsoft.common.config;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


@Configuration
@EnableAsync
public class ExecutorConfig {

 
  private int CORE_POOL_SIZE = 10;

 
  private int MAX_POOL_SIZE = 100;

 
  private int QUEUE_CAPACITY = 200;

  
  private String THREAD_NAME_PREFIX = "MainExecutor-";

  @Bean
  public Executor msjAsync() {
    ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
    executor.setCorePoolSize(CORE_POOL_SIZE);
    executor.setMaxPoolSize(MAX_POOL_SIZE);
    executor.setQueueCapacity(QUEUE_CAPACITY);
    executor.setThreadNamePrefix(THREAD_NAME_PREFIX);


    executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
    executor.initialize();
    return executor;
  }
}
