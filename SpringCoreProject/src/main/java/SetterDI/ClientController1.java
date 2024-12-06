package SetterDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientController1 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("*****Dependency Injection using Setter Methods*****");
		Student s = context.getBean(Student.class, "studentbean");// at this line object will be created at run time
		System.out.println(s.toString()); 
		//you can use getter methods also to print properties individually
		context.close();
	}
}
