package com.yuhang.jsoup;

import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupUtil {

	/**
	 * @Description 将所有https的网站添加信任 爬取https网站时需要
	 */
	public static void addHttpsTrust() {
		try {
			HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}
			});

			SSLContext context = SSLContext.getInstance("TLS");
			context.init(null, new X509TrustManager[] { new X509TrustManager() {
				public void checkClientTrusted(X509Certificate[] chain, String authType)
						throws CertificateException {
				}

				public void checkServerTrusted(X509Certificate[] chain, String authType)
						throws CertificateException {
				}

				public X509Certificate[] getAcceptedIssuers() {
					return new X509Certificate[0];
				}
			} }, new SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(context.getSocketFactory());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @Description 获取页面信息
	 * @param rule
	 *            请求规则
	 * @return 页面的document对象
	 * @throws Exception
	 */
	public static Document getDocumentByRule(JsoupRule rule) throws Exception {
		// 添加https信任
		if (rule.getUrl().startsWith("https://")) {
			addHttpsTrust();
		}
		// 获取连接
		Connection conn = Jsoup.connect(rule.getUrl());
		conn.userAgent("Mozilla");
		// 设置查询参数
		if (rule.getParamNames() != null) {
			for (int i = 0; i < rule.getParamNames().length; i++) {
				conn.data(rule.getParamNames()[i], rule.getParamValues()[i]);
			}
		}
		// 根据请求类型获取返回数据
		Document doc = null;
		if (rule.getRequestMethod() == Constant.REQUEST_GET) {
			doc = conn.timeout(100000).get();
		} else if (rule.getRequestMethod() == Constant.REQUEST_POST) {
			doc = conn.timeout(10000).post();
		} else {
			throw new Exception("无效的请求类型");
		}
		return doc;
	}

	public static Document getDocumentByRuleProxy(JsoupRule rule, ProxyIpModel ip) throws Exception {
		// 添加https信任
		if (rule.getUrl().startsWith("https://")) {
			addHttpsTrust();
		}
		// 获取连接
		Connection conn = Jsoup.connect(rule.getUrl());
		conn.userAgent("Mozilla");
		conn.proxy(ip.getIp(), ip.getPort());
		// 设置查询参数
		if (rule.getParamNames() != null) {
			for (int i = 0; i < rule.getParamNames().length; i++) {
				conn.data(rule.getParamNames()[i], rule.getParamValues()[i]);
			}
		}
		// 根据请求类型获取返回数据
		Document doc = null;
		if (rule.getRequestMethod() == Constant.REQUEST_GET) {
			doc = conn.timeout(100000).get();
		} else if (rule.getRequestMethod() == Constant.REQUEST_POST) {
			doc = conn.timeout(2000).post();
		} else {
			throw new Exception("无效的请求类型");
		}
		return doc;
	}
}
