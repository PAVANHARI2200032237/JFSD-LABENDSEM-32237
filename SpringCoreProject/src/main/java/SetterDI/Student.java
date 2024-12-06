package SetterDI;

import java.util.List;

public class Student 
{
	private int id;//primitive data type
	private String name;//non primitive data type
	private String gender;//non primitive data type
	private float age;//primitive data type
	private double cgpa;//primitive data type
	private int backlogs;//primitive data type
	private boolean graduated;//primitive data type
	private List<String> certifications;//non primitive data type
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", cgpa=" + cgpa
				+ ", backlogs=" + backlogs + ", graduated=" + graduated + ", certifications=" + certifications + "]";
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
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public int getBacklogs() {
		return backlogs;
	}
	public void setBacklogs(int backlogs) {
		this.backlogs = backlogs;
	}
	public boolean isGraduated() {
		return graduated;
	}
	public void setGraduated(boolean graduated) {
		this.graduated = graduated;
	}
	public List<String> getCertifications() {
		return certifications;
	}
	public void setCertifications(List<String> certifications) {
		this.certifications = certifications;
	}
	
	
}
