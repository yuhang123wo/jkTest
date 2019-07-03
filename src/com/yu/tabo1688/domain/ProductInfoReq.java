package com.yu.tabo1688.domain;

import java.util.Arrays;

public class ProductInfoReq {
	private String productType;
	private String categoryID; // 类目ID，由相应类目API获取
	private ProductAttribute[] attributes;// 商品属性和属性值
	private String groupID;
	private String subject;// 商品标题
	private String description;
	private String language;// 语种
	private Integer periodOfValidity;// 信息有效期
	private Integer bizType;// 业务类型。1：商品，2：加工，3：代理，4：合作，5：商务服务；不传入默认按照商品发布；国际站按默认商品。
	private boolean pictureAuth;// 是否图片私密信息，国际站此字段无效
	private ProductImageInfo image;// 商品主图
	private ProductSKUInfo[] skuInfos;// SKU信息，这里可传入多组信息
	private ProductSaleInfo saleInfo;// 商品销售信息
	private ProductShippingInfo shippingInfo;// 商品物流信息
	private ProductInternationalTradeInfo internationalTradeInfo;// 商品国际贸易信息，1688无需处理此字段
	private String webSite;// 站点信息，指定调用的API是属于国际站（alibaba）还是1688网站（1688）

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public ProductAttribute[] getAttributes() {
		return attributes;
	}

	public void setAttributes(ProductAttribute[] attributes) {
		this.attributes = attributes;
	}

	public String getGroupID() {
		return groupID;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getPeriodOfValidity() {
		return periodOfValidity;
	}

	public void setPeriodOfValidity(Integer periodOfValidity) {
		this.periodOfValidity = periodOfValidity;
	}

	public Integer getBizType() {
		return bizType;
	}

	public void setBizType(Integer bizType) {
		this.bizType = bizType;
	}

	public boolean isPictureAuth() {
		return pictureAuth;
	}

	public void setPictureAuth(boolean pictureAuth) {
		this.pictureAuth = pictureAuth;
	}

	public ProductImageInfo getImage() {
		return image;
	}

	public void setImage(ProductImageInfo image) {
		this.image = image;
	}

	public ProductSKUInfo[] getSkuInfos() {
		return skuInfos;
	}

	public void setSkuInfos(ProductSKUInfo[] skuInfos) {
		this.skuInfos = skuInfos;
	}

	public ProductSaleInfo getSaleInfo() {
		return saleInfo;
	}

	public void setSaleInfo(ProductSaleInfo saleInfo) {
		this.saleInfo = saleInfo;
	}

	public ProductShippingInfo getShippingInfo() {
		return shippingInfo;
	}

	public void setShippingInfo(ProductShippingInfo shippingInfo) {
		this.shippingInfo = shippingInfo;
	}

	public ProductInternationalTradeInfo getInternationalTradeInfo() {
		return internationalTradeInfo;
	}

	public void setInternationalTradeInfo(ProductInternationalTradeInfo internationalTradeInfo) {
		this.internationalTradeInfo = internationalTradeInfo;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	@Override
	public String toString() {
		return "ProductInfoReq [productType=" + productType + ", categoryID=" + categoryID
				+ ", attributes=" + Arrays.toString(attributes) + ", groupID=" + groupID
				+ ", subject=" + subject + ", description=" + description + ", language="
				+ language + ", periodOfValidity=" + periodOfValidity + ", bizType=" + bizType
				+ ", pictureAuth=" + pictureAuth + ", image=" + image + ", skuInfos="
				+ Arrays.toString(skuInfos) + ", saleInfo=" + saleInfo + ", shippingInfo="
				+ shippingInfo + ", internationalTradeInfo=" + internationalTradeInfo
				+ ", webSite=" + webSite + "]";
	}

}
