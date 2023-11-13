package com.ravi.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.ravi.java8.lambda.Employee;

public class StreamImpl1 {
	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(100);
		l.add(2);
		l.add(30);
		l.add(90);

		// write the program to sort the above list
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);

		System.out.println("Reverse order");
		l.stream().sorted(Collections.reverseOrder()).forEach(n -> System.out.println(n));

		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Ravi", 123, 43000));
		emp.add(new Employee("Kartik", 233, 50000));
		emp.add(new Employee("Aavi", 223, 65000));
		emp.add(new Employee("Abhi", 103, 40000));
		emp.add(new Employee("Aniket", 105, 55000));

		System.out.println("sort the Employee in ascending.......");
		emp.stream().sorted().forEach(c -> System.out.println(c));
		System.out.println("*****************sort the Employee in descending order****************........ ");
		emp.stream().sorted(Collections.reverseOrder()).forEach(c -> System.out.println(c));

		// emp.sort(Comparator.comparing(Employee::getEmpSalary));\

		// write the program to sort the employee based on the salary
		System.out.println("***********  sorting based on the  salary************");

		emp.stream().sorted((e1, e2) -> (e1.getEmpSalary().compareTo(e2.getEmpSalary())))
				.forEach(c -> System.out.println(c));
		System.out.println(" ---------min salary  --------  " + emp.get(0));
		System.out.println("----------max salary-------" + emp.get(4));

		// write the program to sort the Employee bases on the name
		System.out.println("*************sorting base on the name********************");

		emp.stream().sorted((e1, e2) -> (e1.getEmpName().compareTo(e2.getEmpName())))
				.forEach(c -> System.out.println(c));

		// write the program to print the employee who is getting min salary

		// emp.stream().min((e1,e2)->
		// e1.getEmpSalary()-e2.getEmpSalary().getInteger(null)
		System.out.println("************* min salary**********");
		System.out.println(emp.stream().min((e1, e2) -> e1.getEmpSalary() - e2.getEmpSalary()));

		// write the program to print the employee who is getting maz salary

		System.out.println("************* max salary**********");
		System.out.println(emp.stream().max((e1, e2) -> e1.getEmpSalary() - e2.getEmpSalary()));

		Employee[] empArray = new Employee[5];

		empArray[0] = new Employee("Ravi", 123, 43000);
		empArray[1] = new Employee("Kartik", 233, 50000);
		empArray[2] = new Employee("Aavi", 223, 65000);
		empArray[3] = new Employee("Abhi", 103, 40000);
		empArray[4] = new Employee("Aniket", 105, 55000);
		// 1st approach write the program to print to sort Arrays Employee on the basis
		// of salary..
		List<Employee> empArraysSort = Arrays.stream(empArray).sorted((e1,
				e2) -> (e1.getEmpSalary() < e2.getEmpSalary()) ? -1 : (e1.getEmpSalary() == e2.getEmpSalary()) ? 0 : 1)
				.collect(Collectors.toList());

		System.out.println(
				"$$$$$$$$$$$$$$$$$    sort  emp Array on the basis of salary  ascending order.. $$$$$$$$$$$$$$ "
						+ empArraysSort);
		System.out.println("@@@@@@@@@ min salary @@@@@@@@  " + empArraysSort.get(0));
		System.out.println("&&&&&&&&&&  max salary &&&&&&&&&& " + empArraysSort.get(empArraysSort.size() - 1));

		System.out.println("--------------- using find first----------------------");
		// find First
		// 2nd approach write the program to print to sort Arrays Employee on the basis
		// of salary.. -1 +1 Ascending order +1 -1 descending order
		Optional<Employee> op = Arrays.stream(empArray).sorted((e1, e2) -> (e1.getEmpSalary() < e2.getEmpSalary()) ? -1
				: (e1.getEmpSalary() == e2.getEmpSalary()) ? 0 : 1).findFirst();
		
		if(op.isPresent()) {
			System.out.println("============  2nd Appraoch ..min salary  using findFirst() =========" + op.get());
		}
		

		Optional<Employee> op1 = Arrays.stream(empArray).sorted((e1, e2) -> (e1.getEmpSalary() < e2.getEmpSalary()) ? 1
				: (e1.getEmpSalary() == e2.getEmpSalary()) ? 0 : -1).findFirst();
		if(op1.isPresent()) {
			System.out.println("============  2nd Appraoch ..max  salary  using findFirst() =========" + op1.get());
		}



		// using the min and max
		System.out.println("-------using min and max   method-----------");

		Optional<Employee> min1 = Arrays.stream(empArray).min((e1, e2) -> (e1.getEmpSalary() < e2.getEmpSalary()) ? -1
				: (e1.getEmpSalary() == e2.getEmpSalary() ? 0 : 1));
		if(min1.isPresent()){
			
			System.out.println("!!!!!!!!!!!!!!!    using the min terminal  operator  !!!!!!!!!!!!!!" + min1.get());
		}
		

		Optional<Employee> max1 = Arrays.stream(empArray).max((e1, e2) -> (e1.getEmpSalary() > e2.getEmpSalary()) ? 1
				: (e1.getEmpSalary() == e2.getEmpSalary() ? 0 : -1));
		
		
		if(max1.isPresent()) {
			System.out.println("!!!!!!!!!!!!!!!    using the max terminal  operator  !!!!!!!!!!!!!!" + max1.get());
		}
		

		// have 1000 employee

		// limit and skip method

		// write a program to print the employee having nth highest salary
		// write a program to print the employee having 2th minimum salary
		System.out.println("==============  2nd min salary.......... using limit and skip method......========");
		emp.stream()
				.sorted((e1, e2) -> (e1.getEmpSalary() < e2.getEmpSalary()) ? -1
						: (e1.getEmpSalary() == e2.getEmpSalary() ? 0 : 1))
				.limit(2).skip(1).forEach(c -> System.out.println(c));

		//// write a program to print the employee having 2th highest salary
		System.out.println("==============  2nd  max  salary.......... using limit and skip method......========");
		emp.stream()
				.sorted((e1, e2) -> (e1.getEmpSalary() < e2.getEmpSalary()) ? 1
						: (e1.getEmpSalary() == e2.getEmpSalary() ? 0 : -1))
				.limit(2).skip(1).forEach(c -> System.out.println(c));

		// write the program to print the average salary.. using the summarizing method

		System.out.println("++++++++++   using  summarizing  method find the  average salary ++++++++++++"
				+ emp.stream().collect(Collectors.summarizingInt(p -> p.getEmpSalary())));

		 IntSummaryStatistics d1 = emp.stream().collect(Collectors.summarizingInt(p -> p.getEmpSalary()));
		 System.out.println("summary statistic average min max");
		 System.out.println(d1);
		 System.out.println(d1.getAverage());
		 System.out.println(d1.getMax());
		 System.out.println(d1.getMin());
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(23);
		l1.add(13);
		l1.add(25);
		l1.add(40);
		l1.add(5);
		System.out.println("+++++++++++++++limit  method========= ");
		l1.stream().limit(3).forEach(c -> System.out.println(c));
		System.out.println("-----------------Skip method========= ");
		l1.stream().skip(2).forEach(c -> System.out.println(c));

		// write a program to sort the hashSet.

		Set<Integer> s1 = new HashSet<>();
		s1.add(10);
		s1.add(100);
		s1.add(2);
		s1.add(30);
		s1.add(90);

		Set s2 = new HashSet();

		System.out.println(" 1st Approach write a program to sort the hashSet");
		// 1st Approach
		List<Integer> l2 = new LinkedList<Integer>(s1);
		Collections.sort(l2);
		System.out.println(l2);
		// 2nd Approach..
		System.out.println(" 2nd Approach write a program to sort the hashSet");
		List<Integer> l3 = s1.stream().collect(Collectors.toList());
		System.out.println(l3);
	}

}
