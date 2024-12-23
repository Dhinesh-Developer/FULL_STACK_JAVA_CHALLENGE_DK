package com.Dhinesh_Developer;

import java.util.Scanner;

public class DAY8 {
	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(2*i)-1;j++) {
				System.out.print("*");
			}
				System.out.println();
		}
	}
	
	public static void pattern2(int n) {
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=(n-i);k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++) {
				System.out.print("*");
			}
				System.out.println();
		}
	}
	
	public static void pattern3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=(n-1);i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void pattern4(int n) {
		for(int i=1;i<=n;i++) {
			int cnt = i*(i+1)/2;
			for(int j=1;j<=i;j++) {
				System.out.print(cnt-j+1+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		pattern4(n);
	}

}
