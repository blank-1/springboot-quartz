package com.master.service;

import java.util.List;

import com.master.entity.QuartzDictionary;

public interface IQuartzDictionaryService {
	public void batchAddQuartzAddQuartz(List<QuartzDictionary> jobs);
	
	public void delteAllJobs();
}
