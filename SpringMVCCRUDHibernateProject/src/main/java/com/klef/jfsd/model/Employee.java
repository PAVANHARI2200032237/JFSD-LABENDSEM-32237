package com.klef.jfsd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_table")
public class Employee 
{
	@Id
    @Column(name = "employee_id")
	private int id;
	@Column(name = "employee_name",nullable=false,length = 100)
	private String name;
	@Column(name = "employee_gender",nullable=false,length = 10)
	private String gender;
	@Column(name = "employee_dateofbirth",nullable=false,length = 20)
	private String dateofbirth;
	@Column(name = "employee_department",nullable=false,length = 50)
	private String department;
	@Column(name = "employee_salary",nullable=false)
	private double salary;
	@Column(name = "employee_location",nullable=false,length = 100)
	private String location;
	@Column(name = "employee_email",nullable=false,unique = true,length = 100)
	private String email;
	@Column(name = "employee_contact",nullable=false,unique = true,length = 20)
    private String contact;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", dateofbirth=" + dateofbirth
				+ ", department=" + department + ", salary=" + salary + ", location=" + location + ", email=" + email
				+ ", contact=" + contact + "]";
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
}
