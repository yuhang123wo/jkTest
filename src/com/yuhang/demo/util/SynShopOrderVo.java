package com.yuhang.demo.util;

public class SynShopOrderVo {

	private long shopId;
	private String startTime;
	private String endTime;
	private Integer state;
	private String ati;

	public String getAti() {
		return ati;
	}

	public void setAti(String ati) {
		this.ati = ati;
	}

	public long getShopId() {
		return shopId;
	}

	public void setShopId(long shopId) {
		this.shopId = shopId;
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

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "SynShopOrderVo [shopId=" + shopId + ", startTime=" + startTime + ", endTime="
				+ endTime + ", state=" + state + ", ati=" + ati + "]";
	}

}
