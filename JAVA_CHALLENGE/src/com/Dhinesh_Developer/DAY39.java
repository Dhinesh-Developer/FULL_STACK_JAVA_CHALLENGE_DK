package com.Dhinesh_Developer;

import java.util.Scanner;

class Demo1{
	// way3: Ducking an Exception (throws)
	void fun1() throws Exception{
		Scanner in = new Scanner(System.in);
		
			System.out.println("Enter the Numerator");
			int a = in.nextInt();
			System.out.println("Enter thr Denominator");
			int b = in.nextInt();
			int c = a/b;
			System.out.println(c);
	}
}
public class DAY39 {
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		try {
			d.fun1();
		}catch(Exception e) {
			System.out.println("Exception handled in main()");
		}
		
		
		
		
	}
	/*// way1: Handling the Exception (try-catch)
	 * void fun1() {
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Enter the Numerator");
			int a = in.nextInt();
			System.out.println("Enter thr Denominator");
			int b = in.nextInt();
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("Enter the valid data");
		}
		
		
		
		// way2: Rethrowing the Exception (try-catch-throw-throws-finally)
	void fun1() throws ArithmeticException{
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Enter the Numerator");
			int a = in.nextInt();
			System.out.println("Enter thr Denominator");
			int b = in.nextInt();
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			throw e;
		}finally {
			System.out.println("reThrowing the exception");
		}
	}
	}*/
}
