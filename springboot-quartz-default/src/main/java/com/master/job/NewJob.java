package com.master.job;

import java.util.Date;  
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.quartz.JobExecutionContext;  
import org.quartz.JobExecutionException;  
@Component
public class NewJob implements BaseJob {  
  
    private static Logger _log = LoggerFactory.getLogger(NewJob.class);  
     
    public NewJob() {  
          
    }  
     
    public void execute(JobExecutionContext context)  
        throws JobExecutionException {  
        _log.error("New Job执行时间: " + new Date());  
          
    }  
}  