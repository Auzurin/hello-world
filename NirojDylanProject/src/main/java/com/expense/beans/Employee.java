package com.expense.beans;

public class Employee {
	private int empId;
	private String firstName;
	private String lastName;
	private String title;
	private String email;
	private int phoneNumber;
	private String username;
	private String password;
	//want to include picture for profile pic
	
	 public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(int empId, String firstName, String lastName, String title, String email, String username,
			String password) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.email = email;
		this.username = username;
		this.password = password;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", title=" + title
				+ ", email=" + email + ", username=" + username + "]";
	}
	 
	 
	
	
}
