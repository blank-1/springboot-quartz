package com.master.entity;

import java.io.Serializable;
import java.math.BigInteger;

import org.apache.commons.lang3.StringUtils;

public class JobAndTrigger implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2944023999477191376L;
	private String jobName;
	private String jobGroup;
	private String jobClassName;
	private String triggerName;
	private String triggerGroup;
	private BigInteger repeatInterval;
	private BigInteger timesTriggered;
	private String cronExpression;
	private String timeZoneId;
	private String triggerState;//状态
	
	
	
	public String getTriggerState() {
		if(StringUtils.isNotBlank(triggerState)) {
			return JobAndTrigger.TriggerState.getValueByKey(triggerState);
		}
		return triggerState;
	}
	public void setTriggerState(String triggerState) {
		this.triggerState = triggerState;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getJobGroup() {
		return jobGroup;
	}
	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup;
	}
	public String getJobClassName() {
		return jobClassName;
	}
	public void setJobClassName(String jobClassName) {
		this.jobClassName = jobClassName;
	}
	public String getTriggerName() {
		return triggerName;
	}
	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}
	public String getTriggerGroup() {
		return triggerGroup;
	}
	public void setTriggerGroup(String triggerGroup) {
		this.triggerGroup = triggerGroup;
	}
	public BigInteger getRepeatInterval() {
		return repeatInterval;
	}
	public void setRepeatInterval(BigInteger repeatInterval) {
		this.repeatInterval = repeatInterval;
	}
	public BigInteger getTimesTriggered() {
		return timesTriggered;
	}
	public void setTimesTriggered(BigInteger timesTriggered) {
		this.timesTriggered = timesTriggered;
	}
	public String getCronExpression() {
		return cronExpression;
	}
	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}
	public String getTimeZoneId() {
		return timeZoneId;
	}
	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}
	
	/**
	 * 状态枚举
	 * @author txo
	 *
	 */
	public enum TriggerState{
		STATE_WAITING("WAITING","启用"),
		STATE_PAUSED("PAUSED","暂停");
		
		
		private String key;
		private String value;
		
		
	    private TriggerState(String key, String value) {
	        this.key = key;
	        this.value = value;
	    }

	    
	    public static String getValueByKey(String key) {
	        for (TriggerState c : TriggerState.values()) {
	            if (c.getKey().equals(key)) {
	                return c.getValue();
	            }
	        }
	        return null;
	    }

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	    
	}
}
