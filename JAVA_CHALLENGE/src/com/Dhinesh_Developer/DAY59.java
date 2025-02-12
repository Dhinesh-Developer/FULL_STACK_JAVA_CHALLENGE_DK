package com.DhineshDeveloper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DAY59 {
	
	private static final String URL = "jdbc:mysql://localhost:3306/jdbc";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root@dk";
	private static Connection con;
	private static PreparedStatement pstmt;
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			 con.setAutoCommit(false);
			 boolean transaction = transaction();
			 
			 if(transaction) {
				 con.commit();
			 }
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	private static boolean transaction() {
		System.out.println("Enter the Sender and receiver Amount");
		System.out.println("Enter the Amount");
		int amount = in.nextInt();
		in.nextLine();
		System.out.println("Enter the sender Name");
		String sender = in.nextLine();
		System.out.println("Enter the Receiver Name");
		String receiver = in.nextLine();
		int i = updateAmount(sender,+amount);
		int j = updateAmount(receiver,-amount);
		return isConfirm(i,j);
	}

	private static boolean isConfirm(int i, int j) {
		System.out.println("Do you want to commit the Transaction yes/no");
		String choice = in.nextLine();
		
		if(choice.equalsIgnoreCase("yes") && i==1 && j==1) {
			return true;
		}else {
			return false;
		}
	}

	private static int updateAmount(String sender, int amount) {
		
		String Query = "update bank set balance = balance - ? where name = ?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(Query);
			pstmt.setInt(1, amount);
			pstmt.setString(2, sender);
			int x = pstmt.executeUpdate();
			return x;
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}

}
