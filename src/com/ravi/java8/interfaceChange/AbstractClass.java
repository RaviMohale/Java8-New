package com.ravi.java8.interfaceChange;

public  abstract class AbstractClass {
	
	final int i ;  // Blank final variable
	AbstractClass (int i){
		System.out.println(" Abstract class constructor..");
		this.i = i;
	}
	
	public abstract  void m1();
	
	// we dont create the object for Abstract class
}
