package com.yuhang.demo.util;

import java.math.BigDecimal;
import java.util.List;

public class OrderPayDto {
	private Long userId;//
	private String amount;// 总金额
	private List<Long> orders;// 订单ID列表
	private String pwd;
	private PayType type;
	private String rate;

	// app支付时传
	private String notifyUrl;
	private String returnUrl;

	private String onlineyPay;
	private String blancePay;

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

	public String getOnlineyPay() {
		return onlineyPay;
	}

	public void setOnlineyPay(String onlineyPay) {
		this.onlineyPay = onlineyPay;
	}

	public String getBlancePay() {
		return blancePay;
	}

	public void setBlancePay(String blancePay) {
		this.blancePay = blancePay;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	private String couponId;// 优惠券ID

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
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

	public PayType getType() {
		return type;
	}

	public void setType(PayType type) {
		this.type = type;
	}

}