package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class SyniTest {

	public Map<String, Object> method() {

		Map<String, Object> map = new HashMap<String, Object>();
		List<String> ids = new ArrayList<String>();
		map.put("ids", ids);

		for (int i = 0; i < 10; i++) {
			ids.add(i + "x");
		}

		return map;
	}

	public static void main(String[] args) {
		SyniTest t = new SyniTest();

		System.out.println(t.method());
	}

}
