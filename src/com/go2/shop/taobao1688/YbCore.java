package com.go2.shop.taobao1688;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.alibaba.openapi.sdk.cbusdk.ApiFacade;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaCategoryAttributeGetParam;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaCategoryAttributeGetResult;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaPhotobankAlbumAddParam;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaPhotobankAlbumAddResult;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaPhotobankAlbumGetListParam;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaPhotobankAlbumGetListResult;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaPhotobankPhotoAddParam;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaPhotobankPhotoAddResult;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaPhotobankPhotoGetListParam;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaPhotobankPhotoGetListResult;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaProductAddParam;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaProductAddResult;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaProductGetListParam;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaProductGetListResult;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaProductGetParam;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaProductGetResult;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaProductGroupAddParam;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaProductGroupAddResult;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaProductGroupGetListParam;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaProductGroupGetListResult;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabacategoryAttributeInfo;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabacategoryAttributeValueInfo;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaproductProductAttribute;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaproductProductImageInfo;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaproductProductInfo;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaproductProductPriceRange;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaproductProductSaleInfo;
import com.yu.tabo1688.CommonUtil;
import com.yu.tabo1688.PostUtil;
import com.yu.tabo1688.test.YbConfig;

/**
 * 
 * @author yuhang
 * @date 2016年10月12日
 * @desc 1688
 */
public class YbCore {

	private static final String SITE = "china";
	private static final String STATE = "YOUR_PARM";
	private static final String WEB_SITE = "1688";

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
		sb.append("&state=" + STATE);
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

	/**
	 * 
	 * @Date 2016年11月1日
	 * @desc 发布商品
	 */
	public static AlibabaProductAddResult addProduct(AlibabaProductAddParam param,
			String accessToken) {
		ApiFacade facade = new ApiFacade();
		facade.setAppKey(YbConfig.APP_KEY);
		facade.setSigningKey(YbConfig.APP_SECRET_KEY);
		return facade.alibabaProductAdd(param, accessToken);
	}

	/**
	 * 
	 * @Date 2016年11月1日
	 * @desc 获取分类列表
	 */
	public static AlibabaProductGroupGetListResult groupList(
			AlibabaProductGroupGetListParam request, String accessToken) {
		ApiFacade facade = new ApiFacade();
		facade.setAppKey(YbConfig.APP_KEY);
		facade.setSigningKey(YbConfig.APP_SECRET_KEY);
		return facade.alibabaProductGroupGetList(request, accessToken);

	}

	/**
	 * 
	 * @Date 2016年11月1日
	 * @desc 添加分类
	 */
	public static AlibabaProductGroupAddResult addGroup(AlibabaProductGroupAddParam request,
			String accessToken) {
		ApiFacade facade = new ApiFacade();
		facade.setAppKey(YbConfig.APP_KEY);
		facade.setSigningKey(YbConfig.APP_SECRET_KEY);
		return facade.alibabaProductGroupAdd(request, accessToken);

	}

	/**
	 * 根据类目ID获取类目属性
	 * 
	 * @Date 2016年11月1日
	 * @desc
	 */
	public static AlibabaCategoryAttributeGetResult attributeGet(
			AlibabaCategoryAttributeGetParam param, String accessToken) {
		ApiFacade facade = new ApiFacade();
		facade.setAppKey(YbConfig.APP_KEY);
		facade.setSigningKey(YbConfig.APP_SECRET_KEY);
		return facade.alibabaCategoryAttributeGet(param, accessToken);
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
		map.put("webSite", "1688");
		map.put("access_token", token);
		String sign = CommonUtil.signatureWithParamsAndUrlPath(urlPath, map,
				YbConfig.APP_SECRET_KEY);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("categoryID", categoryID));
		formparams.add(new BasicNameValuePair("webSite", "1688"));
		formparams.add(new BasicNameValuePair("access_token", token));
		formparams.add(new BasicNameValuePair("_aop_signature", sign));
		String result = PostUtil.httpPost(YbConfig.YB_URL + urlPath, formparams);
		return result;
	}

	/**
	 * 
	 * @Date 2016年11月1日
	 * @desc 获取全店商品列表
	 */
	public static AlibabaProductGetListResult productGetList(AlibabaProductGetListParam param,
			String accessToken) {
		ApiFacade facade = new ApiFacade();
		facade.setAppKey(YbConfig.APP_KEY);
		facade.setSigningKey(YbConfig.APP_SECRET_KEY);
		param.setWebSite(WEB_SITE);
		return facade.alibabaProductGetList(param, accessToken);
	}

	/**
	 * 
	 * @Date 2016年11月1日
	 * @desc 获取单个商品
	 */
	public static AlibabaProductGetResult productGet(AlibabaProductGetParam param,
			String accessToken) {
		ApiFacade facade = new ApiFacade();
		facade.setAppKey(YbConfig.APP_KEY);
		facade.setSigningKey(YbConfig.APP_SECRET_KEY);
		param.setWebSite(WEB_SITE);
		return facade.alibabaProductGet(param, accessToken);
	}

	/**
	 * 
	 * @Date 2016年11月1日
	 * @desc 获取商品分组列表
	 */
	public static AlibabaProductGroupGetListResult groupGetList(
			AlibabaProductGroupGetListParam param, String accessToken) {
		ApiFacade facade = new ApiFacade();
		facade.setAppKey(YbConfig.APP_KEY);
		facade.setSigningKey(YbConfig.APP_SECRET_KEY);
		param.setWebSite(WEB_SITE);
		param.setWebSite(WEB_SITE);
		return facade.alibabaProductGroupGetList(param, accessToken);
	}

	/**
	 * 
	 * @Date 2016年11月1日
	 * @desc 获取相册列表
	 */
	public static AlibabaPhotobankAlbumGetListResult albumGetList(
			AlibabaPhotobankAlbumGetListParam param, String accessToken) {
		ApiFacade facade = new ApiFacade();
		facade.setAppKey(YbConfig.APP_KEY);
		facade.setSigningKey(YbConfig.APP_SECRET_KEY);
		param.setWebSite(WEB_SITE);
		return facade.alibabaPhotobankAlbumGetList(param, accessToken);
	}

	/**
	 * 
	 * @Date 2016年11月1日
	 * @desc 添加相册
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
		map.put("webSite", WEB_SITE);
		map.put("access_token", token);
		String sign = CommonUtil.signatureWithParamsAndUrlPath(urlPath, map,
				YbConfig.APP_SECRET_KEY);
		System.out.println(sign);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("name", name));
		formparams.add(new BasicNameValuePair("description", desc));
		formparams.add(new BasicNameValuePair("authority", authority));
		formparams.add(new BasicNameValuePair("password", password));
		formparams.add(new BasicNameValuePair("webSite", WEB_SITE));
		formparams.add(new BasicNameValuePair("access_token", token));
		formparams.add(new BasicNameValuePair("_aop_signature", sign));
		String result = PostUtil.httpPost(YbConfig.YB_URL + urlPath, formparams);
		return result;
	}

	/**
	 * 
	 * @Date 2016年11月1日
	 * @desc 获取图片列表
	 */
	public static AlibabaPhotobankPhotoGetListResult photoGetList(
			AlibabaPhotobankPhotoGetListParam param, String accessToken) throws IOException {
		ApiFacade facade = new ApiFacade();
		facade.setAppKey(YbConfig.APP_KEY);
		facade.setSigningKey(YbConfig.APP_SECRET_KEY);
		param.setWebSite(WEB_SITE);
		return facade.alibabaPhotobankPhotoGetList(param, accessToken);
	}

	/**
	 * 
	 * @Date 2016年11月1日
	 * @desc 订单列表
	 */
	public static String orderList(String pageSize, String pageNo, String token, String memberId)
			throws IOException {
		String urlPath = CommonUtil.buildInvokeUrlPath(YbConfig.NAMESPACE_OPEN,
				YbConfig.TRADE_ORDER_LIST_GET, YbConfig.API_VERSION_2, YbConfig.PROTOCOL,
				YbConfig.APP_KEY);
		Map<String, String> map = new HashMap<String, String>();
		map.put("buyerMemberId", memberId);
		map.put("pageSize", pageSize);
		map.put("page", pageNo);
		map.put("access_token", token);
		String sign = CommonUtil.signatureWithParamsAndUrlPath(urlPath, map,
				YbConfig.APP_SECRET_KEY);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("pageSize", pageSize));
		formparams.add(new BasicNameValuePair("page", pageNo));
		formparams.add(new BasicNameValuePair("buyerMemberId", memberId));
		formparams.add(new BasicNameValuePair("access_token", token));
		formparams.add(new BasicNameValuePair("_aop_signature", sign));
		String result = PostUtil.httpPost(YbConfig.YB_URL + urlPath, formparams);
		return result;
	}

	/**
	 * 
	 * @return
	 * @Date 2016年11月1日
	 * @desc 相片添加
	 */
	public static AlibabaPhotobankPhotoAddResult photoAdd(AlibabaPhotobankPhotoAddParam param,
			String accessToken) {
		ApiFacade facade = new ApiFacade();
		facade.setAppKey(YbConfig.APP_KEY);
		facade.setSigningKey(YbConfig.APP_SECRET_KEY);
		param.setWebSite(WEB_SITE);
		return facade.alibabaPhotobankPhotoAdd(param, accessToken);
	}

	/**
	 * 
	 * @throws IOException
	 * @Date 2016年11月1日
	 * @desc 获取订单详情
	 */
	public static String detailGet(String token, String orderid) throws IOException {
		String urlPath = CommonUtil.buildInvokeUrlPath(YbConfig.NAMESPACE_OPEN,
				YbConfig.TRADE_ORDER_DETAIL_GET, YbConfig.API_VERSION_1, YbConfig.PROTOCOL,
				YbConfig.APP_KEY);
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", orderid);
		map.put("access_token", token);
		String sign = CommonUtil.signatureWithParamsAndUrlPath(urlPath, map,
				YbConfig.APP_SECRET_KEY);
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("id", orderid));
		formparams.add(new BasicNameValuePair("access_token", token));
		formparams.add(new BasicNameValuePair("_aop_signature", sign));
		String result = PostUtil.httpPost(YbConfig.YB_URL + urlPath, formparams);
		return result;
	}

	public static void main(String[] args) throws Exception {
//		 String str = authorizeURL();//获取URL177174734
//		 String str =getAccessToken("3d5cfba8-eabc-4273-905c-5dd6c3c920ba");
		String accessToken = "97a6e61c-5e17-4d0c-aa35-329c0046bb73";
		// String result = searchCategory("0", accessToken);
		// getAttribute(accessToken);
		// addProuct(accessToken);
		// System.out.println(result);
		// productList(accessToken);
//		 AlibabaPhotobankAlbumAddParam p = new
//		 AlibabaPhotobankAlbumAddParam();
//		 p.setName("好漂亮");
//		 p.setDescription("鞋子");
		// int n=1;
		// p.setAuthority(n);
		// albumAdd(p, accessToken);
//		 String str = albumCreate("相册2", "hehe", "1", "", "4e6acc84-1007-4964-9514-60f8b2251d8b");
		// System.out.println(str);
		// AlibabaPhotobankAlbumGetListParam param = new
		// AlibabaPhotobankAlbumGetListParam();
		// AlibabaPhotobankAlbumGetListResult result = albumGetList(param,
		// accessToken);
		// for (int i = 0; i < result.getAlbumInfos().length; i++) {
		// System.out.println(result.getAlbumInfos()[i].getName());
		// System.out.println(result.getAlbumInfos()[i].getAlbumID());
		// }
		 AlibabaProductGroupGetListParam param = new
		 AlibabaProductGroupGetListParam();
		 AlibabaProductGroupGetListResult result = groupGetList(param,accessToken);
		 System.out.println(result.getProductGroupInfo()[0].getName());

		// AlibabaPhotobankPhotoGetListParam param = new
		// AlibabaPhotobankPhotoGetListParam();
		// param.setPageNo(1);
		// param.setAlbumID(176697876L);
		// param.setPageSize(10);
//		 AlibabaPhotobankPhotoGetListResult result = photoGetList(param,accessToken);
//		 System.out.println(result);
		// for(int i=0;i<result.getPhotoInfos().length;i++){
		// System.out.println(result.getPhotoInfos()[0].getName());
		// System.out.println(result.getPhotoInfos()[0].getUrl());
		// }
		// AlibabaPhotobankPhotoAddParam param = new
		// AlibabaPhotobankPhotoAddParam();
		// param.setAlbumID(176697876L);
		// param.setDescription("test");
		// param.setName("piaoliang");
		// param.setImageBytes(ImageUtil.toByte("D:/123.jpg"));
		// photoAdd(param, accessToken);
//		String str = orderList("10", "1", accessToken, "b2b-1896126271");
//		String str = detailGet(accessToken, "12");
//		System.out.println(str);

	}

	private static void productList(String accessToken) {
		AlibabaProductGetListParam param = new AlibabaProductGetListParam();
		// param.setCategoryID(10170L);
		param.setPageNo(1);
		param.setPageSize(20);
		param.setWebSite("1688");
		AlibabaProductGetListResult result = productGetList(param, accessToken);
		AlibabaproductProductInfo[] info = result.getProductInfos();
		for (int i = 0; i < info.length; i++) {
			System.out.println(info[i].getProductID());
			System.out.println(info[i].getDescription());
			System.out.println(info[i].getGroupID());
		}
	}

	private static void getAttribute(String accessToken) {
		AlibabaCategoryAttributeGetParam param = new AlibabaCategoryAttributeGetParam();
		param.setCategoryID(10170L);
		param.setWebSite("1688");
		AlibabaCategoryAttributeGetResult result = attributeGet(param, accessToken);
		for (int i = 0; i < result.getAttributes().length; i++) {
			System.out.println(result.getAttributes()[i].getAttrID());
			System.out.println(result.getAttributes()[i].getName());
			System.out.println(result.getAttributes()[i].getUnits());
			AlibabacategoryAttributeValueInfo[] info = result.getAttributes()[i].getAttrValues();
			for (int k = 0; k < info.length; k++) {
				System.out.println(info[k].getName() + ":x");
				System.out.println(info[k].getAttrValueID() + ":x");
			}
			System.out.println(result.getAttributes()[i].getInputType());
			System.out.println(result.getAttributes()[i].getRequired());
		}
	}

	public static void addProuct(String accessToken) {
		AlibabaProductAddParam param = new AlibabaProductAddParam();
		param.setProductType("wholesale");
		param.setCategoryID(10170L);
		List<AlibabaproductProductAttribute> list = new ArrayList<AlibabaproductProductAttribute>();
		AlibabaCategoryAttributeGetParam request = new AlibabaCategoryAttributeGetParam();
		request.setCategoryID(10170L);
		request.setWebSite("1688");
		AlibabaCategoryAttributeGetResult result = attributeGet(request, accessToken);
		for (int i = 0; i < result.getAttributes().length; i++) {
			AlibabacategoryAttributeInfo tmp = result.getAttributes()[i];
			if (tmp.getRequired()) {
				AlibabaproductProductAttribute attributes = new AlibabaproductProductAttribute();
				attributes.setAttributeID(tmp.getAttrID());
				attributes.setAttributeName(tmp.getName());
				attributes.setValue("1");
				attributes.setIsCustom(false);
				attributes.setValueID(i + 1L);
				list.add(attributes);
			}
		}

		AlibabaproductProductAttribute[] strings = new AlibabaproductProductAttribute[list.size()];
		list.toArray(strings);
		param.setAttributes(strings);
		// param.setGroupID(groupID);
		param.setSubject("subjectsss");
		param.setDescription("xie zi");
		param.setLanguage("CHINESE");
		param.setPeriodOfValidity(20);
		param.setBizType(1);
		AlibabaproductProductImageInfo image = new AlibabaproductProductImageInfo();
		image.setImages(new String[] { "/img/ibank/2016/872/127/3556721278_68880618.jpg" });
		param.setImage(image);
		AlibabaproductProductSaleInfo saleInfo = new AlibabaproductProductSaleInfo();
		saleInfo.setSupportOnlineTrade(true);
		saleInfo.setMixWholeSale(false);
		saleInfo.setPriceAuth(false);
		AlibabaproductProductPriceRange priceRanges = new AlibabaproductProductPriceRange();
		priceRanges.setPrice(100D);
		priceRanges.setStartQuantity(100);
		saleInfo.setPriceRanges(new AlibabaproductProductPriceRange[] { priceRanges });
		saleInfo.setAmountOnSale(1000D);
		saleInfo.setUnit("件");
		saleInfo.setMinOrderQuantity(100);
		saleInfo.setBatchNumber(10);
		saleInfo.setRetailprice(100D);
		saleInfo.setTax("xx");
		saleInfo.setSellunit("手");
		param.setSaleInfo(saleInfo);
		param.setWebSite("1688");
		AlibabaProductAddResult result1 = addProduct(param, accessToken);
		System.out.println(result1.getErrorMsg());
	}
}
