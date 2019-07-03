package com.yuhang.jsoup;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

	/**
	 * 
	 * @Date 2016年9月6日
	 * @desc 是否为空
	 */
	public static boolean isNull(String str) {
		if (str == null || "".equals(str.trim()))
			return true;
		return false;
	}

	/**
	 * 
	 * @Date 2016年9月6日
	 * @desc
	 */
	public static boolean isNotNull(String str) {
		return !isNull(str);
	}

	/**
	 * 
	 * @Date 2016年9月6日
	 * @desc 拆分字符串并取第几个
	 */
	public static String getArrayIndex(String str, String tag, int index) {
		if (isNull(str)) {
			return "";
		}
		String[] strs = str.split(tag);
		if (index < 0 || strs.length - 1 < index)
			return str.trim();
		String result = strs[index];
		if (isNotNull(str)) {
			return result.trim();
		}
		return "";
	}

	/**
	 * 
	 * @Date 2016年9月6日
	 * @desc
	 */
	public static String replaceStr(String str, String rep) {
		if (isNull(str)) {
			return "";
		}
		String result = str.replaceAll(rep, "");
		if (isNotNull(result)) {
			return result.trim();
		}
		return "";
	}

	public static String getNumbers(String content) {
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(content);
		while (matcher.find()) {
			return matcher.group(0);
		}
		return "";
	}
}
