package com.yu.tabo1688.test;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.alibaba.fastjson.JSON;
import com.yu.tabo1688.CommonUtil;
import com.yu.tabo1688.PostUtil;
import com.yu.tabo1688.domain.OfferImageInfo;
import com.yu.tabo1688.domain.OfferNew;
import com.yu.tabo1688.domain.ProductImageInfo;

/**
 * 
 * @author yuhang
 * @date 2016年10月12日
 * @desc 1688
 */
public class YbCore {

	private static final String SITE = "china";
	private static final String STATE = "YOUR_PARM";
	private static final String productType = "wholesale";
	private static final String language = "CHINESE";
	private static final String website = "1688";

	/**
	 * 
	 * @Date 2016年10月13日
	 * @desc 授权链接
	 */
	public static String authorizeURL() {
		StringBuilder sb = new StringBuilder();
		sb.append(YbConfig.AUTH_URL);
		sb.append("client_id=" + YbConfig.APP_KEY);
		sb.append("&site=china");
		sb.append("&redirect_uri=" + YbConfig.YB_REDIRECT_URL);
		sb.append("&state=YOUR_PARM");
		Map<String, String> params = new HashMap<String, String>();
		params.put("client_id", YbConfig.APP_KEY);
		params.put("site", SITE);
		params.put("redirect_uri", YbConfig.YB_REDIRECT_URL);
		params.put("state", STATE);
		String sign = CommonUtil.signatureWithParamsOnly(params, YbConfig.APP_SECRET_KEY);
		sb.append("&_aop_signature=" + sign);
		return sb.toString();
	}

	/**
	 * 
	 * @throws IOException
	 * @Date 2016年10月13日
	 * @desc 获取token
	 */
	public static String getAccessToken(String code) throws IOException {
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("grant_type", "authorization_code"));
		formparams.add(new BasicNameValuePair("need_refresh_token", "true"));
		formparams.add(new BasicNameValuePair("client_id", YbConfig.APP_KEY));
		formparams.add(new BasicNameValuePair("client_secret", YbConfig.APP_SECRET_KEY));
		formparams.add(new BasicNameValuePair("redirect_uri", YbConfig.YB_REDIRECT_URL));
		formparams.add(new BasicNameValuePair("code", code));
		String result = PostUtil.httpPost(YbConfig.YB_TOKEN_URL + YbConfig.APP_KEY, formparams);
		return result;
	}

	/***
	 * 
	 * @Date 2016年10月13日
	 * @desc 根据商品ID查询
	 */
	public static String productInfo(String productId, String webSite, String token)
			throws IOException {
		String urlPath = CommonUtil.buildInvokeUrlPath(YbConfig.NAMESPACE_PRODUCT,
				YbConfig.API_NAME_PRODUCT, YbConfig.API_VERSION_1, YbConfig.PROTOCOL,
				YbConfig.APP_KEY);
		Map<String, String> map = new HashMap<String, String>();
		map.put("productID", productId);
		map.put("webSite", webSite);
		map.put("access_token", token);
		String sign = CommonUtil.signatureWithParamsAndUrlPath(urlPath, map,
				YbConfig.APP_SECRET_KEY);
		System.out.println(sign);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("productID", productId));
		formparams.add(new BasicNameValuePair("webSite", webSite));
		formparams.add(new BasicNameValuePair("access_token", token));
		formparams.add(new BasicNameValuePair("_aop_signature", sign));
		String result = PostUtil.httpPost(YbConfig.YB_URL + urlPath, formparams);
		return result;
	}

	/**
	 * 获取所有的商品
	 * 
	 * @Date 2016年10月13日
	 * @desc
	 */
	public static String productList(String webSite, String pageNo, String pageSize, String token)
			throws IOException {
		String urlPath = CommonUtil.buildInvokeUrlPath(YbConfig.NAMESPACE_PRODUCT,
				YbConfig.API_NAME_PRODUCT_LIST, YbConfig.API_VERSION_1, YbConfig.PROTOCOL,
				YbConfig.APP_KEY);
		Map<String, String> map = new HashMap<String, String>();
		map.put("pageNo", pageNo);
		map.put("pageSize", pageSize);
		map.put("webSite", webSite);
		map.put("access_token", token);
		String sign = CommonUtil.signatureWithParamsAndUrlPath(urlPath, map,
				YbConfig.APP_SECRET_KEY);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("pageNo", pageNo));
		formparams.add(new BasicNameValuePair("pageSize", pageSize));
		formparams.add(new BasicNameValuePair("webSite", webSite));
		formparams.add(new BasicNameValuePair("access_token", token));
		formparams.add(new BasicNameValuePair("_aop_signature", sign));
		String result = PostUtil.httpPost(YbConfig.YB_URL + urlPath, formparams);
		return result;
	}

	/**
	 * 
	 * @Date 2016年10月13日
	 * @desc 商品发布(1688新接口，现在一直报错不用)
	 */
	public static String productAdd(String token) throws IOException {
		// 构造URI
		String urlPath = CommonUtil.buildInvokeUrlPath(YbConfig.NAMESPACE_PRODUCT,
				YbConfig.API_NAME_PRODUCT_ADD, YbConfig.API_VERSION_1, YbConfig.PROTOCOL,
				YbConfig.APP_KEY);
		System.out.println(urlPath);
		ProductImageInfo image = new ProductImageInfo();
		image.setImages(new String[] { "/img/ibank/2016/872/127/3556721278_68880618.jpg" });
		Map<String, String> map = new HashMap<String, String>();
		map.put("productType", productType);
		map.put("categoryID", "10170");
		map.put("subject", "test");
		map.put("description", "test");
		map.put("language", language);
		System.out.println(JSON.toJSONString(image));
		map.put("image", JSON.toJSONString(image));
		map.put("periodOfValidity", "20");
		map.put("webSite", website);
		map.put("access_token", token);
		String sign = CommonUtil.signatureWithParamsAndUrlPath(urlPath, map,
				YbConfig.APP_SECRET_KEY);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("productType", productType));
		formparams.add(new BasicNameValuePair("categoryID", "10170"));
		formparams.add(new BasicNameValuePair("subject", "test"));
		formparams.add(new BasicNameValuePair("description", "test"));
		formparams.add(new BasicNameValuePair("language", language));
		formparams.add(new BasicNameValuePair("image", JSON.toJSONString(image)));
		formparams.add(new BasicNameValuePair("periodOfValidity", "20"));
		formparams.add(new BasicNameValuePair("webSite", website));
		formparams.add(new BasicNameValuePair("access_token", token));
		formparams.add(new BasicNameValuePair("_aop_signature", sign));
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < formparams.size(); i++) {
			sb.append("&" + formparams.get(i).getName() + "=" + formparams.get(i).getValue());
		}
		System.out.println(YbConfig.YB_URL + urlPath + "?" + sb.toString());
		String result = PostUtil.httpPost(YbConfig.YB_URL + urlPath, formparams);
		return result;
	}

	/**
	 * 
	 * @Date 2016年10月19日
	 * @desc 查询类目(类目id,必须大于等于0， 如果为0，则查询所有一级类目)
	 */
	public static String searchCategory(String categoryID, String token) throws IOException {
		String urlPath = CommonUtil.buildInvokeUrlPath(YbConfig.NAMESPACE_PRODUCT,
				YbConfig.CATEGORY_GET, YbConfig.API_VERSION_1, YbConfig.PROTOCOL, YbConfig.APP_KEY);
		Map<String, String> map = new HashMap<String, String>();
		map.put("categoryID", categoryID);
		map.put("webSite", website);
		map.put("access_token", token);
		String sign = CommonUtil.signatureWithParamsAndUrlPath(urlPath, map,
				YbConfig.APP_SECRET_KEY);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("categoryID", categoryID));
		formparams.add(new BasicNameValuePair("webSite", website));
		formparams.add(new BasicNameValuePair("access_token", token));
		formparams.add(new BasicNameValuePair("_aop_signature", sign));
		String result = PostUtil.httpPost(YbConfig.YB_URL + urlPath, formparams);
		return result;
	}

	public static byte[] image2byte(String path) {
		byte[] data = null;
		FileImageInputStream input = null;
		try {
			input = new FileImageInputStream(new File(path));
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			byte[] buf = new byte[1024];
			int numBytesRead = 0;
			while ((numBytesRead = input.read(buf)) != -1) {
				output.write(buf, 0, numBytesRead);
			}
			data = output.toByteArray();
			output.close();
			input.close();
		} catch (FileNotFoundException ex1) {
			ex1.printStackTrace();
		} catch (IOException ex1) {
			ex1.printStackTrace();
		}
		return data;
	}

	/**
	 * 
	 * @Date 2016年10月19日
	 * @desc 上传图片
	 */
	public static String upImage(String albumId, String name, String description, String drawTxt,
			String token, String path) throws IOException {
		String urlPath = CommonUtil.buildInvokeUrlPath(YbConfig.NAMESPACE_PRODUCT,
				YbConfig.IMAGE_UPLOAD, YbConfig.API_VERSION_1, YbConfig.PROTOCOL, YbConfig.APP_KEY);
		byte[] bye = image2byte(path);
		Map<String, String> map = new HashMap<String, String>();
		map.put("albumId", albumId);
		map.put("name", name);
		map.put("description", description);
		map.put("imageBytes", new Base64().encodeToString(bye));
		map.put("webSite", website);
		map.put("access_token", token);
		String sign = CommonUtil.signatureWithParamsAndUrlPath(urlPath, map,
				YbConfig.APP_SECRET_KEY);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("albumId", albumId));
		formparams.add(new BasicNameValuePair("name", name));
		formparams.add(new BasicNameValuePair("description", description));
		formparams.add(new BasicNameValuePair("webSite", website));
		formparams.add(new BasicNameValuePair("access_token", token));
		formparams.add(new BasicNameValuePair("_aop_signature", sign));
		String result = PostUtil.httpPost2(YbConfig.YB_URL + urlPath, bye, formparams);
		return result;
	}

	/**
	 * 
	 * @Date 2016年10月19日
	 * @desc 创建相册
	 */
	public static String albumCreate(String name, String desc, String authority, String password,
			String token) throws IOException {
		String urlPath = CommonUtil.buildInvokeUrlPath(YbConfig.NAMESPACE_PRODUCT,
				YbConfig.ALBUM_CREATE, YbConfig.API_VERSION_1, YbConfig.PROTOCOL, YbConfig.APP_KEY);
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		map.put("description", desc);
		map.put("authority", authority);
		map.put("password", password);
		map.put("webSite", website);
		map.put("access_token", token);
		String sign = CommonUtil.signatureWithParamsAndUrlPath(urlPath, map,
				YbConfig.APP_SECRET_KEY);
		System.out.println(sign);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("name", name));
		formparams.add(new BasicNameValuePair("description", desc));
		formparams.add(new BasicNameValuePair("authority", authority));
		formparams.add(new BasicNameValuePair("password", password));
		formparams.add(new BasicNameValuePair("webSite", website));
		formparams.add(new BasicNameValuePair("access_token", token));
		formparams.add(new BasicNameValuePair("_aop_signature", sign));
		String result = PostUtil.httpPost(YbConfig.YB_URL + urlPath, formparams);
		return result;
	}

	/**
	 * 
	 * @Date 2016年10月19日
	 * @desc 获取相册
	 */
	public static String albumGet(String albumId, String token) throws IOException {
		String urlPath = CommonUtil.buildInvokeUrlPath(YbConfig.NAMESPACE_OPEN,
				YbConfig.IBANK_ALBUM_GET, YbConfig.API_VERSION_1, YbConfig.PROTOCOL,
				YbConfig.APP_KEY);
		ProductImageInfo image = new ProductImageInfo();
		image.setImages(new String[] { "http://baidu.com/1.jpg" });
		Map<String, String> map = new HashMap<String, String>();
		map.put("albumId", albumId);
		map.put("access_token", token);
		String sign = CommonUtil.signatureWithParamsAndUrlPath(urlPath, map,
				YbConfig.APP_SECRET_KEY);
		System.out.println(sign);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("albumId", albumId));
		formparams.add(new BasicNameValuePair("access_token", token));
		formparams.add(new BasicNameValuePair("_aop_signature", sign));
		String result = PostUtil.httpPost(YbConfig.YB_URL + urlPath, formparams);
		return result;
	}

	/**
	 * 
	 * @Date 2016年10月19日
	 * @desc 获取相册列表
	 */
	public static String albumList(String token) throws IOException {
		String urlPath = CommonUtil.buildInvokeUrlPath(YbConfig.NAMESPACE_PRODUCT,
				YbConfig.ALBUM_LIST, YbConfig.API_VERSION_1, YbConfig.PROTOCOL, YbConfig.APP_KEY);
		Map<String, String> map = new HashMap<String, String>();
		map.put("webSite", website);
		map.put("access_token", token);
		String sign = CommonUtil.signatureWithParamsAndUrlPath(urlPath, map,
				YbConfig.APP_SECRET_KEY);
		System.out.println(sign);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("webSite", website));
		formparams.add(new BasicNameValuePair("access_token", token));
		formparams.add(new BasicNameValuePair("_aop_signature", sign));
		String result = PostUtil.httpPost(YbConfig.YB_URL + urlPath, formparams);
		return result;
	}

	/**
	 * 
	 * @Date 2016年10月19日
	 * @desc 获取图片列表
	 */
	public static String photoGetlist(String albumID, String pageSize, String pageNo, String token)
			throws IOException {
		String urlPath = CommonUtil
				.buildInvokeUrlPath(YbConfig.NAMESPACE_PRODUCT, YbConfig.PHOTO_GETLIST,
						YbConfig.API_VERSION_1, YbConfig.PROTOCOL, YbConfig.APP_KEY);
		Map<String, String> map = new HashMap<String, String>();
		map.put("albumID", albumID);
		map.put("pageSize", pageSize);
		map.put("pageNo", pageNo);
		map.put("webSite", website);
		map.put("access_token", token);
		String sign = CommonUtil.signatureWithParamsAndUrlPath(urlPath, map,
				YbConfig.APP_SECRET_KEY);
		System.out.println(sign);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("albumID", albumID));
		formparams.add(new BasicNameValuePair("pageSize", pageSize));
		formparams.add(new BasicNameValuePair("pageNo", pageNo));
		formparams.add(new BasicNameValuePair("webSite", website));
		formparams.add(new BasicNameValuePair("access_token", token));
		formparams.add(new BasicNameValuePair("_aop_signature", sign));
		String result = PostUtil.httpPost(YbConfig.YB_URL + urlPath, formparams);
		return result;
	}

	public static String orderList(String pageSize, String pageNo, String token, String memberId)
			throws IOException {
		String urlPath = CommonUtil.buildInvokeUrlPath(YbConfig.NAMESPACE_OPEN,
				YbConfig.TRADE_ORDER_LIST_GET, YbConfig.API_VERSION_2, YbConfig.PROTOCOL,
				YbConfig.APP_KEY);
		Map<String, String> map = new HashMap<String, String>();
		map.put("buyerMemberId", memberId);
		// map.put("pageSize", pageSize);
		// map.put("page", pageNo);
		map.put("access_token", token);
		String sign = CommonUtil.signatureWithParamsAndUrlPath(urlPath, map,
				YbConfig.APP_SECRET_KEY);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		// formparams.add(new BasicNameValuePair("pageSize", pageSize));
		// formparams.add(new BasicNameValuePair("page", pageNo));
		formparams.add(new BasicNameValuePair("buyerMemberId", memberId));
		formparams.add(new BasicNameValuePair("access_token", token));
		formparams.add(new BasicNameValuePair("_aop_signature", sign));
		String result = PostUtil.httpPost(YbConfig.YB_URL + urlPath, formparams);
		return result;
	}

	/**
	 * 
	 * @Date 2016年10月20日
	 * @desc 老接口发布商品(现在就这一个接口可用)
	 */
	public static String productAddOld(OfferNew offerNew, String token) throws IOException {
		String urlPath = CommonUtil.buildInvokeUrlPath(YbConfig.NAMESPACE_OPEN, "offer.new",
				YbConfig.API_VERSION_1, YbConfig.PROTOCOL, YbConfig.APP_KEY);
		String offer = JSON.toJSONString(offerNew);
		Map<String, String> map = new HashMap<String, String>();
		map.put("access_token", token);
		map.put("offer", offer);
		String sign = CommonUtil.signatureWithParamsAndUrlPath(urlPath, map,
				YbConfig.APP_SECRET_KEY);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("offer", offer));
		formparams.add(new BasicNameValuePair("access_token", token));
		formparams.add(new BasicNameValuePair("_aop_signature", sign));
		String result = PostUtil.httpPost(YbConfig.YB_URL + urlPath, formparams);
		return result;
	}

	public static String upImageOld(String albumId, String name, String description,
			String drawTxt, String token, String path) throws IOException {
		String urlPath = CommonUtil.buildInvokeUrlPath(YbConfig.NAMESPACE_OPEN,
				YbConfig.IBANK_IMAGE_UPLOAD, YbConfig.API_VERSION_1, YbConfig.PROTOCOL,
				YbConfig.APP_KEY);
		File file = new File(path);
		byte[] bye = IOUtils.toByteArray(new FileReader(file));
		Map<String, String> map = new HashMap<String, String>();
		map.put("imageBytes", new Base64().encodeToString(bye));
		map.put("albumId", albumId);
		map.put("name", name);
		map.put("description", description);
		// map.put("webSite", website);
		map.put("access_token", token);
		String sign = CommonUtil.signatureWithParamsAndUrlPath(urlPath, map,
				YbConfig.APP_SECRET_KEY);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("albumId", albumId));
		formparams.add(new BasicNameValuePair("name", name));
		formparams.add(new BasicNameValuePair("description", description));
		// formparams.add(new BasicNameValuePair("webSite", website));
		formparams.add(new BasicNameValuePair("access_token", token));
		formparams.add(new BasicNameValuePair("_aop_signature", sign));
		String result = PostUtil.httpPost2(YbConfig.YB_URL + urlPath, bye, formparams);
		return result;
	}
	

	public static void main(String[] args) throws IOException {
//		 String str = authorizeURL();// 授权连接
		 String str = YbCore.getAccessToken("486e6c7a-3998-4c9b-afbf-7d0cd32f01d1");
		String memberId = "b2b-1896126271";
		String token = "d9f15412-35ba-44d7-8f10-2b27660e4d3d";
//		 String str=albumList(token);
		// String str=albumCreate("wode", "wode", "1", "123",
		// "cd11dcaf-49a5-4b27-af7b-7086893eec87");
		// String str = productAdd(token);
		// String str = searchCategory("商品管理",
		// "cd81a3b2-47d2-418c-91fc-a0cbaeb40ddd");
		// String str = productList(website, "1", "20", token);
		// String str = albumList("MY", "20", "1",
		// "cd81a3b2-47d2-418c-91fc-a0cbaeb40ddd");
		// String str = upImage("176697876", "123", "gg",
		// null,token,"D:/123vb.jpg");

//		String str = upImage("176697876", "123", "gg", null, token, "D:/123vb.jpg");
//		 String str = photoGetlist("176697876", "20", "1",token);
		// String str=orderList("10","1", token,memberId);
		// String str = publishProduct(token);
		// String str = searchCategory("125376002", token);
		System.out.println(str);
	}

	private static String publishProduct(String token) throws IOException {
		OfferNew offer = new OfferNew();
		offer.setAmountOnSale("1");
		offer.setBizType("1");
		offer.setCategoryID("1034340");
		offer.setFreightTemplateId(null);
		offer.setFreightType(null);
		List<OfferImageInfo> images = new ArrayList<OfferImageInfo>();
		OfferImageInfo o = new OfferImageInfo();
		o.setImageURI("/img/ibank/2016/872/127/3556721278_68880618.jpg");
		images.add(o);
		offer.setImageUriList(images);
		offer.setMixWholeSale(true);
		offer.setOfferWeight(null);
		offer.setPeriodOfValidity("1");
		offer.setPictureAuthOffer(false);
		offer.setPriceAuthOffer(false);
		offer.setPriceRanges("100:21.33`1000:14.15");
		offer.setProductFeatures(null);
		offer.setSendGoodsAddressId(null);
		offer.setSkuPics(null);
		offer.setSubject("漂亮凉鞋");
		offer.setUserCategorys(null);
		String str = productAddOld(offer, token);
		return str;
	}
}
