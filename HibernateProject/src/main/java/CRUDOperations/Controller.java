package CRUDOperations;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Controller 
{
	public static void main(String[] args) 
	{
		Controller controller = new Controller();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Faculty");
            System.out.println("2. Display Faculty by ID");
            System.out.println("3. Update Faculty");
            System.out.println("4. Delete Faculty");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice;
                choice = sc.nextInt();
  
            

            switch (choice) {
                case 1:
                    controller.addfaculty();
                    break;

                case 2:
                    controller.displayfacultybyid();
                    break;

                case 3:
                    controller.updatefaculty();
                    break;

                case 4:
                    controller.deletefaculty();
                    break;

                case 5:
                    //sc.close();
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
		//controller.displayfacultybyid();
		//controller.deletefaculty();
    }
	public void addfaculty() {
	    Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    
	    SessionFactory sf = configuration.buildSessionFactory();
	    Session session = sf.openSession();
	    
	    Transaction t = session.beginTransaction();
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter Faculty ID:");
	    int id = sc.nextInt();
	    sc.nextLine();  // Consume newline character left by nextInt()

	    System.out.println("Enter Faculty Name:");
	    String name = sc.nextLine();

	    System.out.println("Enter Faculty Gender:");
	    String gender = sc.nextLine();

	    System.out.println("Enter Faculty Department:");
	    String department = sc.nextLine();

	    System.out.println("Enter Faculty Salary:");
	    double salary = sc.nextDouble();
	    sc.nextLine();  // Consume newline character left by nextDouble()

	    System.out.println("Enter Faculty Contact Number:");
	    String contactNo = sc.nextLine();

	    Faculty faculty = new Faculty();
	    faculty.setId(id);
	    faculty.setName(name);
	    faculty.setGender(gender);
	    faculty.setDepartment(department);
	    faculty.setSalary(salary);
	    faculty.setContactno(contactNo);
	    
	    session.persist(faculty);
	    t.commit();
	    
	    System.out.println("Faculty Added Successfully");
	    
	    session.close();
	    sf.close();
	    //sc.close();  // Close the scanner
	}
	//display or find faculty based on ID column 
	public void displayfacultybyid()
	{
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sf = configuration.buildSessionFactory();
		Session session=sf.openSession();
		
		//There is no need to create transaction object because there is no DML Operation
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Faculty ID:");
		int fid = sc.nextInt();
		
		Faculty faculty = session.find(Faculty.class, fid);
		if(faculty!=null)
		{
			System.out.println("Faculty ID:"+faculty.getId());
			System.out.println("Faculty Name:"+faculty.getName());
			System.out.println("Faculty Gender:"+faculty.getGender());
			System.out.println("Faculty Department:"+faculty.getDepartment());
			System.out.println("Faculty Salary:"+faculty.getSalary());
			System.out.println("Faculty Contactno:"+faculty.getContactno());

		}
		else
		{
			System.out.println("Faculty ID Not Found");
		}
		//sc.close();
		session.close();
		sf.close();
		
	}
	public void updatefaculty() 
	{
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sf = configuration.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Faculty ID to Update:");
		int fid = sc.nextInt();
		
		Faculty faculty = session.find(Faculty.class, fid);
		if(faculty!=null)
		{
			System.out.println("Enter Faculty Name:");
			String fname=sc.next();
			System.out.println("Enter Faculty Salary:");
			double fsalary = sc.nextDouble();
			System.out.println("Enter Faculty Contacno:");
			String fcontact = sc.next();
			
			faculty.setName(fname);
			faculty.setSalary(fsalary);
			faculty.setContactno(fcontact);
			
			t.commit();
			System.out.println("Faculty Updated Successfully");
			
		}
		else
		{
			System.out.println("Faculty ID Not Found");
		}
		//sc.close();
		session.close();
		sf.close();
		
		
	}
	public void deletefaculty()
	{
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sf = configuration.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Faculty ID to Delete:");
		int fid = sc.nextInt();
		
		Faculty faculty = session.find(Faculty.class, fid);
		if(faculty!=null)
		{
			session.remove(faculty);
			t.commit();
			System.out.println("Faculty Deleted Successfully");
		}
		else
		{
			System.out.println("Faculty Not Found");
		}
		//sc.close();
	}
}
