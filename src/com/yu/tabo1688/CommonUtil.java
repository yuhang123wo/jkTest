package com.yu.tabo1688;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 通用工具类，包括了签名工具、url拼装以及httpResponse的解析
 */
public final class CommonUtil {
	/**
	 * 将urlPath和请求参数同时作为签名因子进行签名
	 * 
	 * @param urlPath
	 *            protocol/version/namespace/name/appKey
	 * @param params
	 *            api请求的各参数键值对
	 * @param appSecretKey
	 *            app签名密钥
	 * @return
	 */
	public static String signatureWithParamsAndUrlPath(String urlPath, Map<String, String> params,
			String appSecretKey) {
		List<String> paramValueList = new ArrayList<String>();
		if (params != null) {
			for (Map.Entry<String, String> entry : params.entrySet()) {
				paramValueList.add(entry.getKey() + entry.getValue());
			}
		}
		final String[] datas = new String[1 + paramValueList.size()];
		datas[0] = urlPath;
		Collections.sort(paramValueList);
		for (int i = 0; i < paramValueList.size(); i++) {
			datas[i + 1] = paramValueList.get(i);
		}
		byte[] signature = SecurityUtil.hmacSha1(datas, StringUtil.toBytes(appSecretKey));
		return StringUtil.encodeHexStr(signature);
	}

	/**
	 * 
	 * 仅将请求参数作为签名因子进行签名
	 * 
	 * @param params
	 *            api请求的各参数键值对
	 * @param appSecretKey
	 * @return
	 */
	public static String signatureWithParamsOnly(Map<String, String> params, String appSecretKey) {
		List<String> paramValueList = new ArrayList<String>();
		if (params != null) {
			for (Map.Entry<String, String> entry : params.entrySet()) {
				paramValueList.add(entry.getKey() + entry.getValue());
			}
		}
		Collections.sort(paramValueList);
		String[] datas = new String[paramValueList.size()];
		paramValueList.toArray(datas);
		byte[] signature = SecurityUtil.hmacSha1(datas, StringUtil.toBytes(appSecretKey));
		return StringUtil.encodeHexStr(signature);
	}

	/**
	 * 生成api签名的urlPath，即protocol/version/namespace/name/appKey
	 * 
	 * @param apiNamespace
	 * @param apiName
	 * @param apiVersion
	 * @param protocol
	 * @param appKey
	 * @return
	 */
	public static String buildInvokeUrlPath(String apiNamespace, String apiName, int apiVersion,
			String protocol, String appKey) {
		String url = protocol + "/" + apiVersion + "/" + apiNamespace + "/" + apiName + "/"
				+ appKey;
		return url;
	}

	/**
	 * 获取完整的url
	 * 
	 * @param url
	 *            请求uri
	 * @param params
	 *            请求参数
	 * @return
	 */
	public static String getWholeUrl(String url, Map<String, String> params) {
		if (url == null) {
			return null;
		}
		if (params == null) {
			return url;
		}
		Set<Map.Entry<String, String>> set = params.entrySet();
		if (set.size() <= 0) {
			return url;
		}
		url += "?";
		Iterator<Map.Entry<String, String>> it = set.iterator();
		if (it.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
			String param = entry.getKey() + "=" + entry.getValue();
			url += param;
		}
		while (it.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
			String param = entry.getKey() + "=" + entry.getValue();
			url += "&" + param;
		}
		return url;
	}

	private CommonUtil() {
	}
}
