package com.yuhang.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.yuhang.demo.util.PostUtil;

public class CreateOrder {

//	String json="[ { "sourceType":"IMPORT", "shopOrderId":0, "shopOrderType":"TAOBAO", "shopOrderNo":"2453506562790844", "collect":0, "remark": "订单备注测试", "receivers": { "name": "杨杰", "phone": "15828006658", "mobile": "15922551329", "address": { "province": "重庆", "city": "重庆", "country": "渝北区", "address": "重庆重庆渝北区光电园水星" } }, "dsId": 66, "items": [ { "supplierId": 197841, "supplier": "D区88号", "phone": "18523502645", "address": "国际商贸城3区2楼14街22505号", "artNo": "创意·雨燕&c205", "itemId": 1, "skuId": 12, "title": "商品title", "picUrl": "http://go2.i.ximgs.net/5/265/20150305/20150305230304603_220.jpg", "price": 1, "num": 2, "amount": 2, "color": "白色", "size": "EUR26", "shopItemId":111, "style":"花色", "weight":2 } ], "fee": { "giftInfo": [ { "id": 1, "price": 0.5, "num": 1, "imgUrl": "http://go2.i.ximgs.net/5/265/20150305/20150305230304603_220.jpg", "remark": "后跟帖", "weight":2 }, { "id": 2, "price": 1, "num": 2, "imgUrl": "http://go2.i.ximgs.net/5/265/20150305/20150305230304603_220.jpg", "remark": "丝袜", "weight":2 } ], "gifts": 2.5, "express": 25, "inspection": 0, "serviceCharge": 2, "payment":3 }, "expressId": 1, "expressName": "中通快递", "expressNo": "8564564564564" } ]"
	
   static String json = "[ { \"sourceType\":\"IMPORT\", \"shopOrderId\":0, \"shopOrderType\":\"TAOBAO\", \"shopOrderNo\":\"2453506562790844\", \"collect\":0, \"remark\": \"订单备注测试\", \"receivers\": { \"name\": \"杨杰\", \"phone\": \"15828006658\", \"mobile\": \"15922551329\", \"address\": { \"province\": \"重庆\", \"city\": \"重庆\", \"country\": \"渝北区\", \"address\": \"重庆重庆渝北区光电园水星\" } }, \"dsId\": 66, \"items\": [ { \"supplierId\": 197841, \"supplier\": \"D区88号\", \"phone\": \"18523502645\", \"address\": \"国际商贸城3区2楼14街22505号\", \"artNo\": \"创意·雨燕&c205\", \"itemId\": 1, \"skuId\": 12, \"title\": \"商品title\", \"picUrl\": \"http://go2.i.ximgs.net/5/265/20150305/20150305230304603_220.jpg\", \"price\": 1, \"num\": 2, \"amount\": 2, \"color\": \"白色\", \"size\": \"EUR26\", \"shopItemId\":111, \"style\":\"花色\", \"weight\":2 },{ \"supplierId\": 197841, \"supplier\": \"D区88号\", \"phone\": \"18523502645\", \"address\": \"国际商贸城3区2楼14街22505号\", \"artNo\": \"创意·雨燕&c205\", \"itemId\": 1, \"skuId\": 12, \"title\": \"商品title\", \"picUrl\": \"http://go2.i.ximgs.net/5/265/20150305/20150305230304603_220.jpg\", \"price\": 1, \"num\": 2, \"amount\": 2, \"color\": \"白色\", \"size\": \"EUR26\", \"shopItemId\":111, \"style\":\"花色\", \"weight\":2 },{ \"supplierId\": 197841, \"supplier\": \"D区88号\", \"phone\": \"18523502645\", \"address\": \"国际商贸城3区2楼14街22505号\", \"artNo\": \"创意·雨燕&c205\", \"itemId\": 1, \"skuId\": 12, \"title\": \"商品title\", \"picUrl\": \"http://go2.i.ximgs.net/5/265/20150305/20150305230304603_220.jpg\", \"price\": 1, \"num\": 2, \"amount\": 2, \"color\": \"白色\", \"size\": \"EUR26\", \"shopItemId\":111, \"style\":\"花色\", \"weight\":2 },{ \"supplierId\": 197841, \"supplier\": \"D区88号\", \"phone\": \"18523502645\", \"address\": \"国际商贸城3区2楼14街22505号\", \"artNo\": \"创意·雨燕&c205\", \"itemId\": 1, \"skuId\": 12, \"title\": \"商品title\", \"picUrl\": \"http://go2.i.ximgs.net/5/265/20150305/20150305230304603_220.jpg\", \"price\": 1, \"num\": 2, \"amount\": 2, \"color\": \"白色\", \"size\": \"EUR26\", \"shopItemId\":111, \"style\":\"花色\", \"weight\":2 } ], \"fee\": { \"giftInfo\": [ { \"id\": 1, \"price\": 0.5, \"num\": 1, \"imgUrl\": \"http://go2.i.ximgs.net/5/265/20150305/20150305230304603_220.jpg\", \"remark\": \"后跟帖\", \"weight\":2 }, { \"id\": 2, \"price\": 1, \"num\": 2, \"imgUrl\": \"http://go2.i.ximgs.net/5/265/20150305/20150305230304603_220.jpg\", \"remark\": \"丝袜\", \"weight\":2 } ], \"gifts\": 2.5, \"express\": 25, \"inspection\": 0, \"serviceCharge\": 2, \"payment\":3 }, \"expressId\": 1, \"expressName\": \"中通快递\", \"expressNo\": \"8564564564564\" } ]";
	public static void main(String[] args) throws IOException {
		String url = "http://192.168.1.11:8086/tong/2b/order/createOrder";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("json", json));
		formparams.add(new BasicNameValuePair("userId", "120240"));
		formparams.add(new BasicNameValuePair("outPlatform", "20"));
		String result= PostUtil.httpPost(url, formparams);
		System.out.println(result);
	}
}
