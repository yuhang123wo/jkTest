package com.yuhang.demo.vo;

public class CertifyVO {

	private String amount;

	private long targetId;

	
	
	
	public CertifyVO() {
	}

	public CertifyVO(String amount, long targetId) {
		this.amount = amount;
		this.targetId = targetId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public long getTargetId() {
		return targetId;
	}

	public void setTargetId(long targetId) {
		this.targetId = targetId;
	}
	
	
}
