package com.yuhang.demo.vo;

import java.math.BigDecimal;

public class UpdateSkuPo {

	private Long prdSkuId;

	private BigDecimal price;

	private BigDecimal batchPrice;

	private String color;

	private String size;

	private Integer batchNum;

	public Integer getBatchNum() {
		return batchNum;
	}

	public void setBatchNum(Integer batchNum) {
		this.batchNum = batchNum;
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

	public Long getPrdSkuId() {
		return prdSkuId;
	}

	public void setPrdSkuId(Long prdSkuId) {
		this.prdSkuId = prdSkuId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getBatchPrice() {
		return batchPrice;
	}

	public void setBatchPrice(BigDecimal batchPrice) {
		this.batchPrice = batchPrice;
	}
}
