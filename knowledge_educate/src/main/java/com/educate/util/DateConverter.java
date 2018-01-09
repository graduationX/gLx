package com.educate.util;

import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date> {

	/*
	 * @Override public Date convert(String str) { return
	 * DateTools.stringToDate(str, DateTools.YYYY_MM_DD_HH); }
	 */

	public Date convert(String source) {
		if (null != source && "" != source && !"NaN".equals(source)) {
			return DateUtil.parse(source);
		} else {
			return null;
		}
	}

}
