package com.yuhang.demo.util;

public enum PayType {
	ALIPAY{public String getName(){return "支付宝";}},
	BALANCE{public String getName(){return "余额";}},
	WEIXIN{public String getName(){return "微信支付";}},
	MIXWX{public String getName(){return "微信混合支付";}},
	MIXALI{public String getName(){return "支付宝混合支付";}};
    public abstract String getName();
}
