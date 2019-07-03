package com.yuhang.demo;

import java.io.IOException;

import com.yuhang.demo.util.AutoTest;

public class TestYb {

	// private static String api="http://192.168.1.11:8085/";
	// private static String api="http://121.40.182.83:16610/";
	private static String api = "http://127.0.0.1:6666/web-service";

	public static void main(String[] args) throws IOException {
//		String result = AutoTest.auth_1688(api);
//		String result = AutoTest.token_1688(api);
//		String result = AutoTest.category_1688(api);
//		String result = AutoTest.categoryAttribute_1688(api);
//		String result = AutoTest.getAlbum_1688(api);
//		String result = AutoTest.addAlbum_1688(api);
//		String result = AutoTest.photoList_1688(api);
//		String result = AutoTest.photoAdd_1688(api);
//		String result = AutoTest.addProduct_1688(api);
//		String result = AutoTest.productList_1688(api);
		
		String result = AutoTest.productGet_1688(api);
		
		System.out.println(result);
	}
}
