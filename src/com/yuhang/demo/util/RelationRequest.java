package com.yuhang.demo.util;

import java.util.List;

public class RelationRequest {

	private Long userId;

	private List<RelationDto> list;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public List<RelationDto> getList() {
		return list;
	}

	public void setList(List<RelationDto> list) {
		this.list = list;
	}

}
