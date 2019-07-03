package com.yu.tabo1688.domain;

public class ProductShippingInfo {

	private String freightTemplateID;
	private String unitWeight;
	private String packageSize;
	private Integer volume;
	private Integer handlingTime;
	private String sendGoodsAddressId;

	public String getFreightTemplateID() {
		return freightTemplateID;
	}

	public void setFreightTemplateID(String freightTemplateID) {
		this.freightTemplateID = freightTemplateID;
	}

	public String getUnitWeight() {
		return unitWeight;
	}

	public void setUnitWeight(String unitWeight) {
		this.unitWeight = unitWeight;
	}

	public String getPackageSize() {
		return packageSize;
	}

	public void setPackageSize(String packageSize) {
		this.packageSize = packageSize;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public Integer getHandlingTime() {
		return handlingTime;
	}

	public void setHandlingTime(Integer handlingTime) {
		this.handlingTime = handlingTime;
	}

	public String getSendGoodsAddressId() {
		return sendGoodsAddressId;
	}

	public void setSendGoodsAddressId(String sendGoodsAddressId) {
		this.sendGoodsAddressId = sendGoodsAddressId;
	}

}
