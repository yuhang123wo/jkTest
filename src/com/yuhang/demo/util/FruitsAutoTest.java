package com.yuhang.demo.util;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.alibaba.fastjson.JSON;
import com.yuhang.domain.ItemVd;
import com.yuhang.domain.SkuVd;

public class FruitsAutoTest {

	/**
	 * 
	 * @Date 2016年8月4日
	 * @desc 店铺列表
	 */
	public static String goodsAddVd(String api) throws IOException {
		String url = api + "/goods/addVd";
		ItemVd itemVd = new ItemVd();
		itemVd.setShopId(132);
		itemVd.setUserId(555954);
		itemVd.setItemId(1);
		itemVd.setRemote_free_delivery(0);
		itemVd.setTitles(new String[] { "苹果" });
		itemVd.setStock(1);
		itemVd.setItem_comment("测试商品");
		itemVd.setMerchant_code("007");
		itemVd.setBigImgs(new String[] { "https://si.geilicdn.com/bj-open-335264854-1503046247344-1167361050_1001_692.jpg?w=1001&h=692" });
		itemVd.setStatus(1);
		itemVd.setFree_delivery(0);
		itemVd.setItem_name("测试商品");
		itemVd.setPrice(new BigDecimal(1));
		SkuVd[] skus = new SkuVd[1];
		SkuVd sku = new SkuVd();
		sku.setImg("https://si.geilicdn.com/bj-open-335264854-1503046247344-1167361050_1001_692.jpg?w=1001&h=692");
		sku.setPrice(new BigDecimal(1));
		sku.setSku_merchant_code("0071");
		sku.setStock(1);
		sku.setTitle("测试1商品");
		skus[0] = sku;
		itemVd.setSku(skus);
		System.out.println(JSON.toJSONString(itemVd));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "555954"));
		formparams.add(new BasicNameValuePair("shopId", "132"));
		formparams.add(new BasicNameValuePair("itemId", "28"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String uploadImgVd(String api) throws IOException {
		String url = api + "/goods/uploadImgVd";
		File file = new File("D:/11.jpg");
		ByteArrayOutputStream bos = new ByteArrayOutputStream((int) file.length());
		BufferedInputStream in = null;
		try {
			in = new BufferedInputStream(new FileInputStream(file));
			int buf_size = 1024;
			byte[] buffer = new byte[buf_size];
			int len = 0;
			while (-1 != (len = in.read(buffer, 0, buf_size))) {
				bos.write(buffer, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			bos.close();
		}
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "548267"));
		formparams.add(new BasicNameValuePair("shopId", "306"));
		formparams
				.add(new BasicNameValuePair("file", Base64.encodeBase64String(bos.toByteArray())));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String getStock(String api) throws IOException {
		String url = api + "/goods/getUploadRecord";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "120240"));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	
	public static String editGoods(String api) throws IOException {
		String url = api + "/goods/editGoodsVd";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userId", "555954"));
		formparams.add(new BasicNameValuePair("shopId", "132"));
		formparams.add(new BasicNameValuePair("itemId", "28"));
		return PostUtil.httpPost(url, formparams);
	}
}
