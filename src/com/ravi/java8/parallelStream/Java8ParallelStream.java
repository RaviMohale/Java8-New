package com.ravi.java8.parallelStream;

import java.util.ArrayList;
import java.util.List;

public class Java8ParallelStream {
	public static void main(String[] args) {
		
		
		List<String> l1 = new ArrayList<>();
		l1.add("Ravi");
		l1.add("Kiran");
		l1.add("Rani");
		l1.add("Raju");
		l1.add("Abhi");
		l1.add("Nishu");
		l1.add("Vivek");
		
		// write a program  to print the name whose name start with 'R';
		System.out.println("Using stream.........");// stream follow sequentially
		l1.stream().filter(p -> p.startsWith("R")).forEach(s -> System.out.println(s)); // insertion order maintain in list
		System.out.println("using Parallel Stream **********   ");
		l1.parallelStream().filter(p -> p.startsWith("R")).forEach(s -> System.out.println(s)); // multiple threads  method execute parallel on the collection
		System.out.println("insertion order maintain their is  forEachOrdered Method ....");
		l1.parallelStream().filter(p -> p.startsWith("R")).forEachOrdered(p -> System.out.println(p));// using forEachOrdered we can guarantee the ordered
	}

}
