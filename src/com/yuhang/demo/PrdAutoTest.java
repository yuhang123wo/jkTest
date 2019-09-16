package com.yuhang.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.alibaba.fastjson.JSON;
import com.yuhang.demo.util.PostUtil;
import com.yuhang.demo.util.SignUtil;
import com.yuhang.demo.vo.CreateOrder;
import com.yuhang.demo.vo.CreateProductVo;
import com.yuhang.demo.vo.Items;
import com.yuhang.demo.vo.SkuVo;
import com.yuhang.demo.vo.UpdateProductPo;
import com.yuhang.demo.vo.UpdateSkuPo;

public class PrdAutoTest {
	public static String createDrpProduct() throws Exception {
		String url = PrdTest.api + "/drp/product/createDrpProduct";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 303);
		params.put("timestamp", b);
		CreateProductVo vo = new CreateProductVo();
		vo.setOriginPrice("60");
		vo.setReward("6");
		vo.setShippingTag(1);
		vo.setArticleNumber("女童迷彩裤");
		vo.setBrand("棒棒熊");
		vo.setBatchTag(1);
		List<String> list = new ArrayList<String>();
		list.add("/2/2272/20160331/20160331184238715012.jpg");
		list.add("/2/2272/20160331/20160331184238715012.jpg");
		vo.setImages(list);
		vo.setPrice(new BigDecimal("31"));
		vo.setProductId(1487904L);
		vo.setVideo("http://3e3e.i.ximgs.net/8/470778/2019010920190109212631145.mp4");
		vo.setSupplierId(410729L);
		vo.setSupplierName("淘气孩童装");
		vo.setTitle("棒棒熊&女童迷彩裤");
		vo.setWeight(new BigDecimal("1"));
		List<SkuVo> svs = new ArrayList<SkuVo>();
		SkuVo ss = new SkuVo();
		ss.setColor("军绿色");
		ss.setPrice(new BigDecimal("52"));
		ss.setBatchPrice(new BigDecimal("50.5"));
		ss.setImage("");
		ss.setSize("110");
		ss.setBatchNum(2);
		SkuVo s2 = new SkuVo();
		s2.setColor("紫色");
		s2.setPrice(new BigDecimal("51"));
		s2.setBatchPrice(new BigDecimal("49.6"));
		s2.setImage("");
		s2.setSize("110");
		s2.setBatchNum(2);
		SkuVo s3 = new SkuVo();
		s3.setColor("粉红色");
		s3.setPrice(new BigDecimal("50"));
		s3.setBatchPrice(new BigDecimal("47.8"));
		s3.setImage("");
		s3.setSize("110");
		s3.setBatchNum(3);
		SkuVo s4 = new SkuVo();
		s4.setColor("粉红色");
		s4.setPrice(new BigDecimal("50"));
		s4.setBatchPrice(new BigDecimal("47.9"));
		s4.setImage("");
		s4.setSize("115");
		s4.setBatchNum(3);
		svs.add(ss);
		svs.add(s2);
		svs.add(s3);
		svs.add(s4);
		vo.setSkus(svs);
		params.put("data", JSON.toJSONString(vo));
		return PostUtil.httpPostPrd(url, params);
	}
	
	
	
	
	public static String productList() throws Exception {
		String url = PrdTest.api + "/drp/product/productList";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("timestamp", b);
		params.put("pageNo", 1);
		params.put("pageSize", 100);
		params.put("state", "0");
		params.put("prdId", 1901);
		return PostUtil.httpPostPrd(url, params);
	}
	
	
	public static String prdInfo() throws Exception {
		String url = PrdTest.api + "/drp/account/getPrdInfo";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("outId", 487182);
		params.put("timestamp", b);
		SignUtil s = new SignUtil();
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("timestamp", b + ""));
		formparams.add(new BasicNameValuePair("outId", "320697"));
		formparams.add(new BasicNameValuePair("sign", s.sign(params, "UTF-8")));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	
	public static String updateProductState() throws Exception {
		String url = PrdTest.api + "/drp/product/updateProductState";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userId", 53);
		params.put("timestamp", b);
		params.put("state", -1);
		params.put("productId", 2);
		SignUtil s = new SignUtil();
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "53"));
		formparams.add(new BasicNameValuePair("timestamp", b + ""));
		formparams.add(new BasicNameValuePair("state", "-1"));
		formparams.add(new BasicNameValuePair("productId", "2"));
		formparams.add(new BasicNameValuePair("sign", s.sign(params, "UTF-8")));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	
	
	public static String updateProductInfo() throws Exception {
		String url = PrdTest.api + "/drp/product/updateProductInfo";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 104);
		params.put("timestamp", b);
		UpdateProductPo vo = new UpdateProductPo();
		vo.setProductId(144L);
		vo.setTitle("女童旗袍连衣裙夏装2019新款女孩洋气时髦夏季蕾丝背心裙潮x");
		vo.setWeight(new BigDecimal("1"));
		vo.setShippingTag(0);
		vo.setBatchTag(1);
		vo.setOriginPrice("51");
		vo.setReward("7");
		List<UpdateSkuPo> svs = new ArrayList<UpdateSkuPo>();
		UpdateSkuPo ss = new UpdateSkuPo();
		ss.setPrice(new BigDecimal("46"));
		ss.setPrdSkuId(1482L);
		ss.setBatchPrice(new BigDecimal("45.4"));
		ss.setBatchNum(2);
		ss.setColor("粉红色");
		ss.setSize("110");
		
		UpdateSkuPo gg = new UpdateSkuPo();
		gg.setPrice(new BigDecimal("48"));
		gg.setBatchPrice(new BigDecimal("47.2"));
		gg.setColor("粉红色");
		gg.setSize("120");
		gg.setBatchNum(2);
		gg.setPrdSkuId(1483L);
		
		
		
		UpdateSkuPo xx = new UpdateSkuPo();
		xx.setPrice(new BigDecimal("49"));
		xx.setBatchNum(2);
		xx.setBatchPrice(new BigDecimal("48"));
		xx.setColor("粉红色");
		xx.setSize("130");
		xx.setPrdSkuId(1484L);
		svs.add(ss);
		svs.add(gg);
		svs.add(xx);
		vo.setSkus(svs);
		params.put("data", JSON.toJSONString(vo));
		return PostUtil.httpPostPrd(url, params);
	}
	
	
	public static String saleOrderList() throws Exception {
		String url = PrdTest.api + "/drp/order/saleOrderList";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 440);
//		params.put("orderNo", "T1903076640655");
		params.put("timestamp", b);
		params.put("pageNo", 1);
//		params.put("state", "COMPLETED");
		params.put("pageSize", 20);
//		params.put("isShipping", "1");
		return PostUtil.httpPostPrd(url, params);
	}
	
	
	public static String transactionList() throws Exception {
		String url = PrdTest.api + "/drp/account/transactionList";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 303);
		params.put("timestamp", b);
		params.put("pageNo", 1);
//		params.put("type", "REWARDR");
		params.put("pageSize", 20);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String paypwdAdd() throws Exception {
		String url = PrdTest.api + "/drp/account/paypwd/add";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 104);
		params.put("pwd", "234234");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String paypwdEdit() throws Exception {
		String url = PrdTest.api + "/drp/account/paypwd/edit";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 104);
		params.put("pwd", "123456");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String customerList() throws Exception {
		String url = PrdTest.api + "/drp/customer/customerList";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 303);
		params.put("timestamp", b);
		params.put("pageNo", 1);
		params.put("pageSize", 20);
		params.put("type", 2);
		return PostUtil.httpPostPrd(url, params);
	}
	public static String getDetailCustomer() throws Exception {
		String url = PrdTest.api + "/drp/customer/getDetailCustomer";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 303);
		params.put("timestamp", b);
		params.put("customerId", 233);
		return PostUtil.httpPostPrd(url, params);
	}
	public static String getPercentage() throws Exception {
		String url = PrdTest.api + "/drp/percentage/getAllPercentage";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 195);
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	public static String listProfit() throws Exception {
		String url = PrdTest.api + "/drp/profit/listProfit";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 303);
//		params.put("createTimeBegin", "2019-01-09");
//		params.put("createTimeEnd", "2019-09-09");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	public static String getRewardAndProfit() throws Exception {
		String url = PrdTest.api + "/drp/rp/getRewardAndProfit";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 303);
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String listReward() throws Exception {
		String url = PrdTest.api + "/drp/reward/listReward";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 104);
		params.put("type", 1);
//		params.put("createTimeBegin", "2019-01-09");
//		params.put("createTimeEnd", "2019-09-09");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	public static String refundOrder() throws Exception {
		String url = PrdTest.api + "/drp/order/refundOrder";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 440);
		params.put("orderId", 757);
		params.put("password", "1234567");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	public static String drphotProductList() throws Exception {
		String url = PrdTest.api + "/drp/product/hotProductList";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 104);
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	public static String saleOrderDetail() throws Exception {
		String url = PrdTest.api + "/drp/order/saleOrderDetail";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 104);
		params.put("orderId", 574);
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	public static String batchDelProduct() throws Exception {
		String url = PrdTest.api + "/drp/product/batchDelProduct";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 368);
		params.put("productIds", 148);
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String listPostage() throws Exception {
		String url = PrdTest.api + "/drp/postage/listPostage";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 303);
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String getCode() throws Exception {
		String url = PrdTest.api + "/drp/wx/getCode";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 104);
		params.put("page", "pages/register/getUserInfo");
		params.put("scene", "sharety=co&prdId=104&id=144&pId=1");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}

	public static String modifyPostageState() throws Exception {
		String url = PrdTest.api + "/drp/postage/modifyPostageState";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 53);
		params.put("postId", "10");
		params.put("state", "0");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}

	public static String addPostage() throws Exception {
		String url = PrdTest.api + "/drp/postage/add";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 53);
		params.put("expressId", "1");
		params.put("expressName", "中国邮政平邮");
		params.put("firstWeight", "1");
		params.put("addedWeight", "1");
		params.put("firstWeightKg", "1");
		params.put("addedWeightKg", "1");
		params.put("destination", "1");
		params.put("reamrk", "1");
		params.put("state", "1");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	
	public static String addPrd() throws Exception {
		String url = PrdTest.api + "/drp/account/addPrd";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("outId", 326939);
		params.put("username", "1360830879422");
		params.put("shopName", "xu店铺");
		params.put("state", "1");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	public static String completeOrderBatch() throws Exception {
		String url = PrdTest.api + "/drp/order/completeOrderBatch";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 368);
		params.put("orderIds", "4259548");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	public static String getProfit() throws Exception {
		String url = PrdTest.api + "/drp/profit/getProfit";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 303);
		params.put("tag",2);
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	

	
	public static String getCanSelectRegion() throws Exception {
		String url = PrdTest.api + "/drp/postage/getCanSelectRegion";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 303);
		params.put("expressId", "86");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	
	public static String modifyExpressState() throws Exception {
		String url = PrdTest.api + "/drp/postage/modifyExpressState";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 53);
		params.put("expressId", "1");
		params.put("state", "1");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	
	public static String createOrder() throws Exception {
		String url = PrdTest.api + "prd/order/createOrder";
		CreateOrder o = new CreateOrder();
		o.setPrdId(368);
		o.setToken(PrdTest.token);
		o.setVersion("2.0");
		o.setAmount(new BigDecimal("50"));
//		o.setExpressId(28);
//		o.setExpressName("圆通速递");
		o.setBuyerComments("快点发货啊");
		o.setCollect(0);
		o.setFreight(new BigDecimal(0));
		o.setPrice(new BigDecimal("50"));
		o.setReceiverAddressId(71L);
		o.setShippingTag(1);
		
		List<Items> list = new ArrayList<Items>();
		Items item = new Items();
		item.setNum(1);
//		item.setShoppingCartId(1L);
		item.setPrice(new BigDecimal("50"));
		item.setProductId(148L);
		item.setProductSkuId(1613L);
		list.add(item);
		o.setItems(list);
		return PostUtil.httpPostBody(url, JSON.toJSONString(o));
	}
	
	 
	
	public static String createDfOrder() throws Exception {
		String url = PrdTest.api + "/drp/order/createDfOrder";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 368);
		List<DfOrderInfoTT> tt =new ArrayList<DfOrderInfoTT>();
		DfOrderInfoTT t = new DfOrderInfoTT();
		t.setOrderId(576L);
		t.setComments("测试测试");
		t.setExpressId(28L);
		t.setReceiverName("于航");
		t.setReceiverPhone("15803096943");
		t.setRecevierCity("兰州");
		t.setRecevierDistrict("城关");
		t.setRecevierProvince("甘肃");
		t.setReceiverAddress("甘肃兰州城关hjjjs");
		t.setServicePrice(new BigDecimal(1.5));
		t.setChargeInspection(BigDecimal.ZERO);
		t.setFreight(new BigDecimal(5));
		t.setPrice(new BigDecimal(31));
		t.setAmount(new BigDecimal(37.5));
		tt.add(t);
		System.out.println(JSON.toJSON(tt));
		params.put("orders", JSON.toJSON(tt));
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String dfOrderList() throws Exception {
		String url = PrdTest.api + "/drp/order/dfOrderList";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 231);
//		params.put("state", "WAITFORPAY");
		params.put("orderNo", "19");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String getProductByProductId() throws Exception {
		String url = PrdTest.api + "/drp/product/getProductByProductId";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 195);
		params.put("productId", "1488832");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	public static String dforderPay() throws Exception {
		String url = PrdTest.api + "/drp/pay/orderPay";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 368);
		params.put("orderIds", "4259548");
		params.put("amount", "37.5");
		params.put("payType", "BALANCE");//BALANCE,ALI
		params.put("pwd", "123456");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String updateDfOrderComments() throws Exception {
		String url = PrdTest.api + "/drp/order/updateDfOrderComments";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 104);
		params.put("orderId", "4216957");
		params.put("comments","");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String updateDfOrderExpress() throws Exception {
		String url = PrdTest.api + "/drp/order/updateDfOrderExpress";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 104);
		params.put("orderId", "4216957");
		params.put("postageId", "18348");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String updateDfOrderReceiver() throws Exception {
		String url = PrdTest.api + "/drp/order/updateDfOrderReceiver";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 104);
		params.put("orderId", "4216957");
		params.put("name", "于航");
		params.put("mobile", "15803096943");
		params.put("provinceName", "北京");
		params.put("cityName", "北京");
		params.put("countyName", "朝阳区");
		params.put("address", "123234");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String deposit() throws Exception {
		String url = PrdTest.api + "/drp/pay/deposit";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 231);
		params.put("fee", "0.01");
		params.put("payType", "ALI");
		params.put("aliReturnUrl", "http://prdapi.go2b2b.com/app/alipay/return");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String withdrawApply() throws Exception {
		String url = PrdTest.api + "/drp/account/withdrawApply";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 104);
		params.put("amount", "2");
		params.put("type", "2");
		params.put("pwd", "123456");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String updateAlipayInfo() throws Exception {
		String url = PrdTest.api + "/drp/account/updateAlipayInfo";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 104);
		params.put("alipayAccount", "yu");
		params.put("alipayName", "uii");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String withdrawList() throws Exception {
		String url = PrdTest.api + "/drp/account/withdrawList";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 104);
		params.put("state", "");
		params.put("startTime", "");
		params.put("endTime", "");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	public static String getAccountInfo() throws Exception {
		String url = PrdTest.api + "/drp/account/getAccountInfo";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 104);
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String getexpressInfoDrp() throws Exception {
		String url = PrdTest.api + "/drp/order/getExpressInfo";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("orderId", "4216977");
		params.put("prdId", 104);
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	public static String getOrderStatisNum() throws Exception {
		String url = PrdTest.api + "/drp/order/getOrderStatisNum";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 195);
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String prdexpressPostagesList() throws Exception {
		String url = PrdTest.api + "/drp/order/expressPrdPostagesList";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 53);
		params.put("province", "重庆");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String dfexpressPostagesList() throws Exception {
		String url = PrdTest.api + "/drp/order/expressDfPostagesList";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 53);
		params.put("province", "重庆");
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String  drpproductDetail() throws Exception {
		String url = PrdTest.api + "/drp/product/productDetail";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 104);
		params.put("productId", 170);
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String  getTradeRelationDrp() throws Exception {
		String url = PrdTest.api + "/drp/account/getTradeRelation";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 104);
		params.put("tId", 32264);
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String  getWithdrawAmount() throws Exception {
		String url = PrdTest.api + "/drp/account/getWithdrawAmount";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 104);
		params.put("timestamp", b);
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String hasSet() throws Exception {
		String url = PrdTest.api + "/drp/account/paypwd/hasSet";
		SignUtil s = new SignUtil();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 104);
		params.put("timestamp", String.valueOf(new Date().getTime()));
		params.put("sign", s.sign(params, "UTF-8"));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		Iterator<Entry<String, Object>> iter = params.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
			formparams
					.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
		}
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String cancelOrder() throws Exception {
		String url = PrdTest.api + "/drp/order/cancelOrder";
		SignUtil s = new SignUtil();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 104);
		params.put("orderId", 541);
		params.put("timestamp", String.valueOf(new Date().getTime()));
		params.put("sign", s.sign(params, "UTF-8"));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		Iterator<Entry<String, Object>> iter = params.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
			formparams
					.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
		}
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String getDsInfo() throws Exception {
		String url = PrdTest.api + "/drp/order/getDsInfo";
		SignUtil s = new SignUtil();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 53);
		params.put("timestamp", String.valueOf(new Date().getTime()));
		params.put("sign", s.sign(params, "UTF-8"));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		Iterator<Entry<String, Object>> iter = params.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
			formparams
					.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
		}
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String updateCutomerComments() throws Exception {
		String url = PrdTest.api + "/drp/customer/updateCutomerComments";
		SignUtil s = new SignUtil();
		
		List<Cvpo> list = new ArrayList<Cvpo>();
		Cvpo c = new Cvpo(54L, "aaaa");
		list.add(c);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 53);
		params.put("commentsv", JSON.toJSONString(list));
		params.put("timestamp", String.valueOf(new Date().getTime()));
		params.put("sign", s.sign(params, "UTF-8"));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		Iterator<Entry<String, Object>> iter = params.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
			formparams
					.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
		}
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String getDistributionNum() throws Exception {
		String url = PrdTest.api + "/drp/supplier/getDistributionNum";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 53);
		params.put("supplierIds", "1,2,3");
		params.put("timestamp", b);
		SignUtil s = new SignUtil();
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("prdId", "53"));
		formparams.add(new BasicNameValuePair("supplierIds", "1,2,3"));
		formparams.add(new BasicNameValuePair("timestamp", b + ""));
		formparams.add(new BasicNameValuePair("sign", s.sign(params, "UTF-8")));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String modifyMobileVcode() throws Exception {
		SignUtil s = new SignUtil();
		String url = PrdTest.api + "/drp/account/getModifyVcode";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 53);
		params.put("mobile", "15803096943");
		params.put("timestamp", String.valueOf(new Date().getTime()));
		params.put("sign", s.sign(params, "UTF-8"));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		Iterator<Entry<String, Object>> iter = params.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
			formparams
					.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
		}
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String modifyMobile() throws Exception {
		SignUtil s = new SignUtil();
		String url = PrdTest.api + "/drp/account/modifyMobile";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 53);
		params.put("mobile", "15803096943");
		params.put("code", "201885");
		params.put("timestamp", String.valueOf(new Date().getTime()));
		params.put("sign", s.sign(params, "UTF-8"));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		Iterator<Entry<String, Object>> iter = params.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
			formparams
					.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
		}
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String region() throws Exception {
		SignUtil s = new SignUtil();
		String url = PrdTest.api + "/drp/order/region";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 53);
		params.put("pid", 31);
		params.put("timestamp", String.valueOf(new Date().getTime()));
		params.put("sign", s.sign(params, "UTF-8"));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		Iterator<Entry<String, Object>> iter = params.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
			formparams
					.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
		}
		return PostUtil.httpPost(url, formparams);
	}
	public static String getPrdCalcFreight() throws Exception {
		SignUtil s = new SignUtil();
		String url = PrdTest.api + "/drp/order/getPrdCalcFreight";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 53);
		params.put("orderId", 383);
		params.put("province", "重x庆");
		params.put("expressId", "1");
		params.put("timestamp", String.valueOf(new Date().getTime()));
		params.put("sign", s.sign(params, "UTF-8"));
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String getDfCalcFreight() throws Exception {
		SignUtil s = new SignUtil();
		String url = PrdTest.api + "/drp/order/getDfCalcFreight";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 850);
		params.put("orderId", 383);
		params.put("province", "重庆");
		params.put("expressId", "1");
		params.put("timestamp", String.valueOf(new Date().getTime()));
		params.put("sign", s.sign(params, "UTF-8"));
		return PostUtil.httpPostPrd(url, params);
	}
	
	
	
	public static String saleOrderTodfDetail() throws Exception {
		SignUtil s = new SignUtil();
		String url = PrdTest.api + "/drp/order/saleOrderTodfDetail";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 104);
		params.put("orderId", 605);
		params.put("timestamp", String.valueOf(new Date().getTime()));
		return PostUtil.httpPostPrd(url, params);
	}
	
	public static String getDfOrderDetail() throws Exception {
		SignUtil s = new SignUtil();
		String url = PrdTest.api + "/drp/order/getDfOrderDetail";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 104);
		params.put("orderId", 4216812);
		params.put("timestamp", String.valueOf(new Date().getTime()));
		params.put("sign", s.sign(params, "UTF-8"));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		Iterator<Entry<String, Object>> iter = params.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
			formparams
					.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
		}
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String getAllDrpSupplier() throws Exception {
		String url = PrdTest.api + "/drp/supplier/getAllDrpSupplier";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 53);
		params.put("pageNo", "1");
		params.put("pageSize", "20");
		params.put("timestamp", b);
		SignUtil s = new SignUtil();
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("prdId", "53"));
		formparams.add(new BasicNameValuePair("pageNo", "1"));
		formparams.add(new BasicNameValuePair("pageSize", "20"));
		formparams.add(new BasicNameValuePair("timestamp", b + ""));
		formparams.add(new BasicNameValuePair("sign", s.sign(params, "UTF-8")));
		return PostUtil.httpPost(url, formparams);
	}
	public static String xcudeposit() throws Exception {
	 
		String url = PrdTest.api + "/prd/pay/deposit";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("fee", "50000000"));
		formparams.add(new BasicNameValuePair("ip", "182.19.9.1"));
		formparams.add(new BasicNameValuePair("token", PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String xcuUpdateExpress() throws Exception {
		String url = PrdTest.api + "/prd/order/updateExpress";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("postageId", "10"));
		formparams.add(new BasicNameValuePair("orderId", "383"));
		formparams.add(new BasicNameValuePair("token", PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String xcuOrderPay() throws Exception {
		 
		String url = PrdTest.api + "/prd/pay/orderPay";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("prdId", "368"));
		formparams.add(new BasicNameValuePair("orderIds", "641"));
		formparams.add(new BasicNameValuePair("amount", "50"));
		formparams.add(new BasicNameValuePair("payType", "BALANCE"));
		formparams.add(new BasicNameValuePair("pwd", "123456"));
		formparams.add(new BasicNameValuePair("ip", "182.19.9.1"));
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String xcuCustomerList() throws Exception {
		String url = PrdTest.api + "/prd/customer/customerList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("prdId", "440"));
		formparams.add(new BasicNameValuePair("type", "2"));
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	public static String WxgetAccountInfo() throws Exception {
		String url = PrdTest.api + "/prd/account/getAccountInfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
//		formparams.add(new BasicNameValuePair("prdId", "104"));
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	public static String hotProductList() throws Exception {
		String url = PrdTest.api + "/prd/product/hotProductList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("prdId", "104"));
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String getProductFromOrder() throws Exception {
		String url = PrdTest.api + "/prd/order/getProductFromOrder";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("prdId", "104"));
		formparams.add(new BasicNameValuePair("orderId", "561"));
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	public static String getRewardData() throws Exception {
		String url = PrdTest.api + "/prd/reward/getRewardData";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String mobileAliVcode() throws Exception {
		String url = PrdTest.api + "/prd/account/mobile/mobileAliVcode";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String collectList() throws Exception {
		String url = PrdTest.api + "/prd/product/collectList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		formparams.add(new BasicNameValuePair("prdId","104"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String getRewardDetail() throws Exception {
		String url = PrdTest.api + "/prd/reward/getRewardDetail";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		formparams.add(new BasicNameValuePair("transactionId","1183"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String wxwithdrawApply() throws Exception {
		String url = PrdTest.api + "/prd/account/withdrawApply";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		formparams.add(new BasicNameValuePair("pwd","xxx"));
		formparams.add(new BasicNameValuePair("type","1"));
		formparams.add(new BasicNameValuePair("amount","1"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String getUsPrdList() throws Exception {
		String url = PrdTest.api + "/prd/account/getUsPrdList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String updateAliPay() throws Exception {
		String url = PrdTest.api + "/prd/account/ali/updateAliPay";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("code", "080750"));
		formparams.add(new BasicNameValuePair("alipayName", "2"));
		formparams.add(new BasicNameValuePair("alipayAccount", "2"));
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String wxProductQuery() throws Exception {
		String url = PrdTest.api + "/prd/product/query";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("prdId", "303"));
		formparams.add(new BasicNameValuePair("sortName", "REWARD"));
		formparams.add(new BasicNameValuePair("size", ""));
		formparams.add(new BasicNameValuePair("sizeSection", ""));
		formparams.add(new BasicNameValuePair("minPrice", ""));
		formparams.add(new BasicNameValuePair("maxPrice", ""));
		formparams.add(new BasicNameValuePair("token", PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String prdProductQuery() throws Exception {
		String url = PrdTest.api + "/drp/home/query";
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("prdId", "104");
//		formparams.add(new BasicNameValuePair("sortName", "REWARD"));
//		map.put("size", "");
//		map.put("pageNo", "2");
//		map.put("sizeSection", "1");
//		map.put("minPrice", "");
//		map.put("maxPrice", "");
		map.put("sortName", "PRICE");
		map.put("timestamp", String.valueOf(new Date().getTime()));
		return PostUtil.httpPostPrd(url, map);
	}
	
	public static String drplistRewardNews() throws Exception {
		String url = PrdTest.api + "/drp/home/listRewardNews";
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("prdId", "104");
		map.put("timestamp", String.valueOf(new Date().getTime()));
		return PostUtil.httpPostPrd(url, map);
	}
	public static String getPrdInfoByPrdId() throws Exception {
		String url = PrdTest.api + "/drp/account/getPrdInfoByPrdId";
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("prdId", "104");
		map.put("timestamp", String.valueOf(new Date().getTime()));
		return PostUtil.httpPostPrd(url, map);
	}
	
	
	public static String wxProductdetail() throws Exception {
		String url = PrdTest.api + "/prd/product/detail";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("prdId", "303"));
		formparams.add(new BasicNameValuePair("productId", "132"));
		formparams.add(new BasicNameValuePair("token", PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String cartList() throws Exception {
		String url = PrdTest.api + "/prd/cart/list";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("prdId", "104"));
		formparams.add(new BasicNameValuePair("token", PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String getCartNum() throws Exception {
		String url = PrdTest.api + "/prd/cart/getCartNum";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("prdId", "109"));
		formparams.add(new BasicNameValuePair("token", PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String getAgreement() throws Exception {
		String url = PrdTest.api + "/prd/user/getAgreement";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("prdId", "104"));
		formparams.add(new BasicNameValuePair("token", PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	public static String prdList() throws Exception {
		String url = PrdTest.api + "/prd/account/prdList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("prdId", "104"));
		formparams.add(new BasicNameValuePair("type", "1"));
		formparams.add(new BasicNameValuePair("token", PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String setGuide() throws Exception {
		String url = PrdTest.api + "/prd/user/setGuide";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("prdId", "104"));
		formparams.add(new BasicNameValuePair("type", "2"));
		formparams.add(new BasicNameValuePair("token", PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String getGuide() throws Exception {
		String url = PrdTest.api + "/prd/user/getGuide";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("prdId", "104"));
		formparams.add(new BasicNameValuePair("type", "2"));
		formparams.add(new BasicNameValuePair("token", PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	public static String setAgreement() throws Exception {
		String url = PrdTest.api + "/prd/user/setAgreement";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("prdId", "104"));
		formparams.add(new BasicNameValuePair("token", PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String getPayAgreement() throws Exception {
		String url = PrdTest.api + "/prd/user/getPayAgreement";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("prdId", "104"));
		formparams.add(new BasicNameValuePair("type", "2"));
		formparams.add(new BasicNameValuePair("token", PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String setPayAgreement() throws Exception {
		String url = PrdTest.api + "/prd/user/setPayAgreement";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("prdId", "104"));
		formparams.add(new BasicNameValuePair("type", "2"));
		formparams.add(new BasicNameValuePair("token", PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String getTradeRelation() throws Exception {
		String url = PrdTest.api + "/prd/account/getTradeRelation";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("tId", "21"));
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	public static String getRewardReport() throws Exception {
		String url = PrdTest.api + "/prd/reward/getRewardReport";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	public static String wxlistReward() throws Exception {
		String url = PrdTest.api + "/prd/reward/listReward";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		formparams.add(new BasicNameValuePair("orderId","572"));
		return PostUtil.httpPost(url, formparams);
	}
	public static String listRewardNews() throws Exception {
		String url = PrdTest.api + "/prd/reward/listRewardNews";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("prdId","104"));
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	public static String listWaitReward() throws Exception {
		String url = PrdTest.api + "/prd/reward/listWaitReward";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("prdId","104"));
		formparams.add(new BasicNameValuePair("type","0"));
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String WxtransactionList() throws Exception {
		String url = PrdTest.api + "/prd/account/transactionList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("orderNo", "T"));
		formparams.add(new BasicNameValuePair("startTime", "2019-01-01"));
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String WxgetCalcFreight() throws Exception {
		String url = PrdTest.api + "/prd/order/getCalcFreight";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("expressId", "4"));
		formparams.add(new BasicNameValuePair("weight", "10"));
		formparams.add(new BasicNameValuePair("province", "xx"));
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		formparams.add(new BasicNameValuePair("prdId","53"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String expressPostagesList() throws Exception {
		String url = PrdTest.api + "/prd/order/expressPostagesList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("province","重"));
		formparams.add(new BasicNameValuePair("prdId","104"));
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String getAllExpressPostagesList() throws Exception {
		String url = PrdTest.api + "/drp/order/getAllExpressPostagesList";
		Map<String,Object> parmams =new HashMap<String, Object>();
		parmams.put("prdId", "231");
		parmams.put("timestamp", String.valueOf(new Date().getTime()));
		return PostUtil.httpPostPrd(url, parmams);
	}
	
	public static String getExpressInfo() throws Exception {
		String url = PrdTest.api + "/prd/order/getExpressInfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("orderId","1617"));
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String wxproduct() throws Exception {
		String url = PrdTest.api + "/prd/product/query";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("prdId","53"));
		formparams.add(new BasicNameValuePair("token",PrdTest.token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String bsProductList() throws Exception {
		String url = PrdTest.api + "/backstage/product/list";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 1901);
		params.put("articleNumber", "3208");
		params.put("timestamp", b);
		return PostUtil.httpPostBack(url, params);
	}
	
	
	public static String prdCustomerList() throws Exception {
		String url = PrdTest.api + "/backstage/customer/list";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("prdId", 53);
		params.put("timestamp", b);
		SignUtil s = new SignUtil();
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("timestamp", b + ""));
		formparams.add(new BasicNameValuePair("prdId", "53"));
		formparams.add(new BasicNameValuePair("sign", s.signBack(params, "UTF-8")));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String listPrd() throws Exception {
		String url = PrdTest.api + "/backstage/account/listPrd";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("timestamp", b);
		params.put("pageNo", "1");
//		params.put("start", "2019-04-19");
//		params.put("end", "2019-04-19");
		return PostUtil.httpPostBack(url, params);
	}
	public static String setRecommend() throws Exception {
		String url = PrdTest.api + "/backstage/account/setRecommend";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("timestamp", b);
		params.put("prdId", "104");
		params.put("state", "1");
		return PostUtil.httpPostBack(url, params);
	}
	
	public static String productListBack() throws Exception {
		String url = PrdTest.api + "/backstage/product/list";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("start", "2018-01-01");
		params.put("state", 2);
		params.put("timestamp", b);
		SignUtil s = new SignUtil();
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("timestamp", b + ""));
//		formparams.add(new BasicNameValuePair("start", "2018-01-01"));
		formparams.add(new BasicNameValuePair("state", "2"));
		formparams.add(new BasicNameValuePair("sign", s.signBack(params, "UTF-8")));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String cutomerlist() throws Exception {
		String url = PrdTest.api + "/backstage/customer/list";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("start", "2018-01-16");
//		params.put("end", "2018-09-16");
//		params.put("type", 1);
		params.put("pageNo", "1");
		params.put("pageSize", "100");
		params.put("timestamp", b);
		params.put("prdId","303");
//		params.put("shopName","1");
//		params.put("prdName","1");
//		params.put("recommendName","1");
		return PostUtil.httpPostBack(url, params);
	}
	
	
	public static String updateProductInfoBack() throws Exception {
		String url = PrdTest.api + "/backstage/product/updateProductInfo";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("timestamp", b);
		UpdateProductPo vo = new UpdateProductPo();
		vo.setProductId(2L);
		vo.setTitle("titlex");
		vo.setWeight(new BigDecimal("10.2"));
		List<UpdateSkuPo> svs = new ArrayList<UpdateSkuPo>();
		UpdateSkuPo ss = new UpdateSkuPo();
		ss.setPrice(new BigDecimal("12.33"));
		ss.setPrdSkuId(1L);
		ss.setBatchPrice(new BigDecimal("12.43"));
		svs.add(ss);
		vo.setSkus(svs);
		params.put("data", JSON.toJSONString(vo));
		SignUtil s = new SignUtil();
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("timestamp", b + ""));
		formparams.add(new BasicNameValuePair("data", JSON.toJSONString(vo)));
		formparams.add(new BasicNameValuePair("sign",  s.signBack(params, "UTF-8")));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String productDown() throws Exception {
		String url = PrdTest.api + "/backstage/product/productDown";
		long b = new Date().getTime();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("productId", "1653362");
		params.put("timestamp", b);
		return PostUtil.httpPostBack(url, params);
	}
	
}
