package com.ravi.java8.lambda;

import java.util.Comparator;

public class Employee  implements Comparable<Employee>{
	
	private String empName;
	private Integer empId;
	private Integer empSalary;
	
	public Employee(String empName, Integer empId, Integer empSalary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
	}



	public Integer getEmpSalary() {
		return empSalary;
	}



	public void setEmpSalary(Integer empSalary) {
		this.empSalary = empSalary;
	}



	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(String empName, Integer empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}



	public Employee(String empName) {
		super();
		this.empName = empName;
	}



	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public Integer getEmpId() {
		return empId;
	}



	public void setEmpId(Integer empId) {
		this.empId = empId;
	}



	@Override
	public String toString() {
		if(null != this && 0 != this.getEmpId() && null != this.getEmpName() && 0 != this.empSalary)
		return "Employee [empName=" + empName + ", empId=" + empId + ", empSalary=" + empSalary + "]";
		else 
			return null;
	}










	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return (e.getEmpId() < this.getEmpId() ? 1 :((e.getEmpId() == this.getEmpId() ? 0 : -1)));
	}



		
}
