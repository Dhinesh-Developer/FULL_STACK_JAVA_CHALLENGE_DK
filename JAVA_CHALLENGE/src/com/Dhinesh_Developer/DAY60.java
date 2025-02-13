package com.DhineshDeveloper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DAY60 {
	
	private static final String URL = "jdbc:mysql://localhost:3306/jdbc";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root@dk";
	private static Connection con;
	private static java.sql.CallableStatement cs;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			 cs = con.prepareCall("{CALL getNameById(?)}");
			 System.out.println("Enter the Account Id");
			 int acc_no = in.nextInt();
			 cs.setInt(1, acc_no);
			 ResultSet res = cs.executeQuery();
			 
			 while(res.next()) {
				 int id = res.getInt("id");
				 int accNo = res.getInt("acc_no");
				 String name = res.getString("name");
				 int balance = res.getInt("balance");
				 System.out.println(id+" "+accNo+" "+name+" "+balance);
				 
			 }
			 
			 
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
