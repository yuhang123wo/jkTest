package com.yuhang.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import com.yuhang.demo.util.PmAutoTest;

public class PmTest {
//	 public static String api = "http://app.go2b2b.com/";
//	public static String api = "http://116.62.199.18:16620/";
//	public static String api = "http://yhwo.free.idcfengye.com";
//	public static String api = "http://192.168.1.11:8080/";
//	public static String api = "http://localhost:8087/app-1b/";
//	 public static String api="http://127.0.0.1:8026/";
	
	public static String api="http://127.0.0.1:8086/web-service/";
//	public static String api = "http://116.62.199.18:16610/";
//	public static String api="http://192.168.1.11:8080";
	// public static String api="http://api.app.gsb68.com";

	public static void main(String[] args) {
		try {
//			 String result = PmAutoTest.byOutId();//登录
			// String result = PmAutoTest.DealPay();
			// String result = PmAutoTest.getCustomerById();//

			// String result = PmAutoTest.likeByName();
			// String result = PmAutoTest.selectSupplier();
			// String result = PmAutoTest.byPlatformAndUsername();
			// String result = PmAutoTest.balance();
			// String result = PmAutoTest.pwdAdd();
			// String result = PmAutoTest.pwdEdit();
			// String result = PmAutoTest.userinfo2b();
//			 String result = PmAutoTest.createOrder(); //TODO
			// String result = PmAutoTest.getSupplierByDomain();
			// String result = PmAutoTest.loadSupplierInfo();
			// String result = PmAutoTest.offLineDepositApply();
			// String result = PmAutoTest.queryItemByParamsMustUser();
//			 String result = PmAutoTest.queryItemByParams();
//			 String result = PmAutoTest.loadSingleGsbItem();
			// String result = PmAutoTest.loadDsOrSupplierInfo();
			// String result = PmAutoTest.calcManyFreight();
			// String result = PmAutoTest.offLineDepositApply();
			// String result = PmAutoTest.offLineDepositUpdate();
			// String result = PmAutoTest.offLineDepositList();
			// String result = PmAutoTest.topay();
			// String result = PmAutoTest.checkPayInfo();

			// String result = PmAutoTest.addPayInfo();

			// String result = PmAutoTest.updatePayInfo();
			// String result = PmAutoTest.alivCodeByOwner();

//			 String result = PmAutoTest.orderPay();//订单支付
			 
//			 String result = PmAutoTest.orderPayWap();//WAP支付
			 
//			 String result = PmAutoTest.returnOrder();
			 
//			 String result = PmAutoTest.updateRefundSign();
			 
//			 String result = PmAutoTest.updateRefundRefuse();
//			 String result = PmAutoTest.refundListvib();
			// String result = PmAutoTest.accountInfo();
			// String result = PmAutoTest.transactionList();
			// String result = PmAutoTest.transferReceive();
			// String result = PmAutoTest.transferPayList();
//			 String result = PmAutoTest.receiveApply();
//			 String result = PmAutoTest.transferPay();
			// String result = PmAutoTest.transferPayBatch();
//			 String result = PmAutoTest.withdrawApply();//提现申请
//			 String result = PmAutoTest.getPrdFrozen();
			// String result = PmAutoTest.withDrawList2B();

			// String result = PmAutoTest.addGifts();
			// String result = PmAutoTest.listGifts();
			// String result = PmAutoTest.getOffPayState();
			// String result = PmAutoTest.updateOffPayState();
			// String result = PmAutoTest.offPaySet();
			// String result = PmAutoTest.offPaySetvCode();
			// String result = PmAutoTest.matchItem();

			// String result = PmAutoTest.batchOrderlist();

			// String result = PmAutoTest.AppOrderlist();

			// String result = PmAutoTest.AppviewExpress();
			// String result = PmAutoTest.listTemplate();
			// String result = PmAutoTest.validTemplates();
			// String result = PmAutoTest.getIndexUrl();
			// String result = PmAutoTest.getElectronicSheetInfo();

			// String result = PmAutoTest.listBranch();
			// String result = PmAutoTest.batchListOrderInfos();
			// String result = PmAutoTest.batchOrderlist();
			// String result = PmAutoTest.postageList();
			// String result = PmAutoTest.checkCanBeCancel();

//			String result = PmAutoTest.createAikuOrder();
//			String result = PmAutoTest.getAikuActivity();
//			String result=PmAutoTest.getActivityNameByOrderId();
			
			
			
			 
//			 String result = PmAutoTest.returnOrder();
			 
//			 String result = PmAutoTest.cancelWaiforsendOrder();
//			 String result = PmAutoTest.getOrderRefundMaps();
//			 String result = PmAutoTest.detailOrder();
//			 String result = PmAutoTest.updateRefundSign();
//			 String result = PmAutoTest.getStoreIndex();
			 
//			 String result = PmAutoTest.getprXeBalance();
			 
//			 String result = PmAutoTest.updateRefundRefuse();
//			String result=PmAutoTest.transactionRelation();
//			String result=PmAutoTest.sellListPlatform();
//			String result=PmAutoTest.updateAppeal();
//			String result=PmAutoTest.stockOutList();
//			String result=PmAutoTest.advanceList();
//			String result=PmAutoTest.appAdvanceList();
//			String result=PmAutoTest.getSalesTake();
//			String result=PmAutoTest.getOrderRefundByOrderIdAndOrderItemId();
//			String result=PmAutoTest.refundDetail();
//			String result=PmAutoTest.getTakeTracByOrderId();
//			String result=PmAutoTest.submitAppeal();
//			String result=PmAutoTest.refundItemList();
//			String result=PmAutoTest.appStockOutList();
//			String result=PmAutoTest.appStoreListNew();
//			String result=PmAutoTest.getTodayStoreIndex();
//			String result=PmAutoTest.appStoreList();
//			String result=PmAutoTest.getRefundingReach();
//			String result=PmAutoTest.getAppStoreNotice();
//			String result=PmAutoTest.querySkuByColorSize();
//			String result=PmAutoTest.viewExpress();
//			String result=PmAutoTest.getUserByOutId();
			
//			String result=PmAutoTest.getpreBalance();
			
//			String result=PmAutoTest.getTransferLimit();
			
//			String result=PmAutoTest.orderTakePrintCallBack();
//			String result=PmAutoTest.wapLogin();
//			String result=PmAutoTest.getIndex();
			//APP-1B
//			String result=PmAutoTest.loginApp1b();
			String token="2fc53230-5c53-42e3-88d2-2e2d3b175a01";
//			String result=PmAutoTest.option(token);
//			String result=PmAutoTest.index(token);
//			String result=PmAutoTest.taked(token);
//			String result=PmAutoTest.orderStockOut(token);
			
//			String result=PmAutoTest.querySkuColorSizeByOuterId();
			//1b-store
			
//			String result=PmAutoTest.supplierStoreList();
			
//			String result=PmAutoTest.appSupplierStoreList();
			
//			String result=PmAutoTest.orderTakePrintCallBackWap();
//			String result=PmAutoTest.updateStoreOperationBatch();
//			String result=PmAutoTest.sellListPlatform();
//			String result=PmAutoTest.appointList();
//			String result=PmAutoTest.prepareList();
//			String result=PmAutoTest.pmOrderList();
//			String result=PmAutoTest.takeprintQuery();
//			String result=PmAutoTest.getStoreData();
//			String result=PmAutoTest.getStoreDataAll();
//			String result=PmAutoTest.getSupplierAutoStoreSign();
//			String result=PmAutoTest.setSupplierAutoStoreSign();
//			String result=PmAutoTest.updateStoreOperation();
//			String result=PmAutoTest.getAppMsg();
//			String result=PmAutoTest.getStoreTakeTrace();
			String result=PmAutoTest.pOrderList(); //2b orderList
			
			
			
			
			
			
			//尖货
//			String result = PmAutoTest.getBestProductSku();
//			String result = PmAutoTest.getProductAndSkuByProductIds();
//			String result = PmAutoTest.updateStockNum();
//			String result = PmAutoTest.updateNextDayStock();
//			String result = PmAutoTest.bestStockList();
//			String result = PmAutoTest.bestStockListByUserId();
//			String result = PmAutoTest.bestDayStockList();
//			String result=PmAutoTest.getSendoutOrderTakeData();
//			String result=PmAutoTest.getCompensateRecord();
//			String result=PmAutoTest.getCompensateNumBySupplierIds();
//			String result=PmAutoTest.updateBestState();
//			String result=PmAutoTest.updateBestStateByUserId();
//			String result=PmAutoTest.returnMargin();
//			String result=PmAutoTest.getSendoutReturnRecord();
//			String result=PmAutoTest.getHasGoodsDay();
//			String result=PmAutoTest.marginReplenish();
			
//			String result=PmAutoTest.getBestProductStatis();
			System.out.println(result);
//			upload2(api);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void upload2(String url) throws ClientProtocolException, IOException{
	    CloseableHttpClient httpClient = HttpClientBuilder.create().build();
	    CloseableHttpResponse httpResponse = null;
	    RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(200000).setSocketTimeout(200000000).build();
	    HttpPost httpPost = new HttpPost(url+"upload/uploadImg");
	    httpPost.setConfig(requestConfig);
	    MultipartEntityBuilder multipartEntityBuilder = MultipartEntityBuilder.create();
	    //multipartEntityBuilder.setCharset(Charset.forName("UTF-8"));
	         
	    //File file = new File("F:\\Ken\\1.PNG");
	    //FileBody bin = new FileBody(file); 
	         
	    File file = new File("D://1.png");
	          
	    //multipartEntityBuilder.addBinaryBody("file", file,ContentType.create("image/png"),"abc.pdf");
	    //当设置了setSocketTimeout参数后，以下代码上传PDF不能成功，将setSocketTimeout参数去掉后此可以上传成功。上传图片则没有个限制
	    //multipartEntityBuilder.addBinaryBody("file",file,ContentType.create("application/octet-stream"),"abd.pdf");
	    multipartEntityBuilder.addBinaryBody("file",file);
	    //multipartEntityBuilder.addPart("comment", new StringBody("This is comment", ContentType.TEXT_PLAIN));
	    multipartEntityBuilder.addTextBody("fileType", "4");
	    HttpEntity httpEntity = multipartEntityBuilder.build();
	    httpPost.setEntity(httpEntity);
	         
	    httpResponse = httpClient.execute(httpPost);
	    HttpEntity responseEntity = httpResponse.getEntity();
	    int statusCode= httpResponse.getStatusLine().getStatusCode();
	    if(statusCode == 200){
	        BufferedReader reader = new BufferedReader(new InputStreamReader(responseEntity.getContent()));
	        StringBuffer buffer = new StringBuffer();
	        String str = "";
	        while( (str = reader.readLine())!=null) {
	            buffer.append(str);
	        }
	             
	        System.out.println(buffer.toString());
	    }
	         
	    httpClient.close();
	    if(httpResponse!=null){
	        httpResponse.close();
	    }
	     
	}

}
