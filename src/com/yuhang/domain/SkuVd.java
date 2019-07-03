package com.yuhang.domain;

import java.math.BigDecimal;

/**
 * 
 * @author yuhang
 * @Date 2017年8月18日
 * @desc 微店SKU
 */
public class SkuVd {
	private String sku_merchant_code;// false型号编码
	private String img;// false添加多级sku时使用，多级sku的attr_id只能有一张图片，且以attr_id中对应的属性中的img为准，非多级sku则使用本图片
	private int stock;// true库存量
	private BigDecimal price;// true价格
	private String title;// sku名称
	private AttrVd[] attr_ids;// false多级SKU属性id(这里的id和title中的名称对应)764651-L,764647-蓝色注意:添加多级SKU商品时为必传项若无则传[]值顺序需要与attr_list中顺序一致

	public String getSku_merchant_code() {
		return sku_merchant_code;
	}

	public void setSku_merchant_code(String sku_merchant_code) {
		this.sku_merchant_code = sku_merchant_code;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public AttrVd[] getAttr_ids() {
		return attr_ids;
	}

	public void setAttr_ids(AttrVd[] attr_ids) {
		this.attr_ids = attr_ids;
	}

}
