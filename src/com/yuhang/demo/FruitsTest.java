package com.yuhang.demo;

import com.yuhang.demo.util.FruitsAutoTest;

public class FruitsTest {

	 public static String api = "http://127.0.0.1:8089/web-service";
//	public static String api = "http://121.40.182.83:16620/";
	// public static String api="http://192.168.1.11:8086/";
	public static void main(String[] args) {
		try {
//			 String result = FruitsAutoTest.goodsAddVd(api);
			 String result = FruitsAutoTest.editGoods(api);
//			 String result = FruitsAutoTest.getStock(api);
//			 String result = FruitsAutoTest.uploadImgVd(api);
			 System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
