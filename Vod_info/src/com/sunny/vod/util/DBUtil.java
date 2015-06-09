package com.sunny.vod.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.Future;

import javax.naming.InitialContext;
//import javax.sql.DataSource;

import org.apache.tomcat.jdbc.pool.DataSource;


public class DBUtil {
	public static void main(String[] args) {
		DBUtil util = new DBUtil();
		Connection conn = util.getConnection();
		System.out.print(conn);
	}

	public Connection getConnection() {
//		DataSource ds = null;
//		try {
//			InitialContext ctx = new InitialContext();
//			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/sxpt");
//			Connection conn = ds.getConnection();
//			return conn;

		Connection con = null;
		try {
			InitialContext ctx = new InitialContext();
			DataSource datasource = (DataSource) ctx
					.lookup("java:comp/env/jdbc/vodinfo");
			Future<Connection> future = datasource.getConnectionAsync();
			while (!future.isDone()) {
				System.out.println("Connection is not yet available. Do some background work");
				try {
					Thread.sleep(100); // simulate work
				} catch (InterruptedException x) {
					Thread.currentThread().interrupted();
				}
			}
			con = future.get(); // should return instantly
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void close(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
