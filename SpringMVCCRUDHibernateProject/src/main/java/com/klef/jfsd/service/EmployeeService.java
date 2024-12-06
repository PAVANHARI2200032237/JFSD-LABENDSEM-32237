package com.klef.jfsd.service;

import java.util.List;

import com.klef.jfsd.model.Employee;

public interface EmployeeService 
{
	public String addEmployee(Employee employee);
	public List<Employee> viewAllEmployees();
	public String updateEmployee(Employee employee);
	public Employee viewEmployeeByID(int eid);
	public String deleteEmployee(int eid);
}
