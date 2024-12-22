package com.Dhinesh_Developer;

import java.util.Scanner;

public class DAY7 {
	private static void pattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	private static void pattern2(int n) {
		for(int i=1;i<=n;i++) {
			for(int k=1;k<(n-i)+1;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	 static void pattern3(int n) {
		for(int i=1;i<=n;i++) {
			for(int k=1;k<(n-i)+1;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*   ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		pattern3(n);
	}

}
