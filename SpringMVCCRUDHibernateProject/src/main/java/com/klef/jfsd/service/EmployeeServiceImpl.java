package com.klef.jfsd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.klef.jfsd.dao.EmployeeDAO;
import com.klef.jfsd.model.Employee;

public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired
	private EmployeeDAO employeeDAO;
	
	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	public String addEmployee(Employee employee) {
		return employeeDAO.addEmployee(employee);
	}

	@Override
	public List<Employee> viewAllEmployees() {
		
		return employeeDAO.viewAllEmployees();
	}

	@Override
	public String updateEmployee(Employee employee) {
		
		return employeeDAO.updateEmployee(employee);
	}

	@Override
	public Employee viewEmployeeByID(int eid) {
		
		return employeeDAO.viewEmployeeByID(eid);
	}

	@Override
	public String deleteEmployee(int eid) {
		return employeeDAO.deleteEmployee(eid) ;
	}

}
