package com.ravi.java8.methodreference;

import java.io.PrintStream;
import java.util.function.Consumer;

public class Test1  {
	public static void main(String[] args) {
		
		TestImpl tmp = new TestImpl();
		
		MethodRef ref = (i,j)-> tmp.add2number(i, j);

		//---------- instance method   -------------
		// if your lambda is taking the same number of argument
		// and if you are calling the instance method
		// and passing the same argument as that of lambda.. then
		// we can simplify the lambda using methodRefrence
		// Method Reference is nothing but the simplification of Lambda Expression
		
		MethodRef ref1 = tmp::add2number;
		
		Consumer<String> c1 = (d1)-> System.out.println(d1);
		
		PrintStream ps = System.out;
		
		Consumer<String>c2 = (d1)-> ps.print(d1);
		Consumer<String>c3 = ps::print;
		Consumer<String>c4 = System.out::println;
		 
		// ------------  static method --------------
		
		// using lambda
		MethodRef ref2 =(i ,j)-> Test1Impl.add2number(i, j);
		
		// using method reference
		MethodRef ref3 = Test1Impl::add2number;
		
		MethodRef1 ref4 = MethodRefImpl :: new;

		
	}

	

}
