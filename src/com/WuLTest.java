package com;

import java.io.IOException;

import com.yuhang.demo.WuLAutoTest;

public class WuLTest {
	public static String api="http://127.0.0.1:8086/web-service/";
	
	public static void main(String[] args) throws IOException {
		
//		String result = WuLAutoTest.queryProduct();
//		String result = WuLAutoTest.createOrder();
//		String result = WuLAutoTest.orderList();
//		String result = WuLAutoTest.orderPay();
		String result = WuLAutoTest.consumablesRefund();
		System.out.println(result);
	}
}
