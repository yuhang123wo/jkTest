package com.yuhang.demo;

public class RuleDto {
	private int ladder;
	private String amount;
	private String rate;

	public int getLadder() {
		return ladder;
	}

	public void setLadder(int ladder) {
		this.ladder = ladder;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "RuleDto [ladder=" + ladder + ", amount=" + amount + ", rate=" + rate + "]";
	}
}
