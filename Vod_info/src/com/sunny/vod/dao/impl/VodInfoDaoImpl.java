package com.sunny.vod.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.sunny.vod.bean.VodInfo;
import com.sunny.vod.dao.VodInfoDao;
import com.sunny.vod.util.DBUtil;
import com.sunny.vod.util.Page;

public class VodInfoDaoImpl implements VodInfoDao {
	private DBUtil util = new DBUtil();

	PreparedStatement pstmt;

	@Override
	public List<VodInfo> getList() {
		List<VodInfo> infolist = new ArrayList<VodInfo>();
		Connection conn = util.getConnection();
		String sql = "select  * from vod_info_tb";
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs != null && rs.next()) {
				VodInfo vi = new VodInfo();
				vi.setId(rs.getString("id"));
				vi.setClassroom(rs.getString("classroom"));
				vi.setManager(rs.getString("manager"));
				vi.setTelephone(rs.getString("telephone"));
				vi.setLbip(rs.getString("lbip"));
				vi.setSkip(rs.getString("skip"));
				vi.setHdip(rs.getString("hdip"));
				vi.setZbip(rs.getString("zbip"));
				infolist.add(vi);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			util.close(conn);
		}

		return infolist;
	}

	@Override
	public void update(VodInfo vi) {
		Connection conn = util.getConnection();
		String sql = "update vod_info_tb set classroom=?,manager=?,telephone=?,lbip=?,skip=?,hdip=?,zbip=?,createtime=now() where id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			int i = 1;
			pstmt.setString(i++, vi.getClassroom());
			pstmt.setString(i++, vi.getManager());
			pstmt.setString(i++, vi.getTelephone());
			pstmt.setString(i++, vi.getLbip());
			pstmt.setString(i++, vi.getSkip());
			pstmt.setString(i++, vi.getHdip());
			pstmt.setString(i++, vi.getZbip());
			pstmt.setString(i++, vi.getId());

			pstmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			util.close(conn);
		}

	}

	@Override
	public void del(String vid) {
		Connection conn = util.getConnection();
		String sql = "delete from vod_info_tb where id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vid);

			pstmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			util.close(conn);
		}

	}

	@Override
	public void add(VodInfo vi) {
		Connection conn = util.getConnection();
		String sql = "insert into vod_info_tb values (?,?,?,?,?,?,?,?,now())";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, UUID.randomUUID().toString().substring(0, 31));
			pstmt.setString(2, vi.getClassroom());
			pstmt.setString(3, vi.getManager());
			pstmt.setString(4, vi.getTelephone());
			pstmt.setString(5, vi.getLbip());
			pstmt.setString(6, vi.getSkip());
			pstmt.setString(7, vi.getHdip());
			pstmt.setString(8, vi.getZbip());

			pstmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			util.close(conn);
		}

	}

	@Override
	public VodInfo load(String vid) {
		VodInfo vi = new VodInfo();
		Connection conn = util.getConnection();
		String sql = "select * from vod_info_tb where id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vid);

			ResultSet rs = pstmt.executeQuery();
			while (rs != null && rs.next()) {

				vi.setId(rs.getString("id"));
				vi.setClassroom(rs.getString("classroom"));
				vi.setManager(rs.getString("manager"));
				vi.setTelephone(rs.getString("telephone"));
				vi.setLbip(rs.getString("lbip"));
				vi.setSkip(rs.getString("skip"));
				vi.setHdip(rs.getString("hdip"));
				vi.setZbip(rs.getString("zbip"));

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			util.close(conn);
		}

		return vi;

	}

	@Override
	public List<VodInfo> getListByName(String name) {
		List<VodInfo> infolist = new ArrayList<VodInfo>();
		Connection conn = util.getConnection();
		String sql = "select  * from vod_info_tb where classroom like ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + name + "%");
			ResultSet rs = pstmt.executeQuery();
			while (rs != null && rs.next()) {
				VodInfo vi = new VodInfo();
				vi.setId(rs.getString("id"));
				vi.setClassroom(rs.getString("classroom"));
				vi.setManager(rs.getString("manager"));
				vi.setTelephone(rs.getString("telephone"));
				vi.setLbip(rs.getString("lbip"));
				vi.setSkip(rs.getString("skip"));
				vi.setHdip(rs.getString("hdip"));
				vi.setZbip(rs.getString("zbip"));
				infolist.add(vi);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			util.close(conn);
		}

		return infolist;
	}

	public List<VodInfo> queryByPage(int i, int pageSize) {
		List<VodInfo> infolist = new ArrayList<VodInfo>();
		Connection conn = util.getConnection();

		String sql = "select * from vod_info_tb  order by createtime desc limit "
				+ i + "," + pageSize;
		try {

			pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				VodInfo vi = new VodInfo();
				vi.setId(rs.getString("id"));
				vi.setClassroom(rs.getString("classroom"));
				vi.setManager(rs.getString("manager"));
				vi.setTelephone(rs.getString("telephone"));
				vi.setLbip(rs.getString("lbip"));
				vi.setSkip(rs.getString("skip"));
				vi.setHdip(rs.getString("hdip"));
				vi.setZbip(rs.getString("zbip"));
				infolist.add(vi);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			util.close(conn);
		}
		return infolist;
	}

	// 查询总行数
	public int count(String sql) {
		int intRowCount = 0;// 总行数
		Connection conn = util.getConnection();

		// String sql = "select count(*) from vod_info_tb";
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			rs.next();// 游标指向第一行
			intRowCount = rs.getInt(1);// 取得总行数

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			util.close(conn);
		}
		return intRowCount;
	}

	@Override
	public List<VodInfo> queryByPage(Page page) {

		String sql = "select count(*) from vod_info_tb";
		int rowcount = this.count(sql);
		page.setIntRowCount(rowcount);
		page.setIntPageCount(rowcount);

		List<VodInfo> infolist = new ArrayList<VodInfo>();
		Connection conn = util.getConnection();

		sql = "select * from vod_info_tb  order by createtime desc limit "
				+ page.getStartRow() + "," + page.getPageSize();
		try {

			pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				VodInfo vi = new VodInfo();
				vi.setId(rs.getString("id"));
				vi.setClassroom(rs.getString("classroom"));
				vi.setManager(rs.getString("manager"));
				vi.setTelephone(rs.getString("telephone"));
				vi.setLbip(rs.getString("lbip"));
				vi.setSkip(rs.getString("skip"));
				vi.setHdip(rs.getString("hdip"));
				vi.setZbip(rs.getString("zbip"));
				infolist.add(vi);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			util.close(conn);
		}
		return infolist;
	}

}
