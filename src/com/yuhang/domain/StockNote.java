package com.yuhang.domain;

import java.util.List;

public class StockNote {

	private long shopItemId;
	private long userId;
	private List<StockQtyNote> stocks;

	public long getShopItemId() {
		return shopItemId;
	}

	public void setShopItemId(long shopItemId) {
		this.shopItemId = shopItemId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public List<StockQtyNote> getStocks() {
		return stocks;
	}

	public void setStocks(List<StockQtyNote> stocks) {
		this.stocks = stocks;
	}

}
