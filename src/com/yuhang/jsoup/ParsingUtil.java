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
 * @desc 解析
 */
public class ParsingUtil {

	private static final String mhaoZn = "：";// 中文冒号
	private static final String CNY = "¥";
	private static final String PROPSHOWBOX = "propshowbox";
	private static final String seller_r = "seller_r";
	private static final String slash = "\\/";
	private static final String img = "productmemo";

	/**
	 * 
	 * @Date 2016年9月6日
	 * @desc
	 */
	public static ProductModel parseDoc(Document doc) {
		ProductModel model = new ProductModel();
		// 取div c_r
		parseDivCr(doc, model);
		// propshowbox
		parseDivShowbox(doc, model);
		// seller_r
		parseDivSellerR(doc, model);
		//
		parseDivImg(doc, model);
		return model;
	}

	/**
	 * 
	 * @Date 2016年9月6日
	 * @desc 取div c_r中的信息
	 */
	public static void parseDivCr(Document doc, ProductModel model) {
		Elements el = doc.getElementsByAttributeValue("class", "c_r");
		for (Element e : el) {
			// 货号
			Elements name = e.getElementsByClass("name");
			if (name.size() > 0) {
				String artNo = name.get(0).text();
				model.setArtNo(StringUtil.getArrayIndex(artNo, mhaoZn, 1));
			}
			// 散拿价
			Elements price = e.getElementsByClass("price");
			if (price.size() > 0) {
				Elements money = price.get(0).getElementsByClass("money");
				model.setBulkPrice(StringUtil.replaceStr(money.text(), CNY));
			}
			// 总人气 ,下载
			Elements bot = e.getElementsByClass("bot");
			if (bot.size() > 0) {
				for (Element b : bot) {
					Elements m = b.getElementsByClass("notice");
					// 取总人气，下载次数，发布次数
					if (m != null && m.size() > 0) {
						model.setPopular(m.get(0).text());
						model.setDownCount(m.get(1).text());
						model.setPubCount(m.get(2).text());
					}
					// 获取类型
					Elements bold = b.getElementsByClass("bold");
					if (bold != null && bold.size() > 0) {
						if (b.text().contains("类型")) {
							model.setType(bold.get(0).text());
						}
						if (b.text().contains("货源")) {
							model.setSupply(bold.get(1).text());
						}
						if (b.text().contains("颜色")) {
							model.setColor(bold.get(0).text());
						}
					}

					Elements size = b.getElementsByClass("b_size");
					if (size != null && size.size() > 0) {
						model.setSize(StringUtil.getArrayIndex(size.text(), mhaoZn, 1));
					}
				}
			}
		}
	}

	/**
	 * 
	 * @Date 2016年9月6日
	 * @desc 解析propshowbox
	 */
	public static void parseDivShowbox(Document doc, ProductModel model) {
		Element el = doc.getElementById(PROPSHOWBOX);
		if (el == null) {
			return;
		}
		Elements n = el.getElementsByTag("span");
		if (n == null || n.size() <= 0) {
			return;
		}
		for (int i = 0; i < n.size(); i++) {
			Element node = n.get(i);
			if (node.ownText().contains("品牌")) {
				model.setTrademark(nodeValue(node));
			}
			if (node.ownText().contains("闭合方式")) {
				model.setClosedWay(nodeValue(node));
			}
			if (node.ownText().contains("图案")) {
				model.setPattern(nodeValue(node));
			}
			if (node.ownText().contains("风格")) {
				model.setStyle(nodeValue(node));
			}
			if (node.ownText().contains("后跟高")) {
				model.setHeelPiece(nodeValue(node));
			}
			if (node.ownText().contains("上市年份季节")) {
				model.setListed(nodeValue(node));
			}
			if (node.ownText().contains("鞋头款式")) {
				model.setToeCap(nodeValue(node));
			}
			if (node.ownText().contains("跟底款式")) {
				model.setSoleStyle(nodeValue(node));
			}
			if (node.ownText().contains("鞋底材质")) {
				model.setSoleMaterial(nodeValue(node));
			}
			if (node.ownText().contains("内里材质")) {
				model.setInsideMaterial(nodeValue(node));
			}
			if (node.ownText().contains("开口深度")) {
				model.setDepth(nodeValue(node));
			}
			if (node.ownText().contains("皮质特征")) {
				model.setFeatures(nodeValue(node));
			}
			if (node.ownText().contains("鞋制作工艺")) {
				model.setProcess(nodeValue(node));
			}
			if (node.ownText().contains("鞋垫材质")) {
				model.setInsolesMaterial(nodeValue(node));
			}
			if (node.ownText().contains("款式")) {
				model.setDesign(nodeValue(node));
			}
			if (node.ownText().contains("帮面材质")) {
				model.setUpperMaterial(nodeValue(node));
			}
			if (node.ownText().contains("流行元素")) {
				model.setPopElement(nodeValue(node));
			}
			if (node.ownText().contains("颜色")) {
				model.setColor(nodeValue(node));
			}
			if (node.ownText().contains("尺码")) {
				model.setSize(nodeValue(node));
			}

		}
	}

	/**
	 * 
	 * @Date 2016年9月6日
	 * @desc seller_r
	 */
	public static void parseDivSellerR(Document doc, ProductModel model) {
		Elements el = doc.getElementsByAttributeValue("class", seller_r);
		if (el == null || el.size() <= 0) {
			return;
		}
		Elements e = el.get(0).getElementsByTag("li");
		if (e == null || e.size() < 0) {
			return;
		}
		Element n = e.get(0);
		String tel = StringUtil.getArrayIndex(n.text(), slash, 0);
		String qq = StringUtil.getArrayIndex(n.text(), slash, 1);
		String address = e.get(1).text();
		if (StringUtil.isNotNull(tel)) {
			model.setContactNumber(StringUtil.getArrayIndex(tel, mhaoZn, 1));
		}
		if (StringUtil.isNotNull(qq)) {
			model.setContactQq(StringUtil.getArrayIndex(qq, mhaoZn, 1));
		}
		if (StringUtil.isNotNull(address)) {
			model.setTakeAddress(StringUtil.getArrayIndex(address, mhaoZn, 1));
		}

	}

	/**
	 * 
	 * @Date 2016年9月6日
	 * @desc 取图片信息
	 */
	public static void parseDivImg(Document doc, ProductModel model) {
		Element el = doc.getElementById(img);
		if (el == null) {
			return;
		}
		Elements es = el.getElementsByTag("img");
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < es.size(); i++) {
			String result = es.get(i).attr("data-url");
			list.add(result);
		}
		model.setImgs(list);
	}

	/**
	 * 
	 * @Date 2016年9月6日
	 * @desc
	 */
	private static String nodeValue(Element node) {
		StringBuilder result = new StringBuilder();
		Elements els = node.getElementsByTag("a");
		for (Element e : els) {
			result.append(e.ownText() + ",");
		}
		if (result.toString().endsWith(",")) {
			return result.substring(0, result.length() - 1);
		}
		return result.toString();
	}
}
