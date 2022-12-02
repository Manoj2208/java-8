package com.manu.dto;

import java.time.LocalDateTime;

public class Employee {
	private int employeeId;
	private String employeeName;
	private LocalDateTime dateOfJoin;
	private boolean isManager;
	private String email;
	private long phone;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public LocalDateTime getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(LocalDateTime dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public boolean isManager() {
		return isManager;
	}

	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Employee(int employeeId, String employeeName, LocalDateTime dateOfJoin, boolean isManager, String email,
			long phone) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfJoin = dateOfJoin;
		this.isManager = isManager;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", dateOfJoin=" + dateOfJoin
				+ ", isManager=" + isManager + ", email=" + email + ", phone=" + phone + "]";
	}

}
