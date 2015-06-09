$(document).ready(function(){ 
	 $.formValidator.initConfig(
				{
				formid:"vodform",
				onsuccess:function(){document.forms['vodform'].submit();return false;},
				autotip:true,
				//onerror:function(msg){alert(msg);}
				}
			); 
	 
	 $("#classroom").formValidator({onshow:"请输入录播教室名",onfocus:"录播教室名不能为空",oncorrect:"录播教室名合法"})
	.inputValidator({min:1,empty:{leftempty:false,rightempty:false,emptyerror:"录播教室名两边不能有空符号"},onerror:"录播教室名不能为空,请确认"});

	
	 
	$("#manager").formValidator({onshow:"请输入姓名",onfocus:"姓名不能为空",oncorrect:"姓名合法"})
	.inputValidator({min:1,empty:{leftempty:false,rightempty:false,emptyerror:"姓名两边不能有空符号"},onerror:"姓名不能为空,请确认"});
	 
	$("#email").formValidator({onshow:"请输入邮箱",onfocus:"请注意你输入的邮箱格式",oncorrect:"邮箱格式正确"})
	.regexValidator({regexp:"email",datatype:"enum",onerror:"邮箱格式不正确"});
	
	$("#lbip").formValidator({onshow:"请输入录播主机IP",onfocus:"请注意你输入的IP格式",oncorrect:"IP格式正确"})
	.regexValidator({regexp:"ip4",datatype:"enum",onerror:"IP格式不正确"});
	
	$("#skip").formValidator({onshow:"请输入授课主机IP",onfocus:"请注意你输入的IP格式",oncorrect:"IP格式正确"})
	.regexValidator({regexp:"ip4",datatype:"enum",onerror:"IP格式不正确"});
	
	$("#hdip").formValidator({onshow:"请输入互动主机IP",onfocus:"请注意你输入的IP格式",oncorrect:"IP格式正确"})
	.regexValidator({regexp:"ip4",datatype:"enum",onerror:"IP格式不正确"});
	
	$("#zbip").formValidator({onshow:"请输入直播主机IP",onfocus:"请注意你输入的IP格式",oncorrect:"IP格式正确"})
	.regexValidator({regexp:"ip4",datatype:"enum",onerror:"IP格式不正确"});
	
	$("#phone").formValidator({onshow:"请输入电话",onfocus:"电话不能为空",oncorrect:"电话合法"})
	.regexValidator({regexp:"mobile",datatype:"enum",onerror:"电话格式不正确"});
	 
});

