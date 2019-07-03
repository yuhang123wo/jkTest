package com.alicom.dysms.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yuhang.demo.util.SignUtil;

public class TestInt {

	public static void main(String[] args) throws Exception {

		ABC abc = new ABC();
		B b = new B();
		b.setA("abc");
		b.setX("ggg");
		b.setAz("az");
		b.setD("d");
		abc.setB(b);
		abc.setKesys("ksl");
		abc.setName("name");
		List<String> list = new ArrayList<String>();
		list.add("abc");
		abc.setVakyes(list);

		List<B> listB = new ArrayList<B>();
		listB.add(b);
		abc.setA(listB);
		System.out.println(JSON.toJSONString(abc));
		Map<String, Object> map = JSON.parseObject(JSON.toJSONString(abc), Map.class);

		SignUtil util = new SignUtil();
		System.out.println(util.sign(map, "UTF-8"));

	}
}
