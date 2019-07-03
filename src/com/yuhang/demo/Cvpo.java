package com.yuhang.demo;

public class Cvpo {

	private Long customerId;
	private String comments;

	
	
	public Cvpo() {
	}

	public Cvpo(Long customerId, String comments) {
		this.customerId = customerId;
		this.comments = comments;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
