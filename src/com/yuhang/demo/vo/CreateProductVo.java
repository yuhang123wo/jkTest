package com.yuhang.demo.vo;

import java.math.BigDecimal;
import java.util.List;

public class CreateProductVo {

	private Long prdId;
	private String sign;

	private String timestamp;
	
	private Long productId;

	private String title;

	private List<String> images;

	private BigDecimal weight;

	private BigDecimal price;

	private List<SkuVo> skus;

	private Long supplierId;

	private String supplierName;

	private String articleNumber;

	private String brand;
	
	private String video;
	
	private String originPrice;//原价
	
	private String reward;//推广奖励
	
	private Integer shippingTag;// 是否包邮(0:否,1:是)
	
	private Integer batchTag;
	
	
	 
 

	public Integer getBatchTag() {
		return batchTag;
	}

	public void setBatchTag(Integer batchTag) {
		this.batchTag = batchTag;
	}

	public String getOriginPrice() {
		return originPrice;
	}

	public void setOriginPrice(String originPrice) {
		this.originPrice = originPrice;
	}

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	public Integer getShippingTag() {
		return shippingTag;
	}

	public void setShippingTag(Integer shippingTag) {
		this.shippingTag = shippingTag;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public Long getPrdId() {
		return prdId;
	}

	public void setPrdId(Long prdId) {
		this.prdId = prdId;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getArticleNumber() {
		return articleNumber;
	}

	public void setArticleNumber(String articleNumber) {
		this.articleNumber = articleNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}



	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public List<SkuVo> getSkus() {
		return skus;
	}

	public void setSkus(List<SkuVo> skus) {
		this.skus = skus;
	}

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

}
