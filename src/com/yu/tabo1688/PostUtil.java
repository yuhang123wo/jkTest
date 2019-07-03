package com.yu.tabo1688;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.nodes.Entities;

public class PostUtil {
	/**
	 * 
	 * @Date 2016年7月27日
	 * @desc post请求
	 */
	public static String httpPost(String url, List<NameValuePair> formparams) throws IOException {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost post = new HttpPost(url);
		UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
		post.setEntity(uefEntity);
		String response = client.execute(post, new ResponseHandler<String>() {
			@Override
			public String handleResponse(HttpResponse response) throws IOException {
				HttpEntity entity = response.getEntity();
				return entity != null ? EntityUtils.toString(entity, "utf-8") : null;
			}
		});
		return response;

	}

	/**
	 * 
	 * @Date 2016年10月19日
	 * @desc
	 */
	public static String httpPost2(String url, byte[] fileBody, List<NameValuePair> formparams)
			throws IOException {
		CloseableHttpClient httpClient = null;
		httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		// 把文件转换成流对象FileBody
		MultipartEntityBuilder reqEntity = MultipartEntityBuilder.create();
		for (int i = 0; i < formparams.size(); i++) {
			reqEntity.addTextBody(formparams.get(i).getName(), formparams.get(i).getValue());
		}
		if (fileBody != null) {
			System.out.println(fileBody);
			reqEntity.addBinaryBody("imageBytes", fileBody);
		}
		httpPost.setEntity(reqEntity.build());
		String result = httpClient.execute(httpPost, new ResponseHandler<String>() {
			@Override
			public String handleResponse(HttpResponse response) throws IOException {
				HttpEntity entity = response.getEntity();
				return entity != null ? EntityUtils.toString(entity, "utf-8") : null;
			}
		});
		return result;
	}
}
