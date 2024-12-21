package com.Dhinesh_Developer;

import java.util.Scanner;

public class DAY6 {
	private static void pattern1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==1 || i==5 || j==5) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}
	
	static void pattern2(int n) {
		int cnt;
		for(int i=0;i<n;i++) {
			cnt = i+1;
			for(int j=0;j<n;j++) {
				System.out.print(cnt++ + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	//	pattern1(n);
		pattern2(n);
		
	}

}
