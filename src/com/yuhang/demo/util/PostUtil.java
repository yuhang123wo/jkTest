package com.yuhang.demo.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class PostUtil {
	
	public static String httpPostWz(String url, List<NameValuePair> formparams) throws IOException {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost post = new HttpPost(url);
		UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
		post.setEntity(uefEntity);
		String response = client.execute(post, new ResponseHandler<String>() {
			@Override
			public String handleResponse(HttpResponse response) throws IOException {
				int status = response.getStatusLine().getStatusCode();
				if (status >= HttpStatus.SC_OK && status < HttpStatus.SC_MULTIPLE_CHOICES) {
					HttpEntity entity = response.getEntity();
					return entity != null ? EntityUtils.toString(entity, "utf-8") : null;
				} else {
					System.out.println(response);
				}
				System.out.println(status);
				return null;
			}
		});
		return response;
	}
	
	/**
	 * 
	 * @Date 2016年7月27日
	 * @desc post请求
	 */
	public static String httpPost(String url, List<NameValuePair> formparams) throws IOException {
//		formparams.add(new BasicNameValuePair("version", "2.0"));
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost post = new HttpPost(url);
		UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
		post.setEntity(uefEntity);
		String response = client.execute(post, new ResponseHandler<String>() {
			@Override
			public String handleResponse(HttpResponse response) throws IOException {
				int status = response.getStatusLine().getStatusCode();
				if (status >= HttpStatus.SC_OK && status < HttpStatus.SC_MULTIPLE_CHOICES) {
					HttpEntity entity = response.getEntity();
					return entity != null ? EntityUtils.toString(entity, "utf-8") : null;
				} else {
					System.out.println(response);
				}
				System.out.println(status);
				return null;
			}
		});
		return response;

	}
	public static String httpApp1b(String url, Map<String,Object> params) throws Exception {
		SignUtil s = new SignUtil();
		params.put("sign", s.sign(params, "UTF-8"));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		Iterator<Entry<String, Object>> iter = params.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
			formparams
					.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
		}
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost post = new HttpPost(url);
		UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
		post.setEntity(uefEntity);
		String response = client.execute(post, new ResponseHandler<String>() {
			@Override
			public String handleResponse(HttpResponse response) throws IOException {
				int status = response.getStatusLine().getStatusCode();
				if (status >= HttpStatus.SC_OK && status < HttpStatus.SC_MULTIPLE_CHOICES) {
					HttpEntity entity = response.getEntity();
					return entity != null ? EntityUtils.toString(entity, "utf-8") : null;
				} else {
					System.out.println(response);
				}
				System.out.println(status);
				return null;
			}
		});
		return response;

	}
	
	
	
	public static String httpPostBack(String url, Map<String,Object> params) throws Exception {
		SignUtil s = new SignUtil();
		params.put("sign", s.signBack(params, "UTF-8"));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		Iterator<Entry<String, Object>> iter = params.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
			formparams
					.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
		}
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost post = new HttpPost(url);
		UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
		post.setEntity(uefEntity);
		String response = client.execute(post, new ResponseHandler<String>() {
			@Override
			public String handleResponse(HttpResponse response) throws IOException {
				int status = response.getStatusLine().getStatusCode();
				if (status >= HttpStatus.SC_OK && status < HttpStatus.SC_MULTIPLE_CHOICES) {
					HttpEntity entity = response.getEntity();
					return entity != null ? EntityUtils.toString(entity, "utf-8") : null;
				} else {
					System.out.println(response);
				}
				System.out.println(status);
				return null;
			}
		});
		return response;

	}
	
	
	
	public static String httpPostPrd(String url, Map<String,Object> params) throws Exception {
		SignUtil s = new SignUtil();
		params.put("sign", s.sign(params, "UTF-8"));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		Iterator<Entry<String, Object>> iter = params.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
			formparams
					.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
		}
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost post = new HttpPost(url);
		UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
		post.setEntity(uefEntity);
		String response = client.execute(post, new ResponseHandler<String>() {
			@Override
			public String handleResponse(HttpResponse response) throws IOException {
				int status = response.getStatusLine().getStatusCode();
				if (status >= HttpStatus.SC_OK && status < HttpStatus.SC_MULTIPLE_CHOICES) {
					HttpEntity entity = response.getEntity();
					return entity != null ? EntityUtils.toString(entity, "utf-8") : null;
				} else {
					System.out.println(response);
				}
				System.out.println(status);
				return null;
			}
		});
		return response;

	}
	
	
	public static String httpPostBody(String url, String json) throws IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		httpPost.addHeader("Content-Type", "application/json");
		httpPost.setEntity(new StringEntity(json, "UTF-8"));
		CloseableHttpResponse response = httpClient.execute(httpPost);
		HttpEntity entity = response.getEntity();
		String responseContent = EntityUtils.toString(entity, "UTF-8");
		response.close();
		httpClient.close();
		return responseContent;}
	
	
	
	
	
	public static String httpPost1B(String url, Map<String,Object> params) throws Exception {
		SignUtil s = new SignUtil();
		params.put("sign", s.signApp1B(params, "UTF-8"));
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		Iterator<Entry<String, Object>> iter = params.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
			formparams
					.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
		}
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost post = new HttpPost(url);
		UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
		post.setEntity(uefEntity);
		String response = client.execute(post, new ResponseHandler<String>() {
			@Override
			public String handleResponse(HttpResponse response) throws IOException {
				int status = response.getStatusLine().getStatusCode();
				if (status >= HttpStatus.SC_OK && status < HttpStatus.SC_MULTIPLE_CHOICES) {
					HttpEntity entity = response.getEntity();
					return entity != null ? EntityUtils.toString(entity, "utf-8") : null;
				} else {
					System.out.println(response);
				}
				System.out.println(status);
				return null;
			}
		});
		return response;

	}
}




