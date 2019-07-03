package com.yuhang.demo.util;

import java.math.BigDecimal;
import java.util.List;

import com.go2.shipping.common.StringUtil;

public class FruitsOrderPayDto {

	private Long userId;//
	private String amount;// 总金额
	private List<Long> orders;// 订单ID列表
	private String pwd;
	private PayType payType;
	private String comments;
	private Long tradeId;
	private String onlinePay;// 在线支付
	private String blancePay;// 余额支付

	public String valiPayType() {
		if (payType == null) {
			return "请选择支付类型";
		}
		BigDecimal total = new BigDecimal(amount);
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public List<Long> getOrders() {
		return orders;
	}

	public void setOrders(List<Long> orders) {
		this.orders = orders;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public PayType getPayType() {
		return payType;
	}

	public void setPayType(PayType payType) {
		this.payType = payType;
	}

	public String getComments() {
		if (orders.size() > 1) {
			return "订单批量支付";
		}
		return "订单个支付";
	}

	public Long getTradeId() {
		if (orders.size() > 1) {
			return -1L;
		}
		return orders.get(0);
	}

	@Override
	public String toString() {
		return "FruitsOrderPayDto [userId=" + userId + ", amount=" + amount + ", orders=" + orders
				+ ", payType=" + payType + ", comments=" + comments + ", tradeId=" + tradeId
				+ ", onlinePay=" + onlinePay + ", blancePay=" + blancePay + "]";
	}
}
