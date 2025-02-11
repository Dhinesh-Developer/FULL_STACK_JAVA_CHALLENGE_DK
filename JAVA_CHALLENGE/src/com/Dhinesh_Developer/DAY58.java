package com.DhineshDeveloper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DAY58 {
	private static final String url = "jdbc:mysql://localhost:3306/jdbc";
	private static final String username = "root";
	private static final String password = "root@dk";
	private static Connection con;
	private static Statement stmt;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
			stmt = con.createStatement();
			
			String query1 = "insert into bank (id,acc_no,name,balance) values (1008,9997,'giri',10000)";
			String query2 = "insert into bank (id,acc_no,name,balance) values (1009,9998,'gokul',100000)";
			String query3 = "insert into bank (id,acc_no,name,balance) values (1010,9999,'harsh',20000)";
			
			stmt.addBatch(query1);
			stmt.addBatch(query2);
			stmt.addBatch(query3);
			
			int[] x = stmt.executeBatch();
			System.out.println(x);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
