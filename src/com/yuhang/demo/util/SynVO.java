package com.yuhang.demo.util;

import java.util.List;

public class SynVO {

	private long userId;
	
	private int repeat;

	private List<SynShopOrderVo> list;

	public int getRepeat() {
		return repeat;
	}

	public void setRepeat(int repeat) {
		this.repeat = repeat;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public List<SynShopOrderVo> getList() {
		return list;
	}

	public void setList(List<SynShopOrderVo> list) {
		this.list = list;
	}

}
