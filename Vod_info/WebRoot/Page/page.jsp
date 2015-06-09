<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body>

  <div align="right" style="margin-right: 35px">

 <%String url=request.getParameter("url");
 
     request.setAttribute("url", url);
  %>
 

     
        共<s:property value="#session.page.intRowCount"/>记录&nbsp;&nbsp;
        共<s:property value="#session.page.intPageCount"/>页&nbsp;&nbsp;
        第<s:property value="#session.page.pageNow"/>页&nbsp;&nbsp;
         <s:url id="url_pre" value="%{#request.url}" >   
        	 <s:param name="page.pageNow" value="#session.page.pageNow-1"></s:param>  
        	
    	 </s:url>   
	  
	     <s:url id="url_next" value="%{#request.url}">   
	         <s:param name="page.pageNow" value="#session.page.pageNow+1"></s:param>   
	     </s:url> 
	       
	     <s:url id="url_first" value="%{#request.url}">   
	         <s:param name="page.pageNow" value="1"></s:param>   
	     </s:url>   
	     
	     <s:url id="url_end" value="%{#request.url}">   
	         <s:param name="page.pageNow" value="#session.page.intPageCount"></s:param>   
	     </s:url>   
   
     <s:if test="#session.page.pageNow!=1">
    <s:a href="%{url_first}">最前一页</s:a>
     <s:a href="%{url_pre}">上一页</s:a>
     </s:if>
    
    
      
     <s:if test="#session.page.pageNow!=#session.page.intPageCount">
      <s:a href="%{url_next}">下一页</s:a>
     <s:a href="%{url_end}">最后一页</s:a>
       </s:if>
      
      
       </div>         
</body>
</html>
