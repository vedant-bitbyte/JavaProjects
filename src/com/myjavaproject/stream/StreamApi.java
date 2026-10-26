package com.myjavaproject.stream;

import java.util.List;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamApi {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(10, "Ramesh", 30, 400000));
		employees.add(new Employee(20, "Santosh", 29, 350000));
		employees.add(new Employee(30, "Sanjay", 30, 450000));
		employees.add(new Employee(40, "Pramod", 29, 500000));
		
		List<Employee> employeeSorted = employees.stream()
				.sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
		
		System.out.println(employeeSorted);
	}
}
