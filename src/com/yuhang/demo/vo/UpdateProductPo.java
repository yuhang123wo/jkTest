package com.yuhang.demo.vo;

import java.math.BigDecimal;
import java.util.List;

public class UpdateProductPo {

	private Long userId;

	private Long productId;

	private String title;

	private BigDecimal weight;

	private List<UpdateSkuPo> skus;

	private String originPrice;// 原价
	private String reward;// 推广奖励
	private Integer shippingTag;// 是否包邮(0:否,1:是)
	private Integer batchTag;

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

	public Integer getBatchTag() {
		return batchTag;
	}

	public void setBatchTag(Integer batchTag) {
		this.batchTag = batchTag;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public List<UpdateSkuPo> getSkus() {
		return skus;
	}

	public void setSkus(List<UpdateSkuPo> skus) {
		this.skus = skus;
	}

}
