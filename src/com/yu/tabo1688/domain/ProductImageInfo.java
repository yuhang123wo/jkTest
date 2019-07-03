package com.yu.tabo1688.domain;

public class ProductImageInfo {
	private String[] images;// 主图列表，需先使用图片上传接口上传图片
//	private boolean isWatermark;// 是否打水印，是(true)或否(false)，1688无需关注此字段，1688的水印信息在上传图片时处理
//	private boolean isWatermarkFrame;// 水印是否有边框，有边框(true)或者无边框(false)，1688无需关注此字段，1688的水印信息在上传图片时处理
//	private String watermarkPosition;// 水印位置，在中间(center)或者在底部(bottom)，1688无需关注此字段，1688的水印信息在上传图片时处理

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

//	public boolean isWatermark() {
//		return isWatermark;
//	}
//
//	public void setWatermark(boolean isWatermark) {
//		this.isWatermark = isWatermark;
//	}
//
//	public boolean isWatermarkFrame() {
//		return isWatermarkFrame;
//	}
//
//	public void setWatermarkFrame(boolean isWatermarkFrame) {
//		this.isWatermarkFrame = isWatermarkFrame;
//	}
//
//	public String getWatermarkPosition() {
//		return watermarkPosition;
//	}
//
//	public void setWatermarkPosition(String watermarkPosition) {
//		this.watermarkPosition = watermarkPosition;
//	}

}
