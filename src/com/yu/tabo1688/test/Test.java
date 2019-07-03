package com.yu.tabo1688.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;

import com.alibaba.openapi.client.AlibabaClientFactory;
import com.alibaba.openapi.client.Request;
import com.alibaba.openapi.client.SyncAPIClient;
import com.alibaba.openapi.client.entity.AuthorizationToken;
import com.alibaba.openapi.client.entity.AuthorizationTokenStore;
import com.alibaba.openapi.client.entity.DefaultAuthorizationTokenStore;
import com.alibaba.openapi.client.exception.OceanException;
import com.alibaba.openapi.client.policy.ClientPolicy;
import com.alibaba.openapi.client.policy.RequestPolicy;
import com.alibaba.openapi.client.policy.RequestPolicy.HttpMethodPolicy;
import com.alibaba.openapi.client.serialize.DeSerializerListener;
import com.alibaba.openapi.client.serialize.SerializerListener;
import com.alibaba.openapi.example.param.apiexample.ExampleFamilyGetParam;
import com.alibaba.openapi.example.param.apiexample.ExampleFamilyGetResult;
import com.alibaba.openapi.example.param.apiexample.ExampleFamilyPostParam;
import com.alibaba.openapi.example.param.apiexample.ExampleFamilyPostResult;
import com.alibaba.openapi.sdk.cbusdk.ApiFacade;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaPhotobankAlbumAddResult;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaPhotobankPhotoAddParam;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaPhotobankPhotoAddResult;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaProductGetListParam;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaProductGetListResult;

public class Test {

	private String serverHost = "gw.open.1688.com";
	private int httpPort = 80;
	private int httpsPort = 443;
	private String appKey;
	private String secKey;

	private AuthorizationTokenStore authorizationTokenStore;

	private Map<Class<? extends SerializerListener>, SerializerListener> serializerListeners = new LinkedHashMap<Class<? extends SerializerListener>, SerializerListener>();
	private Map<Class<? extends DeSerializerListener>, DeSerializerListener> deSerializerListeners = new LinkedHashMap<Class<? extends DeSerializerListener>, DeSerializerListener>();

	public void register(SerializerListener serializerListener) {
		serializerListeners.put(serializerListener.getClass(), serializerListener);
	}

	public void register(DeSerializerListener deSerializerListener) {
		deSerializerListeners.put(deSerializerListener.getClass(), deSerializerListener);
	}

	public SyncAPIClient getAPIClient() {
		ClientPolicy clientPolicy = new ClientPolicy(serverHost);
		clientPolicy.setHttpPort(httpPort);
		clientPolicy.setHttpsPort(httpsPort);
		if (appKey != null) {
			clientPolicy.setAppKey(appKey);
		}
		if (secKey != null) {
			clientPolicy.setSigningKey(secKey);
		}
		if (authorizationTokenStore == null) {
			authorizationTokenStore = new DefaultAuthorizationTokenStore();
		}
		SyncAPIClient syncAPIClient = new AlibabaClientFactory().createAPIClient(clientPolicy,
				authorizationTokenStore);
		return syncAPIClient;
	}

	/**
	 * 设置开放平台网关地址
	 * 
	 * @param host
	 *            网关地址，默认为"gw.api.alibaba.com"
	 */
	public final void setServerHost(String host) {
		serverHost = host;
	}

	/**
	 * 设置http端口
	 * 
	 * @param port
	 *            http端口, 默认为80
	 */
	public final void setHttpPort(int port) {
		httpPort = port;
	}

	/**
	 * 设置https端口
	 * 
	 * @param port
	 *            https端口，默认为443
	 */
	public final void setHttpsPort(int port) {
		httpsPort = port;
	}

	/**
	 * 设置appKey
	 * 
	 * @param appKey
	 */
	public final void setAppKey(String newAppKey) {
		appKey = newAppKey;
	}

	/**
	 * 设置签名密钥
	 * 
	 * @param secKey
	 *            签名密钥
	 */
	public final void setSigningKey(String newSecKey) {
		secKey = newSecKey;
	}

	/**
	 * 根据授权码换取授权令牌
	 * 
	 * @param code
	 *            授权码
	 * @return 授权令牌
	 */
	public final AuthorizationToken getToken(String code) {
		try {
			return getAPIClient().getToken(code);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 刷新令牌
	 * 
	 * @param refreshToken
	 * 
	 * @return 授权令牌
	 */
	public final AuthorizationToken refreshToken(String refreshToken) {
		try {
			return getAPIClient().refreshToken(refreshToken);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private ApiExample _ApiExample = new ApiExample();

	public ApiExample getApiExample() {
		return this._ApiExample;
	}

	/**
	 * 命名空间：api.example
	 */
	public final class ApiExample {
		/**
		 * 获取一个SDK范例的一个家庭信息
		 *
		 * @param param
		 *
		 * @return
		 */
		@SuppressWarnings("unchecked")
		public final ExampleFamilyGetResult exampleFamilyGet(ExampleFamilyGetParam param) {
			RequestPolicy reqPolicy = new RequestPolicy();
			reqPolicy.setHttpMethod(HttpMethodPolicy.POST).setNeedAuthorization(false)
					.setRequestSendTimestamp(false).setUseHttps(false).setUseSignture(false)
					.setAccessPrivateApi(false);

			try {
				Request req = new Request("aliexpress.open.ningyong", "example.family.get", 1);
				// req = new Request("api.example", "example.family.get", 1);

				req.setRequestEntity(param);
				ExampleFamilyGetResult ret = getAPIClient().send(req, ExampleFamilyGetResult.class,
						reqPolicy, serializerListeners.values(), deSerializerListeners.values());
				return ret;
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

		/**
		 * 
		 *
		 * @param param
		 * @param accessToken
		 *            授权令牌
		 *
		 * @return
		 */
		@SuppressWarnings("unchecked")
		public final ExampleFamilyPostResult exampleFamilyPost(ExampleFamilyPostParam param,
				String accessToken) {
			RequestPolicy reqPolicy = new RequestPolicy();
			reqPolicy.setHttpMethod(HttpMethodPolicy.POST).setNeedAuthorization(true)
					.setRequestSendTimestamp(false).setUseHttps(false).setUseSignture(true)
					.setAccessPrivateApi(false);

			try {
				Request req = new Request("aliexpress.open.ningyong", "example.family.post", 1);

				req.setRequestEntity(param);
				req.setAccessToken(accessToken);
				ExampleFamilyPostResult ret = getAPIClient().send(req,
						ExampleFamilyPostResult.class, reqPolicy, serializerListeners.values(),
						deSerializerListeners.values());
				return ret;
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}
	
    public static byte[] xx(){
    	File file = new File("D:/123vb.jpg");
		byte[] bbb =  new byte[10240];
		try {
			InputStream a = new FileInputStream(file);
			a.read(bbb);
			return bbb;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) throws OceanException, FileNotFoundException, IOException {
		String token="95e1f079-8283-4da8-a5de-9b02374e3dc5";
		ApiFacade api = new ApiFacade();
		api.setAppKey(YbConfig.APP_KEY);
		api.setSigningKey(YbConfig.APP_SECRET_KEY);
		byte[] bye = IOUtils.toByteArray(new FileReader("D:/123vb.jpg"));
		AlibabaPhotobankPhotoAddParam photo = new AlibabaPhotobankPhotoAddParam();
		photo.setImageBytes(xx());
		photo.setAlbumID(176697876L);
		photo.setName("hehei");
		photo.setWebSite("1688");
		photo.setDescription("test");
		photo.setDrawTxt(false);
		AlibabaPhotobankPhotoAddResult result = api.alibabaPhotobankPhotoAdd(photo, token);
		System.out.println(result);
		System.out.println(result.getImage()==null);
		System.out.println(result.getImage().getAlbumID());
		
		
	}
}
