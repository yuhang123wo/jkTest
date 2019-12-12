package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
	
	public static Date addTime(Date date,int type,int time){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add (type, time);
		return cal.getTime();
	}
	public static void main(String[] args) throws ParseException {
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-12-02 17:52:54");
		Date s = addTime(date, Calendar.HOUR_OF_DAY, 48);
		Date dateg = new Date();
		System.out.println(s.getTime() - dateg.getTime());
	}

}
