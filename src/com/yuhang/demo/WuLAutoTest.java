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
		formparams.add(new BasicNameValuePair("productId", "12"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String queryDictArea() throws IOException {
		String url = WuLTest.api + "/consume/buyer/queryDictArea";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("pageNo", "1"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String calcFreight() throws IOException {
		String url = WuLTest.api + "/consume/buyer/calcFreight";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("expressId", "29"));
		formparams.add(new BasicNameValuePair("province", "重庆"));
		formparams.add(new BasicNameValuePair("weight", "0.6"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String listRecvInfo() throws IOException {
		String url = WuLTest.api + "/consume/buyer/listRecvInfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String createOrder() throws IOException {
		String url = WuLTest.api + "/consume/buyer/createOrder";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "97"));
		List<ConsumeOrderInfo> list = new ArrayList<ConsumeOrderInfo>();

		ConsumeOrderInfo o = new ConsumeOrderInfo();
		o.setCollect(0);
		o.setAmount(new BigDecimal("25.29"));
		o.setComments("1234");
		o.setDevice(0);
		o.setExpressId(29);
		o.setFreight(new BigDecimal("2.99"));
		o.setOrderType(1);
		o.setPrice(new BigDecimal("22.3"));
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

		
		ConsumeItem item1 = new ConsumeItem();
		item1.setItemId(1L);
		item1.setQuantity(1);
		item1.setSkuId(2L);
		
		List<ConsumeItem> items = new ArrayList<ConsumeItem>();
		items.add(item);
		items.add(item1);
		o.setItems(items);
		list.add(o);
		String json = JSON.toJSONString(list);
		System.out.println(json);
		formparams.add(new BasicNameValuePair("json", json));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String orderListVib() throws IOException {
		String url = WuLTest.api + "/consume/buyer/orderList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("pageNo", "1"));
		formparams.add(new BasicNameValuePair("pageSize", "1"));
		formparams.add(new BasicNameValuePair("userId", "55934"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	
	public static String orderListDs() throws IOException {
		String url = WuLTest.api + "/consume/seller/orderList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("pageNo", "1"));
		formparams.add(new BasicNameValuePair("pageSize", "1"));
		formparams.add(new BasicNameValuePair("userId", "621482"));
		return PostUtil.httpPost(url, formparams);
	}
//	public static String orderListVib() throws IOException {
//		String url = WuLTest.api + "/consume/buyer/orderList";
//		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
//		formparams.add(new BasicNameValuePair("pageNo", "1"));
//		formparams.add(new BasicNameValuePair("pageSize", "1"));
//		formparams.add(new BasicNameValuePair("userId", "55934"));
//		return PostUtil.httpPost(url, formparams);
//	}
//	
	
	
	public static String orderDetailVib() throws IOException {
		String url = WuLTest.api + "/consume/buyer/orderDetail";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("orderId", "6"));
		formparams.add(new BasicNameValuePair("userId", "55934"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String cancelOrder() throws IOException {
		String url = WuLTest.api + "/consume/buyer/cancelOrder";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("orderId", "6"));
		formparams.add(new BasicNameValuePair("userId", "55934"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String orderPay() throws IOException {
		String url = WuLTest.api + "/pay/consumablesPay";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		ConsumablesPayDto dto = new ConsumablesPayDto();
		dto.setUserId(55934L);
		dto.setAmount("25.29");
		List<Long> orders =new ArrayList<Long>();
		orders.add(13L);
//		orders.add(12L);
		dto.setOrders(orders);
		dto.setPwd("123456");
		dto.setType("BALANCE");
		System.out.println(JSON.toJSONString(dto));
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(dto)));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String waporderPay() throws IOException {
		String url = WuLTest.api + "/payWap/consumablesPay";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		ConsumablesPayDto dto = new ConsumablesPayDto();
		dto.setUserId(55934L);
		dto.setAmount("13.09");
		List<Long> orders =new ArrayList<Long>();
//		orders.add(3L);
		orders.add(8L);
		dto.setOrders(orders);
		dto.setPwd("123456");
		dto.setType("ALIPAY");//BALANCE
		dto.setReturnUrl("www.ba");
		dto.setNotifyUrl("ww.baidu.com");
		System.out.println(JSON.toJSONString(dto));
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(dto)));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String consumablesRefund() throws IOException {
		String url = WuLTest.api + "/pay/consumablesRefund";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		ConsumablesRefundDto dto = new ConsumablesRefundDto();
		dto.setUserId(621482L);
		dto.setAmount("25.29");
		dto.setOrderId(13L);
		dto.setPwd("123456");
		dto.setType("ALIPAY");
		System.out.println(JSON.toJSONString(dto));
		formparams.add(new BasicNameValuePair("json", JSON.toJSONString(dto)));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String loadDsInfo() throws IOException {
		String url = WuLTest.api + "/consume/buyer/loadDsInfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String getOrderStateNum() throws IOException {
		String url = WuLTest.api + "/consume/buyer/getOrderStateNum";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "55934"));
		formparams.add(new BasicNameValuePair("state", "0"));
		return PostUtil.httpPost(url, formparams);
	}
	public static String pickUpGoods() throws IOException {
		String url = WuLTest.api + "/consume/seller/pickUpGoods";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "621482"));
		formparams.add(new BasicNameValuePair("orderId", "13"));
		return PostUtil.httpPost(url, formparams);
	}
	public static String pmList() throws IOException {
		String url = WuLTest.api + "/consume/seller/pm/list";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "621482"));
//		formparams.add(new BasicNameValuePair("orderId", "3"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String deliverGoods() throws IOException {
		String url = WuLTest.api + "/consume/seller/deliverGoods";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "621482"));
		formparams.add(new BasicNameValuePair("orderIds", "4"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String updateOrderRemark() throws IOException {
		String url = WuLTest.api + "/consume/seller/updateOrderRemark";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("remark", "哈哈"));
		formparams.add(new BasicNameValuePair("orderId", "4"));
		formparams.add(new BasicNameValuePair("userId", "621482"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String updateExpressInfo() throws IOException {
		String url = WuLTest.api + "/consume/seller/updateExpressInfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "621482"));
		formparams.add(new BasicNameValuePair("orderId", "4"));
		formparams.add(new BasicNameValuePair("expressId", "29"));
		formparams.add(new BasicNameValuePair("expressNo", "402839012842"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String updateSingleOrderStatus() throws IOException {
		String url = WuLTest.api + "/consume/seller/updateSingleOrderStatus";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "621482"));
		formparams.add(new BasicNameValuePair("orderId", "4"));
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
		formparams.add(new BasicNameValuePair("out_trade_no", "GSB_TEBBV_26179"));
		formparams.add(new BasicNameValuePair("price", "25.29"));
		formparams.add(new BasicNameValuePair("trade_status", "TRADE_SUCCESS"));
		formparams.add(new BasicNameValuePair("total_fee", "25.29"));
		formparams.add(new BasicNameValuePair("total_amount", "25.29"));
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
