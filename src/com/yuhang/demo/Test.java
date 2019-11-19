package com.yuhang.demo;

import java.io.IOException;

import com.yuhang.demo.util.AutoTest;

public class Test {

//	 private static String api="http://192.168.1.11:8086/";
//	 private static String api="http://116.62.199.18:16620/";
	private static String api = "http://127.0.0.1:8086/web-service";
//	 public static String api="http://127.0.0.1:8080/";
//		public static String api = "http://country.go2b2b.com/";
	 
//	public static String api = "http://country.go2b2b.com/";
	public static int pageNum(int pageSize, int totalCount) {
		if ((totalCount % pageSize) == 0) {
			return totalCount / pageSize;
		} else {
			return totalCount / pageSize + 1;
		}
	}

	public static void main(String[] args) {
		try {
			long begin=System.currentTimeMillis();
//			 String result = AutoTest.shopList(api);//获取店铺列表
			// Stringr esult = AutoTest.shopEdit(api);//店铺编辑
			// String result = AutoTest.shopDel(api);//删除店铺
//			 String result = AutoTest.manageList(api);//商品列表
//			 String result = AutoTest.itemSyn(api);//商品同步
//			 String result = AutoTest.stockList(api);//库存列表
			// String result = AutoTest.stockEdit(api);//库存编辑
			// String result = AutoTest.stockLimitEdit(api);//库存下限纺车
//			 String result = AutoTest.stockFwater(api);//库存列表
			// String result = AutoTest.stockWarn(api);//库存预警
			// String result = AutoTest.deliverList(api);//发货清单
			// String result = AutoTest.printDelivery(api);// 打单发货
//			 String result = AutoTest.onSaleMethod(api);
//			 String result = AutoTest. itemInfoEdit(api);
//			 String result = AutoTest.takePrice(api);
			// String result = AutoTest.goodsDel(api);
			// String result = AutoTest.shopItemView(api);
			// String result = AutoTest.getBlance(api);
			// String result = AutoTest.byOutId(api);
			String result = AutoTest.order(api);
//			String result = AutoTest.shopOrderDel(api);
//			 String result =AutoTest.updateItemInfo(api);
//			 String result = AutoTest.callBack();
//			 String result = AutoTest.userinfo(api);
//			 String result = AutoTest.loadOrderItems(api);
			// String result =AutoTest.index(api);
			// 1058686
			// String result =AutoTest.addInquiry2B(api);
			// String result = AutoTest.inquiry2B(api);//查询所有
			// String result = AutoTest.queryInquiry2B(api);
			// String result = AutoTest.queryReply2B(api);
			// String result = AutoTest.login(api);
//			 String result = AutoTest.inquiryAll(api);
			// String result = AutoTest.inquiryEdit(api);
			// String result = AutoTest.inquiryChecked(api);
			// String result = AutoTest.inquiryReply(api);

			// String result = AutoTest.supplierFindReply(api);

			// String result = AutoTest.supplierInquiryOne(api);

			// String result = AutoTest.queryInquiryOperator(api);
//			 String result = AutoTest.queryReplyOperator(api);
			// String result = AutoTest.editPush(api);
			//
			// 微信
//			 String result = AutoTest.byWeiXinId(api);
			
			System.out.println(result);
			
			System.out.println("耗时："+(System.currentTimeMillis()-begin));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
