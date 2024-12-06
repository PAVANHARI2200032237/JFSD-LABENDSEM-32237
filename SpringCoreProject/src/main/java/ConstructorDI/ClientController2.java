package ConstructorDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientController2
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("*****Dependency Injection using Constructor Methods*****");
		
		Faculty f = (Faculty)context.getBean("facultybean");  
		System.out.println(f.toString());
		
		context.close();
	}
}
