package com.sunny.vod.util;

public class Page {
	int i=1;//�м����
    private int k;//�������ҳ����
    private int startRow=1;//��ʼ��¼
   
    private int pageNow=1; //ҳ����,��ʼΪ1
    private int pageSize = 2 ; //ҳ������ 
    private int intRowCount;//������
    private int intPageCount;//��ҳ��
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
	//���õ�ǰҳ
	public void setPageNow(int pageNow) {
		System.out.println("����setPageNow"+pageNow);
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
	//�����ܼ�¼��������ҳ��
	public void setIntPageCount(int intRowCount) {
		this.intPageCount = (intRowCount + pageSize - 1) / pageSize;
		System.out.println(this.getPageNow());
		this.setStartRow();
		System.out.println(this.getStartRow());
	}
    
    
}
