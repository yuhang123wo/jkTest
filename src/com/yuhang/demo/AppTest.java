package com.yuhang.demo;

import com.yuhang.demo.util.AppAutoTest;

public class AppTest {
//	 private static String api="http://192.168.1.11:8087/";
	 private static String api="http://121.40.182.83:16650/";
//	private static String api = "http://127.0.0.1:6666/app-1b";

	public static int pageNum(int pageSize, int totalCount) {
		if ((totalCount % pageSize) == 0) {
			return totalCount / pageSize;
		} else {
			return totalCount / pageSize + 1;
		}
	}

	public static void main(String[] args) {
		try {

//			String result = AppAutoTest.viewExpress(api);// 根据快递单号查询快递信息
//			String result = AppAutoTest.deliveryExpress(api);
			
			
			//手机支付
			String result = AppAutoTest.pay(api);
//			String result = AppAutoTest.waitDealOrder(api);//待处理订单
			//900de163-6d15-4be5-afdc-9a9248a2d2e1
//			String result = AppAutoTest.loginPack(api);
//			String result =AppAutoTest.messageByExpressNo(api);
			
//			String result = AppAutoTest.ntLogin(api);
//			String result = AppAutoTest.ntViewOrder(api);
//			String result = AppAutoTest.editSendGoods(api);
			
//			String result = AppAutoTest.getWeightLog(api);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
