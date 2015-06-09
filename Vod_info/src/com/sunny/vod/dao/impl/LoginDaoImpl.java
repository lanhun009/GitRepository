package com.sunny.vod.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sunny.vod.dao.LoginDao;
import com.sunny.vod.util.DBUtil;

public class LoginDaoImpl implements LoginDao{
	
	
	@Override
	public boolean login(String name, String password) {
		boolean sign=false;
		String sql = "select  count(*) num from user_tb where username=? and password=?";
		DBUtil util = new DBUtil();
		Connection conn = util.getConnection();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()){
				int num=rs.getInt("num");
				if(num!=0){
					sign=true;
				}
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			util.close(conn);
		}
		
		return sign;
	}

}
