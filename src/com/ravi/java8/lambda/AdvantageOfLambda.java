package com.ravi.java8.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class AdvantageOfLambda {

	public static void main(String[] args) {
		
		show(10);
		int i = 16;
		show(i); // Data as a parameter to the method
		
		display("Ravi");
		String s = " Raj ";
		display(s);// Data as a parameter to the method
		
		Employee e = new Employee("Ravi");
		write(e);// Data/value as a parameter to the method
		
		
		validate(new Test3Impl());// Data/value as a parameter to the method
		
		
		Test3 t3 =(x,y)->{
			return x*y;
		};
		validate(t3);
		
		
		
		validate((a,b)->{
			return a*b;
		});
		
		
		Test4 t4 =()->{
			System.out.println(20-10);
		};
		
		validate(t4);
		
		// Thread creation
		
		Thread th1 = new Thread(new Thread1());
		Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hi...");
				
			}
		});
		
		Runnable r = ()-> System.out.println("run method using lambda");
		
		Thread th3 = new Thread(r);
		
		Thread th4 = new Thread(()-> System.out.println("run method using lambda"));
		
		// Predicate
		
		Predicate<Employee> p =(p1)->{
			if(p1.getEmpName().startsWith("A"))
				return true;
			return false;
		};
		
		boolean d = p.test(e);
		
		//Function
		
		Function<Employee, Boolean> f1 =(p1)->{
			if(p1.getEmpName().startsWith("A"))
				return true;
		return false;
		};
		
		boolean b =f1.apply(new Employee());
		//Consumer
		
	
		
		
	}

	static public void show(int i) {
		System.out.println("i value is " + i);

	}

	static public void display(String i) {
		System.out.println("i value is " + i);

	}

	static public void write(Employee e) {
		System.out.println("e value is " + e);
	}

	static void validate(Test3 t) {
		t.multiply(10, 20);
	}

	static void validate(Test4 t) {
		t.substract();
	}
}
