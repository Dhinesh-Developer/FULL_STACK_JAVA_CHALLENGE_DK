package com.DhineshDeveloper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAY56 {
	
	private static final String URL = "jdbc:mysql://localhost:3306/jdbc";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root@dk";
	private static final String SELECT = "select * from bank";
	private static Connection con;
	private static Statement stmt;
	private static ResultSet res;
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			stmt = con.createStatement();
			res = stmt.executeQuery(SELECT);
			
			while(res.next()) {
				System.out.println(res.getInt("id")+"	  "+
						res.getInt("acc_no")+"		"+
						res.getString("name")+"		"+
						res.getInt("balance"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

}
