package com.yuhang.demo.vo.s;

import java.math.BigDecimal;
import java.util.List;

public class ConsumeOrderInfo {

	/**
	 * 收件地址ID-(如果是用的已存在的地址时必须填入)
	 */
	private Long receiverAddressId;

	/**
	 * 收件省
	 */
	private Integer receiverProvince;

	/**
	 * 
	 */
	private String receiverProvinceName;

	/**
	 * 收件市
	 */
	private Integer receiverCity;
	/**
	 * 
	 */
	private String receiverCityName;
	/**
	 * 收件区
	 */
	private Integer receiverCounty;

	/**
	 * 
	 */
	private String receiverCountyName;

	/**
	 * 收件人纤细地址
	 */
	private String receiverAddress;

	/**
	 * 收件人姓名
	 */
	private String receiverName;
	/**
	 * 收件人电话
	 */
	private String receiverPhone;

	/**
	 * 订单备注
	 */
	private String comments;

	/**
	 * 快递ID
	 */
	private Integer expressId;

	/**
	 * 货款
	 */
	private BigDecimal price;

	/**
	 * 总金额
	 */
	private BigDecimal amount;

	/**
	 * 快递费
	 */
	private BigDecimal freight;

	/**
	 * 是否货到付款 0 否 1是
	 */
	private Integer collect;
	/**
	 * 下单设备：0-电脑、1-安卓、2-苹果
	 */
	private Integer device;
	/**
	 * 0:自提,1:快递
	 */
	private Integer orderType;

	private List<ConsumeItem> items;

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public Long getReceiverAddressId() {
		return receiverAddressId;
	}

	public void setReceiverAddressId(Long receiverAddressId) {
		this.receiverAddressId = receiverAddressId;
	}

	public Integer getReceiverProvince() {
		return receiverProvince;
	}

	public void setReceiverProvince(Integer receiverProvince) {
		this.receiverProvince = receiverProvince;
	}

	public Integer getReceiverCity() {
		return receiverCity;
	}

	public void setReceiverCity(Integer receiverCity) {
		this.receiverCity = receiverCity;
	}

	public Integer getReceiverCounty() {
		return receiverCounty;
	}

	public void setReceiverCounty(Integer receiverCounty) {
		this.receiverCounty = receiverCounty;
	}

	public String getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getExpressId() {
		return expressId;
	}

	public void setExpressId(Integer expressId) {
		this.expressId = expressId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getFreight() {
		return freight;
	}

	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}

	public Integer getCollect() {
		return collect;
	}

	public void setCollect(Integer collect) {
		this.collect = collect;
	}

	public Integer getDevice() {
		return device;
	}

	public void setDevice(Integer device) {
		this.device = device;
	}

	public List<ConsumeItem> getItems() {
		return items;
	}

	public void setItems(List<ConsumeItem> items) {
		this.items = items;
	}

	public String getReceiverProvinceName() {
		return receiverProvinceName;
	}

	public void setReceiverProvinceName(String receiverProvinceName) {
		this.receiverProvinceName = receiverProvinceName;
	}

	public String getReceiverCityName() {
		return receiverCityName;
	}

	public void setReceiverCityName(String receiverCityName) {
		this.receiverCityName = receiverCityName;
	}

	public String getReceiverCountyName() {
		return receiverCountyName;
	}

	public void setReceiverCountyName(String receiverCountyName) {
		this.receiverCountyName = receiverCountyName;
	}

}
