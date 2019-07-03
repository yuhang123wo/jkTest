package com.yuhang.jsoup;

public class ProxyIpModel {

	private String ip;
	private int port;

	public ProxyIpModel() {
		super();
	}

	public ProxyIpModel(String ip, int port) {
		super();
		this.ip = ip;
		this.port = port;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "ProxyIpModel [ip=" + ip + ", port=" + port + "]";
	}

}
