package com.yu.tabo1688.test;

public class YbConfig {

	/**
	 * 回调地址
	 */
	public static final String YB_REDIRECT_URL = "http://micro.ngrok.cc/Yb/callBack";
	/**
	 * 获取token
	 */
	public static final String YB_TOKEN_URL = "https://gw.open.1688.com/openapi/http/1/system.oauth2/getToken/";
	/**
	 * openapi
	 */
	public static final String YB_URL = "http://gw.open.1688.com/openapi/";
	/**
	 * appkey 相当于client_id
	 */
	public static final String APP_KEY = "2185097";

	public static final String APP_SECRET_KEY = "NLagMoiB5cdZ";

	public static final String AUTH_URL = "http://gw.open.1688.com/auth/authorize.htm?";

	public static final String NAMESPACE_PRODUCT = "com.alibaba.product";

	public static final int API_VERSION_1 = 1;

	public static final int API_VERSION_2 = 2;

	public static final String PROTOCOL = "param2";

	/**
	 * 发布商品
	 */
	public static final String API_NAME_PRODUCT_ADD = "alibaba.product.add";

	/**
	 * 获取商品列表
	 */
	public static final String API_NAME_PRODUCT_LIST = "alibaba.product.getList";

	/**
	 * 获取单个商品
	 */
	public static final String API_NAME_PRODUCT = "alibaba.product.get";

	public static final String PHOTO_GETLIST = "alibaba.photobank.photo.getList";

	public static final String ALBUM_LIST = "alibaba.photobank.album.getList";

	public static final String NAMESPACE_OPEN = "cn.alibaba.open";

	/**
	 * 类目查询
	 */
	public static final String CATEGORY_GET = "alibaba.category.get";

	/**
	 * 上传图片
	 */
	public static final String IMAGE_UPLOAD = "alibaba.photobank.photo.add";

	/**
	 * 创建相册
	 */
	public static final String ALBUM_CREATE = "alibaba.photobank.album.add";
	/**
	 * 获取相册
	 */
	public static final String IBANK_ALBUM_GET = "ibank.album.get";

	/**
	 * 查询订单列表
	 */
	public static final String TRADE_ORDER_LIST_GET = "trade.order.list.get";
	/**
	 * 
	 */
	public static final String TRADE_ORDER_DETAIL_GET = "trade.order.detail.get";
	/**
	 * 发布商品
	 */
	public static final String OFFER_NEW = "offer.new";

	public static final String IBANK_IMAGE_UPLOAD = "ibank.image.upload";

}
