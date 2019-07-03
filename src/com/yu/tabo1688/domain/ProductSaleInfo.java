package com.yu.tabo1688.domain;

public class ProductSaleInfo {
	private boolean supportOnlineTrade;// 是否支持网上交易。true：支持 false：不支持
	private boolean mixWholeSale;// 是否支持混批，国际站无需关注此字段 TRUE
	private String saleType;// 销售方式，按件卖(normal)或者按批卖(batch)，1688站点无需关注此字段 normal
	private boolean priceAuth;// 是否价格私密信息，国际站无需关注此字段 TRUE
	private ProductPriceRange[] priceRanges;// 区间价格。按数量范围设定的区间价格
	private Double amountOnSale;// 可售数量，国际站无需关注此字段
	private String unit;// 计量单位
	private Integer minOrderQuantity;// 最小起订量，范围是1-99999。1688无需处理此字段
	private Integer batchNumber;// 每批数量
	private Double retailprice;// 建议零售价，国际站无需关注
	private String tax;// 税率相关信息，内容由用户自定，国际站无需关注
	private String sellunit;// 售卖单位，如果为批量售卖，代表售卖的单位，例如1"手"=12“件"的"手"
	private Integer quoteType;// 普通报价-FIXED_PRICE("0"),SKU规格报价-SKU_PRICE("1"),SKU区间报价（商品维度）-SKU_PRICE_RANGE_FOR_OFFER("2"),SKU区间报价（SKU维度）-SKU_PRICE_RANGE("3")，国际站无需关注

	public boolean isSupportOnlineTrade() {
		return supportOnlineTrade;
	}

	public void setSupportOnlineTrade(boolean supportOnlineTrade) {
		this.supportOnlineTrade = supportOnlineTrade;
	}

	public boolean isMixWholeSale() {
		return mixWholeSale;
	}

	public void setMixWholeSale(boolean mixWholeSale) {
		this.mixWholeSale = mixWholeSale;
	}

	public String getSaleType() {
		return saleType;
	}

	public void setSaleType(String saleType) {
		this.saleType = saleType;
	}

	public boolean isPriceAuth() {
		return priceAuth;
	}

	public void setPriceAuth(boolean priceAuth) {
		this.priceAuth = priceAuth;
	}

	public ProductPriceRange[] getPriceRanges() {
		return priceRanges;
	}

	public void setPriceRanges(ProductPriceRange[] priceRanges) {
		this.priceRanges = priceRanges;
	}

	public Double getAmountOnSale() {
		return amountOnSale;
	}

	public void setAmountOnSale(Double amountOnSale) {
		this.amountOnSale = amountOnSale;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Integer getMinOrderQuantity() {
		return minOrderQuantity;
	}

	public void setMinOrderQuantity(Integer minOrderQuantity) {
		this.minOrderQuantity = minOrderQuantity;
	}

	public Integer getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(Integer batchNumber) {
		this.batchNumber = batchNumber;
	}

	public Double getRetailprice() {
		return retailprice;
	}

	public void setRetailprice(Double retailprice) {
		this.retailprice = retailprice;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getSellunit() {
		return sellunit;
	}

	public void setSellunit(String sellunit) {
		this.sellunit = sellunit;
	}

	public Integer getQuoteType() {
		return quoteType;
	}

	public void setQuoteType(Integer quoteType) {
		this.quoteType = quoteType;
	}

}
