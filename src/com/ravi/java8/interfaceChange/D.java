package com.ravi.java8.interfaceChange;

public class D  extends AbstractClass{
	
	
	D(int i) {
		super(i);
		
	}
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 from D class");
	}
	
	public static void main(String[] args) {
		D d1 = new D(10);
		D d2 = new D(20);
		D d3 = new D(30);
		D d4 = new D(40);
		System.out.println(d1.i);
		System.out.println(d2.i);
		System.out.println(d3.i);
		System.out.println(d4.i);
		
	}

}
