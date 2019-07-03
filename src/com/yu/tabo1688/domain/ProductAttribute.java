package com.yu.tabo1688.domain;

public class ProductAttribute {

	private String attributeID;
	private String attributeName;// 属性名称
	private String valueID;// 属性值ID 123456
	private String value;// 属性值 grey
	private boolean isCustom;// 是否为自定义属性，国际站无需关注 true

	public ProductAttribute() {
		super();
	}

	public ProductAttribute(String attributeID, String attributeName, String valueID, String value,
			boolean isCustom) {
		super();
		this.attributeID = attributeID;
		this.attributeName = attributeName;
		this.valueID = valueID;
		this.value = value;
		this.isCustom = isCustom;
	}

	public String getAttributeID() {
		return attributeID;
	}

	public void setAttributeID(String attributeID) {
		this.attributeID = attributeID;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getValueID() {
		return valueID;
	}

	public void setValueID(String valueID) {
		this.valueID = valueID;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isCustom() {
		return isCustom;
	}

	public void setCustom(boolean isCustom) {
		this.isCustom = isCustom;
	}

}
