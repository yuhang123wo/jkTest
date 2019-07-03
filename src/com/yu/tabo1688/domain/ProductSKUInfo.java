package com.yu.tabo1688.domain;

public class ProductSKUInfo {
	private SKUAttrInfo[] attributes;// SKU属性值，可填多组信息
	private String cargoNumber;// 指定规格的货号，国际站无需关注
	private Integer amountOnSale;// 可销售数量，国际站无需关注
	private double retailPrice;// 建议零售价，国际站无需关注
	private Double price;// 报价时该规格的单价，国际站注意要点：含有SKU属性的在线批发产品设定具体价格时使用此值，若设置阶梯价格则使用priceRange
	private ProductPriceRange[] priceRange;//
	private String skuCode;
	private String skuId;
	private String specId;

	public SKUAttrInfo[] getAttributes() {
		return attributes;
	}

	public void setAttributes(SKUAttrInfo[] attributes) {
		this.attributes = attributes;
	}

	public String getCargoNumber() {
		return cargoNumber;
	}

	public void setCargoNumber(String cargoNumber) {
		this.cargoNumber = cargoNumber;
	}

	public Integer getAmountOnSale() {
		return amountOnSale;
	}

	public void setAmountOnSale(Integer amountOnSale) {
		this.amountOnSale = amountOnSale;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ProductPriceRange[] getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(ProductPriceRange[] priceRange) {
		this.priceRange = priceRange;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSpecId() {
		return specId;
	}

	public void setSpecId(String specId) {
		this.specId = specId;
	}

}
