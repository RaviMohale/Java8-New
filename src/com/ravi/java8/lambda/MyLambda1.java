package com.ravi.java8.lambda;

public class MyLambda1 {

	public static void main(String[] args) {

		Test t = () -> System.out.println("hi display"); // method implementation

		t.display(); // method calling

		Test1 t1 = (y) -> {
			System.out.println("adding ");
			int x = y * 10;
			System.out.println(x);
			return 10;
		};
		t1.add(20);

		Test2 t2 = (x, y) -> {
			int z = x + y;
			System.out.println("method of test2 interface  ");
			return z;
		};

		int w = t2.add1(20, 30);
		System.out.println(w);
		
		Test2 t3 =(a,b) -> a-b ;
			int c = t3.add1(30, 20);
			
		System.out.println(c);
		
		Test3 f = (a,b) -> a* b;
		double d = f.multiply(20, 5);
		System.out.println(d);
		
		
	}
}
