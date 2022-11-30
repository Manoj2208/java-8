package com.java8;

public class Student {
//implements Comparable<Student> 

	private int id;
	private String name;
	private float marks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	public Student(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	/*@Override
	public int compareTo(Student student2) {
		if(this.getMarks()>student2.getMarks()){
			return 1;
		}
		else return -1;*/
		
		
		//in case of comparator interface no need to implement comparable 
		//we can also implement our own logic there

}

