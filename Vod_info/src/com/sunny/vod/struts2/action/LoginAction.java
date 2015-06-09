package com.sunny.vod.struts2.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sunny.vod.bean.User;
import com.sunny.vod.dao.LoginDao;
import com.sunny.vod.dao.impl.LoginDaoImpl;

public class LoginAction extends ActionSupport {
	private User user;
	LoginDao loginDao=new LoginDaoImpl();
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String execute() throws Exception {  
        boolean sign=this.businessExecute(); 
        if(sign){
        	ActionContext actionContext = ActionContext.getContext();
        	 
            Map session = actionContext.getSession();
      
            session.put("username", this.user.getUserName());
        return "success"; 
        }
        else
        {
        	 this.addFieldError("message", "�û������������");  

        	return "input";
        }
    }  
	public String logout() throws Exception {  
        
       
        	ActionContext actionContext = ActionContext.getContext();
        	 
            Map session = actionContext.getSession();
      
            session.remove("username"); 
        return "success"; 
       
    }  
	 public boolean businessExecute(){  
	        //System.out.println("�û�����Ĳ���Ϊ==="+"account="+account+",password="+password+",submitFlag="+submitFlag);  
	 System.out.println("�û�����"+this.user.getUserName());
	 System.out.println("���룺"+this.user.getPassword());
	 return loginDao.login(user.getUserName(), this.user.getPassword());
	 
	 
	 }

}
