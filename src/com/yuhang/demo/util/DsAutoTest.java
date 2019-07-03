package com.yuhang.demo.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.alibaba.fastjson.JSON;
import com.yuhang.demo.DsTest;
import com.yuhang.demo.RuleDto;
import com.yuhang.demo.util.vo.Address;
import com.yuhang.demo.util.vo.CreateOrder;
import com.yuhang.demo.util.vo.CreateOrderReceivers;
import com.yuhang.demo.util.vo.Fee;
import com.yuhang.demo.util.vo.Items;
import com.yuhang.demo.util.vo.SourceType;
import com.yuhang.demo.vo.CertifyVO;

public class DsAutoTest {

	DsAutoTest auto = new DsAutoTest();

	public static void testS() throws Exception {
//		 Map<String,Object> params = new HashMap<String, Object>();
//		 String time =new Date().getTime()+"";
//		 params.put("userId", 265);
//		 params.put("timestamp", time);
//		 SignUtil util = new SignUtil();
//		 util.sign(params, "UTF-8");
//		 List<NameValuePair> formparams = new ArrayList<NameValuePair>();
//		 formparams.add(new BasicNameValuePair("userId", "265"));
//		 formparams.add(new BasicNameValuePair("sign", util.sign(params,
//		 "UTF-8")));
//		 formparams.add(new BasicNameValuePair("timestamp", time));
//		 String str =
//		 PostUtil.httpPost("http://apiapp.go2b2b.com/cd/user/getUserOrderBySupplier",
//		 formparams);
//		 System.out.println(str);

	}

	/**
	 * 支付宝充值链接
	 * 
	 * @param api
	 * @return
	 * @throws IOException
	 */
	public static String topay() throws IOException {
		String url = DsTest.api + "/pay/topay";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "40"));
		formparams.add(new BasicNameValuePair("fee", "0.01"));
		formparams.add(new BasicNameValuePair("rate", "0.008"));
		formparams.add(new BasicNameValuePair("returnUrl","http://yuhang.free.idcfengye.com/pay/alipay/return"));
		formparams.add(new BasicNameValuePair("notifyUrl","http://yuhang.free.idcfengye.com/pay/alipay/return"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String wapPay() throws IOException {
		String url = DsTest.api + "/payWap/topay";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "97"));
		formparams.add(new BasicNameValuePair("fee", "0.01"));
		formparams.add(new BasicNameValuePair("rate", "0.009"));
		// formparams.add(new BasicNameValuePair("returnUrl",
		// "http://micro.ngrok.cc/web-service/pay/alipay/return"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String waptransferBatch() throws IOException {
		String url = DsTest.api + "/payWap/transfer/payBatch";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		formparams.add(new BasicNameValuePair("transferIds", "66"));
		formparams.add(new BasicNameValuePair("pwd", "1234567"));
		formparams.add(new BasicNameValuePair("payType", "ALIPAY"));// BALANCE
																	// ALIPAY
		// formparams.add(new BasicNameValuePair("returnUrl",
		// "http://micro.ngrok.cc/web-service/pay/alipay/return"));
		return PostUtil.httpPost(url, formparams);
	}

	/**
	 * 余额
	 * 
	 * @return
	 * @throws IOException
	 */
	public static String accountInfo() throws IOException {
		String url = DsTest.api + "/1b/capital/accountInfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "120240"));
		return PostUtil.httpPost(url, formparams);
	}

	/**
	 * 流水列表
	 * 
	 * @return
	 * @throws IOException
	 */
	public static String transactionList() throws IOException {
		String url = DsTest.api + "/1b/capital/transaction/list";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		 formparams.add(new BasicNameValuePair("page", "3"));
		// formparams.add(new BasicNameValuePair("pageSize", ""));
		// formparams.add(new BasicNameValuePair("startTime", "2017-02-01"));
		// formparams.add(new BasicNameValuePair("endTime", "2017-02-28"));
		// formparams.add(new BasicNameValuePair("tradeNo", ""));
		// formparams.add(new BasicNameValuePair("accountName", ""));
		// formparams.add(new BasicNameValuePair("tradeType", "DEPOSIT"));
		// formparams.add(new BasicNameValuePair("direction", "1"));
		// formparams.add(new BasicNameValuePair("relationId", "55934"));
		// formparams.add(new BasicNameValuePair("online", "1"));
//		formparams.add(new BasicNameValuePair("id", "22117741"));

		return PostUtil.httpPost(url, formparams);
	}

	/**
	 * 
	 * @return
	 * @throws IOException
	 */
	public static String electronic() throws IOException {
		String url = DsTest.api + "/1b/capital/transaction/electronic";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "106730"));
		formparams.add(new BasicNameValuePair("startTime", "2017-1-01"));
		formparams.add(new BasicNameValuePair("endTime", "2017-1-31"));
		return PostUtil.httpPost(url, formparams);
	}

	/**
	 * 
	 * @return
	 * @throws IOException
	 */
	public static String electronicList() throws IOException {
		String url = DsTest.api + "/1b/capital/transaction/electronicList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "106730"));
		formparams.add(new BasicNameValuePair("pageSize", "20"));
		formparams.add(new BasicNameValuePair("page", "1"));
		formparams.add(new BasicNameValuePair("startTime", "2017-1-01"));
		formparams.add(new BasicNameValuePair("endTime", "2017-1-31"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String transferReceive() throws IOException {
		String url = DsTest.api + "/trade/transfer/receive/list";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "33"));
		formparams.add(new BasicNameValuePair("pageSize", "1"));
		formparams.add(new BasicNameValuePair("orderNo", ""));
		formparams.add(new BasicNameValuePair("page", "1"));
		formparams.add(new BasicNameValuePair("startTime", ""));
		formparams.add(new BasicNameValuePair("endTime", ""));
		formparams.add(new BasicNameValuePair("state", ""));
		formparams.add(new BasicNameValuePair("name", ""));
		return PostUtil.httpPost(url, formparams);
	}

	public static String transferPayment() throws IOException {
		String url = DsTest.api + "/trade/transfer/pay/list";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "107"));
		formparams.add(new BasicNameValuePair("pageSize", "500"));
		formparams.add(new BasicNameValuePair("page", "1"));
		formparams.add(new BasicNameValuePair("startTime", ""));
		formparams.add(new BasicNameValuePair("endTime", ""));
		formparams.add(new BasicNameValuePair("state", "WAITFORPAY"));
		formparams.add(new BasicNameValuePair("name", ""));
		return PostUtil.httpPost(url, formparams);
	}

	public static String receiveApply() throws IOException {
		String url = DsTest.api + "/trade/transfer/receive/apply";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "107"));// 55934
		formparams.add(new BasicNameValuePair("pwd", ""));
		formparams.add(new BasicNameValuePair("transferId", ""));
		formparams.add(new BasicNameValuePair("fee", "102"));
		formparams.add(new BasicNameValuePair("fromId", "33"));
		formparams.add(new BasicNameValuePair("toId", "107"));
		formparams.add(new BasicNameValuePair("comments", "测试测试测试测试测试"));
		// formparams.add(new BasicNameValuePair("orders", "25711"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String urge() throws IOException {
		String url = DsTest.api + "/trade/transfer/urge";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		formparams.add(new BasicNameValuePair("transferId", "62"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String transferPay() throws IOException {
		String url = DsTest.api + "/trade/transfer/pay";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "106730"));
		formparams.add(new BasicNameValuePair("transferId", "203"));
		formparams.add(new BasicNameValuePair("pwd", "1234567"));
		formparams.add(new BasicNameValuePair("payType", "ALIPAY"));// BALANCE
																	// ALIPAY
		formparams.add(new BasicNameValuePair("fee", "100"));
		formparams.add(new BasicNameValuePair("fromId", "106730"));
		formparams.add(new BasicNameValuePair("toId", ""));
		formparams.add(new BasicNameValuePair("comments", "777"));
		formparams.add(new BasicNameValuePair("rate", "1.2"));
		// formparams.add(new BasicNameValuePair("orders", "257250"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String transferPayBatch() throws IOException {
		String url = DsTest.api + "/trade/transfer/payBatch";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		formparams.add(new BasicNameValuePair("transferIds", "138,137"));
		formparams.add(new BasicNameValuePair("pwd", "1234567"));
		formparams.add(new BasicNameValuePair("payType", "ALIPAY"));// BALANCE
																	// ALIPAY
		formparams.add(new BasicNameValuePair("rate", "0.012"));// BALANCE
																// ALIPAY
		return PostUtil.httpPost(url, formparams);
	}

	public static String withdrawApply() throws IOException {
		String url = DsTest.api + "/trade/withdraw/apply";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "33"));
//		formparams.add(new BasicNameValuePair("amount", "111"));
		formparams.add(new BasicNameValuePair("pwd", "123456"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String orderPay() throws IOException {
		String url = DsTest.api + "/pay/orderPay";
		OrderPayDto dto = new OrderPayDto();
		dto.setPwd("123456");
		// dto.setCouponId("1");
		dto.setType(PayType.BALANCE);
		dto.setUserId(40L);
		dto.setAmount("500");
		List<Long> list = new ArrayList<Long>();
//		list.add(6L);
		list.add(157L);
		list.add(156L);
		list.add(155L);
		list.add(154L);
//		list.add(52L);
//		list.add(51L);
		// list.add(942351L);
		// list.add(942391L);
		// list.add(1276586L);
		// list.add(1276603L);
		dto.setOrders(list);
		dto.setReturnUrl("http://dfdfsa");
		dto.setNotifyUrl("http://dfadf");
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(dto)));
		return PostUtil.httpPost(url, formparams);
	}

	public static String getChargeByOutplatfrom() throws IOException {
		String url = DsTest.api + "/pay/getChargeByOutplatfrom";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("outPlatform", "1"));
		formparams.add(new BasicNameValuePair("amount", "100"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String wapOrderPay() throws IOException {
		String url = DsTest.api + "/payWap/order/pay";
		OrderPayDto dto = new OrderPayDto();
		dto.setPwd("123456");
		dto.setCouponId("1");
		dto.setType(PayType.BALANCE);
		dto.setUserId(323965L);
		dto.setAmount("26");
		List<Long> list = new ArrayList<Long>();
		list.add(1290494L);
		dto.setOrders(list);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(dto)));
		return PostUtil.httpPost(url, formparams);
	}

	public static String withDrawList() throws IOException {
		String url = DsTest.api + "/trade/withDrawList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		formparams.add(new BasicNameValuePair("stateW", "2"));
		return PostUtil.httpPost(url, formparams);
	}

	/*** 88888888888888888888888888888888888888888888888888888888888888 **/

	public static String supplierList() throws IOException {
		String url = DsTest.api + "/1b/region/supplierList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "548032"));
		formparams.add(new BasicNameValuePair("page", "1"));
		formparams.add(new BasicNameValuePair("pageSize", "100"));
		formparams.add(new BasicNameValuePair("type", "1"));
		formparams.add(new BasicNameValuePair("outPlatform", "20"));
		// formparams.add(new BasicNameValuePair("name", "寐怡家纺"));
		// formparams.add(new BasicNameValuePair("regionId", "15"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String createRegion() throws IOException {
		String url = DsTest.api + "/1b/region/createRegion";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "548250"));
		formparams.add(new BasicNameValuePair("name", "商贸城"));
		formparams.add(new BasicNameValuePair("remark", "remark"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String listRegion() throws IOException {
		String url = DsTest.api + "/1b/region/listRegion";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "548250"));
		// formparams.add(new BasicNameValuePair("name", "gx小区附近区域"));
		formparams.add(new BasicNameValuePair("page", "1"));
		formparams.add(new BasicNameValuePair("pageSize", "20"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String listAllRegion() throws IOException {
		String url = DsTest.api + "/1b/region/listAllRegion";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "548250"));
		// formparams.add(new BasicNameValuePair("name", "gx小区附近区域"));548250
		return PostUtil.httpPost(url, formparams);
	}

	public static String createRegionSupplier() throws IOException {
		String url = DsTest.api + "/1b/region/createRegionSupplier";
		RegionSupplier supplier = new RegionSupplier();
		supplier.setRegionId(18L);
		List<RegionSupplierBean> supplierBeans = new ArrayList<RegionSupplierBean>();
		RegionSupplierBean bean = new RegionSupplierBean();
		bean.setSupplierId(466415L);
		supplierBeans.add(bean);
		supplier.setList(supplierBeans);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		System.out.println(JSON.toJSONString(supplier));
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(supplier)));

		return PostUtil.httpPost(url, formparams);
	}

	public static String listRegionSupplier() throws IOException {
		String url = DsTest.api + "/1b/region/listRegionSupplier";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("regionId", "18"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String listBatchRegionSupplier() throws IOException {
		String url = DsTest.api + "/1b/region/listBatchRegionSupplier";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("regionIds", "4,5"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String regionInfo() throws IOException {
		String url = DsTest.api + "/1b/region/regionInfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("regionId", "5"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String editRegion() throws IOException {
		String url = DsTest.api + "/1b/region/editRegion";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("name", "ggg"));
		formparams.add(new BasicNameValuePair("regionId", "5"));
		formparams.add(new BasicNameValuePair("remark", "1xxx"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String delRegion() throws IOException {
		String url = DsTest.api + "/1b/region/delRegion";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("regionId", "9"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String listGifts() throws IOException {
		String url = DsTest.api + "/1b/gifts/listGifts";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "184725"));
		formparams.add(new BasicNameValuePair("page", "1"));
		formparams.add(new BasicNameValuePair("pageSize", "20"));
		formparams.add(new BasicNameValuePair("name", ""));
		return PostUtil.httpPost(url, formparams);
	}

	public static String queryGifts() throws IOException {
		String url = DsTest.api + "/1b/gifts/queryGifts";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("giftsId", "1"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String addGifts() throws IOException {
		String url = DsTest.api + "/1b/gifts/addGifts";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("name", "小包包ss儿"));
		formparams.add(new BasicNameValuePair("userId", "184725"));
		formparams.add(new BasicNameValuePair("imgUrl", "http://mig.c.x"));
		formparams.add(new BasicNameValuePair("price", "0.5"));
		formparams.add(new BasicNameValuePair("quantity", "1000"));
		formparams.add(new BasicNameValuePair("type", "GIFT"));
		formparams.add(new BasicNameValuePair("cost", "12"));
		formparams.add(new BasicNameValuePair("remark", "xxx"));
		formparams.add(new BasicNameValuePair("state", "ENABLED"));
		formparams.add(new BasicNameValuePair("weight", "1"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String editGifts() throws IOException {
		String url = DsTest.api + "/1b/gifts/editGifts";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("name", "oz6KcI25ysF1x+HRoxPOEc+xV3eYcg4sa05YlYKjZJIvL8am68KKCXsQEzP6MnYyoJgOSrWa1IIfahV+HW/MyxEIXWGiP3zCMuRyj44L/39uGk5/pb+YYILQdcHvHA05JSZlcxVq+O9vtW+SBpYPsABqdqM9vlRII3sHXLx2cQlN+1B+JHU39URazobRvbsN6IbhB5rovUvMV2e0xV5BHlnt5i0xnbLi5DNNzC+X25MrTTqjycJRoO9VZI0Tjgf0yKO5dXSv6NSgt6Si9Tot1rLHwFbXteFHC3qGAIGnxVQgLGpvuvhiTX9ueYgeBmRMg75EON5TfolUd440/GuYCQ=="));
		formparams.add(new BasicNameValuePair("imgUrl", "http://mig.c.x"));
		// formparams.add(new BasicNameValuePair("price", "0.5"));
		formparams.add(new BasicNameValuePair("quantity", "100"));
		formparams.add(new BasicNameValuePair("id", "4"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String delGifts() throws IOException {
		String url = DsTest.api + "/1b/gifts/delGifts";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("giftsId", "2"));
		formparams.add(new BasicNameValuePair("userId", "161325"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String addGiftsBatch() throws IOException {
		String url = DsTest.api + "/1b/gifts/addGiftsBatch";
		List<Gifts> list = new ArrayList<Gifts>();
		Gifts n = new Gifts();
		n.setName("name2");
		n.setPrice(0.4f);
		n.setQuantity(1100);
		n.setUserId(161329L);
		Gifts n1 = new Gifts();
		n1.setName("name2");
		n1.setPrice(0.4f);
		n1.setUserId(161329L);
		n1.setQuantity(1200);
		list.add(n);
		list.add(n1);

		System.out.println(JSON.toJSONString(list));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(list)));
		return PostUtil.httpPost(url, formparams);
	}

	public static String editGiftsBatch() throws IOException {
		String url = DsTest.api + "/1b/gifts/editGiftsBatch";
		List<Gifts> list = new ArrayList<Gifts>();
		Gifts n = new Gifts();
		n.setId(13L);
		n.setName("bbsdfd");
		Gifts n1 = new Gifts();
		n1.setId(14L);
		n1.setName("ddd");
		list.add(n);
		list.add(n1);
		System.out.println(JSON.toJSONString(list));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(list)));
		return PostUtil.httpPost(url, formparams);
	}

	public static String orderRefund() throws IOException {
		String url = DsTest.api + "/pay/orderRefund";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("fee", "0.01"));
		formparams.add(new BasicNameValuePair("userId", "97"));
		formparams.add(new BasicNameValuePair("refundId", "421"));
		formparams.add(new BasicNameValuePair("type", "BALANCE"));
		formparams.add(new BasicNameValuePair("rate", "1.2"));
		formparams.add(new BasicNameValuePair("pwd", "123456"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String updatedSupplierInfo() throws IOException {
		String url = DsTest.api + "/1b/user/updatedSupplierInfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "87"));
		// formparams.add(new BasicNameValuePair("contact", "0.01"));
		// formparams.add(new BasicNameValuePair("name", "0.01"));
		// formparams.add(new BasicNameValuePair("capacity", "0.01"));
		// formparams.add(new BasicNameValuePair("mobile", "0.01"));
		// formparams.add(new BasicNameValuePair("spareMobile", "0.01"));
		// formparams.add(new BasicNameValuePair("email", "0.01"));
		// formparams.add(new BasicNameValuePair("qq", "0.01"));
		formparams.add(new BasicNameValuePair("disclaimer", "bbss"));
		formparams.add(new BasicNameValuePair("commitment", "sssgg"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String supplierInfo() throws IOException {
		String url = DsTest.api + "/1b/user/supplierInfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "87"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String saleStatis() throws IOException {
		String url = DsTest.api + "/1b/analysis/saleStatis";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "503048"));
		formparams.add(new BasicNameValuePair("pageSize", "20"));
		formparams.add(new BasicNameValuePair("page", "1"));
		formparams.add(new BasicNameValuePair("startTime", "2016-1-11"));
		formparams.add(new BasicNameValuePair("endTime", "2017-08-19"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String giftStatis() throws IOException {
		String url = DsTest.api + "/1b/analysis/giftStatis";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "187637"));
		formparams.add(new BasicNameValuePair("pageSize", "20"));
		formparams.add(new BasicNameValuePair("page", "1"));
		formparams.add(new BasicNameValuePair("name", "毛绒"));
		formparams.add(new BasicNameValuePair("startTime", "2016-1-11"));
		formparams.add(new BasicNameValuePair("endTime", "2017-08-19"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String saleStatisActual() throws IOException {
		String url = DsTest.api + "/1b/analysis/saleStatisActual";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "106730"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String itemStatis() throws IOException {
		String url = DsTest.api + "/1b/analysis/itemStatis";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "58597"));
		formparams.add(new BasicNameValuePair("pageSize", "20"));
		formparams.add(new BasicNameValuePair("page", "1"));
		formparams.add(new BasicNameValuePair("startTime", "2017-1-01"));
		formparams.add(new BasicNameValuePair("endTime", "2017-01-19"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String wapItemStatis() throws IOException {
		String url = DsTest.api + "/1b/analysis/wapItemStatis";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "97"));
		formparams.add(new BasicNameValuePair("pageSize", "5"));
		formparams.add(new BasicNameValuePair("page", "1"));
		formparams.add(new BasicNameValuePair("startTime", "2017-1-01"));
		formparams.add(new BasicNameValuePair("endTime", "2017-05-19"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String expressStatis() throws IOException {
		String url = DsTest.api + "/1b/analysis/expressStatis";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "161325"));
		formparams.add(new BasicNameValuePair("pageSize", "20"));
		formparams.add(new BasicNameValuePair("page", "1"));
		formparams.add(new BasicNameValuePair("startTime", "2017-1-11"));
		formparams.add(new BasicNameValuePair("endTime", "2017-01-19"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String settlementing() throws IOException {
		String url = DsTest.api + "/1b/capital/settlementing/list";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "9990"));
		formparams.add(new BasicNameValuePair("pageSize", "20"));
		formparams.add(new BasicNameValuePair("page", "1"));
		// formparams.add(new BasicNameValuePair("startTime", "2017-1-11"));
		// formparams.add(new BasicNameValuePair("endTime", "2017-01-12"));
		formparams.add(new BasicNameValuePair("accountName", ""));
		return PostUtil.httpPost(url, formparams);
	}

	public static String stockList() throws IOException {
		String url = DsTest.api + "/gsbStockLog/stock/list";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "197841"));
		formparams.add(new BasicNameValuePair("pageSize", "2"));
		formparams.add(new BasicNameValuePair("page", "1"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String stockIn() throws IOException {
		String url = DsTest.api + "/gsbStockLog/stockIn";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("itemJson",
				"[{\"itemId\":\"1\",\"skuId\":\"1\",\"num\":\"2\",\"remark\":\"aaaaa\"}]"));
		formparams.add(new BasicNameValuePair("agentInfo", "2fdfdfd"));
		formparams.add(new BasicNameValuePair("stockType", "BUYIN"));
		return PostUtil.httpPost(url, formparams);
	}

	/**
	 * 
	 * @return
	 * @throws IOException
	 */
	public static String stockOut() throws IOException {
		String url = DsTest.api + "/gsbStockLog/stockOut";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("itemJson",
				"[{\"itemId\":\"1\",\"skuId\":\"1\",\"num\":\"2\",\"remark\":\"aaaaa\"}]"));
		formparams.add(new BasicNameValuePair("agentInfo", "2fdfdfd"));
		formparams.add(new BasicNameValuePair("stockType", "SALEOUT"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String editWarn() throws IOException {
		String url = DsTest.api + "/gsbStockLog/edit/stockWarn";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "197841"));
		formparams.add(new BasicNameValuePair("skuId", "1"));
		formparams.add(new BasicNameValuePair("stockWarn", "0"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String addClerk() throws IOException {
		String url = DsTest.api + "/1b/clerk/addClerk";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "106730"));
		formparams.add(new BasicNameValuePair("username", "yuhang"));
		formparams.add(new BasicNameValuePair("realname", "某某"));
		formparams.add(new BasicNameValuePair("initPassword", "123456"));
		formparams.add(new BasicNameValuePair("qq", "1578723894"));
		formparams.add(new BasicNameValuePair("tel", "1578723894"));
		formparams.add(new BasicNameValuePair("remark", "dsdf"));
		formparams.add(new BasicNameValuePair("state", "ACTIVE"));
		formparams.add(new BasicNameValuePair("regionList", "15"));
		formparams.add(new BasicNameValuePair("roleList", "11"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String listClerk() throws IOException {
		String url = DsTest.api + "/1b/clerk/listClerk";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "129763"));
		formparams.add(new BasicNameValuePair("state", "ACTIVE"));
		// formparams.add(new BasicNameValuePair("roleId", "8"));
		formparams.add(new BasicNameValuePair("page", "1"));
		formparams.add(new BasicNameValuePair("pageSize", "20"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String listAllClerk() throws IOException {
		String url = DsTest.api + "/1b/clerk/listAllClerk";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "106730"));
		// formparams.add(new BasicNameValuePair("state", "ACTIVE"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String listRole() throws IOException {
		String url = DsTest.api + "/1b/clerk/listRole";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "106730"));// 129763
		return PostUtil.httpPost(url, formparams);
	}

	public static String listArea() throws IOException {
		String url = DsTest.api + "/1b/clerk/listArea";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "129763"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String editClerk() throws IOException {
		String url = DsTest.api + "/1b/clerk/editClerk";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "548253"));
		formparams.add(new BasicNameValuePair("realname", "gsb1"));
		formparams.add(new BasicNameValuePair("initPassword", "123456"));
		formparams.add(new BasicNameValuePair("qq", "15787238943"));
		// formparams.add(new BasicNameValuePair("tel", "15787238941"));
		// formparams.add(new BasicNameValuePair("remark", "gggg"));
		formparams.add(new BasicNameValuePair("state", "ACTIVE"));
		formparams.add(new BasicNameValuePair("regionList", "19"));
		formparams.add(new BasicNameValuePair("roleList", "44"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String autoAssignInfo() throws IOException {
		String url = DsTest.api + "/1b/take/autoAssignInfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("dsId", "378637"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String canSetAutoAssign() throws IOException {
		String url = DsTest.api + "/1b/take/canSetAutoAssign";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("dsId", "378637"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String setAutoTime() throws IOException {
		String url = DsTest.api + "/1b/take/setAutoTime";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("dsId", "378637"));
		formparams.add(new BasicNameValuePair("autoTime", "22:59:59"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String clerkInfo() throws IOException {
		String url = DsTest.api + "/1b/clerk/clerkInfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "26849"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String information() throws IOException {
		String url = DsTest.api + "/smsSetting/information";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "463087"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String switchSetUp() throws IOException {
		String url = DsTest.api + "/smsSetting/switchSetUp";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "463087"));
		formparams.add(new BasicNameValuePair("state", "DISABLED"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String selectType() throws IOException {
		String url = DsTest.api + "/smsSetting/selectType";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "463087"));
		formparams.add(new BasicNameValuePair("type", "1"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String optionSetUp() throws IOException {
		String url = DsTest.api + "/smsSetting/optionSetUp";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "463087"));
		formparams.add(new BasicNameValuePair("smsGoodsSend", "1"));
		formparams.add(new BasicNameValuePair("smsStock", "1"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String timeSetUp() throws IOException {
		String url = DsTest.api + "/smsSetting/timeSetUp";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "463087"));
		formparams.add(new BasicNameValuePair("start", "08:30"));
		formparams.add(new BasicNameValuePair("end", "21:30"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String statisView() throws IOException {
		String url = DsTest.api + "/homePage/statisView";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "97"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String getSingleSysNotice() throws IOException {
		String url = DsTest.api + "/homePage/getSingleSysNotice";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "97"));
		formparams.add(new BasicNameValuePair("sysNoticeId", "48"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String salesView() throws IOException {
		String url = DsTest.api + "/homePage/salesView";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "97"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String listSysNotice() throws IOException {
		String url = DsTest.api + "/homePage/listSysNotice";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "502850"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String deleGsbAgent() throws IOException {
		String url = DsTest.api + "/1b/customer/deleGsbAgent";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("dsId", "9991"));
		formparams.add(new BasicNameValuePair("id", "24"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String settlementDetails() throws IOException {
		String url = DsTest.api + "/trade/settlementDetails";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("dsId", "452737"));
		// formparams.add(new BasicNameValuePair("username", "迷塔美鞋馆"));
		// formparams.add(new BasicNameValuePair("userphone", "18523502645"));
		formparams.add(new BasicNameValuePair("state", "0"));
		formparams.add(new BasicNameValuePair("page", "1"));
		formparams.add(new BasicNameValuePair("pageSize", "100"));
		// formparams.add(new BasicNameValuePair("orderNo", "1702170000001"));
		// formparams.add(new BasicNameValuePair("expressName", "申通快递"));
		// formparams.add(new BasicNameValuePair("startFinish", "2017-10-17"));
		// formparams.add(new BasicNameValuePair("endFinish", "2017-10-17"));
		formparams.add(new BasicNameValuePair("startCreate", "2017-10-17"));
		formparams.add(new BasicNameValuePair("endCreate", "2017-10-17"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String stationMessage() throws IOException {
		String url = DsTest.api + "/stationMessage/list";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "129763"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String stationClick() throws IOException {
		String url = DsTest.api + "/stationMessage/click";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("stationId", "1"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String queryCustomerTranCount() throws IOException {
		String url = DsTest.api + "/1b/customer/queryCustomerTranCount";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("dsId", "990"));
		formparams.add(new BasicNameValuePair("orderBy", "3"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String addNotice() throws IOException {
		String url = DsTest.api + "/1b/user/addNotice";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "106730"));
		formparams.add(new BasicNameValuePair("title", "abced"));
		formparams.add(new BasicNameValuePair("content", "3"));
		formparams.add(new BasicNameValuePair("state", "1"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String loadSingleNotice() throws IOException {
		String url = DsTest.api + "/1b/user/loadSingleNotice";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("noticeId", "10"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String updateStockWarn() throws IOException {
		String url = DsTest.api + "/gi/editCostPrice";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("itemId", "1"));
		formparams.add(new BasicNameValuePair("costPrice", "124"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String advPay() throws IOException {
		String url = DsTest.api + "/outIntf/finance/apiTransfer";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("outId", "166447"));
		formparams.add(new BasicNameValuePair("amount", "200"));
		formparams.add(new BasicNameValuePair("adId", "125"));
		formparams.add(new BasicNameValuePair("out_platform", "1"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String sellListCount() throws IOException {
		String url = DsTest.api + "/outIntf/sellListCount";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("supplierId", "6324"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String sellList() throws IOException {
		String url = DsTest.api + "/1b/take/sellList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("supplierId", "5895"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String advRefund() throws IOException {
		String url = DsTest.api + "/outIntf/finance/adRefund";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("outId", "166447"));
		formparams.add(new BasicNameValuePair("amount", "1"));
		formparams.add(new BasicNameValuePair("id", "8"));
		formparams.add(new BasicNameValuePair("out_platform", "1"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String advRefundTransation() throws IOException {
		String url = DsTest.api + "/outIntf/finance/getAdRefund";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("id", "8"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String shippingorderlist() throws IOException {
		String url = DsTest.api + "/outIntf/supplier/shippingorderlist";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("supplierId", "206466"));
		formparams.add(new BasicNameValuePair("pageSize", "20"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String allInquiryStatis() throws IOException {
		String url = DsTest.api + "/2b/inquiry/allInquiryStatis";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "97"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String factorageGet() throws IOException {
		String url = DsTest.api + "/trade/factorageGet";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "97"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String updateOrderSizeAndColor() throws IOException {
		String url = DsTest.api + "/1b/order/updateColorSize";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "97"));
		formparams.add(new BasicNameValuePair("orderId", "5058"));
		formparams.add(new BasicNameValuePair("itemId", "20146"));
		formparams.add(new BasicNameValuePair("color", "dfd"));
		formparams.add(new BasicNameValuePair("size", "97"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String queryCustomerRelation() throws IOException {
		String url = DsTest.api + "/2b/customer/queryCustomerRelation";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "278569"));
		formparams.add(new BasicNameValuePair("customerType", "2"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String getUserPayInfo() throws IOException {
		String url = DsTest.api + "/trade/transfer/getUserPayInfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userIds", "106730,129763,55934"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String findExistTransferByOrderNo() throws IOException {
		String url = DsTest.api + "/trade/findExistTransferByOrderNo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		formparams.add(new BasicNameValuePair("orderNo", "1703160000039"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String findTransferByOrderNo() throws IOException {
		String url = DsTest.api + "/trade/findTransferByOrderNo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		formparams.add(new BasicNameValuePair("orderNo", "1703160000039"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String transferPayCount() throws IOException {
		String url = DsTest.api + "/trade/transfer/pay/count";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String getUnReadNotice() throws IOException {
		String url = DsTest.api + "/1b/user/getUnReadNotice";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String signNotice() throws IOException {
		String url = DsTest.api + "/1b/user/signNotice";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "120240"));
		formparams.add(new BasicNameValuePair("noticeId", "24"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String createDefaultDF() throws IOException {
		String url = DsTest.api + "/2b/df/order/createDefaultDF";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "120240"));
		formparams.add(new BasicNameValuePair("dsId", "106730"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String questionAdd() throws IOException {
		String url = DsTest.api + "/common/question/add";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("name", "yuhang"));
		formparams.add(new BasicNameValuePair("email", "591057762@qq.com"));
		formparams.add(new BasicNameValuePair("content", "1111"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String modifyUsername() throws IOException {
		String url = DsTest.api + "/user/update";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("username", "alber111"));
		formparams.add(new BasicNameValuePair("outId", "128605"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String settlementingSupplier() throws IOException {
		String url = DsTest.api + "/outIntf/settlementing/supplier";
		System.out.println(url);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("username", "alber111"));
		formparams.add(new BasicNameValuePair("outId", "128605"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String loadKProduct() throws IOException {
		String url = DsTest.api + "/k3/loadKProduct";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("artNo", "11"));
		// formparams.add(new BasicNameValuePair("outPlatform", "5"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String queryItemByParams() throws IOException {
		String url = DsTest.api + "/gi/queryItemByParams";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
//		formparams.add(new BasicNameValuePair("artNo", "1160251"));
		 formparams.add(new BasicNameValuePair("artNo", "夏天&S168"));
//		 formparams.add(new BasicNameValuePair("supplierId", "47"));
//		 formparams.add(new BasicNameValuePair("ids", "1160251"));
		// formparams.add(new BasicNameValuePair("outPlatform", "6"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String queryItemSku() throws IOException {
		String url = DsTest.api + "/gi/querySkuByColorSize";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("itemId", "45175537"));
		formparams.add(new BasicNameValuePair("color", "黑色"));
		formparams.add(new BasicNameValuePair("size", "31"));
		return PostUtil.httpPost(url, formparams);
	}
	public static String orderOrUpdate() throws IOException {
		String url = DsTest.api + "/2b/df/order/orderUpdate";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams
				.add(new BasicNameValuePair(
						"json",
						"[{\"id\":26055,\"remark\":\"\",\"receivers\":{\"name\":\"ZX\",\"phone\":\"13141234123\",\"mobile\":\"13141234123\",\"address\":{\"province\":\"\",\"city\":\"\",\"country\":\"\",\"address\":\"\u91cd\u5e86\",\"zip\":null}},\"externalOrderId\":\"\",\"dsId\":\"97\",\"selectDeliver\":\"97\",\"provider\":\"97\",\"collect\":\"0\",\"orderType\":0,\"items\":[{\"supplierId\":\"97\",\"supplier\":\"\u521b\u610f\u00b7\u96e8\u71d5\",\"phone\":\"18780052285\",\"address\":\"\u56fd\u9645\u5546\u8d38\u57ce3\u533a2\u697c14\u885722505\u53f7\",\"artNo\":\"\u521b\u610f\u00b7\u96e8\u71d5&812\",\"itemId\":1218144,\"skuId\":\"\",\"picUrl\":\"20180329214732563067_220.jpg\",\"price\":48,\"num\":1,\"color\":\"\u767d\u8272\",\"size\":\"36\"}],\"fee\":{\"giftInfo\":[],\"gifts\":0,\"express\":5,\"inspection\":1,\"serviceCharge\":2},\"expressId\":\"47\",\"expressName\":\"\u5929\u5929\u5feb\u9012\"}]"));
		formparams.add(new BasicNameValuePair("userId", "55934"));
		// formparams.add(new BasicNameValuePair("outPlatform", "6"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String ntViewOrder() throws IOException {
		String url = DsTest.api + "/tong/1b/pw/ntViewOrder";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "464671"));
		formparams.add(new BasicNameValuePair("expressNo", "100648796264"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String ntSplitOrder() throws IOException {
		String url = DsTest.api + "/tong/1b/order/ntSplitOrder";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("orderId", "243"));
		formparams.add(new BasicNameValuePair("itemIds", "398"));
		// formparams.add(new BasicNameValuePair("serviceCharge", "0.5"));
		// formparams.add(new BasicNameValuePair("inspection", "0"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String queryItemByOuterIds() throws IOException {
		String url = DsTest.api + "/gi/queryItemByOuterIds";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("outerIds", "835964"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String queryItemByThirdIds() throws IOException {
		String url = DsTest.api + "/gi/queryItemByThirdIds";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("thirdIds", "78121,28288,41164"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String authentication() throws IOException {
		String url = DsTest.api + "/1b/permission/authentication";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("username", "nt2b"));
		formparams.add(new BasicNameValuePair("outPlatform", "20"));
		formparams.add(new BasicNameValuePair("password", "123456"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String loadSupplier() throws IOException {
		String url = DsTest.api + "/k3/loadSupplier";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("supplierId", "8479"));
		return PostUtil.httpPost(url, formparams);
	}

	private static String alipayNotify() throws IOException {
		String url = "http://127.0.0.1:36061/app/alipay/notify";
		// String url =
		// "http://127.0.0.1:8089/web-service/fruits/pay/alipay/notify";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("gmt_create", "2017-07-19 11:04:06"));
		formparams.add(new BasicNameValuePair("buyer_email", "591057762@qq.com"));
		formparams.add(new BasicNameValuePair("notify_time", "2017-03-22 11:30:07"));
		formparams.add(new BasicNameValuePair("gmt_payment", "2017-03-22 11:04:17"));
		formparams.add(new BasicNameValuePair("seller_email", "margin_nantong@stargoto.com"));
		formparams.add(new BasicNameValuePair("quantity", "1"));
		formparams.add(new BasicNameValuePair("subject", "alber111转账"));
		formparams.add(new BasicNameValuePair("use_coupon", "N"));
		formparams.add(new BasicNameValuePair("sign", "0ab0360a0c0cafbc00a64a4a6e4b368c"));
		formparams.add(new BasicNameValuePair("discount", "0.00"));
		formparams.add(new BasicNameValuePair("body", "转账:0.03"));
		formparams.add(new BasicNameValuePair("buyer_id", "2088112797789753"));
		formparams.add(new BasicNameValuePair("notify_id", "451f45b153cdfe0cbe7e63e6aca32adlse"));
		formparams.add(new BasicNameValuePair("notify_type", "trade_status_sync"));
		formparams.add(new BasicNameValuePair("payment_type", "1"));
		formparams.add(new BasicNameValuePair("out_trade_no", "GSBGO2_CX_23278"));
		formparams.add(new BasicNameValuePair("price", "96.5"));
		formparams.add(new BasicNameValuePair("trade_status", "TRADE_SUCCESS"));
		formparams.add(new BasicNameValuePair("total_fee", "96.5"));
		formparams.add(new BasicNameValuePair("total_amount", "96.5"));
		formparams.add(new BasicNameValuePair("trade_no", "20190322210010047502763188890"));
		formparams.add(new BasicNameValuePair("sign_type", "MD5"));
		formparams.add(new BasicNameValuePair("seller_id", "2088221939210090"));
		formparams.add(new BasicNameValuePair("is_total_fee_adjust", "N"));
		String result = PostUtil.httpPost(url, formparams);
		return result;
	}

	private static String alipayReturn() throws IOException {
		String url = "http://127.0.0.1:8080/test/alipay/return";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("buyer_email", "591057762@qq.com"));
		formparams.add(new BasicNameValuePair("notify_time", "2017-03-22 11:07:48"));
		formparams.add(new BasicNameValuePair("seller_email", "margin_nantong@stargoto.com"));
		formparams.add(new BasicNameValuePair("exterface", "create_direct_pay_by_user"));
		formparams.add(new BasicNameValuePair("subject", "alber111订单支付"));
		formparams.add(new BasicNameValuePair("sign", "ff6045579b86c98be5d7196d4ccf8d0b"));
		formparams.add(new BasicNameValuePair("body", "订单编号:610"));
		formparams.add(new BasicNameValuePair("buyer_id", "2088112797789753"));
		formparams.add(new BasicNameValuePair("is_success", "T"));
		formparams.add(new BasicNameValuePair("notify_id",
				"RqPnCoPT3K9%2Fvwbh3InYydiUW%2BnoIIo%2B%2BlvdqyADeWv0ytt9EVNxJk7P0XNTdsuqHW3n"));
		formparams.add(new BasicNameValuePair("notify_type", "trade_status_sync"));
		formparams.add(new BasicNameValuePair("payment_type", "1"));
		formparams.add(new BasicNameValuePair("out_trade_no", "nationwide_cs22723"));
		formparams.add(new BasicNameValuePair("total_fee", "200"));
		formparams.add(new BasicNameValuePair("trade_status", "TRADE_SUCCESS"));
		formparams.add(new BasicNameValuePair("trade_no", "2017032221001004750276349449"));
		formparams.add(new BasicNameValuePair("sign_type", "MD5"));
		formparams.add(new BasicNameValuePair("seller_id", "2088221939210090"));
		String result = PostUtil.httpPost(url, formparams);
		return result;
	}

	private static String alipayBatchReturn() throws IOException {
		String url = "http://127.0.0.1:8089/web-manage/finance/alipay/batchNotify";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("sign", "edac32addd87b5038c464eea16fdae48"));
		formparams.add(new BasicNameValuePair("notify_time", "2017-05-16 15:59:47"));
		formparams.add(new BasicNameValuePair("pay_user_id", "2088221939210090"));
		formparams.add(new BasicNameValuePair("sign_type", "MD5"));
		formparams.add(new BasicNameValuePair("pay_user_name", "成都星购途信息技术有限公司"));
		// formparams.add(new BasicNameValuePair("success_details",
		// "21767^15803096943^于航^178^S^^201702230185028260^20170223153434|"));
		formparams.add(new BasicNameValuePair("fail_details",
				"21765^15803096943^于航^100.13^S^^201702230185028260^20170223153434|"));
		formparams.add(new BasicNameValuePair("notify_type", "batch_trans_notify"));
		formparams.add(new BasicNameValuePair("notify_id", "16c1c190fe7b9df77caeffae7e76e48l66"));
		formparams.add(new BasicNameValuePair("pay_account_no", "20882219392100900156"));
		formparams.add(new BasicNameValuePair("batch_no", "gsb170223000021751"));
		String result = PostUtil.httpPost(url, formparams);
		return result;
	}

	public static String registerDsNt() throws IOException {
		String url = DsTest.api + "/tong/registerDs";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userName", "hang123yu"));
		formparams.add(new BasicNameValuePair("pwd", "123456"));
		formparams.add(new BasicNameValuePair("qq", "100"));
		formparams.add(new BasicNameValuePair("tel", "15803096949"));
		formparams.add(new BasicNameValuePair("email", "20"));
		formparams.add(new BasicNameValuePair("contactName", "yuyu"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String getNtDropshipping() throws IOException {
		String url = DsTest.api + "/tong/getNtDropshipping";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		// formparams.add(new BasicNameValuePair("dsId", "548250"));
		// formparams.add(new BasicNameValuePair("pwd", "123456"));
		// formparams.add(new BasicNameValuePair("qq", "100"));
		// formparams.add(new BasicNameValuePair("tel", "15803096949"));
		// formparams.add(new BasicNameValuePair("email", "20"));
		// formparams.add(new BasicNameValuePair("contactName", "yuyu"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String loadItem() throws IOException {
		String url = DsTest.api + "/tong/2b/order/loadItem";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		// formparams.add(new BasicNameValuePair("color", "黑色"));
		// formparams.add(new BasicNameValuePair("size", "36"));
		formparams.add(new BasicNameValuePair("name", "艾尼维娅&A68-H206-1&149084211210"));
		formparams.add(new BasicNameValuePair("userId", "548255"));
		// formparams.add(new BasicNameValuePair("email", "20"));
		// formparams.add(new BasicNameValuePair("contactName", "yuyu"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String valiCoupon() throws IOException {
		String url = DsTest.api + "/2b/coupon/valiCoupon";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "323965"));
		formparams.add(new BasicNameValuePair("code", "620fa61fc502e7be95e0d8c"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String exchangeCoupon() throws IOException {
		String url = DsTest.api + "/2b/coupon/exchangeCoupon";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "278569"));
		formparams.add(new BasicNameValuePair("code", "620fa61fc502e7be95e0d8c111"));
		formparams.add(new BasicNameValuePair("relationId", "1139"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String couponList() throws IOException {
		String url = DsTest.api + "/2b/coupon/couponList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "323965"));
		formparams.add(new BasicNameValuePair("code", "6201525bd4c5dafb9a61328"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String refundCoupon() throws IOException {
		String url = DsTest.api + "/2b/coupon/refundCoupon";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "323965"));
		formparams.add(new BasicNameValuePair("code", "6201525bd4c5dafb9a61328"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String loadMgSupplier() throws IOException {
		String url = DsTest.api + "/gi/loadMgSupplier";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("supplierId", "1088"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String fruitsDeposit() throws IOException {
		String url = DsTest.api + "/fruits/pay/toPay";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "555957"));
		formparams.add(new BasicNameValuePair("fee", "0.001"));
		formparams.add(new BasicNameValuePair("payType", "WEIXIN"));// ALIPAY
																	// WEIXIN
		formparams.add(new BasicNameValuePair("isWap", "0"));// ALIPAY WEIXIN
		formparams.add(new BasicNameValuePair("openid", "o0xc8wUfwlZBGFilnOk_fSkK70NM"));// ALIPAY
																							// WEIXIN
		return PostUtil.httpPost(url, formparams);
	}

	public static String fruitsOrderPay() throws IOException {
		String url = DsTest.api + "/fruits/pay/orderPay";
		FruitsOrderPayDto dto = new FruitsOrderPayDto();
		dto.setPwd("123456");
		dto.setPayType(PayType.ALIPAY);
		dto.setUserId(548267L);
		dto.setAmount("37.90");
		List<Long> list = new ArrayList<Long>();
		list.add(1291155L);
		list.add(1291162L);
		list.add(1291170L);
		dto.setOrders(list);
		dto.setOnlinePay("37.90");
		dto.setBlancePay("0");
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		System.out.println(JSON.toJSONString(dto));
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(dto)));
		return PostUtil.httpPost(url, formparams);
	}

	public static String fruitsOrderRefund() throws IOException {
		String url = DsTest.api + "/fruits/pay/orderRefund";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("fee", "0.01"));
		formparams.add(new BasicNameValuePair("userId", "452737"));
		formparams.add(new BasicNameValuePair("refundId", "69"));
		formparams.add(new BasicNameValuePair("payType", "WEIXIN"));
		formparams.add(new BasicNameValuePair("pwd", ""));
		formparams.add(new BasicNameValuePair("onlinePay", "0.01"));
		formparams.add(new BasicNameValuePair("blancePay", "0"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String fruitsTransferPay() throws IOException {
		String url = DsTest.api + "/fruits/pay/transfer/pay";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "58597"));
		formparams.add(new BasicNameValuePair("transferId", "144"));
		formparams.add(new BasicNameValuePair("pwd", "1234567"));
		formparams.add(new BasicNameValuePair("payType", "ALIPAY"));// BALANCE
																	// ALIPAY
		formparams.add(new BasicNameValuePair("fee", "0.01"));
		formparams.add(new BasicNameValuePair("fromId", "120240"));
		formparams.add(new BasicNameValuePair("toId", "58597"));
		formparams.add(new BasicNameValuePair("comments", "777"));
		formparams.add(new BasicNameValuePair("onlinePay", "0.01"));
		formparams.add(new BasicNameValuePair("blancePay", "0"));
		// formparams.add(new BasicNameValuePair("orders", "257250"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String fruitsTransferPayBatch() throws IOException {
		String url = DsTest.api + "/fruits/pay/transfer/payBatch";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "120240"));
		formparams.add(new BasicNameValuePair("transferIds", "140,138"));
		formparams.add(new BasicNameValuePair("pwd", "1234567"));
		formparams.add(new BasicNameValuePair("payType", "ALIPAY"));// BALANCE
																	// ALIPAY
		return PostUtil.httpPost(url, formparams);
	}

	public static String fruitsTransaction() throws IOException {
		String url = DsTest.api + "/fruits/capital/getTransaction";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "452737"));
		formparams.add(new BasicNameValuePair("id", "22117741"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String refundStoreList() throws IOException {
		String url = DsTest.api + "/1b/refundstore/refundStoreList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("dsId", "452737"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String updateOrderState() throws IOException {
		String url = DsTest.api + "/1b/order/updateOrderState";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("dsId", "452737"));
		formparams.add(new BasicNameValuePair("orderIds", "25506,25507"));
		return PostUtil.httpPost(url, formparams);
	}

	public static void main(String[] args) throws IOException {

		 String result = alipayNotify();
		 System.out.println(result);
//		 String result = alipayReturn();
		// String result = alipayBatchReturn();
//		String url = "http://localhost:36061/drp/product/createDrpProduct";
//		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
//		formparams.add(new BasicNameValuePair("data", "kRb41lXx2uQWOMBBlwYAa5ahLWNYMtZeL8N+npr2+Lc4hIiifkB+tv/MED9LsfTLolyN+9noaSS5YqXBSSNCHQ=="));
//		System.out.println(PostUtil.httpPost(url, formparams));
	}

	public static String getRefundAddress() throws IOException {
		String url = DsTest.api + "/2b/pm/getRefundAddress";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "97"));
		// formparams.add(new BasicNameValuePair("returnUrl",
		// "http://micro.ngrok.cc/web-service/pay/alipay/return"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String updateRefundAddress() throws IOException {
		String url = DsTest.api + "/2b/pm/updateRefundAddress";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "97"));
		formparams.add(new BasicNameValuePair("name", "李磊2"));
		formparams.add(new BasicNameValuePair("mobile", "14888881238"));
		formparams.add(new BasicNameValuePair("provinceId", "24"));
		formparams.add(new BasicNameValuePair("cityId", "823"));
		formparams.add(new BasicNameValuePair("countyId", "828"));
		formparams.add(new BasicNameValuePair("address", "马王乡"));
		formparams.add(new BasicNameValuePair("postcode", "455445"));
		formparams.add(new BasicNameValuePair("type", "1"));
		// formparams.add(new BasicNameValuePair("returnUrl",
		// "http://micro.ngrok.cc/web-service/pay/alipay/return"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String createDefaultExpress() throws IOException {
		String url = DsTest.api + "/shunt/createDefaultExpress";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		formparams.add(new BasicNameValuePair("dsId", "106730"));
		formparams.add(new BasicNameValuePair("templateId", "18350"));
		// formparams.add(new BasicNameValuePair("returnUrl",
		// "http://micro.ngrok.cc/web-service/pay/alipay/return"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String loadDefaultExpress() throws IOException {
		String url = DsTest.api + "/shunt/loadDefaultExpress";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		formparams.add(new BasicNameValuePair("dsId", "106730"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String getWaitSendOrder() throws IOException {
		String url = DsTest.api + "/shunt/getWaitSendOrder";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		return PostUtil.httpPost(url, formparams);
	}


	public static String loadCoopSpList() throws IOException {
		String url = DsTest.api + "/shunt/loadCoopSpList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String addCoopSp() throws IOException {
		String url = DsTest.api + "/shunt/addCoopSp";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		formparams.add(new BasicNameValuePair("supplierIds", "97"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String cancelCoopSp() throws IOException {
		String url = DsTest.api + "/shunt/cancelCoopSp";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		formparams.add(new BasicNameValuePair("supplierIds", "97"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String setDefaultSp() throws IOException {
		String url = DsTest.api + "/shunt/setDefaultSp";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		formparams.add(new BasicNameValuePair("spId", "1"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String loadDeliverySupplier() throws IOException {
		String url = DsTest.api + "/shunt/loadDeliverySupplier";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		formparams.add(new BasicNameValuePair("pageSize", "10"));
		formparams.add(new BasicNameValuePair("name", "创意"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String getSupplierState() throws IOException {
		String url = DsTest.api + "/shunt/getSupplierState";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
//		formparams.add(new BasicNameValuePair("suplierIds", "265"));
		formparams.add(new BasicNameValuePair("outIds", "265"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String delOrder() throws IOException {
		String url = DsTest.api + "/shunt/order/del";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "578400"));
		formparams.add(new BasicNameValuePair("orderId", "3884894"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static CreateOrder order(){
		CreateOrder order = new CreateOrder();
		order.setCollect(0);
		order.setDsId(47);
		order.setExpressId(1);
		order.setExpressName("中通快递");
		order.setExpressNo("12324234");
		order.setRemark("");
//		order.setShopOrderId(18084522L);
//		order.setShopSourceNo("117366126553619176");
		order.setShopSourceType(SourceType.TAOBAO.toString());
		order.setSourceType(SourceType.TAOBAO);
		Fee fee = new Fee();
		fee.setExpress(new BigDecimal(25));
		fee.setGifts(new BigDecimal(0));
		fee.setInspection(new BigDecimal(0));
        fee.setServiceCharge(new BigDecimal(0));
		order.setFee(fee);
		
		List<Items> list = new ArrayList<Items>();
		Items items = new Items();
		items.setAddress("国际商贸城3区2楼14街22505号");
		items.setAmount(new BigDecimal(110));
		items.setArtNo("创意·雨燕&c205");
		items.setColor("黑色");
		items.setItemId(823595);
		items.setNum(1);
		items.setPhone("18523502645");
		items.setPicUrl("http://go2.i.ximgs.net/5/265/20150305/20150305230304603_220.jpg");
		items.setPrice(new BigDecimal(110));
		items.setSize("36");
		items.setSkuId(12);
		items.setSupplier("D区88号");
		items.setSupplierId(47);
		items.setTitle("商品title");
		items.setSupplyType(0);
		items.setReduceAmount(new BigDecimal(2));
		list.add(items);
		order.setItems(list);
		CreateOrderReceivers receivers=new CreateOrderReceivers();
		
		Address address = new Address();
		address.setAddress("重庆重庆渝北区光电园水星");
		address.setCity("重庆");
		address.setCountry("渝北区");
		address.setProvince("重庆");
		receivers.setAddress(address);
		receivers.setMobile("15828006658");
		receivers.setName("杨杰");
		receivers.setPhone("15828006658");
		order.setReceivers(receivers);
		return order;
	}
	public static String createOrder() throws IOException {
		String url = DsTest.api + "2b/df/order/createOrder";
		
		
		CreateOrder order = new CreateOrder();
		order.setCollect(0);
		order.setDsId(47);
		order.setExpressId(1);
		order.setExpressName("中通快递");
		order.setExpressNo("12324234");
		order.setRemark("");
//		order.setShopOrderId(18084522L);
//		order.setShopSourceNo("117366126553619176");
		order.setShopSourceType(SourceType.TAOBAO.toString());
		order.setSourceType(SourceType.TAOBAO);
		Fee fee = new Fee();
		fee.setExpress(new BigDecimal(25));
		fee.setGifts(new BigDecimal(0));
		fee.setInspection(new BigDecimal(0));
        fee.setServiceCharge(new BigDecimal(0));
		order.setFee(fee);
		
		List<Items> list = new ArrayList<Items>();
		Items items = new Items();
		items.setAddress("国际商贸城3区2楼14街22505号");
		items.setAmount(new BigDecimal(2));
		items.setArtNo("创意·雨燕&c205");
		items.setColor("红色");
		items.setItemId(18);
		items.setNum(5);
		items.setPhone("18523502645");
		items.setPicUrl("http://go2.i.ximgs.net/5/265/20150305/20150305230304603_220.jpg");
		items.setPrice(new BigDecimal(25));
		items.setSize("36");
		items.setSkuId(12);
		items.setSupplier("D区88号");
		items.setSupplierId(47);
		items.setTitle("商品title");
		items.setSupplyType(0);
//		items.setReduceAmount(new BigDecimal(2));
		list.add(items);
		order.setItems(list);
		CreateOrderReceivers receivers=new CreateOrderReceivers();
		
		Address address = new Address();
		address.setAddress("重庆重庆渝北区光电园水星");
		address.setCity("重庆");
		address.setCountry("渝北区");
		address.setProvince("重庆");
		receivers.setAddress(address);
		receivers.setMobile("15828006658");
		receivers.setName("杨杰");
		receivers.setPhone("15828006658");
		order.setReceivers(receivers);
		
		List<CreateOrder> orderList = new ArrayList<CreateOrder>();
		orderList.add(order);
//		orderList.add(order());
		String json = JSON.toJSONString(orderList);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();


		File file = new File("D:/a.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String len="";
		StringBuilder sb =new StringBuilder();
		while((len=br.readLine())!=null){
			sb.append(len);
		}
			System.out.println(sb.toString());	
				
		formparams.add(new BasicNameValuePair("json", sb.toString()));
		formparams.add(new BasicNameValuePair("userId", "40"));
		return PostUtil.httpPost(url, formparams);
	}
	public static String orderDsName() throws IOException {
		String url = DsTest.api + "2b/df/order/orderDsName";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "52"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String list2bOrder() throws IOException {
		String url = DsTest.api + "2b/df/order/list";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
//		formparams.add(new BasicNameValuePair("activityId", "1023920824"));
//		formparams.add(new BasicNameValuePair("akWaitforsendExp", "1"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String detail2bOrder() throws IOException {
		String url = DsTest.api + "2b/df/order/detail";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "52"));
		formparams.add(new BasicNameValuePair("orderId", "3885189"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String loadSupplierInfo() throws IOException {
		String url = DsTest.api + "2b/df/order/loadSupplierInfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "52"));
		formparams.add(new BasicNameValuePair("supplierId", "33"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String calcFreight() throws IOException {
		String url = DsTest.api + "2b/df/order/calcFreight";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "52"));
		formparams.add(new BasicNameValuePair("dsId", "33"));
		formparams.add(new BasicNameValuePair("quantity", "5"));
		formparams.add(new BasicNameValuePair("address", "重庆市渝北区"));
		formparams.add(new BasicNameValuePair("expressId", "1"));
		
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String createRebateActivity() throws IOException {
		String url = DsTest.api + "1b/rebate/activity/createRebateActivity";
		
		ActivityRebateDto dto = new ActivityRebateDto();
		dto.setEndTime("2019-12-20");
		dto.setStartTime("2019-11-20");
		dto.setName("huodong");
		List<RuleDto> listRule = new ArrayList<RuleDto>();
		RuleDto r1 = new RuleDto();
		r1.setAmount("100");
		r1.setLadder(1);
		r1.setRate("2");
		listRule.add(r1);
		dto.setListRule(listRule);
		dto.setRebateType(0);
		dto.setSupplierId(47);
		dto.setUserIds(new ArrayList<Long>());
		System.out.println( JSON.toJSONString(dto));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(dto)));
		
		return PostUtil.httpPost(url, formparams);
	}
	
	
	
	public static String getRebateActivityById() throws IOException {
		String url = DsTest.api + "1b/rebate/activity/getActivityById";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("activityId","7"));
		
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String modifyRebateActivity() throws IOException {
		String url = DsTest.api + "1b/rebate/activity/modifyRebateActivity";
		ActivityRebateDto dto = new ActivityRebateDto();
		List<RuleDto> listRule = new ArrayList<RuleDto>();
		RuleDto r1 = new RuleDto();
		r1.setAmount("5000");
		r1.setLadder(3);
		r1.setRate("4");
		listRule.add(r1);
		dto.setListRule(listRule);
		dto.setRebateType(0);
		dto.setSupplierId(47);
		dto.setActivityId(10L);
		List<Long> list= new ArrayList<Long>();
		list.add(107L);
		list.add(14L);
		list.add(40L);
		dto.setUserIds(list);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(dto)));
		
		return PostUtil.httpPost(url, formparams);
	}
	
	
	
	public static String smsSetUp() throws IOException {
		String url = DsTest.api + "smsSetting/smsSetUp";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("start", "00:00"));
		formparams.add(new BasicNameValuePair("userId", "33"));
		formparams.add(new BasicNameValuePair("end", "23:59"));
		formparams.add(new BasicNameValuePair("stockTag", "1"));
		formparams.add(new BasicNameValuePair("appealTag", "1"));
		formparams.add(new BasicNameValuePair("commisonTag", "0"));
		formparams.add(new BasicNameValuePair("rebateTag", "0"));
		return PostUtil.httpPost(url, formparams);
	}
	public static String submitAppeal() throws IOException {
		String url = DsTest.api + "2b/appeal/submitAppeal";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "107"));
		formparams.add(new BasicNameValuePair("content", "发货超时了"));
		formparams.add(new BasicNameValuePair("type", "1"));
		formparams.add(new BasicNameValuePair("orderId", "52"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String shopOrderDel() throws IOException {
		String url = DsTest.api + "2b/order/del";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "40"));
		formparams.add(new BasicNameValuePair("state", "1"));
		formparams.add(new BasicNameValuePair("orderId", "19802553"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	
	public static String redPacketDeposit() throws Exception{
		String url = DsTest.api + "red/packet/redPackeDeposit";
		long b =new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("outId", 265);
		params.put("amount", "100.02");
		params.put("timestamp", b);
		SignUtil s = new SignUtil();
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("outId", "265"));
		formparams.add(new BasicNameValuePair("timestamp", b+""));
		formparams.add(new BasicNameValuePair("amount", "100.02"));
		formparams.add(new BasicNameValuePair("sign", s.sign(params, "UTF-8")));
		String str = PostUtil.httpPost(url, formparams);
		return str;
	}
	
	
	public static String redPacketUse() throws Exception{
		String url = DsTest.api + "red/packet/redPackeUse";
		long b =new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("outUserId", 55934);
		params.put("outSupplierId", 265);
		params.put("redId",5);
		params.put("itemNo", 1);
		params.put("amount", "0.01");
		params.put("timestamp", b);
		SignUtil s = new SignUtil();
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("outUserId", "55934"));
		formparams.add(new BasicNameValuePair("outSupplierId", "265"));
		formparams.add(new BasicNameValuePair("redId", "5"));
		formparams.add(new BasicNameValuePair("itemNo", "1"));
		formparams.add(new BasicNameValuePair("timestamp", b+""));
		formparams.add(new BasicNameValuePair("amount", "0.01"));
		formparams.add(new BasicNameValuePair("sign", s.sign(params, "UTF-8")));
		String str = PostUtil.httpPost(url, formparams);
		return str;
	}
	
	
	
	public static String redPackeRefund() throws Exception{
		String url = DsTest.api + "red/packet/redPackeRefund";
		long b =new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("outId", 265);
		params.put("amount", "1.02");
		params.put("timestamp", b);
		SignUtil s = new SignUtil();
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("outId", "265"));
		formparams.add(new BasicNameValuePair("timestamp", b+""));
		formparams.add(new BasicNameValuePair("amount", "1.02"));
		formparams.add(new BasicNameValuePair("sign", s.sign(params, "UTF-8")));
		String str = PostUtil.httpPost(url, formparams);
		return str;
	}
	
	
	
	
	public static String appearCertifyPay() throws Exception{
		String url = DsTest.api + "deal/appearCertifyPay";
		long b =new Date().getTime();
		
		List<CertifyVO> list = new ArrayList<CertifyVO>();
		list.add(new CertifyVO("0.01", 123456782));
//		list.add(new CertifyVO("0.1", 6));
//		list.add(new CertifyVO("0.11", 7));
//		list.add(new CertifyVO("0.25", 8));
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userId", 59722);
		params.put("payType", "BALANCE");//BALANCE ALIPAY
		params.put("password", "123456");
		params.put("json", JSON.toJSONString(list));
		params.put("notifyUrl", "http://tol.u.3e3e.cn/pay/alipay-notify?shouldUpdateOrder=1");
		params.put("returnUrl", "http://yuhang.free.idcfengye.com/app-1b/deal/alipay/return");
		params.put("timestamp", b);
		String str = PostUtil.httpApp1b(url, params);
		return str;
	}
	
	public static String certifyCompleted() throws Exception{
		String url = DsTest.api + "deal/certifyCompleted";
		long b =new Date().getTime();
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userId", 59722);
		params.put("targetId", "123456781");//BALANCE ALIPAY
		params.put("timestamp", b);
		String str = PostUtil.httpApp1b(url, params);
		return str;
	}
	
	
	
	public static String appearCertifyRefund() throws Exception{
		String url = DsTest.api + "deal/appearCertifyRefund";
		long b =new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userId", 59722);
		params.put("amount", "0.02");
		params.put("targetId", "123456782");
		params.put("articleNumber", "articleNumber");
		params.put("timestamp", b);
		String str = PostUtil.httpApp1b(url, params);
		return str;
	}
	public static String appearCertifyRefundBySupplier() throws Exception{
		String url = DsTest.api + "deal/appearCertifyRefundBySupplier";
		long b =new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userId", 59722);
		params.put("amount", "0.01");
		params.put("targetId", "123456781");
		params.put("articleNumber", "articleNumber");
		params.put("timestamp", b);
		String str = PostUtil.httpApp1b(url, params);
		return str;
	}
	
	
	
	
	public static String debitPay() throws Exception{
		String url = DsTest.api + "deal/debitPay";
		long b =new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userId", 59722);
		params.put("amount", "0.01"); 
		params.put("debitType", "BUYSMS"); 
		params.put("remark", "BUYSMS"); 
		params.put("targetId", "100001"); 
		params.put("payType", "ALIPAY");//BALANCE ALIPAY
		params.put("password", "123456");
		params.put("notifyUrl", "http://yuhang.free.idcfengye.com/app-1b/deal/alipay/notify");
		params.put("returnUrl", "http://yuhang.free.idcfengye.com/app-1b/deal/alipay/return");
		params.put("timestamp", b);
		String str = PostUtil.httpApp1b(url, params);
		return str;
	}
}
