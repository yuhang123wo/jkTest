package com.yuhang.demo.util;

public class RelationDto {

	private String relationId;
	private Long itemId;
	//VO
	private String relationArtNo;
	
	

	public String getRelationArtNo() {
		return relationArtNo;
	}

	public void setRelationArtNo(String relationArtNo) {
		this.relationArtNo = relationArtNo;
	}

	public String getRelationId() {
		return relationId;
	}

	public void setRelationId(String relationId) {
		this.relationId = relationId;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

}
