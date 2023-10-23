package com.backy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.backy.util.DBManager;

public class CustomerDAO {

	private CustomerDAO() {}

	private static CustomerDAO instance;
	
	public static CustomerDAO getInstance() {
		return instance;
	}
	
	public int customerNum() {
		String sql = "SELECT custno FROM MEMBER_TBL_02 WHERE custno = (SELECT MAX(custno) FROM MEMBER_TBL_02)";
		int result = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		
		try {
			conn = DBManager.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				result = rs.getInt("custno")+1;
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}	
	
	public void customerInsert(int custno) {
		String sql = "insert into MEMBER_TBL_02 values(?,?,?,?,?,?,?)";
		
	}

	
	
	
}
