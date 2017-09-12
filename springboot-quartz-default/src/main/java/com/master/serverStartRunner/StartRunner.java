package com.master.serverStartRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.master.entity.QuartzDictionary;
import com.master.job.BaseJob;
import com.master.service.IQuartzDictionaryService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 服务启动类(用于服务启动，新增job字典)
 * @author txo
 *
 */
@Component
public class StartRunner implements CommandLineRunner,ApplicationContextAware {
	
	private ApplicationContext applicationContext;
	@Autowired
	private IQuartzDictionaryService quartzDictionaryService;

	@Override
	public void run(String... arg0) throws Exception {
		Map<String, BaseJob> map = applicationContext.getBeansOfType(BaseJob.class);
		List<QuartzDictionary> jobObjs = new ArrayList<QuartzDictionary>();
		for (String key : map.keySet()) {
			Class<? extends BaseJob> c=map.get(key).getClass();
			QuartzDictionary quartzDic = new QuartzDictionary();
			quartzDic.setQuartzName(key);
			quartzDic.setCreateDate(new Date());
			quartzDic.setStatus("00");
			quartzDic.setQuartzClass(c.getName());
			quartzDic.setUpdateDate(new Date());
			quartzDic.setId(quartzDic.getId());
			jobObjs.add(quartzDic);
		}
		
		//建议以下两部操作进行缓存操作（例如redis）
		//先进性清除所有定时任务
		quartzDictionaryService.delteAllJobs();
		//批量插入定时任务
		quartzDictionaryService.batchAddQuartzAddQuartz(jobObjs);
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		applicationContext=arg0 ;
		
	}

}
