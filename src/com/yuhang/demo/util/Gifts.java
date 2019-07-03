package com.yuhang.demo.util;

import java.util.Date;

import com.go2.shipping.common.entity.Entity;

/**
 * @类说明： 礼品
 * @author YANGJIE
 * @version 1.0
 * @创建时间：2016-12-27 18:27:47
 */
public class Gifts extends Entity {

	private static final long serialVersionUID = 1L;

	private String name; // 名称
	private Long userId; // 代发商ID或1B用户ID
	private String imgUrl; // 图片URL
	private float price; // 价格
	private Date createdTime; // 创建时间
	private Date updateTime; // 修改时间
	private Integer quantity; // 库存数量
	private GiftType type; // 类型
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public GiftType getType() {
		return type;
	}
	public void setType(GiftType type) {
		this.type = type;
	}

	
}
