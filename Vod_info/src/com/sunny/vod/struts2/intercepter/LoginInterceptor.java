package com.sunny.vod.struts2.intercepter;

import java.util.Map;


import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptor extends  MethodFilterInterceptor {

	

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		 // ȡ��������ص�ActionContextʵ��  
        ActionContext ctx = invocation.getInvocationContext();  
        Map session = ctx.getSession();  
        String username = (String) session.get("username");  
  
        // ���û�е�½�����ߵ�½���е��û�������yuewei�����������µ�½  
  
        if (username != null && !username.equals("")) {  
             
            return invocation.invoke();  
        }  
  
        ctx.put("tip", "�㻹û�е�¼");  
        return Action.LOGIN;  
	}

}
