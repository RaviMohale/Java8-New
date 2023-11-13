package com.ravi.java8.optional;

public class OptionalImpl {
	
	public static void main(String[] args) {
		String s = m1();
		if(null != s && s.equals("hi")) {
			System.out.println("if condition satisfied....");
		}
		
		String s1 = m2();
		if(null != s1 &&  s1.equals("Hi")) {
			System.out.println("if condition satisfied....");
		}
		
	}
	
	
		
		
		public static String m1() {
			return "hi";
		}
	

		public static String m2() {
			return null;
		}
	
}
