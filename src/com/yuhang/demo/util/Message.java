package com.yuhang.demo.util;

public class Message implements java.io.Serializable {
	private static final long serialVersionUID = -361584361463787869L;
	public static final String SUCCESS = "0";// 成功
	public static final String FAIL="-1";
	private String code;// 返回标志(0:成功)
	private String msg;// 返回消息说明;
	private Object data;// 返回数据,可再次Map封装多个对象
	public Message() {
	}
	public Message(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	
	public Message Success(Object data){
		this.code = SUCCESS;
		this.data = data;
		return this;
	}
	
	public Message Failed(String msg){
		this.code = FAIL;
		this.msg = msg;
		return this;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
