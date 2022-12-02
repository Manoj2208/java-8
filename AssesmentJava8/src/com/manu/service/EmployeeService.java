package com.manu.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.manu.dto.Employee;
import com.manu.dto.TechnicalLead;

public class EmployeeService {
	static List<Employee> employees = new ArrayList<>();

	public void setEmployee() {
		String fileName = "C:\\Users\\user\\Music\\emp.csv";
		Pattern pattern = Pattern.compile(",");
		Path path = Paths.get(fileName);
		try (Stream<String> list = Files.lines(path)) {

			employees = list.skip(1).map(line -> {
				String[] arr = pattern.split(line);
				return new Employee(Integer.parseInt(arr[0]), arr[1], LocalDateTime.parse(arr[2]),
						Boolean.parseBoolean(arr[3]), arr[4], Long.parseLong(arr[5]));
			}).collect(Collectors.toList());

			employees.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void getRecentEmployees() {
		employees.stream().sorted(Comparator.comparing(Employee::getDateOfJoin).reversed()).limit(5)
				.forEach(System.out::println);

	}

	public void getByDoj(LocalDateTime dateOfJoin) {
		employees.stream().filter(employee -> employee.getDateOfJoin().equals(dateOfJoin)).forEach(System.out::println);

	}

	public List<LocalDate> getNextWeekWorkingdays(LocalDate date) {
		LocalDate date1 = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		return IntStream.range(0, 5).mapToObj(date1::plusDays).collect(Collectors.toList());
	}

	public void groupByEmployeeType() {
		Map<Boolean, List<Employee>> types = employees.stream().collect(Collectors.groupingBy(Employee::isManager));
		System.out.println(types);
	}

	public List<TechnicalLead> makeTechnicalLead() {
		List<TechnicalLead> leads = new ArrayList<>();
		employees.stream().filter(i -> i.getDateOfJoin().plusYears(7).isBefore(LocalDateTime.now()))
				.map(tech -> new TechnicalLead(tech.getEmployeeId(), tech.getEmployeeName(), tech.getDateOfJoin(),
						tech.isManager(), tech.getEmail(), tech.getPhone()))
				.forEach(leads::add);
		return leads;
	}

}
