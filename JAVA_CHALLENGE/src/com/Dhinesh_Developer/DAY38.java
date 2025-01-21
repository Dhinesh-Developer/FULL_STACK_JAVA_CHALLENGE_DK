package com.Dhinesh_Developer;

import java.util.InputMismatchException;
import java.util.Scanner;

class Demo{
	void division() {
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Enter the Numerator");
			int a = in.nextInt();
			System.out.println("Enter the Denominator");
			int b = in.nextInt();
			int c = a/b;
			System.out.println(c);
		}catch (ArithmeticException ae) {
			System.out.println("Enter the non zero denomiator");
		}catch(InputMismatchException ime) {
			System.out.println("Enter the valid data");
		}catch (Exception e) {
			System.out.println("Exception Hnndled");
		}
	}
}


public class DAY38 {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.division();
	}

}
