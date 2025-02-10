package com.DhineshDeveloper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DAY57 {
	private static final String URL = "jdbc:mysql://localhost:3306/jdbc";
	private static final String username = "root";
	private static final String password = "root@dk";
	private static Connection con;
	private static PreparedStatement pstmt;
	private static Statement stmt;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection(URL,username,password);
//			pstmt = con.prepareStatement("insert into bank(id,acc_no,name,balance) values (?,?,?,?)");
//			System.out.println("Enter the id Number");
//			int id = in.nextInt();
//			System.out.println("Enter the Account number");
//			int acc_no = in.nextInt();
//			in.nextLine();
//			System.out.println("Enter the Name");
//			String name = in.nextLine();
//			System.out.println("Enter the Balance");
//			int balance = in.nextInt();
//			
//			pstmt.setInt(1, id);
//			pstmt.setInt(2, acc_no);
//			pstmt.setString(3, name);
//			pstmt.setInt(4, balance);
//			
//			int x = pstmt.executeUpdate();
//			
//			if(x > 0) {
//				System.out.println("Data inserted Successfully");
//			}else {
//				System.out.println("Failed to insert the data");
//			}
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}		
		
		String query = "update bank set name=? where id = ?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,username,password);
			pstmt = con.prepareStatement(query);
			System.out.println("Enter the Name");
			String name = in.nextLine();
			System.out.println("Enter the Id");
			int id = in.nextInt();
			
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			
			int x = pstmt.executeUpdate();
			
			if(x > 0) {
				System.out.println("Data updated Successfully");
			}else {
				System.out.println("Failed to update data");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
