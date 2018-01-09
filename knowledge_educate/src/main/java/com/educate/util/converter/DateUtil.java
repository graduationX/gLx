package com.educate.util.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	/**
	 * 时间格式
	 */
	public static final String PATTERN_TIME = "yyyy-MM-dd HH:mm:ss";
	/**
	 * 日期格式
	 */
	public static final String PATTERN_DATE = "yyyy-MM-dd";

	static SimpleDateFormat timeFormat = new SimpleDateFormat(PATTERN_TIME);
	static SimpleDateFormat dateFormat = new SimpleDateFormat(PATTERN_DATE);

	public static Date parse(String content) {
		if (null != content && content.trim().length() > 0) {
			try {
				return timeFormat.parse(content);
			} catch (Exception e) {
				try {
					return dateFormat.parse(content);
				} catch (Exception e1) {
					return null;
				}
			}
		}
		return null;
	}

}
