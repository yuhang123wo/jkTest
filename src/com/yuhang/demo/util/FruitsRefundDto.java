package com.yuhang.demo.util;

import java.math.BigDecimal;

import com.go2.shipping.common.StringUtil;

public class FruitsRefundDto {

	private String fee;// 费用
	private Long userId;// 操作人ID
	private Long refundId;// 退单ID
	private PayType payType;// 支付类型
	private String pwd;// 支付密码
	private String onlinePay;// 在线支付
	private String blancePay;// 余额支付

	public String valiPayType() {
		if (payType == null) {
			return "请选择支付类型";
		}
		BigDecimal total = new BigDecimal(fee);
		// 取余额
		BigDecimal bp = null;
		if (StringUtil.isEmpty(blancePay)) {
			bp = new BigDecimal(0);
		} else {
			bp = new BigDecimal(blancePay);
		}
		// 取在线支付
		BigDecimal op = null;
		if (StringUtil.isEmpty(onlinePay)) {
			op = new BigDecimal(0);
		} else {
			op = new BigDecimal(onlinePay);
		}
		// 验证金额不能为负数
		if (op.compareTo(new BigDecimal(0)) == -1 || bp.compareTo(new BigDecimal(0)) == -1) {
			return "支付金额不能为负";
		}
		// 在线支付
		if (payType == PayType.ALIPAY || payType == PayType.WEIXIN) {
			if (bp.compareTo(new BigDecimal(0)) != 0) {
				return "支付宝支付时余额支付应为0";
			}
			if (total.compareTo(op) != 0) {
				return "在线支付金额错误";
			}
		}
		// 余额支付
		if (payType == PayType.BALANCE) {
			if (op.compareTo(new BigDecimal(0)) != 0) {
				return "余额支付时在线支付应为0";
			}
			if (total.compareTo(bp) != 0) {
				return "在线支付金额错误";
			}
		}
		// MIX
		if (payType == PayType.MIXALI || payType == PayType.MIXWX) {
			if (op.compareTo(new BigDecimal(0)) <= 0 || bp.compareTo(new BigDecimal(0)) <= 0) {
				return "混合支付时在线支付余额支付都应大于0";
			}
			if (total.compareTo(op.add(bp)) != 0) {
				return "混合支付金额错误";
			}
		}
		return null;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRefundId() {
		return refundId;
	}

	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public PayType getPayType() {
		return payType;
	}

	public void setPayType(PayType payType) {
		this.payType = payType;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getOnlinePay() {
		return onlinePay;
	}

	public void setOnlinePay(String onlinePay) {
		this.onlinePay = onlinePay;
	}

	public String getBlancePay() {
		return blancePay;
	}

	public void setBlancePay(String blancePay) {
		this.blancePay = blancePay;
	}

	@Override
	public String toString() {
		return "FruitsRefundDto [fee=" + fee + ", userId=" + userId + ", refundId=" + refundId
				+ ", payType=" + payType + ", onlinePay=" + onlinePay
				+ ", blancePay=" + blancePay + "]";
	}

	
}
