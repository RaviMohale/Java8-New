package com.ravi.java8.stream;

import java.util.ArrayList;
import java.util.List;

import com.ravi.java8.lambda.Employee;

public class ForEachMethod {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Ravi");
		l.add("Avi");
		l.add("Abhi");
		l.add("Vivek");
		l.add("Nishu");

		// write the program to print the arraylist

		// using forEach loop

		System.out.println("using foreach loop");
		for (String s : l) {
			System.out.println(s);

		}
		System.out.println("using for loop");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println("using forEach Method");
		l.forEach((s) -> System.out.println(s));  
		
		/*
		 * forEach mean this line of code (for (int i = 0; i < l.size(); i++)) where as
		 * s means String type
		 */
		
			List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Ravi",123));
		emp.add(new Employee("Kartik",233));
		emp.add(new Employee("Aavi",223));
		emp.add(new Employee("Abhi",103));
		System.out.println("using for loop");
		for(int i = 0; i< emp.size();i++) {
			System.out.println(emp.get(i)); // toString method
			//packageName className Hexa Decimal number
		}
		
		
		System.out.println("using for Each loop #########");
		emp.forEach((s)-> {
			System.out.println(s);  // here s is employee  object
			//System.out.println(s.getEmpName());
			//System.out.println(s.getEmpId());
		
		
		});
		
		// write a program to remove the "Ravi" from the list  ("removeIf method)
		System.out.println("**********  Using the removeIf method  ***********");
		emp.removeIf((p)-> p.getEmpName().equals("Ravi"));
		emp.forEach((s)-> {
			System.out.println(s);}); 
		
	}

}
