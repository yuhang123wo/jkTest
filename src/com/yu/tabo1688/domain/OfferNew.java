package com.yu.tabo1688.domain;

import java.util.List;

public class OfferNew {
	private String productFeatures;// 属性
	private List<OfferImageInfo> imageUriList;// 产品图片3张
	private String skuPics;// sku图片
	private String bizType;// 贸易类型。1：产品，2：加工，3：代理，4：合作，5：商务服务 不传入默认按照产品发布
	private String categoryID;// 分类ID
	private boolean supportOnlineTrade;// 是否支持网上交易。true：支持 false：不支持
	private boolean pictureAuthOffer;// 是否图片私密信息
	private boolean priceAuthOffer;// 是否价格私密信息
	private boolean mixWholeSale;// 是否支持混批
	private String subject;// 标题
	private String freightType;// 运费类型。T（运费模板） D（运费说明） F（卖家承担运费）
	private String sendGoodsAddressId;// 发货地址id
	private String freightTemplateId;// 物流模板。卖家承担时模板ID为61
	private String amountOnSale;// 可售数量
	private String priceRanges;// 区间价格。每个区间之间用`分割，冒号前面是起订量，后面是价格
	private String offerWeight;// 单位重量
	private String userCategorys;// 自定义类目信息
	private String periodOfValidity;// 信息有效期

	public String getProductFeatures() {
		return productFeatures;
	}

	public void setProductFeatures(String productFeatures) {
		this.productFeatures = productFeatures;
	}

	public List<OfferImageInfo> getImageUriList() {
		return imageUriList;
	}

	public void setImageUriList(List<OfferImageInfo> imageUriList) {
		this.imageUriList = imageUriList;
	}

	public String getSkuPics() {
		return skuPics;
	}

	public void setSkuPics(String skuPics) {
		this.skuPics = skuPics;
	}

	public String getBizType() {
		return bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public boolean isSupportOnlineTrade() {
		return supportOnlineTrade;
	}

	public void setSupportOnlineTrade(boolean supportOnlineTrade) {
		this.supportOnlineTrade = supportOnlineTrade;
	}

	public boolean isPictureAuthOffer() {
		return pictureAuthOffer;
	}

	public void setPictureAuthOffer(boolean pictureAuthOffer) {
		this.pictureAuthOffer = pictureAuthOffer;
	}

	public boolean isPriceAuthOffer() {
		return priceAuthOffer;
	}

	public void setPriceAuthOffer(boolean priceAuthOffer) {
		this.priceAuthOffer = priceAuthOffer;
	}

	public boolean isMixWholeSale() {
		return mixWholeSale;
	}

	public void setMixWholeSale(boolean mixWholeSale) {
		this.mixWholeSale = mixWholeSale;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getFreightType() {
		return freightType;
	}

	public void setFreightType(String freightType) {
		this.freightType = freightType;
	}

	public String getSendGoodsAddressId() {
		return sendGoodsAddressId;
	}

	public void setSendGoodsAddressId(String sendGoodsAddressId) {
		this.sendGoodsAddressId = sendGoodsAddressId;
	}

	public String getFreightTemplateId() {
		return freightTemplateId;
	}

	public void setFreightTemplateId(String freightTemplateId) {
		this.freightTemplateId = freightTemplateId;
	}

	public String getAmountOnSale() {
		return amountOnSale;
	}

	public void setAmountOnSale(String amountOnSale) {
		this.amountOnSale = amountOnSale;
	}

	public String getPriceRanges() {
		return priceRanges;
	}

	public void setPriceRanges(String priceRanges) {
		this.priceRanges = priceRanges;
	}

	public String getOfferWeight() {
		return offerWeight;
	}

	public void setOfferWeight(String offerWeight) {
		this.offerWeight = offerWeight;
	}

	public String getUserCategorys() {
		return userCategorys;
	}

	public void setUserCategorys(String userCategorys) {
		this.userCategorys = userCategorys;
	}

	public String getPeriodOfValidity() {
		return periodOfValidity;
	}

	public void setPeriodOfValidity(String periodOfValidity) {
		this.periodOfValidity = periodOfValidity;
	}

}
