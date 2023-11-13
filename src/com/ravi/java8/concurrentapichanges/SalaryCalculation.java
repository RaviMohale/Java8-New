package com.ravi.java8.concurrentapichanges;

import java.util.concurrent.Callable;

public class SalaryCalculation implements Callable<Empoyee> {
	private Empoyee e = null;
	 SalaryCalculation(Empoyee e) {
		this.e = e;
	}
	
	@Override
	public Empoyee call() {
		
		e.setEmpSalary(salaryCalculation(e));
		return e;
		
	}
	// when you go with the Callable interface is when you want to return some object...
	public double salaryCalculation(Empoyee e) {
	double salary	= e.getBasicSalaryPerDay()*e.getNoOfWorkingDays();
	return salary;//e.setEmpSalary(salary);
	}
}
