package com.Dhinesh_Developer;

import java.util.Scanner;

interface Calculator{
	void add();
	void sub();
}

class MyCalculator1 implements Calculator{
	int a = 100;
	int b = 200;
	@Override
	public void add() {
		System.out.println(a+b);
	}

	@Override
	public void sub() {
		System.out.println(a-b);
	}
}

class MyCalculator2 implements Calculator{
	Scanner in = new Scanner(System.in);
	int a,b;
	@Override
	public void add() {
		System.out.println("Enter the First Number");
		a = in.nextInt();
		System.out.println("Enter the Second Number");
		b = in.nextInt();
		System.out.println(a+b);
	}

	@Override
	public void sub() {
		System.out.println("Enter the First Number");
		a = in.nextInt();
		System.out.println("Enter the Second Number");
		b = in.nextInt();
		System.out.println(a-b);
	}
}



public class DAY36 {

	public static void main(String[] args) {
		MyCalculator1 cal1 = new MyCalculator1();
		MyCalculator2 cal2 = new MyCalculator2();
		
		cal1.add();
		cal1.sub();
		
		cal2.add();
		cal2.sub();
//	an interface is a collection of pure abstract methods,inside an interface , you have only method
		//with a signaturre without body.
	}

}
