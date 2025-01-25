package com.Dhinesh_Developer;

import java.util.Scanner;
/*Custom Excepton =>  in java, we can create our own Exception that are derived from exception class */
class InvalidUserException extends Exception{
	
	@Override
	public String getMessage() {
		
		return "Inavlid card Details ,Try Again";
	}
}
class Bank{
	private int accNum = 1234;
	private int pin = 9999;
	private int an;
	private int pwd;
	
	public void acceptInput() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Account Number");
		an = in.nextInt();
		System.out.println("Enter the Password(pin)");
		pwd =in.nextInt();
	}
	
	public void validate() throws InvalidUserException {
		if(accNum == an && pin == pwd) {
			System.out.println("Collect Your Money");
		}else {
			InvalidUserException iue = new InvalidUserException();
			System.out.println(iue.getMessage());
			throw iue;
		}
	}
}
public class DAY41 {
	
	public static void main(String[] args) {
		Bank b = new Bank();
		
		try {
			b.acceptInput();
			b.validate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
/*
 * /* CHECKED EXCEPTION => checked Exception also referred as complier known exception
		 * errors related to these exceptions must be addressed immediately.
		 
		System.out.println("Connection Established");
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(2000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		/*UNCHECKED EXCEPTION => unchecked exception also known as complier unknown exception.
		 * errors related to this exceptions must be addressed subsequently.
		 *  
		if(i>3) return;
		System.out.println(name);
		fun(i+1,name);
		*String name = "kumar";
		int i = 0;
		fun(i,name);
		*
		*/
	
}
