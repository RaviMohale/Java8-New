package com.ravi.java8.methodreference;

public class Test1Impl implements MethodRef {
	
	@Override
	public int performAddition(int i, int j) {
		// TODO Auto-generated method stub
		return Test1Impl.add2number(i, j);
	}
	
	public  static int add2number(int i , int j) {
		int z = i + j;
		System.out.println(z);
		return z;
	}

}
