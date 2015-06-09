package com.sunny.vod.struts2.action;

import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sunny.vod.bean.VodInfo;
import com.sunny.vod.dao.VodInfoDao;
import com.sunny.vod.dao.impl.VodInfoDaoImpl;
import com.sunny.vod.dao.impl.VodInfoHibernateDaoImpl;
import com.sunny.vod.util.Page;

public class VodInfoAction extends ActionSupport {
	private VodInfo vodInfo;
	private List<VodInfo> infolist;
	private VodInfoDao vodInfoDao=new VodInfoDaoImpl();
	
	//private VodInfoDao vodInfoDao=new VodInfoHibernateDaoImpl();
	
	private Page page=new Page();
	  
	
	
	 public VodInfo getVodInfo() {
		return vodInfo;
	}


	public void setVodInfo(VodInfo vodInfo) {
		this.vodInfo = vodInfo;
	}


	public List<VodInfo> getInfolist() {
		return infolist;
	}


	public void setInfolist(List<VodInfo> infolist) {
		this.infolist = infolist;
	}



	/*public int getIntRowCount() {
		return intRowCount;
	}


	public void setIntRowCount(int intRowCount) {
		this.intRowCount = intRowCount;
	}
*/
	
	



	public Page getPage() {
		return page;
	}


	public void setPage(Page page) {
		this.page = page;
	}


	public String getList() {
		
	      infolist=vodInfoDao.getList();
	      ActionContext actionContext = ActionContext.getContext();
     	 
          Map session = actionContext.getSession();
    
          session.put("infolist", infolist);
	      
	        return SUCCESS;
	    }
	public String add() {
		
		vodInfoDao.add(vodInfo);
		
		return SUCCESS;
	}
	public String load() {
		
		vodInfo=vodInfoDao.load(vodInfo.getId());
		
		return SUCCESS;
	}
	public String update() {
		
		vodInfoDao.update(vodInfo);
		
		return SUCCESS;
	}
	public String del() {
		
		vodInfoDao.del(vodInfo.getId());
		
		return SUCCESS;
	}
	public String getListByName() {
		
	      infolist=vodInfoDao.getListByName(vodInfo.getClassroom());
	      ActionContext actionContext = ActionContext.getContext();
     	 
          Map session = actionContext.getSession();
    
          session.put("infolist", infolist);
	     
	        return SUCCESS;
	    }
	
	 public String getListBypg() throws Exception {
		
		 	//intRowCount=vodInfoDao.count();
	        
	       //page.setIntPageCount(intRowCount);
	       
	       
	        if(null!=vodInfoDao.queryByPage(page)){
	        	infolist = vodInfoDao.queryByPage(page);
	        	ActionContext actionContext = ActionContext.getContext();
	        	 
	            Map session = actionContext.getSession();
	      
	            session.put("infolist", infolist);
	           // session.put("pageNow", page.getPageNow());
	           // session.put("intRowCount", intRowCount);
	           // session.put("intPageCount", page.getIntPageCount());
	            session.put("page", page);
	            return SUCCESS;
	        }else{
	            return "failure";
	        }
	    }
	private JSONArray result=null;
	
	 public JSONArray getResult() {
		return result;
	}


	public void setResult(JSONArray result) {
		this.result = result;
	}


	public String getInfo() {
		
	      infolist=vodInfoDao.getList();
	     
	     result=JSONArray.fromObject(infolist);
	      
	     /* System.out.println("111");
	      for(int i=1;i<result.size();i++){
	      System.out.println(result.getJSONObject(i).getString("classroom"));
	      }*/
	        return SUCCESS;
	    }
}
