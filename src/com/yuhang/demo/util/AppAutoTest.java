package com.yuhang.demo.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class AppAutoTest {

	AppAutoTest auto = new AppAutoTest();

	/**
	 * 
	 * @Date 2016年8月4日
	 * @desc 店铺列表
	 */
	public static String viewExpress(String api) throws IOException {
		String url = api + "/mb/logistics/viewExpress";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "391384"));
		formparams.add(new BasicNameValuePair("expressNo", "70968900122032"));
		return PostUtil.httpPost(url, formparams);
	}

	
	public static String deliveryExpress(String api) throws IOException {
		String url = api + "/mb/logistics/delivery/express";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "391384"));
		formparams.add(new BasicNameValuePair("page", "1"));
		formparams.add(new BasicNameValuePair("pageSize", "1"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	
	public static String pay(String api) throws IOException {
		String url = api + "/payWap/deposit/topay";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "161325"));
		formparams.add(new BasicNameValuePair("fee", "1.0"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String waitDealOrder(String api) throws IOException {
		String url = api + "/mb/order/waitDealOrder";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("supplierId", "97"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String loginPack(String api) throws IOException {
		String url = api + "/pack/login";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userName", "yangjie"));
		formparams.add(new BasicNameValuePair("pwd", "123456"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String messageByExpressNo(String api) throws IOException {
		String url = api + "/pack/order/messageByExpressNo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token", "cd4a7871-6f0b-4448-b29c-201342da8ae9"));
		formparams.add(new BasicNameValuePair("expressNo", "123"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String ntViewOrder(String api) throws IOException {
		String url = api + "/nt/ntViewOrder";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "161325"));
		formparams.add(new BasicNameValuePair("expressNo", "1705240000001"));
		formparams.add(new BasicNameValuePair("token", "9932e959-b40f-4b53-8618-bc2f3c8664d4"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String ntLogin(String api) throws IOException {
		String url = api + "/nt/login";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userName", "tx02"));
		formparams.add(new BasicNameValuePair("pwd", "123456"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	
	
	public static String editSendGoods(String api) throws IOException {
		String url = api + "/nt/editSendGoods";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("orderId", "341"));
		formparams.add(new BasicNameValuePair("weight", "20"));
		formparams.add(new BasicNameValuePair("token", "d4142a74-315e-4608-9e55-f3b51c1ffe3d"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String getWeightLog(String api) throws IOException {
		String url = api + "/nt/getWeightLog";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("orderNo", "1291030"));
		formparams.add(new BasicNameValuePair("expressNo", "322"));
		formparams.add(new BasicNameValuePair("token", "c1bf8860-5869-4f27-9b7f-de8cb1e77d51"));
		return PostUtil.httpPost(url, formparams);
	}
	
}
