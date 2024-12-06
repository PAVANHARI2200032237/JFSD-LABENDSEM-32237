package ConstructorDI;

import java.util.List;

public class Faculty 
{ 
	 private int id;//primitive data type
	 private String name;// non primitive data type
	 private String gender;// non primitive data type
	 private float age;//primitive data type
	 private double salary;//primitive data type
	 private boolean mstatus;//primitive data type
	 private List<String> courses;// non primitive data type
	 @Override
	 public String toString() 
	 {
  		return "Faculty [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", salary=" + salary
				+ ", mstatus=" + mstatus + ", courses=" + courses + "]";
	 }
	 public Faculty(int id, String name, String gender, float age, double salary, boolean mstatus,
			List<String> courses) 
	 {
		//super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
		this.mstatus = mstatus;
		this.courses = courses;
	 }
	 
}
