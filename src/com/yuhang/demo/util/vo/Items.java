package com.yuhang.demo.util.vo;

import java.math.BigDecimal;

public class Items {
	private int supplierId;
	private String supplier;
	private String phone;
	private String address;
	private String artNo;
	private int itemId;
	private int skuId;
	private String title;
	private String picUrl;
	private BigDecimal price;
	private int num;
	private BigDecimal amount;
	private String color;
	private String size;
	
	private int supplyType;// 供货价类型（0：按交易量设置梯度价格，1：按产品规格设置价格） 
	
	private BigDecimal reduceAmount;//减少价格
	
	

	public BigDecimal getReduceAmount() {
		return reduceAmount;
	}

	public void setReduceAmount(BigDecimal reduceAmount) {
		this.reduceAmount = reduceAmount;
	}

	public int getSupplyType() {
		return supplyType;
	}

	public void setSupplyType(int supplyType) {
		this.supplyType = supplyType;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getArtNo() {
		return artNo;
	}

	public void setArtNo(String artNo) {
		this.artNo = artNo;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getSkuId() {
		return skuId;
	}

	public void setSkuId(int skuId) {
		this.skuId = skuId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Items(int supplierId, String supplier, String phone, String address, String artNo,
			int itemId, int skuId, String title, String picUrl, BigDecimal price, int num,
			BigDecimal amount, String color, String size) {
		this.supplierId = supplierId;
		this.supplier = supplier;
		this.phone = phone;
		this.address = address;
		this.artNo = artNo;
		this.itemId = itemId;
		this.skuId = skuId;
		this.title = title;
		this.picUrl = picUrl;
		this.price = price;
		this.num = num;
		this.amount = amount;
		this.color = color;
		this.size = size;
	}

	public Items() {
	}

}
