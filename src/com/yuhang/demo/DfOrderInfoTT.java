package com.yuhang.demo;

import java.math.BigDecimal;

public class DfOrderInfoTT {

	private Long orderId;

	private Long expressId;

	private String receiverName;

	/**
	 * 收件人电话
	 */
	private String receiverPhone;

	/**
	 * 收件人地址
	 */
	private String receiverAddress;

	/**
	 * 收件人所在省
	 */
	private String recevierProvince;

	/**
	 * 收件人所在市
	 */
	private String recevierCity;

	/**
	 * 收件人所在区
	 */
	private String recevierDistrict;

	private String comments;

	private BigDecimal freight;

	private BigDecimal amount;

	private BigDecimal price;

	private BigDecimal servicePrice;
	
	private BigDecimal chargeInspection;
	
	

	public BigDecimal getChargeInspection() {
		return chargeInspection;
	}

	public void setChargeInspection(BigDecimal chargeInspection) {
		this.chargeInspection = chargeInspection;
	}

	public BigDecimal getServicePrice() {
		return servicePrice;
	}

	public void setServicePrice(BigDecimal servicePrice) {
		this.servicePrice = servicePrice;
	}

	public BigDecimal getFreight() {
		return freight;
	}

	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}


	public Long getExpressId() {
		return expressId;
	}

	public void setExpressId(Long expressId) {
		this.expressId = expressId;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getRecevierProvince() {
		return recevierProvince;
	}

	public void setRecevierProvince(String recevierProvince) {
		this.recevierProvince = recevierProvince;
	}

	public String getRecevierCity() {
		return recevierCity;
	}

	public void setRecevierCity(String recevierCity) {
		this.recevierCity = recevierCity;
	}

	public String getRecevierDistrict() {
		return recevierDistrict;
	}

	public void setRecevierDistrict(String recevierDistrict) {
		this.recevierDistrict = recevierDistrict;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
