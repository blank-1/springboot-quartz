package com.master.dao;

import java.util.List;

import com.master.entity.QuartzDictionary;

public interface QuartzDictionaryMapper {
	
	public void batchAddQuartz(List<QuartzDictionary> quartzs);
	
	public void delteAllJobs();

}
