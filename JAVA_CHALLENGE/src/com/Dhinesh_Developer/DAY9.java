package com.Dhinesh_Developer;

import java.util.Scanner;

public class DAY9 {
	private static void pattern1(int n) {
		int ch = 65;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)ch+" ");
			}
			ch++;
			System.out.println();
		}
	}
	
	private static void pattern2(int n) {
		int ch = 65;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				for(int j=1;j<=i;j++) {
					char chRev = (char)(ch+i-1);
					System.out.print((char)chRev-- +" ");
					ch++;
				}
			}else {
				for(int j=1;j<=i;j++) {
					System.out.print((char)ch++ +" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		pattern2(n);
		
	}

}
