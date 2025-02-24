package com.DhineshDeveloper.DAY70;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO{
	
	private static final String URL = "jdbc:mysql://localhost:3306/jdbc";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root@dk";
	private static Connection con;
	private static Statement stmt;
	private static PreparedStatement pstmt;
	private static ResultSet res;
	
	
	private static final String INSERT = "insert into user (name,email,passwd) values (?,?,?)";
	private static final String LIST = "select * from user";
	private static final String SHOWBYID = "select * from user where id = ?";
	private static final String DELETE = "delete from user where id = ?";
	private static final String UPDATE = "update user where id = ? , passwd = ?";
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<UserEntity> getAllUser(UserEntity user) {
		List<UserEntity> users = new ArrayList<>();
		try {
			 stmt = con.createStatement();
			  res = stmt.executeQuery(LIST);
			  
			  while(res.next()) {
				  users.add(new UserEntity(
						  res.getString("name"),
						  res.getString("email"),
						  res.getString("passwd")));
			  }
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return users;
	}

	@Override
	public UserEntity getUserById(int id) {
		List<UserEntity> users = new ArrayList<>();
		 try {
			 pstmt = con.prepareStatement(SHOWBYID);
			 pstmt.setInt(1, id);
			  res = pstmt.executeQuery();
			 
			 while(res.next()) {
				 users.add(new UserEntity(res.getString("name"),
						 res.getString("email"),
						 res.getString("passwd")));
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int deleteUserById(int id) {
		int x = -1;
		 try {
			pstmt = con.prepareStatement(DELETE);
			pstmt.setInt(1, id);
			 x = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return x;
	}

	@Override
	public int insertUser(UserEntity user) {
		int x = -1;
		 try {
			pstmt = con.prepareStatement(INSERT);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3,user.getPasswd());
			x = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return x;
	}

	@Override
	public int updateUSerById(UserEntity user,int id, String passwd) {
		int x = -1;
		 try {
			pstmt = con.prepareStatement(UPDATE);
			pstmt.setInt(1, user.getId());
			pstmt.setString(2,user.getPasswd());
			 x = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return x;
	}

}
