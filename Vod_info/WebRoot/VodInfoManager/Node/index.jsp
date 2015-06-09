<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="<%=basePath %>VodInfoManager/Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath %>VodInfoManager/Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath %>VodInfoManager/Css/style.css" />
    <script type="text/javascript" src="<%=basePath %>VodInfoManager/Js/jquery.js"></script>
    <script type="text/javascript" src="<%=basePath %>VodInfoManager/Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="<%=basePath %>VodInfoManager/Js/bootstrap.js"></script>
    <script type="text/javascript" src="<%=basePath %>VodInfoManager/Js/ckform.js"></script>
    <script type="text/javascript" src="<%=basePath %>VodInfoManager/Js/common.js"></script>
<Script type="text/javascript">
    $(function () {
        
		$('#addnew').click(function(){

				window.location.href="<%=basePath %>VodInfoManager/Node/add.jsp";
		 });


    });

	function del(id)
	{
		
		
		if(confirm("确定要删除吗？"))
		{
		
			var url = "vodinfodel!del.action?vodInfo.id="+id;
			
			window.location.href=url;		
		
		}
	
	
	
	
	}
</Script>
    <style type="text/css">
        body {
            padding-bottom: 40px;
        }
        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }


    </style>
</head>
<body>
<form class="form-inline definewidth m20" action="vodinfolistbyname!getListByName.action" method="post">  
    录播教室名称：
    <input type="text" name="vodInfo.classroom" id="rolename"class="abc input-default" placeholder="" value="">&nbsp;&nbsp;  
    <button type="submit" class="btn btn-primary">查询</button>&nbsp;&nbsp; <button type="button" class="btn btn-success" id="addnew">新增</button>
</form>
<table class="table table-bordered table-hover definewidth m10" >
    <thead>
    <tr>
        <th>录播教室名称</th>
        <th>管理员姓名</th>
        <th>管理员电话</th>
        <th>录播主机IP</th>
        <th>授课主机IP</th>
        <th>互动主机IP</th>
        <th>直播主机IP</th>
        <th>操作</th>

    </tr>
    </thead>
	     <s:iterator value="#session.infolist" id="info">
                   
	     
	     <tr>
            <td><s:property value="#info.getClassroom()" /></td>
            <td><s:property value="#info.getManager()" /></td>
            <td><s:property value="#info.getTelephone()" /></td>
            <td><s:property value="#info.getLbip()" /></td>
            <td><s:property value="#info.getSkip()" /></td>
            <td><s:property value="#info.getHdip()" /></td>
            <td><s:property value="#info.getZbip()" /></td>
            
            <td>
                  <a href="<s:url action="vodinfoload!load.action"><s:param name="vodInfo.id" value="#info.getId()" /></s:url>">编辑</a>
                 &nbsp; &nbsp;<a href="#"  id="del" onclick="javascript:del('<s:property value="#info.getId()" />');">删除</a>
                  
            </td>
        </tr>
        
       </s:iterator>
        </table>
      <%--   <%@include file="/Page/page.jsp" %> --%>
        <jsp:include page="/Page/page.jsp">
        <jsp:param value="list1!getListBypg.action" name="url" />
        </jsp:include>
          
</body>
</html>
