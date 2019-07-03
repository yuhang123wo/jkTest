package com.yuhang.demo.util;

import java.util.List;

public class RegionSupplier {

	private Long regionId;
	private List<RegionSupplierBean> list;

	public List<RegionSupplierBean> getList() {
		return list;
	}

	public void setList(List<RegionSupplierBean> list) {
		this.list = list;
	}

	public Long getRegionId() {
		return regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

}
