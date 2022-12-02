package com.manu.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.manu.service.EmployeeService;

public class EmployeeController {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		Scanner scanner = new Scanner(System.in);
		boolean x = true;
		do {
			System.out.println(
					"choices are:\n1.Read text data containing Employee data and populate it to static collection\n2.Get top 5 employees based on joining date\n3.Get employees based on JoiningDate input (it should be with time)\n4.Get all working days for the next week\n5.Categorize employees as Regular and Manager based on their isManager field\n6.Populate list with Object TechnicalLead for Employees having experience >7 yrs\n7.exit");
			System.out.println("enter your choice");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				employeeService.setEmployee();
				break;

			case 2:
				employeeService.getRecentEmployees();
				break;

			case 3:
				String dateOfJoin = "2020-07-01T11:23:43";
				LocalDateTime date = LocalDateTime.parse(dateOfJoin,
						DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
				employeeService.getByDoj(date);
				break;

			case 4:
				System.out.println(employeeService.getNextWeekWorkingdays(LocalDate.now()));
				break;

			case 5:
				employeeService.groupByEmployeeType();
				break;

			case 6:
				System.out.println(employeeService.makeTechnicalLead());
				break;

			case 7:
				x = false;
				break;

			default:
				System.out.println("invalid choice");
			}
		} while (x);
		scanner.close();
	}

}
