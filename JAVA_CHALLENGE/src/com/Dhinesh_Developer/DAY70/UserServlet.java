package com.DhineshDeveloper.DAY70;

import java.util.List;

public class UserServlet {
	public static void main(String[] args) {
		
		UserEntity u = new UserEntity("dhines","dhines@gmail.com","dhinesh123");
		UserDAO udao = new UserDAOImpl();
		int x = udao.insertUser(u);
		if(x > 0) {
			System.out.println("Data inserted");
		}else {
			System.out.println("Failed to insert tjhe data");
		}
		
		System.out.println("List of user available");
		List<UserEntity> allUser = udao.getAllUser(u);
		System.out.println(allUser);
		
		
		System.out.println("Delete the user by id");
		int d = udao.deleteUserById(1);
		if(d>0) {
			System.out.println("Row deleted");
		}else {
			System.out.println("Failed to delete the row");
		}
		
		System.err.println("Get users by id");
		UserEntity userById = udao.getUserById(2);
		System.out.println(userById);
		
	}
}
