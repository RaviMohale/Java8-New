package com.ravi.java8.interfaceChange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A implements Test {
	
	@Override
	public void add(int a) {
		// TODO Auto-generated method stub
		System.out.println("Add from class A");
		System.out.println("calling the interface method");
		
		
		// InterfaceName.super.defaultMethodName   
		Test.super.multiply(20, 30);   // interface  Test method called
	}
	
	
	static void display() {
		System.out.println("static method from class A");
	}
	
	
	@Override
	public void multiply(int a, int b) {
		// TODO Auto-generated method stub
		//Test.super.multiply(a, b);
		
		System.out.println(10*9);
	}
	public static void main(String[] args) {
		A  a = new A();
		a.add(200);
		System.out.println("calling the Class method");
		a.multiply(10,5);  // Class A method called
		
		//static method called ,we can not override
		// static method are related to class we can not override it
		// instance  method are related to object 
		
		Test.display();  // calling static method from Interface Test
		Test.display1();
		A.display();	//	calling static method from Class A
		
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(null);
		al.add(40);
		al.add(2);
		Collections.synchronizedList(al);
		System.out.println(al);
		
		
	}
}
