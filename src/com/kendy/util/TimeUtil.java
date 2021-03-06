package com.kendy.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具类
 * 
 * @author 林泽涛
 * @time 2018年1月1日 下午10:56:51
 */
public class TimeUtil {

	public static void main(String[] args) {
		System.out.println(getTime());

	}
	private static String DEFAULT_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	private static SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_TIME_FORMAT);
	
	public static String getTime() {
		String timeStr = "";
		timeStr = sdf.format(new Date());
		return timeStr;
	}
	
	/**
	 * 获取时间
	 * 注意这个方法是线程不安全的
	 * 若考虑线程安全，建议直接采用JDK8自带的时间API
	 * 
	 * @time 2017年11月30日
	 * @return
	 */
	public static String getDateTime() {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		String timeStr = "";
		timeStr = format.format(new Date());
		return timeStr;
	}
	
	/**
	 * 获取当前日期
	 * 
	 * @time 2018年2月11日
	 * @return
	 */
	public static String getDateString() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String timeStr = "";
		timeStr = format.format(new Date());
		return timeStr;
	}

}
