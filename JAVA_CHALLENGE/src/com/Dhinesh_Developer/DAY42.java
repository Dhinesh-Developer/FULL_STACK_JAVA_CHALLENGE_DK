package com.Dhinesh_Developer;

import java.util.Scanner;

public class DAY42 {

	public static void main(String[] args) {
		System.out.println("Division task started");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a = in.nextInt();
		System.out.println("Enter the Second number");
		int b = in.nextInt();
		try {
			Thread.sleep(2000);
			try {
				int c = a/b;
			}catch(ArithmeticException ae) {
				System.out.println("Enter the non zero second number");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Division Number started");
		
		
		System.out.println("Character printing started");
		for(int i=65;i<70;i++) {
			try {
				Thread.sleep(2000);
				System.out.println((char)i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("Character printing Ended");
		
		
		System.out.println("Number printing started");
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(2000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		System.out.println("Number printing Ended");
		
	}

}
