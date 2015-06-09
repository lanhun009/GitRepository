<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>VodInfoManager/Css/bootstrap.css" />
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>VodInfoManager/Css/bootstrap-responsive.css" />
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>VodInfoManager/Css/style.css" />
<script type="text/javascript"
	src="<%=basePath%>VodInfoManager/Js/jquery.js"></script>
<script type="text/javascript"
	src="<%=basePath%>VodInfoManager/Js/jquery.sorted.js"></script>
<script type="text/javascript"
	src="<%=basePath%>VodInfoManager/Js/bootstrap.js"></script>
<script type="text/javascript"
	src="<%=basePath%>VodInfoManager/Js/ckform.js"></script>
<script type="text/javascript"
	src="<%=basePath%>VodInfoManager/Js/common.js"></script>

<script src="<%=basePath%>formValidator3.3/formValidator.js"
	type="text/javascript" charset="UTF-8"></script>
<script src="<%=basePath%>formValidator3.3/formValidatorRegex.js"
	type="text/javascript" charset="UTF-8"></script>
<link href="<%=basePath%>formValidator3.3/style/validator.css"
	type="text/css" rel="stylesheet" />
<script type="text/javascript"
	src="<%=basePath%>VodInfoManager/Js/myjs.js"></script>

<style type="text/css">
body {
	padding-bottom: 40px;
}

.sidebar-nav {
	padding: 9px 0;
}

@media ( max-width : 980px) { /* Enable use of floated navbar text */
	.navbar-text.pull-right {
		float: none;
		padding-left: 5px;
		padding-right: 5px;
	}
}
</style>
</head>
<form action="vodinfoadd!add.action" method="post" id="vodform">
	<table class="table table-bordered table-hover definewidth m10">
		<tr>
			<td width="10%" class="tableleft">录播教室名称</td>
			<td>
				<div style="float: left">
					<input type="text" name="vodInfo.classroom" id="classroom" />
				</div>
				<div id="classroomTip" style="width:250px;float: left"></div></td>
		</tr>
		<tr>
			<td class="tableleft">管理员姓名</td>
			<td><div style="float: left">
					<input type="text" name="vodInfo.manager" id="manager" />
				</div>
				<div id="managerTip" style="width:250px;float: left"></div></td>
		</tr>
		<tr>
			<td class="tableleft">管理员电话</td>
			<td><div style="float: left">
					<input type="text" name="vodInfo.telephone" id="phone" />
				</div>
				<div id="phoneTip" style="width:250px;float: left"></div></td>
		</tr>
		<tr>
			<td class="tableleft">录播主机IP</td>
			<td><div style="float: left">
					<input type="text" name="vodInfo.lbip" id="lbip" />
				</div>
				<div id="lbipTip" style="width:250px;float: left"></div></td>
		</tr>
		<tr>
			<td class="tableleft">授课主机IP</td>
			<td><div style="float: left">
					<input type="text" name="vodInfo.skip" id="skip" />
				</div>
				<div id="skipTip" style="width:250px;float: left"></div></td>
		</tr>
		<tr>
			<td class="tableleft">互动主机IP</td>
			<td><div style="float: left">
					<input type="text" name="vodInfo.hdip" id="hdip" />
				</div>
				<div id="hdipTip" style="width:250px;float: left"></div></td>
		</tr>
		<tr>
			<td class="tableleft">直播主机IP</td>
			<td><div style="float: left">
					<input type="text" name="vodInfo.zbip" id="zbip" />
				</div>
				<div id="zbipTip" style="width:250px;float: left"></div></td>
		</tr>
		<tr>
			<td class="tableleft"></td>
			<td>
				<button type="submit" class="btn btn-primary" type="button">保存</button>&nbsp;&nbsp;
				<button type="button" class="btn btn-success" name="backid"
					id="backid">返回列表</button></td>
		</tr>
	</table>
</form>
</body>
</html>
<script>
	$(function() {
		$('#backid').click(function() {
			window.location.href = "index.jsp";
		});

	});
</script>