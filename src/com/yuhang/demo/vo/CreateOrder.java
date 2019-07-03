package com.yuhang.demo.vo;

import java.math.BigDecimal;
import java.util.List;

public class CreateOrder {

	private long userId;
	private String token;
	private long prdId;
	private Long receiverAddressId;

	private String buyerComments;

	private List<Items> items;

	private int expressId;

	private String expressName;

	private BigDecimal price;

	private BigDecimal amount;

	private int collect;

	private BigDecimal freight;
	
	private int shippingTag;
	
	private String version;
	
	
	
	

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getShippingTag() {
		return shippingTag;
	}

	public void setShippingTag(int shippingTag) {
		this.shippingTag = shippingTag;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public long getPrdId() {
		return prdId;
	}

	public void setPrdId(long prdId) {
		this.prdId = prdId;
	}

	public Long getReceiverAddressId() {
		return receiverAddressId;
	}

	public void setReceiverAddressId(Long receiverAddressId) {
		this.receiverAddressId = receiverAddressId;
	}

	public String getBuyerComments() {
		return buyerComments;
	}

	public void setBuyerComments(String buyerComments) {
		this.buyerComments = buyerComments;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public int getExpressId() {
		return expressId;
	}

	public void setExpressId(int expressId) {
		this.expressId = expressId;
	}

	public String getExpressName() {
		return expressName;
	}

	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public int getCollect() {
		return collect;
	}

	public void setCollect(int collect) {
		this.collect = collect;
	}

	public BigDecimal getFreight() {
		return freight;
	}

	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}

}
