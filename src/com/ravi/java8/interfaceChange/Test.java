package com.ravi.java8.interfaceChange;
@FunctionalInterface
public interface Test {
	// abstract method
	public void add(int a);

	// default method we can write n number of default method
	public default void multiply(int a, int b) {
		System.out.println(10 * 5);
	}

	public default void multiply1(int a, int b) {
		System.out.println(10 * 5);
	}

	public default void multiply2(int a, int b) {
		System.out.println(10 * 5);
	}

	// static method , we can not override static method
	// we can write n number of static method
	
	static void display() {
		System.out.println(" static method from Interface test");
	}
	static void display1() {
		System.out.println(" static method from Inteface  display1");
	}
	static void display2() {
		System.out.println(" static method called");
	}

}
