package com.DhineshDeveloper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAY61 {

	private static final String URL = "jdbc:mysql://localhost:3306/shop";
	private static final String USERNAME = "root";
	private static final String PASSWORd = "root@dk";
	private static Connection con;
	private static PreparedStatement pstmt;
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,USERNAME,PASSWORd);
			pstmt = con.prepareStatement("insert into shop(sName,sPrice,sBrand,sDescription,sImage) values (?,?,?,?,?)");
			pstmt.setString(1, "Laptop");
			pstmt.setString(2, "100000");
			pstmt.setString(3, "ASUS");
			pstmt.setString(4, "Light weight to user");
			
			try {
				FileInputStream fis = new FileInputStream("D:\\images\\3.jpeg");
				pstmt.setBinaryStream(5, fis);
				int x = pstmt.executeUpdate();
				
				if(x > 0) {
					System.out.println("Image Added successfully");
				}else {
					System.out.println("Failed to insert the data");
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}		
	}

}
