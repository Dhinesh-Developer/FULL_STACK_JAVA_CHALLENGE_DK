package com.Dhinesh_Developer;

import java.util.Scanner;

class division{
	
	void fun() {
		System.out.println("connection 2 is established");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		try {
			int c = a/b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println(e.getMessage());	
			
		}finally {
			System.out.println("connection 2 is Terminated");
		}
	}
}


public class DAY40 {

	public static void main(String[] args) {
		System.out.println("connection 1 is established");
		division div = new division();
		div.fun();
		System.out.println("connection 1 is terminated");
	}

}
