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
		String regEx = "[*` ~!@%^)+=|{}':;',\\[\\].<>/~��@��%������������+|{}������������������������]";

		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(Character.toString(strArry[i]));
		String resp = "|"+Character.toString(strArry[i])+"|";
		str = m.replaceAll(resp).trim();
		req = req + str;
	}
	//System.out.println("req"+req);

	//#$&*([?*` ~!@%^)+=|{}':;',\\[\\].<>/~��@��%������������+|{}������������������������
	
	//System.out.println(req);
	
	//req= req+"\\"+"\\";
	
	
	req = "�ո�|"+req;
	req = req+"|�ո�";
	String regEx = "[ |]+";
	Pattern p = Pattern.compile(regEx);
	Matcher m = p.matcher(req);
	req  = m.replaceAll("|").trim();
	
	//System.out.println("���к�"+req);
	
	req = req.replaceAll("\\Q(\\E", "\\\\(");
	req = req.replaceAll("\\Q(\\E", "\\\\(");
	//��������ת��Ϊ����ʶ��ĵ�����
	req = req.replaceAll("\\Q'\\E", "''");
	//��˫����ת��Ϊ����ʶ���˫����
	//req = req.replaceAll("\"", "\"");
	//��*ת��Ϊ\\*
	req = req.replaceAll("\\*", "\\\\*");
	req = req.replaceAll("\\*", "\\\\*");
	//��?ת��Ϊ\\?
	req = req.replaceAll("\\?", "\\\\?");
	req = req.replaceAll("\\?", "\\\\?");
	//��#ת��Ϊ\\?
	req = req.replaceAll("\\#", "\\\\#");
	req = req.replaceAll("\\#", "\\\\#");
	//��$ת��Ϊ\\$
	req = req.replaceAll("\\$", "%24");
	//��&ת��Ϊ\\&
	req = req.replaceAll("\\&", "\\\\&");
	req = req.replaceAll("\\&", "\\\\&");
	//��[ת��Ϊ\\[
	req = req.replaceAll("\\[", "\\\\[");
	req = req.replaceAll("\\[", "\\\\[");
	//System.out.println("�滻��"+req);
	
	return req;

	}
	
	
	
	
	
	
	
	
	
/*	public static void main(String[] args) {
		String str = "@@@";
		String str2 = StringFilter(str);
		System.out.println(str2);
	}

	public static String StringFilter(String str) throws PatternSyntaxException {
		// ֻ������ĸ������
		// String regEx = "[^a-zA-Z0-9]";
		// ��������������ַ�
		String regEx = "[` ~!@#$%^&*()+=|{}':;',\\[\\].<>/?~��@#��%����&*��������+|{}������������������������]+";
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
