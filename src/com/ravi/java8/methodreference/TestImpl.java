package com.ravi.java8.methodreference;

public class TestImpl  implements MethodRef{
	 
		TestImpl t2 = new TestImpl();
	@Override
	public int performAddition(int i, int j) {
		
		return  t2.add2number(i, j);
	}
	
	public int add2number(int i , int j) {
		int z = i + j;
		System.out.println(z);
		return z;
	}
	
}
