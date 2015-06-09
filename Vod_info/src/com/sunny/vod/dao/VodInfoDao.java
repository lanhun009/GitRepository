package com.sunny.vod.dao;

import java.util.List;

import com.sunny.vod.bean.VodInfo;
import com.sunny.vod.util.Page;

	public interface VodInfoDao {
		public List<VodInfo> getList();//≤È—Ø¡–±Ì
		public void update(VodInfo vi);
		public void del(String vid);
		public void add(VodInfo vi);
		public VodInfo load(String vid);
		public List<VodInfo> getListByName(String name);
		
		public List<VodInfo> queryByPage(int pageSize,int pageNow);  
		public int count(String sql);
		public List<VodInfo> queryByPage(Page page);


	
		
}
