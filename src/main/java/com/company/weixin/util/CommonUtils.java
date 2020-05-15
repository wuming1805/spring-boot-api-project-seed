package com.company.weixin.util;

import java.util.ArrayList;
import java.util.List;

public class CommonUtils {
	/**
	 * 把有数字组成的字符串转换为集合
	 * 
	 * @param s
	 * @return
	 */
	public static List<Long> toLongList(String s) {
		if (s.contains(",")) {
			List<Long> sList = new ArrayList<Long>();
			String[] sArry = s.split(",");
			for (int i = 0; i < sArry.length; i++) {
				sList.add(Long.parseLong(sArry[i]));
			}
			return sList;
		}
		return null;
	}

	/**
	 * 把有数字组成的字符串转换为集合
	 * 
	 * @param s
	 * @return
	 */
	public static List<Integer> toIntegerList(String s) {
		if (s.contains(",")) {
			List<Integer> sList = new ArrayList<Integer>();
			String[] sArry = s.split(",");
			for (int i = 0; i < sArry.length; i++) {
				sList.add(Integer.parseInt(sArry[i]));
			}
			return sList;
		}
		return null;
	}

	/**
	 * 判断是否是数字类型
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isInteger(String str) {
		boolean flag = true;
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static boolean isNull(String str) {
		return str == null || str.trim().length() == 0;
	}

	public static boolean isNull(Integer numb) {
		if (null != numb && numb != 0) {
			return false;
		}
		return true;
	}

	public static boolean isNull(Long numb) {
		if (null != numb && numb != 0) {
			return false;
		}
		return true;
	}

	public static boolean isNull(Double numb) {
		if (null != numb && numb != 0) {
			return false;
		}
		return true;
	}

	public static boolean isNull(Byte numb) {
		if (null != numb) {
			return false;
		}
		return true;
	}

	public static boolean isNull(Object numb) {
		if (null != numb) {
			return false;
		}
		return true;
	}
}
