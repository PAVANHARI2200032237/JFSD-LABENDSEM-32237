package com.klef.jfsd.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.klef.jfsd.model.Employee;

@Transactional// both read & write (commit)
public class EmployeeDAOImpl implements EmployeeDAO 
{
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() 
	{
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public String addEmployee(Employee employee) 
	{
		hibernateTemplate.persist(employee);
		return "Employee Added Succefffully";
	}

	@Override
	public List<Employee> viewAllEmployees() 
	{
		return hibernateTemplate.loadAll(Employee.class);
	}

	@Override
	public String updateEmployee(Employee employee) 
	{
		Employee e = hibernateTemplate.get(Employee.class, employee.getId());
		e.setName(employee.getName());
		e.setSalary(employee.getSalary());
		e.setEmail(employee.getEmail());
		e.setContact(employee.getContact());
		
		return "Employee Update Successfully";
	}

	@Override
	public Employee viewEmployeeByID(int eid) 
	{
		Employee e = hibernateTemplate.get(Employee.class, eid);
		return e;
		
	}

	@Override
	public String deleteEmployee(int eid) 
	{
		Employee e = hibernateTemplate.get(Employee.class, eid);
		hibernateTemplate.delete(e);
		return "Employee Deleted Successfulyy";
	}

}
