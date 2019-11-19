package com.yuhang.demo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.WuLTest;
import com.alibaba.fastjson.JSON;
import com.go2.shipping.common.mapper.JsonMapper;
import com.yuhang.demo.util.PostUtil;
import com.yuhang.demo.vo.s.ConsumablesPayDto;
import com.yuhang.demo.vo.s.ConsumablesRefundDto;
import com.yuhang.demo.vo.s.ConsumeItem;
import com.yuhang.demo.vo.s.ConsumeOrderInfo;

public class WuLAutoTest {

	public static String queryProduct() throws IOException {
		String url = WuLTest.api + "/consume/buyer/queryProduct";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("pageNo", "1"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String createOrder() throws IOException {
		String url = WuLTest.api + "/consume/buyer/createOrder";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		List<ConsumeOrderInfo> list = new ArrayList<ConsumeOrderInfo>();

		ConsumeOrderInfo o = new ConsumeOrderInfo();
		o.setCollect(0);
		o.setAmount(new BigDecimal("13.09"));
		o.setComments("1234");
		o.setDevice(0);
		o.setExpressId(29);
		o.setFreight(new BigDecimal("0.99"));
		o.setOrderType(1);
		o.setPrice(new BigDecimal("12.1"));
		o.setReceiverAddress("123");
		o.setReceiverAddressId(1L);
		o.setReceiverCity(4);
		o.setReceiverCityName("重庆");
		o.setReceiverCounty(2254);
		o.setReceiverCountyName("万州");
		o.setReceiverName("于航");
		o.setReceiverProvince(4);
		o.setReceiverPhone("15803096943");
		o.setReceiverProvinceName("重庆");

		ConsumeItem item = new ConsumeItem();
		item.setItemId(1L);
		item.setQuantity(1);
		item.setSkuId(1L);

		List<ConsumeItem> items = new ArrayList<ConsumeItem>();
		items.add(item);
		o.setItems(items);
		list.add(o);

		String json = JSON.toJSONString(list);
		formparams.add(new BasicNameValuePair("json", json));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String orderList() throws IOException {
		String url = WuLTest.api + "/consume/buyer/orderList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("pageNo", "1"));
		formparams.add(new BasicNameValuePair("userId", "55934"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String orderPay() throws IOException {
		String url = WuLTest.api + "/pay/consumablesPay";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		ConsumablesPayDto dto = new ConsumablesPayDto();
		dto.setUserId(55934L);
		dto.setAmount("13.09");
		List<Long> orders =new ArrayList<Long>();
		orders.add(2L);
		dto.setOrders(orders);
		dto.setPwd("123456");
		dto.setType("ALIPAY");
		formparams.add(new BasicNameValuePair("pageNo", "1"));
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(dto)));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String consumablesRefund() throws IOException {
		String url = WuLTest.api + "/pay/consumablesRefund";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		ConsumablesRefundDto dto = new ConsumablesRefundDto();
		dto.setUserId(55934L);
		dto.setAmount("13.09");
		List<Long> orders =new ArrayList<Long>();
		orders.add(2L);
		dto.setOrderId(1L);
		dto.setPwd("123456");
		dto.setType("ALIPAY");
		formparams.add(new BasicNameValuePair("pageNo", "1"));
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(dto)));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	
	
	private static String alipayNotify() throws IOException {
		String url = "http://127.0.0.1:8086/web-service/pay/alipay/notify";
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
		formparams.add(new BasicNameValuePair("out_trade_no", "GSB_TEBBV_26152"));
		formparams.add(new BasicNameValuePair("price", "13.09"));
		formparams.add(new BasicNameValuePair("trade_status", "TRADE_SUCCESS"));
		formparams.add(new BasicNameValuePair("total_fee", "13.09"));
		formparams.add(new BasicNameValuePair("total_amount", "13.09"));
		formparams.add(new BasicNameValuePair("trade_no", "20190322210010047502763188810"));
		formparams.add(new BasicNameValuePair("sign_type", "MD5"));
		formparams.add(new BasicNameValuePair("seller_id", "2088221939210090"));
		formparams.add(new BasicNameValuePair("is_total_fee_adjust", "N"));
		String result = PostUtil.httpPost(url, formparams);
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		alipayNotify();
	}
}
