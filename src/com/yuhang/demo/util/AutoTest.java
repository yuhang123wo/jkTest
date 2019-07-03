package com.yuhang.demo.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.alibaba.fastjson.JSON;
import com.yuhang.domain.InquiryEdit;
import com.yuhang.domain.StockNote;
import com.yuhang.domain.StockQtyNote;

public class AutoTest {

	AutoTest auto = new AutoTest();

	/**
	 * 
	 * @Date 2016年8月4日
	 * @desc 店铺列表
	 */
	public static String shopList(String api) throws IOException {
		String url = api + "/2b/shop/list";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "161325"));
		formparams.add(new BasicNameValuePair("keyword", ""));
		formparams.add(new BasicNameValuePair("type", ""));
		return PostUtil.httpPost(url, formparams);
	}

	/**
	 * 
	 * @Date 2016年8月4日
	 * @desc 更新店铺信息
	 */

	public static String shopEdit(String api) throws IOException {
		String url = api + "/2b/shop/edit";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("name", "哈哈"));
		formparams.add(new BasicNameValuePair("url", "http://baidu.cion"));
		formparams.add(new BasicNameValuePair("id", "7"));
		return PostUtil.httpPost(url, formparams);
	}

	/**
	 * 
	 * @Date 2016年8月4日
	 * @desc
	 */

	public static String shopDel(String api) throws IOException {
		String url = api + "/2b/shop/del";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("shopId", "7"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String manageList(String api) throws IOException {
		String url = api + "/2b/shopItem/manage/list";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("page", ""));
		formparams.add(new BasicNameValuePair("pageSize", ""));
		formparams.add(new BasicNameValuePair("itemName", ""));
		formparams.add(new BasicNameValuePair("userId", "161325"));
		formparams.add(new BasicNameValuePair("type", ""));
		formparams.add(new BasicNameValuePair("shopId", "274"));
		formparams.add(new BasicNameValuePair("artNo", ""));
		return PostUtil.httpPost(url, formparams);
	}

	/**
	 * 
	 * @Date 2016年8月4日
	 * @desc 商品同步
	 */
	public static String itemSyn(String api) throws IOException {
		String url = api + "/2b/shopItem/itemSyn";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "161325"));//278569
		formparams.add(new BasicNameValuePair("shopId", "52406"));//328
		formparams.add(new BasicNameValuePair("startTime", "2016-11-10 10:00:00"));
		formparams.add(new BasicNameValuePair("endTime", "2016-11-30 10:00:00"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String stockList(String api) throws IOException {
		String url = api + "/2b/shopItem/stock/list";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("page", ""));
		formparams.add(new BasicNameValuePair("pageSize", "100"));
		formparams.add(new BasicNameValuePair("userId", "55934"));
		formparams.add(new BasicNameValuePair("name", ""));
		formparams.add(new BasicNameValuePair("artNo", ""));
		formparams.add(new BasicNameValuePair("shopId", "381"));
		return PostUtil.httpPost(url, formparams);
	}

	/**
	 * 实际库存修改
	 * 
	 * @Date 2016年8月4日
	 * @desc
	 */
	public static String stockEdit(String api) throws IOException {
		String url = api + "/2b/shopItem/stock/edit";
		StockNote s = new StockNote();
		s.setShopItemId(8166);
		s.setUserId(161325);
		List<StockQtyNote> stocks = new ArrayList<StockQtyNote>();
		StockQtyNote n = new StockQtyNote();
		n.setNum(11);
		n.setShopSubItemId(92786);
		StockQtyNote n2 = new StockQtyNote();
		n2.setNum(10);
		n2.setShopSubItemId(92787);
		StockQtyNote n1 = new StockQtyNote();
		n1.setNum(2);
		n1.setShopSubItemId(92788);
		stocks.add(n);
		stocks.add(n1);
		stocks.add(n2);
		s.setStocks(stocks);
		String json = JSON.toJSONString(s);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("json", json));
		return PostUtil.httpPost(url, formparams);
	}

	/**
	 * 
	 * @Date 2016年8月4日
	 * @desc 库存下限修改
	 */
	public static String stockLimitEdit(String api) throws IOException {
		String url = api + "/2b/shopItem/stock/stockLimitEdit";
		StockNote s = new StockNote();
		s.setShopItemId(20107);
		s.setUserId(161325);
		// 257859
		// 257860
		// 257861
		// 257862
		// 257863
		// 257864
		// 257865
		// 257866
		// 257867
		// 257868
		// 257869
		// 257870
		// 257871
		// 257872
		// 257873
		//

		List<StockQtyNote> stocks = new ArrayList<StockQtyNote>();
		StockQtyNote n = new StockQtyNote();
		n.setNum(10);
		n.setShopSubItemId(257876);
		StockQtyNote n2 = new StockQtyNote();
		n2.setNum(20);
		n2.setShopSubItemId(257875);
		StockQtyNote n1 = new StockQtyNote();
		n1.setNum(30);
		n1.setShopSubItemId(257874);
		stocks.add(n);
		stocks.add(n1);
		stocks.add(n2);
		s.setStocks(stocks);
		String json = JSON.toJSONString(s);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("json", json));
		return PostUtil.httpPost(url, formparams);
	}

	/**
	 * 
	 * @Date 2016年8月6日
	 * @desc 库存流水
	 */
	public static String stockFwater(String api) throws IOException {
		String url = api + "/2b/shopItem/stock/fwater";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("page", ""));
		formparams.add(new BasicNameValuePair("pageSize", "100"));
		formparams.add(new BasicNameValuePair("userId", "161325"));
		formparams.add(new BasicNameValuePair("itemName", ""));
		formparams.add(new BasicNameValuePair("itemNo", ""));
		formparams.add(new BasicNameValuePair("type", "DELIVERED"));
		formparams.add(new BasicNameValuePair("startTime", ""));
		formparams.add(new BasicNameValuePair("endTime", ""));
		return PostUtil.httpPost(url, formparams);
	}

	/**
	 * 库存预警
	 * 
	 * @Date 2016年8月6日
	 * @desc
	 */
	public static String stockWarn(String api) throws IOException {
		String url = api + "/2b/shopItem/stock/warn";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("page", ""));
		formparams.add(new BasicNameValuePair("pageSize", ""));
		formparams.add(new BasicNameValuePair("userId", "161325"));
		formparams.add(new BasicNameValuePair("itemName", "2016春季新品男士系带日常休闲鞋时尚男鞋低帮鞋"));
		formparams.add(new BasicNameValuePair("artNo", ""));
		formparams.add(new BasicNameValuePair("type", ""));
		formparams.add(new BasicNameValuePair("shopId", ""));
		return PostUtil.httpPost(url, formparams);
	}

	/**
	 * 
	 * @Date 2016年8月6日
	 * @desc 发货清单
	 */
	public static String deliverList(String api) throws IOException {
		String url = api + "/2b/deliver/list";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("page", ""));
		formparams.add(new BasicNameValuePair("pageSize", ""));
		formparams.add(new BasicNameValuePair("userId", "2"));
		formparams.add(new BasicNameValuePair("expressName", ""));
		formparams.add(new BasicNameValuePair("expressNo", ""));
		formparams.add(new BasicNameValuePair("consignorAddress", ""));
		return PostUtil.httpPost(url, formparams);
	}

	/**
	 * 
	 * @Date 2016年8月6日
	 * @desc
	 */
	public static String printDelivery(String api) throws IOException {
		String url = api + "/2b/order/printDelivery";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("page", "1"));
		formparams.add(new BasicNameValuePair("pageSize", ""));
		formparams.add(new BasicNameValuePair("userId", "2"));
		formparams.add(new BasicNameValuePair("shopId", "10"));
		formparams.add(new BasicNameValuePair("orderNo", ""));
		formparams.add(new BasicNameValuePair("buyerName", ""));
		formparams.add(new BasicNameValuePair("receiverName", ""));
		formparams.add(new BasicNameValuePair("receiverPhone", ""));
		formparams.add(new BasicNameValuePair("receiverAddress", ""));
		formparams.add(new BasicNameValuePair("expressStart", ""));
		formparams.add(new BasicNameValuePair("expressEnd", ""));
		formparams.add(new BasicNameValuePair("deliveryStart", ""));
		formparams.add(new BasicNameValuePair("deliveryEnd", ""));
		formparams.add(new BasicNameValuePair("payStart", ""));
		formparams.add(new BasicNameValuePair("payEnd", ""));
		formparams.add(new BasicNameValuePair("state", ""));
		formparams.add(new BasicNameValuePair("isElectronicPrint", ""));
		formparams.add(new BasicNameValuePair("flag", ""));
		formparams.add(new BasicNameValuePair("swagPrint", ""));
		formparams.add(new BasicNameValuePair("expressPrint", ""));
		formparams.add(new BasicNameValuePair("salePrint", ""));
		formparams.add(new BasicNameValuePair("expressNo", "1"));
		formparams.add(new BasicNameValuePair("hasRemark", ""));

		return PostUtil.httpPost(url, formparams);
	}

	public static String onSaleMethod(String api) throws IOException {
		String url = api + "/2b/shopItem/onSale";
		OnSaleNote not = new OnSaleNote();
		not.setOpt("2");
		not.setUserId(161325);
		not.setShopItems(new long[] { 46014 });
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(not)));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String itemInfoEdit(String api) throws IOException {
		String url = api + "/2b/shopItem/itemInfo/edit";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("shopItemIds", "46011"));
		formparams.add(new BasicNameValuePair("userId", "161325"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String takePrice(String api) throws IOException {
		String url = api + "/2b/shopItem/takePrice/edit";
		TakePriceNote t = new TakePriceNote();
		t.setShopItemId(1271);
		t.setUserId(161325);
		List<TakePriceSub> sub = new ArrayList<TakePriceSub>();
		TakePriceSub s = new TakePriceSub();
		s.setCost(new BigDecimal(5));
		s.setShopSubItemId(16090);
		TakePriceSub s1 = new TakePriceSub();
		s1.setCost(new BigDecimal(6));
		s1.setShopSubItemId(16091);
		TakePriceSub s2 = new TakePriceSub();
		s2.setCost(new BigDecimal(5));
		s2.setShopSubItemId(16092);
		TakePriceSub s3 = new TakePriceSub();
		s3.setCost(new BigDecimal(2));
		s3.setShopSubItemId(16093);
		TakePriceSub s4 = new TakePriceSub();
		s4.setCost(new BigDecimal(5));
		s4.setShopSubItemId(16094);
		TakePriceSub s5 = new TakePriceSub();
		s5.setCost(new BigDecimal(5));
		s5.setShopSubItemId(16095);
		sub.add(s);
		sub.add(s1);
		sub.add(s2);
		sub.add(s3);
		sub.add(s4);
		sub.add(s5);
		t.setSub(sub);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(t)));
		return PostUtil.httpPost(url, formparams);
	}

	public static String goodsDel(String api) throws IOException {
		String url = api + "/2b/shopItem/manage/del";
		GoodsNote go = new GoodsNote();
		go.setUserId(161325);
		go.setShopItemId(new long[] { 2703 });
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(go)));
		return PostUtil.httpPost(url, formparams);
	}

	public static String subDetail(String api) throws IOException {
		String url = api + "/2b/shopItem/manage/del";
		GoodsNote go = new GoodsNote();
		go.setUserId(161325);
		go.setShopItemId(new long[] { 2703 });
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(go)));
		return PostUtil.httpPost(url, formparams);
	}

	public static String shopItemView(String api) throws IOException {
		String url = api + "/2b/shopItem/view";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "161325"));
		formparams.add(new BasicNameValuePair("shopItemId", ""));
		return PostUtil.httpPost(url, formparams);
	}

	public static String getBlance(String api) throws IOException {
		String url = api + "/2b/account/balance";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "161325"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String order(String api) throws IOException {
		String url = api + "/2b/order/syncOrders";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		SynVO vo = new SynVO();
		vo.setUserId(80350);
		vo.setRepeat(1);
		List<SynShopOrderVo> list = new ArrayList<SynShopOrderVo>();
		SynShopOrderVo ss = new SynShopOrderVo();
		ss.setAti("");
		ss.setShopId(57408);
		ss.setEndTime("2019-02-22");
		ss.setStartTime("2019-02-20");
		ss.setState(2);
		list.add(ss);
		vo.setList(list);
//		formparams.add(new BasicNameValuePair("shopIds", "8"));//264
//		formparams.add(new BasicNameValuePair("userId", "40"));//120240 278569
//		formparams.add(new BasicNameValuePair("startTime", "2018-10-30"));
//		formparams.add(new BasicNameValuePair("endTime", "2018-10-31"));
//		formparams.add(new BasicNameValuePair("repeat", "false"));
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(vo)));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String shopOrderDel(String api) throws IOException {
		String url = api + "/shunt/shopOrder/del";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));//120240 278569
		formparams.add(new BasicNameValuePair("orderId", "18083553"));//120240 278569
		formparams.add(new BasicNameValuePair("type", "0"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String byOutId(String api) throws IOException {
		String url = api + "/user/byOutId";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("outId", "264516"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String callBack() throws IOException {
		// String url = "http://df.go2.cn.ngrok.cc/web-service/kdniao/callBack";
		String url = "http://go2.gsb68.com/other/kdniao-callback";
		String str = "{\"EBusinessID\": \"1263498\",\"Count\": \"1\",\"PushTime\": \"2016-08-24 16:01:28\",\"Data\": [{\"EBusinessID\": \"1263498\",\"ShipperCode\": \"STO\",\"LogisticCode\": \"402051824196\",\"Success\": true,\"State\": \"3\",\"Traces\": [{\"AcceptTime\": \"2016-03-30 18:59:46\",\"AcceptStation\": \"【重庆市】重庆邮政速递物流城一解放碑揽投部（023-81987486）已收件（揽投员姓名：冯勇,联系电话:15086635389）\"},{\"AcceptTime\": \"2016-03-30 18:59:46\",\"AcceptStation\": \"【重庆市】重庆邮政速递物流城一解放碑揽投部（023-81987486）已收件（揽投员姓名：冯勇,联系电话:15086635389）\"},{\"AcceptTime\": \"2016-03-30 18:59:46\",\"AcceptStation\": \"【重庆市】重庆邮政速递物流城一解放碑揽投部（023-81987486）已收件（揽投员姓名：冯勇,联系电话:15086635389）\"},{\"AcceptTime\": \"2016-03-30 18:59:46\",\"AcceptStation\": \"【重庆市】重庆邮政速递物流城一解放碑揽投部（023-81987486）已收件（揽投员姓名：冯勇,联系电话:15086635389）\"},{\"AcceptTime\": \"2016-03-30 18:59:46\",\"AcceptStation\": \"【重庆市】重庆邮政速递物流城一解放碑揽投部（023-81987486）已收件（揽投员姓名：冯勇,联系电话:15086635389）\"},{\"AcceptTime\": \"2016-03-30 18:59:46\",\"AcceptStation\": \"【重庆市】重庆邮政速递物流城一解放碑揽投部（023-81987486）已收件（揽投员姓名：冯勇,联系电话:15086635389）\"},{\"AcceptTime\": \"2016-03-30 18:59:46\",\"AcceptStation\": \"【重庆市】重庆邮政速递物流城一解放碑揽投部（023-81987486）已收件（揽投员姓名：冯勇,联系电话:15086635389）\"},{\"AcceptTime\": \"2016-03-30 18:59:46\",\"AcceptStation\": \"【重庆市】重庆邮政速递物流城一解放碑揽投部（023-81987486）已收件（揽投员姓名：冯勇,联系电话:15086635389）\"},{\"AcceptTime\": \"2016-03-30 18:59:46\",\"AcceptStation\": \"【重庆市】重庆邮政速递物流城一解放碑揽投部（023-81987486）已收件（揽投员姓名：冯勇,联系电话:15086635389）\"},{\"AcceptTime\": \"2016-03-30 18:59:46\",\"AcceptStation\": \"【重庆市】重庆邮政速递物流城一解放碑揽投部（023-81987486）已收件（揽投员姓名：冯勇,联系电话:15086635389）\"},{\"AcceptTime\": \"2016-03-30 18:59:46\",\"AcceptStation\": \"【重庆市】重庆邮政速递物流城一解放碑揽投部（023-81987486）已收件（揽投员姓名：冯勇,联系电话:15086635389）\"},{\"AcceptTime\": \"2016-03-30 18:59:46\",\"AcceptStation\": \"【重庆市】重庆邮政速递物流城一解放碑揽投部（023-81987486）已收件（揽投员姓名：冯勇,联系电话:15086635389）\"},{\"AcceptTime\": \"2016-03-30 18:59:46\",\"AcceptStation\": \"【重庆市】重庆邮政速递物流城一解放碑揽投部（023-81987486）已收件（揽投员姓名：冯勇,联系电话:15086635389）\"},{\"AcceptTime\": \"2016-03-31 08:02:22\",\"AcceptStation\": \"【重庆市】重庆邮政速递物流城三鲤鱼池揽投部（023-88506984）安排投递，预计13:00:00前投递（投递员姓名：刘国军13983000764*;联系电话：13983000764）\"},{\"AcceptTime\": \"2016-03-31 10:28:06\",\"AcceptStation\": \"【重庆市】投递并签收，签收人：单位收发章 单位收发章\"}],\"CallBack\": \"321\"}]}";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("RequestData", str));
		return PostUtil.httpPost(url, formparams);
	}

	public static String userinfo(String api) throws IOException {
		String url = api + "/2b/account/userinfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "161325"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String loadOrderItems(String api) throws IOException {
		String url = api + "/2b/order/loadOrderItems";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "161325"));
		formparams.add(new BasicNameValuePair("orderIds", "2703"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String updateItemInfo(String api) throws IOException {
		String url = api + "/2b/shopItem/itemInfo/edit";
		String shopItemIds = "38496";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "161325"));
		formparams.add(new BasicNameValuePair("shopItemIds", shopItemIds));
		return PostUtil.httpPost(url, formparams);
	}

	public static String index(String api) throws IOException {
		String url = api + "/2b/index";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "161325"));
		return PostUtil.httpPost(url, formparams);
	}

	public static byte[] SetImageToByteArray(String path) throws Exception {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		byte[] b = new byte[fis.available()];
		fis.read(b);
		fis.close();
		return b;
	}

	public static String addInquiry2B(String api) throws Exception  {
		String url = api + "/2b/inquiry/addInquiry";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("originId", "161325"));
		formparams.add(new BasicNameValuePair("outId", ""));//
		formparams.add(new BasicNameValuePair("outPlatform", "2"));
		formparams.add(new BasicNameValuePair("content", "供应商我参加了双11活动，所以需要优质货源支撑，有意向的厂家可以联系我"));
//		formparams.add(new BasicNameValuePair("marketPrice", "110"));
		formparams.add(new BasicNameValuePair("quantity", "2000"));
		formparams.add(new BasicNameValuePair("expectPrice", "80"));
		formparams.add(new BasicNameValuePair("img","http://2mm.i.ximgs.net/inquiry/20161027155024123.png"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String inquiryAll(String api) throws IOException {
		String url = api + "/out/operator/inquiryAll";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("outPlatform", "2"));
		formparams.add(new BasicNameValuePair("startTime", "2016-10-27"));
		formparams.add(new BasicNameValuePair("quiryState", ""));
		formparams.add(new BasicNameValuePair("approveStatus", ""));
		return PostUtil.httpPost(url, formparams);
	}

	public static String inquiryEdit(String api) throws IOException {
		String url = api + "/out/operator/inquiryEdit";
		InquiryEdit edit = new InquiryEdit();
		edit.setApproveMsg("tongah");
		edit.setApproveStatus("VERIFY");
		edit.setInquiryId(44);
//		edit.setQuirySate("COMPLETE ");
		edit.setVerifyPrice(new BigDecimal(105));
		List<Long> list = new ArrayList<Long>();
		list.add(1L);
		list.add(2L);
		list.add(3L);
		list.add(4L);
		list.add(5L);
		list.add(6L);
		list.add(7L);
		edit.setSupplierId(list);
		String json = JSON.toJSONString(edit);
		System.out.println(json);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("json", json));
		return PostUtil.httpPost(url, formparams);
	}

	public static String inquiryChecked(String api) throws IOException {
		String url = api + "/2b/inquiry/supplier/inquiryChecked";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		 formparams.add(new BasicNameValuePair("userId", "1"));
		 formparams.add(new BasicNameValuePair("outId", ""));
		 formparams.add(new BasicNameValuePair("outPlatform", "2"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String inquiryReply(String api) throws IOException {
		String url = api + "/2b/inquiry/supplier/inquiryReply";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "97"));
		formparams.add(new BasicNameValuePair("outId", ""));
		formparams.add(new BasicNameValuePair("outPlatform", ""));
		formparams.add(new BasicNameValuePair("inquiryId", "66"));
		formparams.add(new BasicNameValuePair("content", "我的价格很低我可以提供低价xx"));
		formparams.add(new BasicNameValuePair("price", "48.5"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String inquiry2B(String api) throws IOException {
		String url = api + "/2b/inquiry/queryInquiryAll";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "161325"));
		formparams.add(new BasicNameValuePair("outId", ""));
		formparams.add(new BasicNameValuePair("outPlatform", "2"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String queryInquiry2B(String api) throws IOException {
		String url = api + "/2b/inquiry/queryInquiry";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("inquiryId", "56"));
		formparams.add(new BasicNameValuePair("userId", "161325"));
//		formparams.add(new BasicNameValuePair("outId", "1000493"));
		formparams.add(new BasicNameValuePair("outPlatform", "2"));
		return PostUtil.httpPost(url, formparams);
	}
	public static String queryReply2B(String api) throws IOException {
		String url = api + "/2b/inquiry/queryRely";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("inquiryId", "56"));
		formparams.add(new BasicNameValuePair("userId", "161325"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String login(String api) throws IOException {
		String url = api + "/login";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userName", "viky"));
		formparams.add(new BasicNameValuePair("password", "161325"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String queryInquiryOperator(String api) throws IOException {
		String url = api + "/out/operator/queryInquiry";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("inquiryId", "52"));
		return PostUtil.httpPost(url, formparams);
	}
	public static String queryReplyOperator(String api) throws IOException {
		String url = api + "/out/operator/queryRely";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("inquiryId", "7"));
		return PostUtil.httpPost(url, formparams);
	}
	public static String editPush(String api) throws IOException {
		String url = api + "/out/operator/push";
		InquiryEdit edit = new InquiryEdit();
		edit.setInquiryId(57);
//		edit.setVerifyPrice(new BigDecimal(105));
//		List<Long> list = new ArrayList<Long>();
//		list.add(1L);
		edit.setSendAll(true);
//		edit.setSupplierId(list);
		edit.setOutPlatform(2);
		String json = JSON.toJSONString(edit);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("json", json));
		return PostUtil.httpPost(url, formparams);
	}
	//weixin
	public static String byWeiXinId(String api) throws IOException {
		String url = api + "/user/byWeiXinId";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("weiXinId", "111"));
		return PostUtil.httpPost(url, formparams);
	}
	public static String supplierFindReply(String api) throws IOException {
		String url = api + "/2b/inquiry/supplier/queryInquiryReply";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "1"));
		formparams.add(new BasicNameValuePair("inquiryId", "56"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String supplierInquiryOne(String api) throws IOException {
		String url = api + "/2b/inquiry/supplier/inquiryOne";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "1"));
		formparams.add(new BasicNameValuePair("inquiryId", "56"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	
	public static void test() throws IOException{
		String url1="http://localhost:8888/micro/adv/testProuduct?name=555&text=6666";
		String url2="http://localhost:8888/micro/adv/testProuduct?name=111&text=6666";
		String url3="http://localhost:8888/micro/adv/testProuduct?name=222&text=6666";
		String url4="http://localhost:8888/micro/adv/testProuduct?name=333&text=6666";
		String url5="http://localhost:8888/micro/adv/testProuduct?name=666&text=6666";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		PostUtil.httpPost(url1, formparams);
		PostUtil.httpPost(url2, formparams);
		PostUtil.httpPost(url3, formparams);
		PostUtil.httpPost(url4, formparams);
		PostUtil.httpPost(url5, formparams);
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		String dsId="22222222222";
		long x=22222222222L;
		System.out.println(x==Long.valueOf(dsId));
	}
	
	
	
	public static String auth_1688(String api) throws IOException {
		String url = api + "/ailibaba/auth";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
//		formparams.add(new BasicNameValuePair("userId", "1"));
//		formparams.add(new BasicNameValuePair("inquiryId", "56"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String token_1688(String api) throws IOException {
		String url = api + "/ailibaba/token";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "161325"));
		formparams.add(new BasicNameValuePair("code", "6f1205d5-5d82-4133-9a19-921a38c17f0d"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String category_1688(String api) throws IOException {
		String url = api + "/ailibaba/getCategory";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("shopId", "267"));
		formparams.add(new BasicNameValuePair("categoryID", "124450001"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String categoryAttribute_1688(String api) throws IOException {
		String url = api + "/ailibaba/categoryAttribute";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("shopId", "267"));
		formparams.add(new BasicNameValuePair("categoryID", "124450001"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String getAlbum_1688(String api) throws IOException {
		String url = api + "/ailibaba/getAlbumList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("shopId", "267"));
		formparams.add(new BasicNameValuePair("albumId", ""));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String addAlbum_1688(String api) throws IOException {
		String url = api + "/ailibaba/addAlbum";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("shopId", "267"));
		formparams.add(new BasicNameValuePair("name", "相册9"));
		formparams.add(new BasicNameValuePair("authority", "1"));
		formparams.add(new BasicNameValuePair("desc", "xx1"));
		formparams.add(new BasicNameValuePair("password", ""));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String photoList_1688(String api) throws IOException {
		String url = api + "/ailibaba/photoList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("shopId", "267"));
		formparams.add(new BasicNameValuePair("albumID", "176697876"));
		formparams.add(new BasicNameValuePair("pageNo", "1"));
		formparams.add(new BasicNameValuePair("pageSize", "20"));
		return PostUtil.httpPost(url, formparams);
	}
	public static String photoAdd_1688(String api) throws IOException {
		String url = api + "/ailibaba/photoAdd";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("shopId", "267"));
		formparams.add(new BasicNameValuePair("albumID", "176697876"));
		formparams.add(new BasicNameValuePair("name", "mingint"));
		formparams.add(new BasicNameValuePair("description", "heh"));
		formparams.add(new BasicNameValuePair("drawTxt", "false"));
//		formparams.add(new BasicNameValuePair("imageBytes", ));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String addProduct_1688(String api) throws IOException {
		String url = api + "/ailibaba/addProduct";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("shopId", "267"));
		formparams.add(new BasicNameValuePair("albumID", "176697876"));
		formparams.add(new BasicNameValuePair("name", "mingint"));
		formparams.add(new BasicNameValuePair("description", "heh"));
		formparams.add(new BasicNameValuePair("drawTxt", "false"));
//		formparams.add(new BasicNameValuePair("imageBytes", ));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String productList_1688(String api) throws IOException {
		String url = api + "/ailibaba/productList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("shopId", "267"));
		formparams.add(new BasicNameValuePair("pageNo", "1"));
		formparams.add(new BasicNameValuePair("pageSize", "20"));
//		formparams.add(new BasicNameValuePair("imageBytes", ));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String productGet_1688(String api) throws IOException {
		String url = api + "/ailibaba/productGet";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("shopId", "267"));
		formparams.add(new BasicNameValuePair("productID", "540325927103"));
//		formparams.add(new BasicNameValuePair("imageBytes", ));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	
	public static String weiXinUser(String api) throws IOException {
		String url = api + "/user/productGet";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("shopId", "267"));
		formparams.add(new BasicNameValuePair("productID", "540325927103"));
//		formparams.add(new BasicNameValuePair("imageBytes", ));
		return PostUtil.httpPost(url, formparams);
	}

	
	
	
}
