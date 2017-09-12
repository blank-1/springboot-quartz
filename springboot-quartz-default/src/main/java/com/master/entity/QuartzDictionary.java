package com.master.entity;

import java.util.Date;

public class QuartzDictionary extends BaseEntity{
	
	private String quartzName;
	
	private String quartzClass;
	
	private String status;
	
	private Date createDate;
	
	private Date updateDate;


	public String getQuartzName() {
		return quartzName;
	}

	public void setQuartzName(String quartzName) {
		this.quartzName = quartzName;
	}

	public String getQuartzClass() {
		return quartzClass;
	}

	public void setQuartzClass(String quartzClass) {
		this.quartzClass = quartzClass;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
