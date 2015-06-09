package com.sunny.vod.util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
public class StringUtil {
	
	public static void main(String[] args) {
		String str = "@@@('";
		String str2 = StringFilter(str);
		//System.out.println(str2);
	}

	public static String StringFilter(String str) throws PatternSyntaxException {
		//System.out.println("str"+str);
		str = str.replaceAll("\"", "\"");
	char[] strArry = str.toCharArray();
	String req = "";
	for(int i=0;i<strArry.length;i++){
		String regEx = "[*` ~!@%^)+=|{}':;',\\[\\].<>/~！@￥%……（）——+|{}【】‘；：”“’。，、？]";

		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(Character.toString(strArry[i]));
		String resp = "|"+Character.toString(strArry[i])+"|";
		str = m.replaceAll(resp).trim();
		req = req + str;
	}
	//System.out.println("req"+req);

	//#$&*([?*` ~!@%^)+=|{}':;',\\[\\].<>/~！@￥%……（）——+|{}【】‘；：”“’。，、？
	
	//System.out.println(req);
	
	//req= req+"\\"+"\\";
	
	
	req = "空格|"+req;
	req = req+"|空格";
	String regEx = "[ |]+";
	Pattern p = Pattern.compile(regEx);
	Matcher m = p.matcher(req);
	req  = m.replaceAll("|").trim();
	
	//System.out.println("运行后"+req);
	
	req = req.replaceAll("\\Q(\\E", "\\\\(");
	req = req.replaceAll("\\Q(\\E", "\\\\(");
	//将单引号转换为可以识别的单引号
	req = req.replaceAll("\\Q'\\E", "''");
	//将双引号转换为可以识别的双引号
	//req = req.replaceAll("\"", "\"");
	//将*转换为\\*
	req = req.replaceAll("\\*", "\\\\*");
	req = req.replaceAll("\\*", "\\\\*");
	//将?转换为\\?
	req = req.replaceAll("\\?", "\\\\?");
	req = req.replaceAll("\\?", "\\\\?");
	//将#转换为\\?
	req = req.replaceAll("\\#", "\\\\#");
	req = req.replaceAll("\\#", "\\\\#");
	//将$转换为\\$
	req = req.replaceAll("\\$", "%24");
	//将&转换为\\&
	req = req.replaceAll("\\&", "\\\\&");
	req = req.replaceAll("\\&", "\\\\&");
	//将[转换为\\[
	req = req.replaceAll("\\[", "\\\\[");
	req = req.replaceAll("\\[", "\\\\[");
	//System.out.println("替换后"+req);
	
	return req;

	}
	
	
	
	
	
	
	
	
	
/*	public static void main(String[] args) {
		String str = "@@@";
		String str2 = StringFilter(str);
		System.out.println(str2);
	}

	public static String StringFilter(String str) throws PatternSyntaxException {
		// 只允许字母和数字
		// String regEx = "[^a-zA-Z0-9]";
		// 清除掉所有特殊字符
		String regEx = "[` ~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]+";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(str);
		str  = m.replaceAll("|").trim();
		str = "/|"+str;
		
		
			str = str+"|/";
			regEx = "[|]+";	
			p = Pattern.compile(regEx);
			m = p.matcher(str);
			str  = m.replaceAll("|").trim();
		return str;
	}*/
}
