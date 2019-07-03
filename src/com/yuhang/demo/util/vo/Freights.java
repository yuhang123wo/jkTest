package com.yuhang.demo.util.vo;

public class Freights {
	private Integer expressId;
	private Integer quantity;
	private String address;
	private String uuid;
	
	//
	private Object amount;
	private Object freightCollect;
	private String error;
	
	
	
	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(String error) {
		this.error = error;
	}


	/**
	 * @return the amount
	 */
	public Object getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Object amount) {
		this.amount = amount;
	}

	/**
	 * @return the freightCollect
	 */
	public Object getFreightCollect() {
		return freightCollect;
	}

	/**
	 * @param freightCollect the freightCollect to set
	 */
	public void setFreightCollect(Object freightCollect) {
		this.freightCollect = freightCollect;
	}

	/**
	 * @return the expressId
	 */
	public Integer getExpressId() {
		return expressId;
	}

	/**
	 * @param expressId
	 *            the expressId to set
	 */
	public void setExpressId(Integer expressId) {
		this.expressId = expressId;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
