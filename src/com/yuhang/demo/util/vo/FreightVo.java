package com.yuhang.demo.util.vo;

import java.util.List;

public class FreightVo {

	private Long dsId;
	private List<Freights> list;

	/**
	 * @return the dsId
	 */
	public Long getDsId() {
		return dsId;
	}

	/**
	 * @param dsId
	 *            the dsId to set
	 */
	public void setDsId(Long dsId) {
		this.dsId = dsId;
	}

	/**
	 * @return the list
	 */
	public List<Freights> getList() {
		return list;
	}

	/**
	 * @param list
	 *            the list to set
	 */
	public void setList(List<Freights> list) {
		this.list = list;
	}

}
