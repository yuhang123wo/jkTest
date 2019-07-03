package com.yuhang.jsoup;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * 
 * @author yuhang
 * @date 2016年9月9日
 * @desc 获取代理IP
 */
public class ProxIpUtil {
	/**
	 * 
	 * @Date 2016年9月9日
	 * @desc
	 */
	public static List<ProxyIpModel> parseOne(String url) throws Exception {
		JsoupRule js = new JsoupRule();
		js.setUrl(url);
		js.setRequestMethod(1);
		Document doc = JsoupUtil.getDocumentByRule(js);
		if (doc == null) {
			return null;
		}
		return parseDoc(doc);
	}

	/**
	 * 
	 * @Date 2016年9月9日
	 * @desc
	 */
	public static List<ProxyIpModel> parseDoc(Document docs) throws Exception {
		Element inha = docs.getElementById("tag_inha");// 现在只取国内高匿代理
		String url = inha.attr("href");
		List<ProxyIpModel> listP = new ArrayList<ProxyIpModel>();
		for (int i = 1; i < 3; i++) {
			List<ProxyIpModel> list = parseByPage(url, i);
			listP.addAll(list);
		}
		return listP;

	}

	public static List<ProxyIpModel> parseByPage(String url, int page) throws Exception {
		JsoupRule js = new JsoupRule();
		js.setUrl("http://www.kuaidaili.com" + url + page);
		js.setRequestMethod(1);
		Document doc = JsoupUtil.getDocumentByRule(js);
		Elements els = doc.getElementsByTag("tbody");
		List<ProxyIpModel> listp = new ArrayList<ProxyIpModel>();
		Element e = els.get(0);
		Elements trs = e.getElementsByTag("tr");
		for (int i = 0; i < trs.size(); i++) {
			Element tr = trs.get(i);
			Elements tds = tr.getElementsByTag("td");
			ProxyIpModel model = new ProxyIpModel();
			for (int k = 0; k < tds.size(); k++) {
				Element td = tds.get(k);
				if ("IP".equals(td.attr("data-title"))) {
					model.setIp(td.ownText());
				}
				if ("PORT".equals(td.attr("data-title"))) {
					model.setPort(Integer.parseInt(td.ownText()));
				}
			}
			listp.add(model);
		}
		return listp;
	}

}
