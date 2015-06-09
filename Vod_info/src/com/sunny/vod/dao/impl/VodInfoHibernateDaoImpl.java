package com.sunny.vod.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;

import com.sunny.vod.bean.VodInfo;
import com.sunny.vod.dao.VodInfoDao;
import com.sunny.vod.util.Page;

public class VodInfoHibernateDaoImpl extends VodInfoBaseDAO implements
		VodInfoDao {

	@Override
	public List<VodInfo> getList() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public void update(VodInfo vi) {
		

	}

	@Override
	public void del(String vid) {
		super.delete(super.findById(vid));

	}

	@Override
	public void add(VodInfo vi) {
		super.save(vi);

	}

	@Override
	public VodInfo load(String vid) {
		// TODO Auto-generated method stub
		return super.findById(vid);
	}

	@Override
	public List<VodInfo> getListByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VodInfo> queryByPage(int pageSize, int pageNow) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(String sql) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<VodInfo> queryByPage(Page page) {
		
		String sql = "select count(*) from vod_info_tb";
		SQLQuery sqlq=getSession().createSQLQuery(sql);
		int rowcount=Integer.parseInt(sqlq.uniqueResult().toString());
		page.setIntRowCount(rowcount);
		page.setIntPageCount(rowcount);
		
		
		Query q = getSession().createQuery("from VodInfo as f");   
		q.setFirstResult(page.getStartRow());   
		q.setMaxResults(page.getPageSize());   
		List<VodInfo> l = q.list(); 
		return l;
	}

}
