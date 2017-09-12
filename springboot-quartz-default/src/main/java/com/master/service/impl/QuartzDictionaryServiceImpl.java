package com.master.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.master.dao.QuartzDictionaryMapper;
import com.master.entity.QuartzDictionary;
import com.master.service.IQuartzDictionaryService;

@Service
@Transactional
public class QuartzDictionaryServiceImpl implements IQuartzDictionaryService{
	@Autowired
	private QuartzDictionaryMapper quartzDictionaryMapper;

	@Transactional(rollbackFor= {Exception.class})
	@Override
	public void batchAddQuartzAddQuartz(List<QuartzDictionary> jobs) {
		quartzDictionaryMapper.batchAddQuartz(jobs);
	}

	@Override
	public void delteAllJobs() {
		quartzDictionaryMapper.delteAllJobs();
	}

	

}
