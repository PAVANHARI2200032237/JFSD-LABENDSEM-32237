package GeneratorClassDemo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class Demo 
{
	public static void main(String[] args) 
	{
		Demo demo = new Demo();
		//demo.addEmployee();
		demo.displayallemps();
	}
	public void addEmployee()
	{
		Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    
	    SessionFactory sf = configuration.buildSessionFactory();
	    Session session = sf.openSession();
	    
	    Transaction t = session.beginTransaction();
	    
	    Scanner sc = new Scanner(System.in);

	    Employee e = new Employee();
	    // where id is auto increment(default)
	    e.setName("JFSD");
	    e.setGender("MALE");
	    e.setContact("9440765488");
	    session.persist(e);
	    t.commit();
	    
	    System.out.println("Employee Added Successfully");
	    
	    session.close();
	    sf.close();
	    sc.close();
	}
	public void displayallemps()
	{
		Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    
	    SessionFactory sf = configuration.buildSessionFactory();
	    Session session = sf.openSession();
	    
	    String hql = "from Employee";//select * from employee_table
	    
	    Query<Employee> qry = session.createQuery(hql, Employee.class);
	    List<Employee> employeelist = qry.getResultList();
	    
	    System.out.println("Total Employess="+employeelist.size());
	    
	    for(Employee e : employeelist)
	    {
	    	System.out.println("ID="+e.getId());
	    	System.out.println("Name="+e.getName());
	    	System.out.println("Gender="+e.getGender());
	    	System.out.println("Contact="+e.getContact());
	    }
	    session.close();
	    sf.close();
	    
	}
}
