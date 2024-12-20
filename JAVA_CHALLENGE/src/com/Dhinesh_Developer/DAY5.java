package com.Dhinesh_Developer;

import java.util.Scanner;

public class DAY5 {
	public static void pattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pattern2(int n) {
		int cnt = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(cnt<10) {
					System.out.print(0);
				}
				System.out.print(cnt+" ");
				cnt++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
//		pattern1(n);
		pattern2(n);
	}

}
