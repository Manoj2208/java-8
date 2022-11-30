package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentDriver {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "manoj", 8.5f));
		students.add(new Student(2, "abhi", 7.5f));
		students.add(new Student(3, "chandan", 7.4f));

		/*
		 * Comparator comparator = new Comparator<Student>() {
		 * 
		 * @Override public int compare(Student s1, Student s2) { if
		 * (s1.getMarks() > s2.getMarks()) { return 1; } return -1; }
		 * 
		 * };
		 */
		//by using lambda expression we can easily sort by name also
		//we  can still simplify the above code by using lambda expression which implements comparable and comparator also
		Collections.sort(students,(s1,s2)->{return s1.getName().compareTo(s2.getName());});

		for (Student student : students) {
			System.out.println(student);
		}
	}

}
