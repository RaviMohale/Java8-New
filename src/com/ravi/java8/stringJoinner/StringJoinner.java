package com.ravi.java8.stringJoinner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;

import com.ravi.java8.lambda.Employee;

public class StringJoinner {
	
	public static void main(String[] args) {

		List<String> l1 = new ArrayList<>();
		l1.add("Ravi");
		l1.add("Kiran");
		l1.add("Rani");
		l1.add("Raju");
		l1.add("Abhi");
		l1.add("Nishu");
		l1.add("Vivek");
		
		
		List<String> l2 = new ArrayList<>();
		l2.add("Kavi");
		l2.add("Kiran");
		l2.add("Kni");
		l2.add("Kaju");
		l2.add("Kbhi");
		l2.add("Kishu");
		l2.add("Kivek");
		// packageName.class@Hexa
		
		System.out.println(l1);
		
		StringJoiner sj1 = new StringJoiner(", ","[ ","] "); // delimiter , prefix , suffix
		for(int i = 0; i < l1.size(); i++) {
			sj1.add(l1.get(i));
		}
		System.out.println(" using string joinner" + sj1);
	
		System.out.println("----------------   All Match  -----------");
		
		System.out.println(" using  allMatch  "  +l1.stream().allMatch(p -> p.startsWith("R")));// allMatch will check the entire collections ,if any one occurrence if not match it will return false
		System.out.println(" using  allMatch  "  +l2.stream().allMatch(p -> p.startsWith("K")));// if all occurrence is match then it will return false.
		System.out.println(" using  anyMatch  "  +l1.stream().anyMatch(p -> p.startsWith("K")));// if first occurrence is match it will return true, it will not check the entire collection
		System.out.println(" using  noneMatch  "  +l1.stream().noneMatch(p -> p.startsWith("K")));// if anything is match it will return False
		System.out.println(" using  noneMatch  "  +l2.stream().noneMatch(p -> p.startsWith("R")));// if anything is not match it will return True
		
		
		// using findAny() method
		
		Optional<String> op = l1.stream().findAny();
		op.ifPresent(p -> System.out.println("using findAny() method  " + p));
		
		
		// using reduce method
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Ravi",101,50000));
		emp.add(new Employee("Kavi",102,40000));
		emp.add(new Employee("Raju",103,45000));
		emp.add(new Employee("Abhi",104,60000));
		emp.add(new Employee("Nishu",105,35000));
		System.out.println("................  Using reduce method  ............"); 
		emp.stream().map( p -> p.getEmpSalary()).reduce((m, n) -> m+n).ifPresent(p -> System.out.println(p));
	System.out.println("==================  AllMatch() ===================");
	boolean flag = emp.stream().allMatch(p ->{
		if(p.getEmpSalary() > 40000 && p.getEmpId() > 103) {
			return true;
			
		}else {
			return false;
		}
	});
	System.out.println(flag);
	}

}
