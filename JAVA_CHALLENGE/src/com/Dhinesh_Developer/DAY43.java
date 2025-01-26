package com.Dhinesh_Developer;

import java.util.Scanner;
/* There are two ways to achieve Multi-threading. 1.extends Thread 2.implements Runnable
 * runnable is more efficient because implementing interfaces.*/ 
class D1 implements Runnable{
	@Override
	public void run() {
		System.out.println("Printing number Started");
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(2000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing number Ended");
	}
}
class D2 extends Thread{
	@Override
	public void run() {
		System.out.println("Character Printing started");
		for(int i=65;i<70;i++) {
			try {
				Thread.sleep(2000);
				System.out.println((char)i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Character number Ended");
	}
}
class D3 implements Runnable{
	@Override
	public void run() {
		System.out.println("Dividing number started");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a = in.nextInt();
		System.out.println("Enter the second number");
		int b = in.nextInt();
		try {
			int c = a/b;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class DAY43 {

	public static void main(String[] args) {
		D1 d1 = new D1();
		D2 d2 = new D2();
		D3 d3 = new D3();
		d1.run();
		d2.run();
		d3.run();
	}

}
