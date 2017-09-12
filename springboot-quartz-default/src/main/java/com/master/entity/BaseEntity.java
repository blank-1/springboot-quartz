package com.master.entity;

import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

public class BaseEntity {
	private String  id;         //主键ID   UUid
	
	public String getId() {
		if(StringUtils.isBlank(id)){
			this.id = UUID.randomUUID().toString().replaceAll("-", "");
		}
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
