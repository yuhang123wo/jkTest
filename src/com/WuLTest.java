package com;

import java.io.IOException;

import com.yuhang.demo.WuLAutoTest;

public class WuLTest {
	public static String api="http://127.0.0.1:8086/web-service/";
	
//	public static String api="http://116.62.199.18:16620/";
	
	
	public static void main(String[] args) throws IOException {
		
//		String result = WuLAutoTest.queryProduct();
//		String result = WuLAutoTest.createOrder();
//		String result = WuLAutoTest.queryDictArea();
//		String result = WuLAutoTest.calcFreight();
//		String result = WuLAutoTest.listRecvInfo();
//		String result = WuLAutoTest.orderListVib();
//		String result = WuLAutoTest.orderListDs();
//		String result = WuLAutoTest.getReCreateOrderInfo();
//		String result = WuLAutoTest.orderDetailVib();
//		String result = WuLAutoTest.cancelOrder();
//		String result = WuLAutoTest.orderPay();
//		String result = WuLAutoTest.consumablesRefund();
//		String result = WuLAutoTest.waporderPay();
//		String result = WuLAutoTest.loadDsInfo();
//		String result = WuLAutoTest.getOrderStateNum();
//		String result = WuLAutoTest.pickUpGoods();
		String result = WuLAutoTest.pmList();
//		String result = WuLAutoTest.deliverGoods();
//		String result = WuLAutoTest.updateOrderRemark();
//		String result = WuLAutoTest.updateExpressInfo();
//		String result = WuLAutoTest.updateSingleOrderStatus();
		System.out.println(result);
	}
}
