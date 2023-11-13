package com.ravi.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.ravi.java8.lambda.Employee;

public class StreamImpl {
	
	public static void main(String[] args) {
		
		
		List<Integer> num = new ArrayList();
		num.add(10);
		num.add(20);
		num.add(40);
		num.add(30);
		num.add(20);
		num.add(50);
		num.add(10);
		
		
		// write a program to remove the duplicates
	System.out.println("write a program to remove the duplicates");
		num.stream().distinct().forEach(c-> System.out.println(c));
		
		// write a program to create a List object  and remove the duplicate
		System.out.println("write a program to create a List object  and remove the duplicate");
		List<Integer> num1 = num.stream().distinct().collect(Collectors.toList());
		System.out.println(num1);
		
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Ravi",123,43000));
		emp.add(new Employee("Kartik",233,50000));
		emp.add(new Employee("Aavi",223,65000));
		emp.add(new Employee("Abhi",103,40000));
		emp.add(new Employee("Aniket",105,55000));
		
		
		// write a program to print the employee name whose name starts with  "A"
		
		
		/*
		 * emp.stream() ----------> is equal to [--- for(int i = 0 ; i < emp.size() ;
		 * i++) ----------]
		 * 
		 * filter is equal to if condition
		 * 
		 * filter is  predicate
		 * forEach  is consumer
		 */
		System.out.println("*******employee name starts with A  ***********");
		
		emp.stream().filter(p -> p.getEmpName().startsWith("A")).forEach(c -> System.out.println(c));
		
		
		// write a program to print all empId
		System.out.println("************ printing empId  ***********");
		emp.stream().forEach(c -> System.out.println(c.getEmpId()));
			
		// intermediate operation  -> which does not provide output ,it provide output only when terminal operation is invoked
		System.out.println("******** intermediate operation ************");
		System.out.println("  Filter"  +emp.stream().filter(p -> p.getEmpName().startsWith("A")) );
	 // write a java program whose salary is greater than  45000.00 
		System.out.println("salary greater than 45000   using fileter only....");
		emp.stream().filter(p -> p.getEmpSalary() < 45000).forEach(c -> System.out.println(c));
	// another way using map ....
		
		System.out.println("using map method");
		emp.stream().map(f -> f.getEmpSalary()).filter(p-> p > 40000).forEach(c -> System.out.println(c));
		
	// write a program to print empName whoes salary is greater than 50000 and name starts with "A"
		emp.stream().filter(p ->  p.getEmpName().startsWith("A")).map(f -> {
			if(f.getEmpSalary() > 45000)
				return f;
			else 
				return null;
		}).forEach(f -> System.out.println(f));
		
	// write a program to create a List object with only the empName starts with "K" 
			
		System.out.println(" write a program to create a List object with only the empName starts with \"K\" ");
	List<String> em = emp.stream().filter(p -> p.getEmpName().startsWith("K")).map(f -> f.getEmpName()).collect(Collectors.toList());
		System.out.println(em);
		
		// write a program to create a Set object with only the empName starts with "K"
		System.out.println(" write a program to create a Set object with only the empName starts with \"K\" ");
		Set<String> em1 = emp.stream().filter(p -> p.getEmpName().startsWith("K")).map(f -> f.getEmpName()).collect(Collectors.toSet());
			System.out.println(em1);
	}

}
