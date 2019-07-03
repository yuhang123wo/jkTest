package com.yuhang.demo.util;

import java.util.Date;
import java.util.List;

import com.yuhang.demo.RuleDto;


public class ActivityRebateDto {
	private String name;
	private String startTime;
	private String endTime;
	private int rebateType;
	private List<Long> userIds;
	private long supplierId;
	
	private Long activityId;
	
	
	

	public Long getActivityId() {
		return activityId;
	}

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	private List<RuleDto> listRule;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public int getRebateType() {
		return rebateType;
	}

	public void setRebateType(int rebateType) {
		this.rebateType = rebateType;
	}

	public List<Long> getUserIds() {
		return userIds;
	}

	public void setUserIds(List<Long> userIds) {
		this.userIds = userIds;
	}

	public long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	public List<RuleDto> getListRule() {
		return listRule;
	}

	public void setListRule(List<RuleDto> listRule) {
		this.listRule = listRule;
	}
}
