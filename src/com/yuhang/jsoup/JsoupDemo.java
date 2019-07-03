package com.yuhang.jsoup;

import java.awt.print.Printable;
import java.util.List;

public class JsoupDemo {

	private static void print(int i, String name) {
		System.out.println(i + ":" + name);
	}

	public static void main(String[] args) throws Exception {

//		for (int i = 0; i < 5; i++) {
//			final int k = i + 1;
//			new Thread(new Runnable() {
//
//				@Override
//				public void run() {
//					print(k,Thread.currentThread().getName());
//
//				}
//			}).start();
//		}
		KtreeModel kt = KthreeUtil.getK3Web("");
		System.out.println(kt.toString());
//		List<ProxyIpModel> list = ProxIpUtil.parseOne("http://www.kuaidaili.com/free/inha/");
//		for (int i = 0; i < kt.getTotalPage(); i++) {
//			ProxyIpModel ip = list.get(i);
//			for (int n = 0; n < kt.getPageContent().size(); n++) {
//				try {
//					ProductModel model = KthreeUtil.parseOne(kt.getPageContent().get(n), ip);
//					System.out.println(model.toString());
//				} catch (Exception e) {
//					System.out.println(kt.getPageContent().get(n));
//				}
//			}
//		}

	}
}
