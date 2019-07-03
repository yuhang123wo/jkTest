package com.yuhang.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.codec.binary.Base64;

import com.yuhang.demo.util.PmAutoTest;

public class PmTest {
	// public static String api = "http://app.go2b2b.com/";

	public static String api = "http://116.62.199.18:16620/";
//	public static String api = "http://localhost:8086/web-service";
	// public static String api="http://127.0.0.1:8020/";

	// public static String api="http://api.app.gsb68.com";

	public static void main(String[] args) {
		try {
			 String result = PmAutoTest.byOutId();//登录
			// String result = PmAutoTest.DealPay();
			// String result = PmAutoTest.getCustomerById();//

			// String result = PmAutoTest.likeByName();
			// String result = PmAutoTest.selectSupplier();
			// String result = PmAutoTest.byPlatformAndUsername();
			// String result = PmAutoTest.balance();
			// String result = PmAutoTest.pwdAdd();
			// String result = PmAutoTest.pwdEdit();
			// String result = PmAutoTest.userinfo2b();
			// String result = PmAutoTest.createOrder();
			// String result = PmAutoTest.getSupplierByDomain();
			// String result = PmAutoTest.loadSupplierInfo();
			// String result = PmAutoTest.offLineDepositApply();
			// String result = PmAutoTest.queryItemByParamsMustUser();
			// String result = PmAutoTest.queryItemByParams();
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

			// String result = PmAutoTest.orderPay();//订单支付

			// String result = PmAutoTest.accountInfo();
			// String result = PmAutoTest.transactionList();
			// String result = PmAutoTest.transferReceive();
			// String result = PmAutoTest.transferPayList();
			// String result = PmAutoTest.receiveApply();
			// String result = PmAutoTest.transferPay();
			// String result = PmAutoTest.transferPayBatch();
			// String result = PmAutoTest.withdrawApply();//提现申请
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
			
			//
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
