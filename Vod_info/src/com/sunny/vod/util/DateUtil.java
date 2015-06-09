package com.sunny.vod.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static String getCurrentDate() {

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String temp = sdf.format(d);
		return temp;

	}

	public static void main(String[] args) {

		new DateUtil();
		double d = DateUtil.jisuan("2014-04-22 08:00:00",
				"2014-04-22 08:30:00");
		System.out.println(d);
//
//		String dw = new DateUtil().jisuan2(new SimpleDateFormat(
//				"yyyy-MM-dd HH:mm:ss").format(new Date()),
//				"2014-04-22 08:00:00");
//		System.out.println(dw);
	}
	//相差20分钟
	public static double jisuan(String nowTime, String startTime) {
		double result = 0;

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date start = sdf.parse(nowTime);
			Date end = sdf.parse(startTime);
			long cha = end.getTime() - start.getTime();
			result = cha * 1.0 / (1000 * 60 * 60);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public static String jisuan2(String nowTime, String startTime) {
		String result = null;
		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date now = df.parse(nowTime);
			Date date = df.parse(startTime);
			long l = now.getTime() - date.getTime();
			long day = l / (24 * 60 * 60 * 1000);
			long hour = (l / (60 * 60 * 1000) - day * 24);
			long min = ((l / (60 * 1000)) - day * 24 * 60 - hour * 60);
			long s = (l / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
			String str = "" + day + "天" + hour + "小时" + min + "分" + s + "秒";
			//System.out.println("" + day + "天" + hour + "小时" + min + "分" + s + "秒");
			return str;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
