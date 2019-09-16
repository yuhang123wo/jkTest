package com.yuhang.demo.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.alibaba.fastjson.JSON;
import com.go2.shipping.common.encrypt.AES;
import com.yuhang.demo.PmTest;
import com.yuhang.demo.util.vo.FreightVo;
import com.yuhang.demo.util.vo.Freights;
import com.yuhang.demo.vo.AikuItem;
import com.yuhang.demo.vo.AikuOrderInfo;

public class PmAutoTest {

	public static String byOutId() throws IOException {
		String url = PmTest.api + "/user/byOutId";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("outId", "507612"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String DealPay() throws Exception {
		String url = PmTest.api + "/deal/pay";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", 59722);
		map.put("amount", 5);
		map.put("debitType", "BRUSH");
		map.put("remark", "刷排名");
		map.put("targetId", 1);
		map.put("timestamp", new Date().getTime());
		return PostUtil.httpPost1B(url, map);

	}

	public static String selectSupplier() throws IOException {
		String url = PmTest.api + "/user/selectSupplier";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "556257"));
		formparams.add(new BasicNameValuePair("supplierId", "556248"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String byPlatformAndUsername() throws IOException {
		String url = PmTest.api + "/user/byPlatformAndUsername";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("outPlatform", "3"));
		formparams.add(new BasicNameValuePair("username", "15088592687"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String balance() throws IOException {
		String url = PmTest.api + "/2b/account/balance";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "556257"));
		formparams.add(new BasicNameValuePair("supplierId", "556248"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String pwdAdd() throws IOException {
		String url = PmTest.api + "/2b/account/pwd/add";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "556257"));
		formparams.add(new BasicNameValuePair("supplierId", "556248"));
		formparams.add(new BasicNameValuePair("accountPwd", "123456"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String pwdEdit() throws IOException {
		String url = PmTest.api + "/2b/account/pwd/edit";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "556257"));
		formparams.add(new BasicNameValuePair("supplierId", "556248"));
		formparams.add(new BasicNameValuePair("oldPwd", "123456"));
		formparams.add(new BasicNameValuePair("newPwd", "1234567"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String userinfo2b() throws IOException {
		String url = PmTest.api + "/2b/account/userinfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "556257"));
		formparams.add(new BasicNameValuePair("supplierId", "556248"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String mobilebind2b() throws IOException {
		String url = PmTest.api + "/2b/account/mobile/bind";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "556257"));
		formparams.add(new BasicNameValuePair("supplierId", "556248"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String createOrder() throws IOException {
		String url = PmTest.api + "/2b/df/order/createOrder";
//		String json = "[ { \"sourceType\":\"JD\",\"collect\":1,\"remark\": \"订单备注测试\", \"receivers\":{ \"name\": \"杨杰\", \"phone\": \"15828006658\", \"mobile\": \"15922551329\", \"address\": { \"province\": \"重庆\", \"city\": \"重庆\", \"country\": \"渝北区\", \"address\": \"重庆重庆渝北区光电园水星\" } }, \"dsId\": 464671, \"items\": [ { \"supplierId\": 97, \"supplier\": \"D区88号\", \"phone\": \"18523502645\", \"address\": \"国际商贸城3区2楼14街22505号\", \"artNo\": \"创意·雨燕&A13\", \"itemId\": 696570, \"skuId\": 12, \"title\": \"商品title\", \"picUrl\": \"http://go2.i.ximgs.net/5/265/20150305/20150305230304603_220.jpg\", \"price\": 45, \"num\": 2, \"amount\": 90, \"color\": \"白色\", \"size\": \"EUR26\" } ], \"fee\": { \"giftInfo\": [ { \"id\": 1, \"price\": 0.5, \"num\": 1, \"imgUrl\": \"http://go2.i.ximgs.net/5/265/20150305/20150305230304603_220.jpg\", \"remark\": \"后跟帖\" }, { \"id\": 2, \"price\": 1, \"num\": 2, \"imgUrl\": \"http://go2.i.ximgs.net/5/265/20150305/20150305230304603_220.jpg\", \"remark\": \"丝袜\" } ], \"gifts\": 2.5, \"express\": 25, \"inspection\": 0, \"serviceCharge\": 2, \"payment\":3 }, \"expressId\": 1, \"expressName\": \"中通快递\", \"expressNo\": \"中通快递\" } ]";
		String json = "[ { \"sourceType\":\"JD\",\"collect\":1,\"remark\": \"订单备注测试\", \"receivers\":{ \"name\": \"杨杰\", \"phone\": \"15828006658\", \"mobile\": \"15922551329\", \"address\": { \"province\": \"重庆\", \"city\": \"重庆\", \"country\": \"渝北区\", \"address\": \"重庆重庆渝北区光电园水星\" } }, \"dsId\": 97, \"items\": [ { \"supplierId\": 97, \"supplier\": \"D区88号\", \"phone\": \"18523502645\", \"address\": \"国际商贸城3区2楼14街22505号\", \"artNo\": \"创意·雨燕&A13\", \"itemId\": 696570, \"skuId\": 12, \"title\": \"商品title\", \"picUrl\": \"http://go2.i.ximgs.net/5/265/20150305/20150305230304603_220.jpg\", \"price\": 45, \"num\": 2, \"amount\": 90, \"color\": \"白色\", \"size\": \"EUR26\" },{ \"supplierId\": 97, \"supplier\": \"D区88号\", \"phone\": \"18523502645\", \"address\": \"国际商贸城3区2楼14街22505号\", \"artNo\": \"创意·雨燕&A11\", \"itemId\": 16413437, \"skuId\": 0, \"title\": \"商品title\", \"picUrl\": \"http://go2.i.ximgs.net/5/265/20150305/20150305230304603_220.jpg\", \"price\": 45, \"num\": 2, \"amount\": 90, \"color\": \"白色\", \"size\": \"35\" } ], \"fee\": {\"gifts\": 0.0, \"express\": 25, \"inspection\": 0, \"serviceCharge\": 2, \"payment\":3 }, \"expressId\": 1, \"expressName\": \"中国邮政平邮\", \"expressNo\": \"\" } ]";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("json", json));
		formparams.add(new BasicNameValuePair("userId", "55934"));
		formparams.add(new BasicNameValuePair("outPlatform", "1"));
		return PostUtil.httpPost(url, formparams);
	}

	// String json =
	// "[ { \"sourceType\":\"JD\",\"collect\":1,\"remark\": \"订单备注测试\", \"receivers\":{ \"name\": \"杨杰\", \"phone\": \"15828006658\", \"mobile\": \"15922551329\", \"address\": { \"province\": \"重庆\", \"city\": \"重庆\", \"country\": \"渝北区\", \"address\": \"重庆重庆渝北区光电园水星\" } }, \"dsId\": 2794, \"items\": [ { \"supplierId\": 197841, \"supplier\": \"D区88号\", \"phone\": \"18523502645\", \"address\": \"国际商贸城3区2楼14街22505号\", \"artNo\": \"创意·雨燕&c205\", \"itemId\": 1, \"skuId\": 12, \"title\": \"商品title\", \"picUrl\": \"http://go2.i.ximgs.net/5/265/20150305/20150305230304603_220.jpg\", \"price\": 1, \"num\": 2, \"amount\": 2, \"color\": \"白色\", \"size\": \"EUR26\" } ], \"fee\": { \"giftInfo\": [ { \"id\": 1, \"price\": 0.5, \"num\": 1, \"imgUrl\": \"http://go2.i.ximgs.net/5/265/20150305/20150305230304603_220.jpg\", \"remark\": \"后跟帖\" }, { \"id\": 2, \"price\": 1, \"num\": 2, \"imgUrl\": \"http://go2.i.ximgs.net/5/265/20150305/20150305230304603_220.jpg\", \"remark\": \"丝袜\" } ], \"gifts\": 2.5, \"express\": 25, \"inspection\": 0, \"serviceCharge\": 2, \"payment\":3 }, \"expressId\": 1, \"expressName\": \"中通快递\", \"expressNo\": \"中通快递\" } ]";

	public static String getSupplierByDomain() throws IOException {
		String url = PmTest.api + "/user/getSupplierByDomain";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("subdomain", "mall"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String loadSupplierInfo() throws IOException {
		String url = PmTest.api + "/2b/df/order/loadSupplierInfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("outId", "265"));
		formparams.add(new BasicNameValuePair("userId", "120240"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String queryItemByParamsMustUser() throws IOException {
		String url = PmTest.api + "/gi/queryItemByParamsMustUser";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("artNo", "D1"));
		// formparams.add(new BasicNameValuePair("sourcePlace", "1"));
		// formparams.add(new BasicNameValuePair("outPlatform", "2"));
		formparams.add(new BasicNameValuePair("supplierId", "8"));

		return PostUtil.httpPost(url, formparams);
	}

	public static String queryItemByParams() throws IOException {
		String url = PmTest.api + "/gi/queryItemByParams";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("artNo", "米莱哆&MM618"));
		// formparams.add(new BasicNameValuePair("sourcePlace", "1"));
		// formparams.add(new BasicNameValuePair("outPlatform", "2"));
		// formparams.add(new BasicNameValuePair("supplierId", "97"));

		return PostUtil.httpPost(url, formparams);
	}
	public static String querySkuByColorSize() throws IOException {
		String url = PmTest.api + "/gi/querySkuByColorSize";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("itemId", "45407693"));
		formparams.add(new BasicNameValuePair("color", "红色"));
		 formparams.add(new BasicNameValuePair("size", "130"));
		// formparams.add(new BasicNameValuePair("outPlatform", "2"));
		// formparams.add(new BasicNameValuePair("supplierId", "97"));

		return PostUtil.httpPost(url, formparams);
	}
	
	
	
	
	
	public static String loadSingleGsbItem() throws IOException {
		String url = PmTest.api + "/gi/loadSingleGsbItem";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("itemId", "23508444"));

		return PostUtil.httpPost(url, formparams);
	}
	

	public static String loadDsOrSupplierInfo() throws IOException {
		String url = PmTest.api + "/2b/df/order/loadDsOrSupplierInfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "97"));
		return PostUtil.httpPost(url, formparams);
	}

	/**
	 * 
	 * @return
	 * @throws IOException
	 */
	public static String calcManyFreight() throws IOException {
		String url = PmTest.api + "/2b/df/order/calcManyFreight";
		FreightVo f = new FreightVo();
		f.setDsId(97L);
		List<Freights> list = new ArrayList<Freights>();
		Freights ff = new Freights();
		ff.setAddress("重庆");
		ff.setExpressId(38);
		ff.setQuantity(5);
		ff.setUuid("dsfdfsd;fs");
		list.add(ff);
		f.setList(list);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(f)));
		return PostUtil.httpPost(url, formparams);
	}

	public static String offLineDepositApply() throws IOException {
		String url = PmTest.api + "/pay/offLineDepositApply";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "556257"));
		formparams.add(new BasicNameValuePair("supplierId", "556248"));
		formparams.add(new BasicNameValuePair("amount", "97"));
		formparams.add(new BasicNameValuePair("comments", "97"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String topay() throws IOException {
		String url = PmTest.api + "/pay/topay";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "556257"));
		formparams.add(new BasicNameValuePair("supplierId", "556248"));
		formparams.add(new BasicNameValuePair("fee", "0.01"));
		formparams.add(new BasicNameValuePair("rate", "0"));
		formparams.add(new BasicNameValuePair("notifyUrl", "http://baidu.com"));
		formparams.add(new BasicNameValuePair("returnUrl",
				"http://127.0.0.1:8080/pay/alipay/return"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String checkPayInfo() throws IOException {
		String url = PmTest.api + "/1b/user/checkPayInfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "4"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String addPayInfo() throws IOException {
		String url = PmTest.api + "/1b/user/addPayInfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "556258"));
		formparams.add(new BasicNameValuePair("partner", "2088221939210090"));
		formparams.add(new BasicNameValuePair("sellerEmail", "margin_nantong@stargoto.com"));
		formparams.add(new BasicNameValuePair("key", "h2osg8bsworasnpdc7gnzhk5wx8wnkxq"));
		formparams.add(new BasicNameValuePair("companyName", "成都星购途信息技术有限公司"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String updatePayInfo() throws IOException {
		String url = PmTest.api + "/1b/user/updatePayInfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "556248"));
		formparams.add(new BasicNameValuePair("partner", "2088221939210090"));
		formparams.add(new BasicNameValuePair("sellerEmail", "margin_nantong@stargoto.com"));
		formparams.add(new BasicNameValuePair("key", "h2osg8bsworasnpdc7gnzhk5wx8wnkxq"));
		formparams.add(new BasicNameValuePair("companyName", "成都星购途信息技术有限公司"));
		formparams.add(new BasicNameValuePair("vCode", "555327"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String alivCodeByOwner() throws IOException {
		String url = PmTest.api + "/1b/user/alivCodeByOwner";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "556248"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String offLineDepositUpdate() throws IOException {
		String url = PmTest.api + "/pay/offLineDepositUpdate";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "556248"));
		formparams.add(new BasicNameValuePair("depositId", "4"));
		formparams.add(new BasicNameValuePair("state", "1"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String offLineDepositList() throws IOException {
		String url = PmTest.api + "/pay/offLineDepositList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "556248"));
		formparams.add(new BasicNameValuePair("supplierId", "556248"));
		formparams.add(new BasicNameValuePair("userName", ""));
		formparams.add(new BasicNameValuePair("startTime", ""));
		formparams.add(new BasicNameValuePair("endTime", ""));
		formparams.add(new BasicNameValuePair("page", ""));
		formparams.add(new BasicNameValuePair("pageSize", ""));
		formparams.add(new BasicNameValuePair("state", ""));
		return PostUtil.httpPost(url, formparams);
	}

	public static String orderPay() throws IOException {
		String url = PmTest.api + "/pay/orderPay";
		OrderPayDto dto = new OrderPayDto();
		dto.setPwd("123456");
		dto.setType(PayType.BALANCE);
		dto.setUserId(55934L);
		dto.setAmount("62.99");
		List<Long> list = new ArrayList<Long>();
		list.add(4263777L);
		dto.setOrders(list);
		dto.setRate("0");
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(dto)));
		return PostUtil.httpPost(url, formparams);
	}

	/**
	 * 余额
	 * 
	 * @return
	 * @throws IOException
	 */
	public static String accountInfo() throws IOException {
		String url = PmTest.api + "/1b/capital/accountInfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "556257"));
		formparams.add(new BasicNameValuePair("supplierId", "556248"));
		return PostUtil.httpPost(url, formparams);
	}

	/**
	 * 流水列表
	 * 
	 * @return
	 * @throws IOException
	 */
	public static String transactionList() throws IOException {
		String url = PmTest.api + "/1b/capital/transaction/list";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "556257"));
		formparams.add(new BasicNameValuePair("supplierId", "556248"));
		// formparams.add(new BasicNameValuePair("page", ""));
		// formparams.add(new BasicNameValuePair("pageSize", ""));
		// formparams.add(new BasicNameValuePair("startTime", "2017-02-01"));
		// formparams.add(new BasicNameValuePair("endTime", "2017-02-28"));
		// formparams.add(new BasicNameValuePair("tradeNo", ""));
		// formparams.add(new BasicNameValuePair("accountName", ""));
		// formparams.add(new BasicNameValuePair("tradeType", "DEPOSIT"));
		// formparams.add(new BasicNameValuePair("direction", "1"));
		// formparams.add(new BasicNameValuePair("relationId", "55934"));
		// formparams.add(new BasicNameValuePair("online", "1"));
		formparams.add(new BasicNameValuePair("id", "2"));

		return PostUtil.httpPost(url, formparams);
	}

	public static String transferReceive() throws IOException {
		String url = PmTest.api + "/trade/transfer/receive/list";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "97"));
		// formparams.add(new BasicNameValuePair("fromId", "556248"));
		formparams.add(new BasicNameValuePair("pageSize", "1"));
		formparams.add(new BasicNameValuePair("orderNo", ""));
		formparams.add(new BasicNameValuePair("page", "1"));
		formparams.add(new BasicNameValuePair("startTime", ""));
		formparams.add(new BasicNameValuePair("endTime", ""));
		formparams.add(new BasicNameValuePair("state", ""));
		formparams.add(new BasicNameValuePair("name", ""));
		return PostUtil.httpPost(url, formparams);
	}

	public static String transferPayList() throws IOException {
		String url = PmTest.api + "/trade/transfer/pay/list";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "97"));
		// formparams.add(new BasicNameValuePair("toId", "556248"));
		formparams.add(new BasicNameValuePair("pageSize", "500"));
		formparams.add(new BasicNameValuePair("page", "1"));
		formparams.add(new BasicNameValuePair("startTime", ""));
		formparams.add(new BasicNameValuePair("endTime", ""));
		formparams.add(new BasicNameValuePair("state", "WAITFORPAY"));
		formparams.add(new BasicNameValuePair("name", ""));
		return PostUtil.httpPost(url, formparams);
	}

	public static String receiveApply() throws IOException {
		String url = PmTest.api + "/trade/transfer/receive/apply";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));// 55934
		formparams.add(new BasicNameValuePair("pwd", ""));
		formparams.add(new BasicNameValuePair("transferId", ""));
		formparams.add(new BasicNameValuePair("fee", "0.01"));
		formparams.add(new BasicNameValuePair("fromId", "464671"));
		formparams.add(new BasicNameValuePair("toId", "55934"));
		formparams.add(new BasicNameValuePair("comments", "我要收款我要收款测试"));
		// formparams.add(new BasicNameValuePair("orders", "25711"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String urge() throws IOException {
		String url = PmTest.api + "/trade/transfer/urge";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		formparams.add(new BasicNameValuePair("transferId", "62"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String transferPay() throws IOException {
		String url = PmTest.api + "/trade/transfer/pay";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "464671"));
//		formparams.add(new BasicNameValuePair("transferId", "2"));
		formparams.add(new BasicNameValuePair("pwd", "123456"));
		formparams.add(new BasicNameValuePair("payType", "BALANCE"));// BALANCE
																		// ALIPAY
		formparams.add(new BasicNameValuePair("fee", "1"));
		formparams.add(new BasicNameValuePair("fromId", "464671"));
		formparams.add(new BasicNameValuePair("toId", "55934"));
		formparams.add(new BasicNameValuePair("comments", "777"));
		// formparams.add(new BasicNameValuePair("orders", "257250"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String transferPayBatch() throws IOException {
		String url = PmTest.api + "/trade/transfer/payBatch";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "120240"));
		formparams.add(new BasicNameValuePair("transferIds", "5,6"));
		formparams.add(new BasicNameValuePair("pwd", "123456"));
		formparams.add(new BasicNameValuePair("payType", "ALIPAY"));// BALANCE
																	// ALIPAY
		formparams.add(new BasicNameValuePair("notifyUrl", "http://baidu.com"));
		formparams.add(new BasicNameValuePair("returnUrl",
				"http://127.0.0.1:8080/pay/alipay/return"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String withdrawApply() throws IOException {
		String url = PmTest.api + "/trade/withdraw/apply";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "464671"));
		formparams.add(new BasicNameValuePair("amount", "1"));
		formparams.add(new BasicNameValuePair("pwd", "123456"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String getPrdFrozen() throws IOException {
		String url = PmTest.api + "/trade/getPrdFrozen";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "461790"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String listGifts() throws IOException {
		String url = PmTest.api + "/1b/gifts/listGifts";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "97"));
		formparams.add(new BasicNameValuePair("page", "1"));
		formparams.add(new BasicNameValuePair("pageSize", "20"));
		formparams.add(new BasicNameValuePair("name", ""));
		return PostUtil.httpPost(url, formparams);
	}

	public static String queryGifts() throws IOException {
		String url = PmTest.api + "/1b/gifts/queryGifts";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("giftsId", "1"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String addGifts() throws IOException {
		String url = PmTest.api + "/1b/gifts/addGifts";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("name", "小卡片"));
		formparams.add(new BasicNameValuePair("userId", "97"));
		formparams.add(new BasicNameValuePair("imgUrl", "http://mig.c.x"));
		formparams.add(new BasicNameValuePair("price", "1"));
		formparams.add(new BasicNameValuePair("quantity", "1000"));
		formparams.add(new BasicNameValuePair("type", "GIFT"));
		formparams.add(new BasicNameValuePair("cost", "12"));
		formparams.add(new BasicNameValuePair("remark", "xxx"));
		formparams.add(new BasicNameValuePair("state", "ENABLED"));
		formparams.add(new BasicNameValuePair("weight", "1"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String editGifts() throws IOException {
		String url = PmTest.api + "/1b/gifts/editGifts";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("name", "小mao"));
		formparams.add(new BasicNameValuePair("imgUrl", "http://mig.c.x"));
		// formparams.add(new BasicNameValuePair("price", "0.5"));
		formparams.add(new BasicNameValuePair("quantity", "100"));
		formparams.add(new BasicNameValuePair("id", "4"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String delGifts() throws IOException {
		String url = PmTest.api + "/1b/gifts/delGifts";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("giftsId", "2"));
		formparams.add(new BasicNameValuePair("userId", "161325"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String addGiftsBatch() throws IOException {
		String url = PmTest.api + "/1b/gifts/addGiftsBatch";
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

	public static String withDrawList2B() throws IOException {
		String url = PmTest.api + "/trade/withDrawList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "556257"));
		formparams.add(new BasicNameValuePair("supplierId", "556248"));
		// formparams.add(new BasicNameValuePair("stateW", "2"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String getOffPayState() throws IOException {
		String url = PmTest.api + "/1b/user/getOffPayState";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "97"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String updateOffPayState() throws IOException {
		String url = PmTest.api + "/1b/user/updateOffPayState";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "97"));
		formparams.add(new BasicNameValuePair("state", "1"));
		formparams.add(new BasicNameValuePair("qrCode", "http://dfadkjf"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String offPaySet() throws IOException {
		String url = PmTest.api + "/1b/user/offPaySet";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "97"));
		formparams.add(new BasicNameValuePair("vCode", "449064"));
		formparams.add(new BasicNameValuePair("qrCode", "http://dfadkdjf"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String offPaySetvCode() throws IOException {
		String url = PmTest.api + "/1b/user/offPaySetvCode";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "97"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String matchItem() throws IOException {
		String url = PmTest.api + "/2b/order/matchItem";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		RelationRequest rqu = new RelationRequest();
		rqu.setUserId(120240L);
		List<RelationDto> list = new ArrayList<RelationDto>();
		RelationDto dto = new RelationDto();
		dto.setItemId(1817L);
		dto.setRelationId("TAOBAO-556907295151");
		RelationDto dto1 = new RelationDto();
		dto1.setItemId(1816L);
		dto1.setRelationId("TAOBAO-556595268391");
		list.add(dto);
		list.add(dto1);
		rqu.setList(list);
		System.out.println(JSON.toJSONString(rqu));
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(rqu)));
		return PostUtil.httpPost(url, formparams);
	}

	private static String alipayNotify() throws IOException {
		String url = "http://127.0.0.1:8080/pay/alipay/notify";
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
		formparams.add(new BasicNameValuePair("body", "转账:0.02"));
		formparams.add(new BasicNameValuePair("buyer_id", "2088112797789753"));
		formparams.add(new BasicNameValuePair("notify_id", "451f45b153cdfe0cbe7e63e6aca32adlse"));
		formparams.add(new BasicNameValuePair("notify_type", "trade_status_sync"));
		formparams.add(new BasicNameValuePair("payment_type", "1"));
		formparams.add(new BasicNameValuePair("out_trade_no", "GSBPM_TEST_21320"));
		formparams.add(new BasicNameValuePair("price", "0.02"));
		formparams.add(new BasicNameValuePair("trade_status", "TRADE_SUCCESS"));
		formparams.add(new BasicNameValuePair("total_fee", "0.02"));
		formparams.add(new BasicNameValuePair("trade_no", "20170322210010047502763188890"));
		formparams.add(new BasicNameValuePair("sign_type", "MD5"));
		formparams.add(new BasicNameValuePair("seller_id", "2088221939210090"));
		formparams.add(new BasicNameValuePair("is_total_fee_adjust", "N"));
		String result = PostUtil.httpPost(url, formparams);
		return result;
	}

	private static String alipayReturn() throws IOException {
		String url = "http://127.0.0.1:6666/web-service/pay/alipay/return";
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
		formparams.add(new BasicNameValuePair("out_trade_no", "GSBGO2_SC_261"));
		formparams.add(new BasicNameValuePair("total_fee", "0.03"));
		formparams.add(new BasicNameValuePair("trade_status", "TRADE_SUCCESS"));
		formparams.add(new BasicNameValuePair("trade_no", "2017032221001004750276349449"));
		formparams.add(new BasicNameValuePair("sign_type", "MD5"));
		formparams.add(new BasicNameValuePair("seller_id", "2088221939210090"));
		String result = PostUtil.httpPost(url, formparams);
		return result;
	}

	private static String alipayBatchReturn() throws IOException {
		String url = "http://127.0.0.1:8080/trade/alipay/batchNotify";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("sign", "edac32addd87b5038c464eea16fdae48"));
		formparams.add(new BasicNameValuePair("notify_time", "2017-05-16 15:59:47"));
		formparams.add(new BasicNameValuePair("pay_user_id", "2088221939210090"));
		formparams.add(new BasicNameValuePair("sign_type", "MD5"));
		formparams.add(new BasicNameValuePair("pay_user_name", "成都星购途信息技术有限公司"));
		// formparams.add(new BasicNameValuePair("success_details",
		// "1591^15803096943^于航^1111^S^^201702230185028260^20170223153434|"));
		formparams.add(new BasicNameValuePair("fail_details",
				"21376^15803096943^于航^100^S^^201702230185028260^20170223153434|"));
		formparams.add(new BasicNameValuePair("notify_type", "batch_trans_notify"));
		formparams.add(new BasicNameValuePair("notify_id", "16c1c190fe7b9df77caeffae7e76e48l66"));
		formparams.add(new BasicNameValuePair("pay_account_no", "20882219392100900156"));
		formparams.add(new BasicNameValuePair("batch_no", "gsb170223000017"));
		String result = PostUtil.httpPost(url, formparams);
		return result;
	}

	public static String getCustomerById() throws IOException {
		String url = PmTest.api + "/orderCustomer/getCustomerById";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("customerId", "1"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String likeByName() throws IOException {
		String url = PmTest.api + "/orderCustomer/likeByName";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("dsId", "97"));
		formparams.add(new BasicNameValuePair("name", "y"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String batchOrderlist() throws IOException {
		String url = PmTest.api + "/trade/order/batchOrderlist";
		A a = new PmAutoTest().new A();
		a.setDsId(265);
		a.setTradeUserId(265);
		a.setState(1);
		AES aes = new AES(APP_AES_KEY);
		String str = aes.encrypt(JSON.toJSONString(a));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("reqParams", str));
		return PostUtil.httpPost(url, formparams);
	}

	class A {
		private long dsId;
		private long tradeUserId;
		private int state;

		public int getState() {
			return state;
		}

		public void setState(int state) {
			this.state = state;
		}

		public long getTradeUserId() {
			return tradeUserId;
		}

		public void setTradeUserId(long tradeUserId) {
			this.tradeUserId = tradeUserId;
		}

		public long getDsId() {
			return dsId;
		}

		public void setDsId(long dsId) {
			this.dsId = dsId;
		}

	}

	public static String AppOrderlist() throws IOException {
		String url = PmTest.api + "/trade/order/list";
		A a = new PmAutoTest().new A();
		a.setDsId(265);
		a.setTradeUserId(265);
		AES aes = new AES(APP_AES_KEY);
		String str = aes.encrypt(JSON.toJSONString(a));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("reqParams", str));
		return PostUtil.httpPost(url, formparams);
	}

	public static String AppviewExpress() throws IOException {
		String url = PmTest.api + "/trade/order/viewExpress";
		B a = new PmAutoTest().new B();
		a.setDsId(265);
		a.setTradeUserId(265);
		a.setOrderId(25849);
		AES aes = new AES(APP_AES_KEY);
		String str = aes.encrypt(JSON.toJSONString(a));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("reqParams", str));
		return PostUtil.httpPost(url, formparams);
	}

	class B {
		private long dsId;
		private long tradeUserId;
		private long orderId;

		public long getDsId() {
			return dsId;
		}

		public void setDsId(long dsId) {
			this.dsId = dsId;
		}

		public long getTradeUserId() {
			return tradeUserId;
		}

		public void setTradeUserId(long tradeUserId) {
			this.tradeUserId = tradeUserId;
		}

		public long getOrderId() {
			return orderId;
		}

		public void setOrderId(long orderId) {
			this.orderId = orderId;
		}

	}

	public static final String APP_AES_KEY = "2016.01_go2plus_chengdu_china";

	public static void main(String[] args) throws IOException {
		// String
		// str="{\"PushTime\":\"2018-03-28%202016:42:15\",\"EBusinessID\":\"1306019\",\"Data\":[{\"CallBack\":\"1&25846&2\",\"LogisticCode\":\"485061481659\",\"ShipperCode\":\"ZTO\",\"Traces\":[{\"AcceptStation\":\"[台州市]温岭泽国镇的客户部[13355862531]已收件\",\"AcceptTime\":\"2018-03-26%2019:27:34\"},{\"AcceptStation\":\"[台州市]快件离开温岭已发往成都中转\",\"AcceptTime\":\"2018-03-26%2019:33:36\"},{\"AcceptStation\":\"[台州市]快件已到达台州中转部\",\"AcceptTime\":\"2018-03-26%2021:29:05\"},{\"AcceptStation\":\"[台州市]快件离开台州中转部已发往成都中转\",\"AcceptTime\":\"2018-03-26%2021:31:28\"},{\"AcceptStation\":\"[南充市]快件已到达南充中转站\",\"AcceptTime\":\"2018-03-28%2011:50:35\"},{\"AcceptStation\":\"[成都市]快件已到达成都中转\",\"AcceptTime\":\"2018-03-28%2016:33:19\"}],\"State\":\"2\",\"OrderCode\":\"1&25846&2\",\"EBusinessID\":\"1306019\",\"Success\":true}],\"Count\":\"1\"}";
		// List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		// formparams.add(new BasicNameValuePair("RequestData", str));
		// String strx=
		// PostUtil.httpPost("http://127.0.0.1:8020/kdniao/callBack",
		// formparams);
		// System.out.println(strx);

		// String
		// s="B0219CC0471A15B9362F8C085AF406458B2B4B530592A61B1FCBF9478824B411A9FA3A5B85D4922A15D9D3AE0B5EABD5337B5158F9849C19F9A6F74A22CA5624";
		//
		// AES aes = new AES(APP_AES_KEY);
		// System.out.println(aes.decrypt(s));

		AES aes = new AES(APP_AES_KEY);
		String str = aes
				.decrypt("8A63981DDF343F59F204177DACF5021A314E530074F01EF33A2AB4691C2557F96755D067D10958116FEA006C3FFBE38F2925BF46568A31C81F8EB858CFC3B1223415474C1F7F29182CF385B84C53DEAED241ABD5148A7767FF0429670A3A117DFE9FDD67E2172537AFC206B301EEA81C3C078F21082D26C0DA372F79007DA9969A7FDF4EA729FEF21A2349A1E72624B966677471A3A6DDBFC88512112E27EF9BD669FB5369677EFD56780285D1F9154370FE33C7B7E338F32F8784A351A7666823B74FBC83BE2D95EFFE39125FD198F5");
		System.out.println(str);

		// List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		// formparams.add(new BasicNameValuePair("reqParams",
		// "EEBB3CEB4DA24F367B9731827A1DEA405E16558FBF819CE5AFED36F35AA249ED315D99749C26255C954358C73E25694EB6E4408945CFD576FB7E21A78481D333"));
		// System.out.println(PostUtil.httpPost("http://121.40.182.83:16710/trade/orderCustomer/edit",
		// formparams));

	}

	public static String listBranch() throws IOException {
		String url = PmTest.api + "/trade/pm/listBranch";
		C a = new PmAutoTest().new C();
		a.setUserId(265);
		a.setTradeUserId(265);
		AES aes = new AES(APP_AES_KEY);
		String str = aes.encrypt(JSON.toJSONString(a));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("reqParams", str));
		return PostUtil.httpPost(url, formparams);
	}

	class D {
		private long tradeId;
		private long dsId;
		private long batchNo;

		public long getTradeId() {
			return tradeId;
		}

		public void setTradeId(long tradeId) {
			this.tradeId = tradeId;
		}

		public long getDsId() {
			return dsId;
		}

		public void setDsId(long dsId) {
			this.dsId = dsId;
		}

		public long getBatchNo() {
			return batchNo;
		}

		public void setBatchNo(long batchNo) {
			this.batchNo = batchNo;
		}

	}

	public static String batchListOrderInfos() throws IOException {
		String url = PmTest.api + "/trade/order/orderListByBatchNo";
		D a = new PmAutoTest().new D();
		a.setTradeId(265);
		a.setDsId(265);
		a.setBatchNo(2018032700001L);
		AES aes = new AES(APP_AES_KEY);
		String str = aes.encrypt(JSON.toJSONString(a));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("reqParams", str));
		return PostUtil.httpPost(url, formparams);
	}

	public static String postageList() throws IOException {
		String url = PmTest.api + "/trade/order/postage/list";
		D a = new PmAutoTest().new D();
		a.setTradeId(265);
		a.setDsId(265);
		a.setBatchNo(2018032700001L);
		AES aes = new AES(APP_AES_KEY);
		String str = aes.encrypt(JSON.toJSONString(a));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("reqParams", str));
		return PostUtil.httpPost(url, formparams);
	}

	public static String validTemplates() throws IOException {
		String url = PmTest.api + "/trade/pm/waybill/validTemplates";
		C a = new PmAutoTest().new C();
		a.setUserId(265);
		a.setTradeUserId(265);
		AES aes = new AES(APP_AES_KEY);
		String str = aes.encrypt(JSON.toJSONString(a));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("reqParams", str));
		return PostUtil.httpPost(url, formparams);
	}

	public static String getIndexUrl() throws IOException {
		String url = PmTest.api + "/trade/orderCustomer/getIndexUrl";
		C a = new PmAutoTest().new C();
		a.setDsId(265);
		a.setCustomerId(12);
		AES aes = new AES(APP_AES_KEY);
		String str = aes.encrypt(JSON.toJSONString(a));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("reqParams", str));
		return PostUtil.httpPost(url, formparams);
	}

	public static String getElectronicSheetInfo() throws IOException {
		String url = PmTest.api + "/trade/pm/order/printInfo";
		C a = new PmAutoTest().new C();
		a.setUserId(265);
		a.setTradeUserId(265);
		a.setOrderIds("25856");
		a.setCpCode("YTO");
		a.setCity("台州市");
		a.setProvince("浙江省");
		a.setDistrict("温岭市");
		a.setDetail("城北街道石粘新村B区10栋2号");
		a.setShopId("41");
		AES aes = new AES(APP_AES_KEY);
		String str = aes.encrypt(JSON.toJSONString(a));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("reqParams", str));
		return PostUtil.httpPost(url, formparams);
	}

	class C {
		private long userId;
		private long dsId;
		private long customerId;

		public long getDsId() {
			return dsId;
		}

		public void setDsId(long dsId) {
			this.dsId = dsId;
		}

		public long getCustomerId() {
			return customerId;
		}

		public void setCustomerId(long customerId) {
			this.customerId = customerId;
		}

		private long tradeUserId;
		private String orderIds;
		private String cpCode;
		private String province;
		private String city;
		private String district;
		private String detail;
		private String shopId;

		public String getCpCode() {
			return cpCode;
		}

		public void setCpCode(String cpCode) {
			this.cpCode = cpCode;
		}

		public String getProvince() {
			return province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getDistrict() {
			return district;
		}

		public void setDistrict(String district) {
			this.district = district;
		}

		public String getDetail() {
			return detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public String getShopId() {
			return shopId;
		}

		public void setShopId(String shopId) {
			this.shopId = shopId;
		}

		public long getUserId() {
			return userId;
		}

		public void setUserId(long userId) {
			this.userId = userId;
		}

		public long getTradeUserId() {
			return tradeUserId;
		}

		public void setTradeUserId(long tradeUserId) {
			this.tradeUserId = tradeUserId;
		}

		public String getOrderIds() {
			return orderIds;
		}

		public void setOrderIds(String orderIds) {
			this.orderIds = orderIds;
		}

	}

	public static String checkCanBeCancel() throws IOException {
		String url = PmTest.api + "/trade/pm/checkCanBeCancel";
		X a = new PmAutoTest().new X();
		a.setOrderIds("25514,25515,25516,25517,25519,25524");
		a.setDsId(210205);
		a.setTradeUserId(210205);
		a.setSid("3592cc8d-02fa-46f6-9b34-b066d6c60f89");
		AES aes = new AES(APP_AES_KEY);
		String str = aes.encrypt(JSON.toJSONString(a));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("reqParams", str));
		return PostUtil.httpPost(url, formparams);
	}

	class X {
		private long tradeUserId;

		public long getTradeUserId() {
			return tradeUserId;
		}

		public void setTradeUserId(long tradeUserId) {
			this.tradeUserId = tradeUserId;
		}

		private long dsId;
		private String orderIds;
		private String sid;

		public String getSid() {
			return sid;
		}

		public void setSid(String sid) {
			this.sid = sid;
		}

		public long getDsId() {
			return dsId;
		}

		public void setDsId(long dsId) {
			this.dsId = dsId;
		}

		public String getOrderIds() {
			return orderIds;
		}

		public void setOrderIds(String orderIds) {
			this.orderIds = orderIds;
		}

	}

	public static String createAikuOrder() throws IOException {
		String url = PmTest.api + "/aiku/createAikuOrder";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "638514"));

		AikuOrderInfo oi = new AikuOrderInfo();
		oi.setActivityId("1023920824");
		oi.setExpressCompany("SF");
		oi.setExpressNo("");
		oi.setOrderNo("10000004");
		oi.setReceiverAddress("重庆云阳凤鸣");
		oi.setReceiverMobile("15803096943");
		oi.setReceiverName("于航");
		
		List<AikuItem> list =new ArrayList<AikuItem>();
		
		AikuItem item = new AikuItem();
		item.setArticleNo("DS");
		item.setBarCode("DS-2");
		item.setSize("34");
		item.setColor("粉红色");
		item.setQuantity(5);
		list.add(item);
		oi.setItem(list);
		
		
		List<AikuOrderInfo> listOrder = new ArrayList<AikuOrderInfo>();
		listOrder.add(oi);
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(listOrder)));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String getAikuActivity() throws IOException {
		String url = PmTest.api + "/aiku/getAikuActivity";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
//		formparams.add(new BasicNameValuePair("userId", "638514"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String getActivityNameByOrderId() throws IOException {
		String url = PmTest.api + "/aiku/getActivityNameByOrderId";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("orderId", "4217309"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	
	public static String returnOrder() throws IOException {
		String url = PmTest.api + "/2b/df/order/returnOrder";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		formparams.add(new BasicNameValuePair("orderId", "4263750"));
		formparams.add(new BasicNameValuePair("itemIds", "4864297"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String cancelWaiforsendOrder() throws IOException {
		String url = PmTest.api + "/1b/order/cancelWaiforsendOrder";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("dsId", "464671"));
		formparams.add(new BasicNameValuePair("orderIds", "4263915"));
		return PostUtil.httpPost(url, formparams);
	}
	public static String getOrderRefundMaps() throws IOException {
		String url = PmTest.api + "/2b/df/order/getOrderRefundMaps";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "1"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String detailOrder() throws IOException {
		String url = PmTest.api + "/2b/df/order/detail";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		formparams.add(new BasicNameValuePair("orderId", "4263941"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	

	
	public static String updateAppeal() throws IOException {
		String url = PmTest.api + "/1b/appeal/deal/updateAppeal";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("appealId", "293"));
		formparams.add(new BasicNameValuePair("remark", "4263404"));
		formparams.add(new BasicNameValuePair("dsId", "4864297"));
		return PostUtil.httpPost(url, formparams);
	}

	
	public static String updateRefundSign() throws IOException {
		String url = PmTest.api + "/1b/refund/updateRefundSign";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("dsId", "464671"));
		formparams.add(new BasicNameValuePair("refundId", "680"));
		formparams.add(new BasicNameValuePair("signStatus", "1"));
		formparams.add(new BasicNameValuePair("reason", "ffffff"));
		formparams.add(new BasicNameValuePair("img", "[\"df/sg/516b9f3c-8979-4caf-a555-acd1795cfaf8.jpg\"]"));
		return PostUtil.httpPost(url, formparams);
	}
	public static String getStoreIndex() throws IOException {
		String url = PmTest.api + "/1b/take/getStoreIndex";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("supplierId", "8"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String updateRefundRefuse() throws IOException {
		String url = PmTest.api + "/1b/refund/updateRefundRefuse";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("dsId", "464671"));
		formparams.add(new BasicNameValuePair("refundId", "700"));
		formparams.add(new BasicNameValuePair("reason", "xxxxxx"));
//		formparams.add(new BasicNameValuePair("img", "http://www.baidu.com/dfjkadf/fdaskjfasdf"));
//		formparams.add(new BasicNameValuePair("img", "http://www.baidu.com/dfjkadf/fdaskjfasdf"));
//		formparams.add(new BasicNameValuePair("img", "http://www.baidu.com/dfjkadf/fdaskjfasdf"));
		return PostUtil.httpPost(url, formparams);
	}
	public static String refundListvib() throws IOException {
		String url = PmTest.api + "/2b/df/order/refundList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("purchaserId", "55934"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	
	public static String loginApp1b() throws IOException {
		String url = PmTest.api + "/wap/login";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("username", "nahuoyuan001"));
		formparams.add(new BasicNameValuePair("password", "123456"));
		return PostUtil.httpPost(url, formparams);
	}

	
	public static String option(String token) throws IOException {
		String url = PmTest.api + "/wap/platform/option";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "621327"));
		formparams.add(new BasicNameValuePair("token", token));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String index(String token) throws IOException {
		String url = PmTest.api + "/wap/platform/index";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "621327"));
		formparams.add(new BasicNameValuePair("token", token));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String taked(String token) throws IOException {
		String url = PmTest.api + "/wap/platform/orderTaked";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "621327"));
		formparams.add(new BasicNameValuePair("takeIds", "3115"));
		formparams.add(new BasicNameValuePair("token", token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String orderStockOut(String token) throws IOException {
		String url = PmTest.api + "/wap/platform/orderStockOut";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "621327"));
		formparams.add(new BasicNameValuePair("takeIds", "3116"));
		formparams.add(new BasicNameValuePair("token", token));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String transactionRelation() throws IOException {
		String url = PmTest.api + "/trade/transaction/relation";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "464671"));
		formparams.add(new BasicNameValuePair("tId", "40484"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String sellListPlatform() throws IOException {
		String url = PmTest.api + "/1b/take/sellListPlatform";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("supplierId", "97"));
//		formparams.add(new BasicNameValuePair("endTime", "2019-08-28"));
		formparams.add(new BasicNameValuePair("pageSize", "10"));
		return PostUtil.httpPost(url, formparams);
	}
	public static String advanceList() throws IOException {
		String url = PmTest.api + "/1b/take/advanceList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("supplierId", "97"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String appAdvanceList() throws IOException {
		String url = PmTest.api + "/1b/take/appAdvanceList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("supplierId", "97"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String getSalesTake() throws IOException {
		String url = PmTest.api + "/1b/take/getSalesTake";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("supplierId", "8"));
		return PostUtil.httpPost(url, formparams);
	}
	public static String getTakeTracByOrderId() throws IOException {
		String url = PmTest.api + "/common/getTakeTracByOrderId";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("orderId", "4263797"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String submitAppeal() throws IOException {
		String url = PmTest.api + "/2b/appeal/submitAppeal";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "226207"));
		formparams.add(new BasicNameValuePair("content", "拿货超时了"));
		formparams.add(new BasicNameValuePair("type", "1"));
		formparams.add(new BasicNameValuePair("orderId", "4263842"));
		return PostUtil.httpPostWz(url, formparams);
	}
	
	
	public static String stockOutList() throws IOException {
		String url = PmTest.api + "/1b/take/stockOutList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("supplierId", "97"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String refundItemList() throws IOException {
		String url = PmTest.api + "/1b/refund/refundItemList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("supplierId", "97"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String getTransferLimit() throws IOException {
		String url = PmTest.api + "/trade/getTransferLimit";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("fromId", "97"));
		formparams.add(new BasicNameValuePair("toId", "55934"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String appStockOutList() throws IOException {
		String url = PmTest.api + "/1b/take/appStockOutListNew";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("supplierId", "97"));
		formparams.add(new BasicNameValuePair("state", "TAKED"));
		formparams.add(new BasicNameValuePair("pageSize", "1"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String appStoreListNew() throws IOException {
		String url = PmTest.api + "/1b/take/appStoreListNew";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("supplierId", "97"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String getTodayStoreIndex() throws IOException {
		String url = PmTest.api + "/1b/take/getTodayStoreIndex";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("supplierId", "97"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String appStoreList() throws IOException {
		String url = PmTest.api + "/1b/take/appStoreList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("supplierId", "97"));
		formparams.add(new BasicNameValuePair("type", "0"));
		formparams.add(new BasicNameValuePair("pageSize", "10"));
		return PostUtil.httpPost(url, formparams);
	}
	public static String getRefundingReach() throws IOException {
		String url = PmTest.api + "/1b/order/getRefundingReach";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("dsId", "464671"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String getUserByOutId() throws IOException {
		String url = PmTest.api + "/user/getUserByOutId";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("outId", "265"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String getpreBalance() throws Exception {
		String url = PmTest.api + "/cd/user/getpreBalance";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "265"));
		Map<String, Object> params = new HashMap<String, Object>();
		String time = new Date().getTime() + "";
		params.put("userId", "265");
		params.put("timestamp", time);
		SignUtil util = new SignUtil();
		util.sign(params, "UTF-8");
		formparams.add(new BasicNameValuePair("timestamp", time));
		formparams.add(new BasicNameValuePair("sign", util.sign(params, "UTF-8")));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String getprXeBalance() throws Exception {
		String url = PmTest.api + "/1b/take/getpreBalance";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "97"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String getOrderRefundByOrderIdAndOrderItemId() throws IOException {
		String url = PmTest.api + "/2b/df/order/getOrderRefundByOrderIdAndOrderItemId";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		formparams.add(new BasicNameValuePair("orderId", "4263797"));
		formparams.add(new BasicNameValuePair("orderItemId", "4864360"));
		formparams.add(new BasicNameValuePair("state", "COMPLETED"));
		return PostUtil.httpPost(url, formparams);
	}
	
}
