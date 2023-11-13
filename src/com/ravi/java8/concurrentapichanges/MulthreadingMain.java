package com.ravi.java8.concurrentapichanges;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MulthreadingMain {
	
	public static void main(String[] args) throws InterruptedException {
		// select * from emp;
		// salary = basicSalaryPerDay * NumberOFworkingDays
		Empoyee e = new Empoyee(101, "Ravi",1000 , 21);
		Empoyee e1 = new Empoyee(102, "Kartik",2000 , 20);
		Empoyee e2= new Empoyee(1013, "Abhi",3000 , 25);
		Empoyee e3 = new Empoyee(104, "Vivek",2500 , 28);
		Empoyee e4 = new Empoyee(105, "Durgesh",4000 , 22);
		Empoyee e5 = new Empoyee(106, "Ashok",4500 , 26);
		Empoyee e6 = new Empoyee(107, "Krish",5000 , 30);
		Empoyee e7 = new Empoyee(108, "Vivek",6000 , 27);
		
		List<Empoyee> l = new ArrayList<Empoyee>();
		l.add(e);
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		l.add(e6);
		l.add(e7);
		
		ExecutorService ex = Executors.newFixedThreadPool(4);
	//	service.invokeAll(null);
		List<SalaryCalculation> callableList = new ArrayList<SalaryCalculation>();
		for(int i = 0 ; i < l.size(); i++) {
			
			SalaryCalculation s = new SalaryCalculation(l.get(i));
			callableList.add(s);
		}
		ex.invokeAll(callableList);
		System.out.println("hi..");
		ex.shutdown();
	}

}
