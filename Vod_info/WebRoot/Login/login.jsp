﻿<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>录播教室信息系统</title>
<style type="text/css">
<!--
*{overflow:hidden; font-size:9pt;}
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-image: url(<%=basePath%>Login/images/bg.gif);
	background-repeat: repeat-x;
}
-->
</style>
<script type="text/javascript" src="<%=basePath%>Login/js/jquery-1.7.2.min.js"></script></head>
<script type="text/javascript">
function submit(){
	$("#form1").submit();
}

</script>

<body>
<form id="form1" action="login.action" method="post">
<table width="100%"  height="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="561" style="background:url(<%=basePath%>Login/images/lbg.gif)"><table width="940" border="0" align="center" cellpadding="0" cellspacing="0">
          <tr>
            <td height="238" style="background:url(<%=basePath%>Login/images/login01.jpg)">&nbsp;</td>
          </tr>
          <tr>
            <td height="190"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="208" height="190" style="background:url(<%=basePath%>Login/images/login02.jpg)">&nbsp;</td>
                <td width="518" style="background:url(<%=basePath%>Login/images/login03.jpg)"><table width="320" border="0" align="center" cellpadding="0" cellspacing="0">
                  <tr>
                    <td width="40" height="50"><img src="<%=basePath%>Login/images/user.gif" width="30" height="30"></td>
                    <td width="38" height="50">用户</td>
                    <td width="242" height="50"><input type="text" name="user.userName" id="user.name" style="width:164px; height:32px; line-height:34px; background:url(<%=basePath%>Login/images/inputbg.gif) repeat-x; border:solid 1px #d1d1d1; font-size:9pt; font-family:Verdana, Geneva, sans-serif;"></td>
                  </tr>
                  <tr>
                    <td height="50"><img src="<%=basePath%>Login/images/password.gif" width="28" height="32"></td>
                    <td height="50">密码</td>
                    <td height="50"><input type="password" name="user.password" id="user.password" style="width:164px; height:32px; line-height:34px; background:url(<%=basePath%>Login/images/inputbg.gif) repeat-x; border:solid 1px #d1d1d1; font-size:9pt; "></td>
                  </tr>
                  <tr>
                    <td height="40">&nbsp;</td>
                    <td height="40">&nbsp;</td>
                    <td height="60"><img src="<%=basePath%>Login/images/login.gif" width="95" height="34" onclick="submit();">&nbsp;&nbsp;
                    <font color=red><s:fielderror fieldName="message"/></font>
                    
                    </td>
                  </tr>
                </table></td>
                <td width="214" style="background:url(<%=basePath%>Login/images/login04.jpg)" >&nbsp;</td>
              </tr>
            </table></td>
          </tr>
          <tr>
            <td height="133" style="background:url(<%=basePath%>Login/images/login05.jpg)">&nbsp;</td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
</table>
<div style="text-align:center;">

</div>
</form>
</body>
</html>
