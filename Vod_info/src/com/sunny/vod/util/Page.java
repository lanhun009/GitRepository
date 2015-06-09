package com.sunny.vod.util;

public class Page {
	int i=1;//中间变量
    private int k;//储存最大页面数
    private int startRow=1;//开始记录
   
    private int pageNow=1; //页码数,初始为1
    private int pageSize = 2 ; //页面行数 
    private int intRowCount;//总行数
    private int intPageCount;//总页数
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow() {
		this.startRow = (this.pageNow -1)*pageSize;
	}
	
	public int getPageNow() {
		return pageNow;
	}
	//设置当前页
	public void setPageNow(int pageNow) {
		System.out.println("调用setPageNow"+pageNow);
		  /*if(pageNow<1){
	            pageNow=1;
		  }
	       if(pageNow > intPageCount){
	            pageNow=intPageCount;
	       }*/
	       this.pageNow = pageNow;  
	       System.out.println(this.pageNow);
	        
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getIntRowCount() {
		return intRowCount;
	}
	public void setIntRowCount(int intRowCount) {
		this.intRowCount = intRowCount;
	}
	public int getIntPageCount() {
		return intPageCount;
	}
	//根据总记录数设置总页数
	public void setIntPageCount(int intRowCount) {
		this.intPageCount = (intRowCount + pageSize - 1) / pageSize;
		System.out.println(this.getPageNow());
		this.setStartRow();
		System.out.println(this.getStartRow());
	}
    
    
}
