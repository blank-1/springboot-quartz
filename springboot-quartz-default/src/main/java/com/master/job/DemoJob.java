package com.master.job;


import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Component
public class DemoJob implements BaseJob {
	
	private static Logger _log = LoggerFactory.getLogger(DemoJob.class); 

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		_log.info("----------DemoJob--------");
	}



}
