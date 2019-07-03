package com.yuhang.demo.vo;

public class BaseVo {

	/**
	 * 请求用户ID
	 */
	private Long userId;

	/**
	 * 登录token
	 */
	private String sign;

	private String timestamp;

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
