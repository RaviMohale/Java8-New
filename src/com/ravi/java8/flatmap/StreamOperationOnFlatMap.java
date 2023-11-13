package com.ravi.java8.flatmap;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamOperationOnFlatMap {
	public static void main(String[] args) {

		List<String> l1 = new ArrayList<String>();

		l1.add("Ravi");
		l1.add("Kiran");
		l1.add("Abhi");
		l1.add("Jui");
		l1.add("Krishna");

		List<String> l2 = new ArrayList<String>();

		l2.add("Raji");
		l2.add("Sonu");
		l2.add("Kishor");
		l2.add("Vijay");
		l2.add("Darshan");
		
		
		
		List<List<String>> finalList = new ArrayList<List<String>>();
		finalList.add(l1);
		finalList.add(l2);
		
		// without Java8
		
		
		//List<List<String>>   ==>  List<String>
		
		//List<List<String>>   ===> one to many mapping
		// before java 8 without using the stream
		 System.out.println("=============    without java8   ================");
		List<String>l3 = new ArrayList<String>();
		for(int i = 0; i < finalList.size() ; i++) {
			List<String> l4 = finalList.get(i);
			
			for(int j = 0; j < l4.size();j++) {
				String s1 = l4.get(j);
				l3.add(s1);
			}
			
		}
		System.out.println(l3);
		
		// using java 8
		System.out.println("****************     using java8 ********************");
		List<String> nameList = finalList.stream().flatMap(p -> p.stream()).collect(Collectors.toList());
		System.out.println(nameList);
	}
}
