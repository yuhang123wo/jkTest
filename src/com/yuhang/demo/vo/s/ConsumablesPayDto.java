package com.yuhang.demo.vo.s;

import java.util.List;

public class ConsumablesPayDto {
	private Long userId;//
	private String amount;// 总金额
	private List<Long> orders;// 订单ID列表
	private String pwd;
	private String type;
	
	private String notifyUrl;
	private String returnUrl;
	
	

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}



	public List<Long> getOrders() {
		return orders;
	}

	public void setOrders(List<Long> orders) {
		this.orders = orders;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
