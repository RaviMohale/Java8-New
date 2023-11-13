package com.ravi.java8.map;

import java.util.HashMap;
import java.util.Map;

public class StreamOperationOnMap {
	public static void main(String[] args) {
		
		Map<Integer,String> m = new HashMap<Integer, String>();
		m.put(1, "a");
		m.put(12, "o");
		m.put(7, "z");
		m.put(4, "r");
		m.put(9, "b");
		
		
		// write a program to sort the Map on the basis of key
		System.out.println(" ===========  sort on the basis of key  ============");
		m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(p -> System.out.println(p));
		
		
		// write a program to sort the Map on the basis of value
		System.out.println("========= sort on the basis of value   ===========");
		m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(p -> System.out.println(p));
		
	}

}
