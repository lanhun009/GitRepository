<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
<head>
    <title>后台管理系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="<%=basePath %>VodInfoManager/assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
    <link href="<%=basePath %>VodInfoManager/assets/css/bui-min.css" rel="stylesheet" type="text/css" />
    <link href="<%=basePath %>VodInfoManager/assets/css/main-min.css" rel="stylesheet" type="text/css" />
</head>
<body>

<div class="header">

    <div class="dl-title">
        <!--<img src="/chinapost/Public/assets/img/top.png">-->
    </div>

    <div class="dl-log">欢迎您，<span class="dl-log-user"><%=session.getAttribute("username")%></span><a href="logout!logout.action" title="退出系统" class="dl-log-quit">[退出]</a>
    </div>
</div>
<div class="content">
    <div class="dl-main-nav">
        <div class="dl-inform"><div class="dl-inform-title"><s class="dl-inform-icon dl-up"></s></div></div>
        <ul id="J_Nav"  class="nav-list ks-clear">
            <li class="nav-item dl-selected"><div class="nav-item-inner nav-home">系统管理</div></li>		

        </ul>
    </div>
    <ul id="J_NavContent" class="dl-tab-conten">

    </ul>
</div>
<script type="text/javascript" src="<%=basePath %>VodInfoManager/assets/js/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="<%=basePath %>VodInfoManager/assets/js/bui-min.js"></script>
<script type="text/javascript" src="<%=basePath %>VodInfoManager/assets/js/common/main-min.js"></script>
<script type="text/javascript" src="<%=basePath %>VodInfoManager/assets/js/config-min.js"></script>
<script>
    BUI.use('common/main',function(){
        var config = [{id:'1',menu:[{text:'系统管理',items:[{id:'12',text:'录播教室信息管理',href:'<%=basePath %>VodInfoManager/Node/index.jsp'}]}]}];
        new PageUtil.MainPage({
            modulesConfig : config
        });
    });
</script>

</body>
</html>