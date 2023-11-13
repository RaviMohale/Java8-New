package com.ravi.java8.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;

import com.ravi.java8.lambda.Employee;

public class LambdaExpression1 {
	public static void main(String[] args) {
		
	//	Test t = ()-> System.out.println();
	
	/*
	 * Since Test interface abstract is similar to Runnable Hence we can use
	 * Runnable Interface and no need of New Interface hence delete Test Interface
	 */
	
		Runnable r = ()-> System.out.println("Hi..");
		r.run();
		
		// public void show(int i)
       
       IntConsumer t2 =(i)->{
    	  int g= 10+20; 
       };
       
       t2.accept(300);
       
       // public double add(int i ,int j);
       
       BiFunction<Integer, Integer,Double>  b = (x,y)-> {
    	   return 100.00;
       };
       
       ToDoubleBiFunction<Integer, Integer> b1 = (x,y)-> {
    	   return 100.00;
       };
       
       // public Employee subtract();
       
       Supplier<Employee> s1 = ()-> new Employee();
	}

}
