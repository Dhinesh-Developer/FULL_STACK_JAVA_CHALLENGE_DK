package com.Dhinesh_Developer;

interface calculator1{
	void add();
	void sub();
}

interface calculator2{
	void mul();
	
}

interface calculator3 extends calculator1,calculator2{
	void div();
}

public class DAY37 {
	public static void main(String[] args) {
//		myCalc mc = new myCalc();
//		mc.add();
//		mc.sub();
//		mc.mul();
//		mc.div();
	}
/*
 * class calculator2 {
	private static final byte a = 100;
	private static final byte b = 50;
	public void mul() {
		System.out.println(a*b);
	}

	public void div() {
		System.out.println(a/b);
	}
}

class myCalc extends calculator2 implements calculator1				{
	private static final byte a = 100;
	private static final byte b = 50;
	

	@Override
	public void add() {
		System.out.println(a+b);
	}

	@Override
	public void sub() {
		System.out.println(a-b);
	}
	
}/


an interface is like a contract which when implementeed helps to achieve statndardization.
interface promotes polymorphism
methods within an interface are automatically public,and abstract.
specialized methods cannot be accessed directly using interface type references.


 */
}
