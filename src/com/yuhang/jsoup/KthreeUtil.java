package com.yuhang.jsoup;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * 
 * @author yuhang
 * @date 2016年9月6日
 * @desc
 */
public class KthreeUtil {
	private static final String BASE_URL = "http://www.k3.cn";
	private static final String slash = "\\,";

	/**
	 * 
	 * @throws Exception
	 * @Date 2016年9月6日
	 * @desc
	 */
	public static ProductModel parseOne(String oneUrl, ProxyIpModel ip) throws Exception {
		JsoupRule js = new JsoupRule();
		js.setUrl(BASE_URL + oneUrl);
		js.setRequestMethod(1);
		Document doc = JsoupUtil.getDocumentByRuleProxy(js, ip);
		if (doc == null) {
			return new ProductModel();
		}
		return ParsingUtil.parseDoc(doc);
	}

	/**
	 * 
	 * @throws Exception
	 * @Date 2016年9月6日
	 * @desc
	 */
	public static KtreeModel getK3Web(String url) throws Exception {
		KtreeModel kt = new KtreeModel();
		JsoupRule js = new JsoupRule();
		js.setUrl(BASE_URL + url);
		js.setRequestMethod(1);
		Document doc = JsoupUtil.getDocumentByRule(js);
		if (doc == null) {
			return null;
		}
		Elements es = doc.select("div[class=menu]");
		if (es == null || es.size() <= 0) {
			return kt;
		}
		Elements uls = es.get(0).getElementsByTag("ul");
		if (uls == null || uls.size() <= 0) {
			return kt;
		}
		Elements lis = uls.get(0).getElementsByTag("li");
		if (lis == null || lis.size() <= 0) {
			return kt;
		}
		List<String> topMenu = new ArrayList<String>();
		for (Element e : lis) {
			topMenu.add(e.getElementsByTag("a").attr("href"));
		}
		kt.setTopMenu(topMenu);
		Elements content = doc.select("ul[class=content]");
		if (content == null || content.size() <= 0) {
			return null;
		}
		List<String> vs = new ArrayList<String>();
		for (int i = 0; i < content.size(); i++) {
			Elements cs = content.get(i).getElementsByTag("li");
			if (cs != null && cs.size() > 0) {
				for (Element e : cs) {
					String value = e.child(0).attr("href");
					vs.add(value);
				}
			}
		}
		kt.setPageContent(vs);
		Elements page = doc.select("div[class=page]");
		Elements pageList = page.select("ul[class=pageList]");
		Elements liList = pageList.get(0).getElementsByTag("li");
		// 当前页
		for (int i = 0; i < liList.size(); i++) {
			Element p = liList.get(i);
			if ("active".equalsIgnoreCase(p.attr("class"))) {
				kt.setCurrentPage(Integer.parseInt(p.child(0).text()));
				break;
			}
		}
		// pageTitle
		Elements p = liList.get(0).getElementsByTag("a");
		if (p != null && p.size() > 0) {
			String title = p.get(0).attr("href");
			kt.setPageTitle(StringUtil.getArrayIndex(title, slash, 0));
			kt.setPageSuffix(StringUtil.getArrayIndex(title, slash, 2));
		}

		// 总页数
		Elements num = page.select("span[class=turn]");
		String totalNum = num.get(0).ownText();
		kt.setTotalPage(Integer.parseInt(StringUtil.getNumbers(totalNum)));
		kt.setNextPage(kt.getCurrentPage() < 1 ? 1 : ((kt.getCurrentPage() + 1) >= kt
				.getTotalPage() ? kt.getTotalPage() : kt.getCurrentPage() + 1));

		return kt;
	}
}
