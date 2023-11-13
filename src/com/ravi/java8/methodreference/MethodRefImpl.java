package com.ravi.java8.methodreference;

public class MethodRefImpl  implements MethodRef1{
	
	@Override
	public void performAddition(int i, int j) {
		MethodRefImpl impl = new MethodRefImpl(i, j);
		
	}

	public MethodRefImpl(int i,int j) {
		// TODO Auto-generated constructor stub
		System.out.println("constructor from the MethodRefImpl......");
	}
}
