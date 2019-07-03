package com.yuhang.demo.util.vo;

import java.math.BigDecimal;

public class Fee {
	private BigDecimal gifts;
	private BigDecimal express;
	private BigDecimal inspection;
	private BigDecimal serviceCharge;

	public BigDecimal getGifts() {
		return gifts;
	}

	public void setGifts(BigDecimal gifts) {
		this.gifts = gifts;
	}

	public BigDecimal getExpress() {
		return express;
	}

	public void setExpress(BigDecimal express) {
		this.express = express;
	}

	public BigDecimal getInspection() {
		return inspection;
	}

	public void setInspection(BigDecimal inspection) {
		this.inspection = inspection;
	}

	public BigDecimal getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(BigDecimal serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public Fee(BigDecimal gifts, BigDecimal express, BigDecimal inspection, BigDecimal serviceCharge) {
		this.gifts = gifts;
		this.express = express;
		this.inspection = inspection;
		this.serviceCharge = serviceCharge;
	}

	public Fee() {
	}

}
