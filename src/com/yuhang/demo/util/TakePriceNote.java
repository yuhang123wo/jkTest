package com.yuhang.demo.util;

import java.util.List;

public class TakePriceNote {

	private long userId;
	private long shopItemId;
	private List<TakePriceSub> sub;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getShopItemId() {
		return shopItemId;
	}

	public void setShopItemId(long shopItemId) {
		this.shopItemId = shopItemId;
	}

	public List<TakePriceSub> getSub() {
		return sub;
	}

	public void setSub(List<TakePriceSub> sub) {
		this.sub = sub;
	}

}
