package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeDriverStreamfilter {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(12, "Raju", 5678.34f));
		employees.add(new Employee(14, "Anu", 2781.34f));
		employees.add(new Employee(56, "Ojha", 56781.34f));
		employees.add(new Employee(7, "Uma", 3678.34f));

		// filtered condition to create stream of employee whose salary greater
		// than 3700
		Stream<Employee> filteredEmployees = employees.stream().filter(employee -> employee.getSalary() > 3700);
		filteredEmployees.forEach(employee -> System.out.println(employee));
		System.out.println();

		employees.forEach(i -> System.out.println(i));

	}

}
