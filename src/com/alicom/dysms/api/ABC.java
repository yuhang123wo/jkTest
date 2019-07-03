package com.alicom.dysms.api;

import java.util.List;

public class ABC {

	private String name;
	private String kesys;

	private List<String> vakyes;

	private B b;

	private List<B> a;

	public List<B> getA() {
		return a;
	}

	public void setA(List<B> a) {
		this.a = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKesys() {
		return kesys;
	}

	public void setKesys(String kesys) {
		this.kesys = kesys;
	}

	public List<String> getVakyes() {
		return vakyes;
	}

	public void setVakyes(List<String> vakyes) {
		this.vakyes = vakyes;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

}
