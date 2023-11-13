package com.ravi.java8.localdate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationOnDate {
	public static void main(String[] args) {
		
		List<LocalDate> l1 = new ArrayList<LocalDate>();
		l1.add(LocalDate.of(2021, 1, 01));
		l1.add(LocalDate.of(2022, 2, 01));
		l1.add(LocalDate.of(2020, 2, 13));
		l1.add(LocalDate.of(2022, 5, 24));
		l1.add(LocalDate.of(2023, 7, 28));
		
		l1.stream().sorted().forEach(p-> System.out.println(p));
		List<LocalDate> l2 = l1.stream().sorted().collect(Collectors.toList());
		System.out.println(l2);
	}

}
