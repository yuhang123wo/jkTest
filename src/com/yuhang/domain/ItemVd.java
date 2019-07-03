package com.yuhang.domain;

import java.math.BigDecimal;

/**
 * 
 * @author yuhang
 * @Date 2017年8月18日
 * @desc 微店商品
 */
public class ItemVd {

	private long userId;
	private long shopId;
	private long itemId;
	
	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	private int remote_free_delivery;// false偏远地区是否包邮：1包邮，0不包邮只有在free_delivery为1时候有效，当free_delivery为0时无论传入何值都不包邮
	private String[] titles;// true商品图片描述
	private int stock;// true库存量，sku商品以sku中的数量为准
	private String item_comment;// false商品描述
	private String merchant_code;// false商品编号
	private String[] bigImgs;// true商品图片
	private int status;// true status=1或不传为在架商品，status=2为下架商品,4表示下架和在架商品
	private int free_delivery;// true是否包邮：0不包邮，1包邮
	private SkuVd[] sku;// falsesku数组
	private String item_name;// true商品描述
	private BigDecimal price;// 价格

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getRemote_free_delivery() {
		return remote_free_delivery;
	}

	public void setRemote_free_delivery(int remote_free_delivery) {
		this.remote_free_delivery = remote_free_delivery;
	}

	public String[] getTitles() {
		return titles;
	}

	public void setTitles(String[] titles) {
		this.titles = titles;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getItem_comment() {
		return item_comment;
	}

	public void setItem_comment(String item_comment) {
		this.item_comment = item_comment;
	}

	public String getMerchant_code() {
		return merchant_code;
	}

	public void setMerchant_code(String merchant_code) {
		this.merchant_code = merchant_code;
	}

	public String[] getBigImgs() {
		return bigImgs;
	}

	public void setBigImgs(String[] bigImgs) {
		this.bigImgs = bigImgs;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getFree_delivery() {
		return free_delivery;
	}

	public void setFree_delivery(int free_delivery) {
		this.free_delivery = free_delivery;
	}

	public SkuVd[] getSku() {
		return sku;
	}

	public void setSku(SkuVd[] sku) {
		this.sku = sku;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getShopId() {
		return shopId;
	}

	public void setShopId(long shopId) {
		this.shopId = shopId;
	}

}
