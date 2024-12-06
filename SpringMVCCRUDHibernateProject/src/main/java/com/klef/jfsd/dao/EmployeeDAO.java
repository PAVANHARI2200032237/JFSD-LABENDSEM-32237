package com.klef.jfsd.dao;

import java.util.List;

import com.klef.jfsd.model.Employee;

public interface EmployeeDAO 
{
	public String addEmployee(Employee employee);
	public List<Employee> viewAllEmployees();
	public String updateEmployee(Employee employee);
	public Employee viewEmployeeByID(int eid);
	public String deleteEmployee(int eid);
}
