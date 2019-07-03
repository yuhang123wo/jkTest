package com.yuhang.demo.util.vo;

import java.util.List;

public class CreateOrder {

	private SourceType sourceType;
	private int collect;
	private String remark;
	private CreateOrderReceivers receivers;
	private int dsId;
	private long shopOrderId;
	private String shopSourceNo;
	private String shopSourceType;
	private List<Items> items;

	private Fee fee;
	private int expressId;
	private String expressName;
	private String expressNo;

	
	
	public long getShopOrderId() {
		return shopOrderId;
	}

	public void setShopOrderId(long shopOrderId) {
		this.shopOrderId = shopOrderId;
	}

	public String getShopSourceNo() {
		return shopSourceNo;
	}

	public void setShopSourceNo(String shopSourceNo) {
		this.shopSourceNo = shopSourceNo;
	}

	public String getShopSourceType() {
		return shopSourceType;
	}

	public void setShopSourceType(String shopSourceType) {
		this.shopSourceType = shopSourceType;
	}

	public SourceType getSourceType() {
		return sourceType;
	}

	public void setSourceType(SourceType sourceType) {
		this.sourceType = sourceType;
	}

	public int getCollect() {
		return collect;
	}

	public void setCollect(int collect) {
		this.collect = collect;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public CreateOrderReceivers getReceivers() {
		return receivers;
	}

	public void setReceivers(CreateOrderReceivers receivers) {
		this.receivers = receivers;
	}

	public int getDsId() {
		return dsId;
	}

	public void setDsId(int dsId) {
		this.dsId = dsId;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public Fee getFee() {
		return fee;
	}

	public void setFee(Fee fee) {
		this.fee = fee;
	}

	public int getExpressId() {
		return expressId;
	}

	public void setExpressId(int expressId) {
		this.expressId = expressId;
	}

	public String getExpressName() {
		return expressName;
	}

	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}

	public String getExpressNo() {
		return expressNo;
	}

	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

}
