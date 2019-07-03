package com.yuhang.jsoup;

public class JsoupRule {
	private String url;// 请求的URL

	private String[] paramNames;// 请求的参数名称

	private String[] paramValues;// 请求的参数值

	private int requestMethod;// 请求的方式

	private int resolveType;// 解析类别

	private int countPage;// 总共所需的页码数

	public JsoupRule() {
		super();
	}

	public JsoupRule(String url, String[] paramNames, String[] paramValues, int requestMethod,
			int resolveType, int countPage) {
		super();
		this.url = url;
		this.paramNames = paramNames;
		this.paramValues = paramValues;
		this.requestMethod = requestMethod;
		this.resolveType = resolveType;
		this.countPage = countPage;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String[] getParamNames() {
		return paramNames;
	}

	public void setParamNames(String[] paramNames) {
		this.paramNames = paramNames;
	}

	public String[] getParamValues() {
		return paramValues;
	}

	public void setParamValues(String[] paramValues) {
		this.paramValues = paramValues;
	}

	public int getRequestMethod() {
		return requestMethod;
	}

	public void setRequestMethod(int requestMethod) {
		this.requestMethod = requestMethod;
	}

	public int getResolveType() {
		return resolveType;
	}

	public void setResolveType(int resolveType) {
		this.resolveType = resolveType;
	}

	public int getCountPage() {
		return countPage;
	}

	public void setCountPage(int countPage) {
		this.countPage = countPage;
	}

}
