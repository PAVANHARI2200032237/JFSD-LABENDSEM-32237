package HQLDemo;



import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;


public class HQLOperations 
{
	public static void main(String args[])
	{
		HQLOperations operations = new HQLOperations();
		Scanner sc = new Scanner(System.in);
		int num;
		while(true)
		{
			System.out.println("1. Add a product");
            System.out.println("2. Display all products (complete object)");
            System.out.println("3. Display all products (partial object)");
            System.out.println("4. Aggregate functions");
            System.out.println("5. Update product (positional parameters)");
            System.out.println("6. Update product (named parameters)");
            System.out.println("7. Delete product (positional parameters)");
            System.out.println("8. Delete product (named parameters)");
            System.out.println("9. Exit");
			System.out.println("Enter Your Choice");
			num = sc.nextInt();
			switch(num)
			{
			case 1:
				operations.addproduct();
				break;
			case 2:
				operations.displayallproductscompleteobj();
				break;
			case 3:
				operations.displayallproductspartialobject();
				break;
			case 4:
				operations.aggeregatefunctions();
				break;
			case 5:
				operations.updatepositionalparams();
				break;
			case 6:
				operations.updatenamedparams();
				break;
			case 7:
				operations.deletepositionalparams();
				break;
			case 8:
				operations.deletenamedparams();
				break;
			case 9:
				sc.close();
				System.out.println("Exitting...");
				System.exit(0);
				break;
			case 10:
				operations.displayproductbyidusingpositionalparams();
				break;
			case 11:
				operations.displayproductbyidusingnamedparams();
				break;
			case 12:
				operations.displayproducts();
				break;
			case 13:
				operations.paginationdemo();
			default:
				System.out.println("Invalid Choice.");
					
			}
		}
		//operations.addproduct();
		//operations.displayallproductscompleteobj();
		//operations.displayallproductspartialobject();
		//operations.aggeregatefunctions();
		//operations.updatepositionalparams();
		//operations.updatenamedparams();
		//operations.deletepositionalparams();
		//operations.deletenamedparams();
	}
	// adding product using persistent object(PO)
	public void addproduct() 
	{
		Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    
	    SessionFactory sf = configuration.buildSessionFactory();
	    Session session = sf.openSession();
	    
	    Transaction t = session.beginTransaction();
	    
	    Product product = new Product();
	    Scanner sc = new Scanner(System.in);
	   /*product.setId(1);
	    product.setCategory("GADGETS");
	    product.setName("IWATCH");
	    product.setCost(45000);
	    product.setStock(10);
	    product.setStatus(true);
	    ///please set stock based on stock value
	    session.persist(product);*/
	    System.out.println("Enter Product ID:");
	    int id = sc.nextInt();
	    sc.nextLine();
	    System.out.println("Enter Category:");
	    String category = sc.nextLine();
	    System.out.println("Enter Name:");
	    String name = sc.nextLine();
	    System.out.println("Enter Product Cost:");
	    double cost = sc.nextDouble();
	    sc.nextLine();
	    System.out.println("Enter Product Quantity:");
	    int stock = sc.nextInt();
	    sc.nextLine();
	    if(stock > 0)
	    {
	    	product.setStatus(true);
	    }
	    else
	    {
	    	product.setStatus(false);
	    }
	    product.setId(id);
	    product.setCategory(category);
	    product.setName(name);
	    product.setCost(cost);
	    product.setStock(stock);
	    session.persist(product);
	    
	    t.commit();
	    
	    System.out.println("Product added successfully");
	    
	    session.close();
	    sf.close();
	    
	}
	/*public void displayproductbyid() {
		Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    
	    SessionFactory sf = configuration.buildSessionFactory();
	    Session session = sf.openSession();
	    Scanner sc= new Scanner(System.in);
	    int pid;
	    System.out.println("Enter ID:");
	    pid = sc.nextInt();
	   // String hql = "from Product where id=";//select * from product_table
	    
	    Query<Product> qry = session.createQuery("from Product where id="+pid, Product.class);
	    List<Product> productlist = qry.getResultList();
	    System.out.println("Total Products="+productlist.size());
	    
	    for(Product p : productlist)
	    {
	    	System.out.println("ID:"+p.getId());
	    	System.out.println("Category:"+p.getCategory());
	    	System.out.println("Name:"+p.getName());
	    	System.out.println("Cost:"+p.getCost());
	    	System.out.println("Quntity:"+p.getStock());
	    	System.out.println("Status:"+p.isStatus());
	    }
	    session.close();
	    sf.close();
	}*/
	public void displayallproductscompleteobj()//complete object
	{
		Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    
	    SessionFactory sf = configuration.buildSessionFactory();
	    Session session = sf.openSession();
	    
	    String hql = "from Product";//select * from product_table
	    
	    Query<Product> qry = session.createQuery(hql, Product.class);
	    List<Product> productlist = qry.getResultList();
	    System.out.println("Total Products="+productlist.size());
	    
	    for(Product p : productlist)
	    {
	    	System.out.println("ID:"+p.getId());
	    	System.out.println("Category:"+p.getCategory());
	    	System.out.println("Name:"+p.getName());
	    	System.out.println("Cost:"+p.getCost());
	    	System.out.println("Quntity:"+p.getStock());
	    	System.out.println("Status:"+p.isStatus());
	    }
	    session.close();
	    sf.close();
	}
	public void displayallproductspartialobject()//partial object
	{
		Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    
	    SessionFactory sf = configuration.buildSessionFactory();
	    Session session = sf.openSession();
	    
	    String hql ="select p.id,p.name,p.cost from Product p";
	    //p is a reference object or alias
	    
	    Query<Object[]> qry = session.createQuery(hql, Object[].class);
	    List<Object[]> productlist = qry.getResultList();
	    
	    System.out.println("Total Products="+productlist.size());
	    for(Object[] obj : productlist)
	    {
	    	System.out.println("Product ID:"+obj[0]);
	    	System.out.println("Product Name:"+obj[1]);
	    	System.out.println("Product Cost:"+obj[2]);
	    }
	    session.close();
	    sf.close();
	    
	}
	public void aggeregatefunctions()
	{
		Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    
	    SessionFactory sf = configuration.buildSessionFactory();
	    Session session = sf.openSession();
	    
	    String hql1 ="select count(*) from Product";
	    //you can also use count(property)
	    Query<Long> qry1 = session.createQuery(hql1,Long.class);
	    Long count = qry1.getSingleResult();
	    System.out.println("Total Products = "+count);
	    
	    
	    String hql2 ="select sum(cost) from Product";
	    Query<Double> qry2 = session.createQuery(hql2,Double.class);
	    double totalcost = qry2.getSingleResult();
	    System.out.println("Total Cost = "+totalcost);
	    
	    String hql3 = "select avg(cost) from Product";
	    Query<Double> qry3 = session.createQuery(hql3,Double.class);
	    double avgcost = qry3.getSingleResult();
	    System.out.println("Average Cost = "+avgcost);
	    
	    
	    String hql4 ="select min(stock) from Product";
	    Query<Integer> qry4 = session.createQuery(hql4,Integer.class);
	    double minstock = qry4.getSingleResult();
	    System.out.println("Minimum stock = "+minstock);
	    
	    String hql5 ="select max(stock) from Product";
	    Query<Integer> qry5 = session.createQuery(hql5,Integer.class);
	    double maxstock = qry5.getSingleResult();
	    System.out.println("Maximum stock = "+maxstock);
	    
	    
	    session.close();
	    sf.close();
	}
	public void updatepositionalparams()
	{
		Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    
	    SessionFactory sf = configuration.buildSessionFactory();
	    Session session = sf.openSession();
	    
	    Transaction t = session.beginTransaction();
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Product ID:");
	    int pid = sc.nextInt();
	    System.out.println("Enter Product Name:");
	    String pname = sc.next();
	    System.out.println("Enter Product Cost:");
	    double pcost = sc.nextDouble();
	    
	    String hql = "update Product set name=?1,cost=?2 where id=?3";
	    MutationQuery qry = session.createMutationQuery(hql);
	    qry.setParameter(1,pname);
	    qry.setParameter(2,pcost);
	    qry.setParameter(3,pid);
	    int n = qry.executeUpdate();
	    
	    t.commit();	
	    System.out.println(n + " Product(s) Updated Successfully");
	    
	    //sc.close();
	    session.close();
	    sf.close();
	    
	}
	public void updatenamedparams()
	{
		Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    
	    SessionFactory sf = configuration.buildSessionFactory();
	    Session session = sf.openSession();
	    
	    Transaction t = session.beginTransaction();
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Product ID:");
	    int pid = sc.nextInt();
	    System.out.println("Enter Product Name:");
	    String pname = sc.next();
	    System.out.println("Enter Product Cost:");
	    double pcost = sc.nextDouble();
	    
	    String hql = "update Product set name=:v1,cost=:v2 where id=:v3";
	    MutationQuery qry = session.createMutationQuery(hql);
	    qry.setParameter("v1",pname);
	    qry.setParameter("v2",pcost);
	    qry.setParameter("v3",pid);
	    int n = qry.executeUpdate();
	    
	    t.commit();
	    System.out.println(n + " Product(s) Updated Successfully");
	    
	    //sc.close();
	    session.close();
	    sf.close();
	}
	
	public void deletepositionalparams()
	{
		Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    
	    SessionFactory sf = configuration.buildSessionFactory();
	    Session session = sf.openSession();
	    
	    Transaction t = session.beginTransaction();
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Product ID:");
	    int pid = sc.nextInt();
	    
	    String hql = "delete from Product where id=?1";
	    MutationQuery qry = session.createMutationQuery(hql);
	    qry.setParameter(1,pid);
	    int n = qry.executeUpdate();
	    
	    t.commit();
	    
	    if(n>0)
	    {
	    	System.out.println("Product deleted successfully");
	    }
	    else
	    {
	    	System.out.println("Product ID Not Found");
	    }
	    
	    //sc.close();
	    session.close();
	    sf.close();
	}
	
	public void deletenamedparams()
	{
		Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    
	    SessionFactory sf = configuration.buildSessionFactory();
	    Session session = sf.openSession();
	    
	    Transaction t = session.beginTransaction();
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Product ID:");
	    int pid = sc.nextInt();
	    
	    String hql = "delete from Product where id=:v";
	    MutationQuery qry = session.createMutationQuery(hql);
	    qry.setParameter("v",pid);
	    int n = qry.executeUpdate();
	    
	    t.commit();
	    
	    if(n>0)
	    {
	    	System.out.println("Product Deleted successfully");
	    }
	    else
	    {
	    	System.out.println("Product ID Not Found");
	    }
	    
	    //sc.close();
	    session.close();
	    sf.close();
	}
	
	//display product by id using positional params
	public void displayproductbyidusingpositionalparams()
	{
		Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    
	    SessionFactory sf = configuration.buildSessionFactory();
	    Session session = sf.openSession();
	    
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter ProductID:");
	    int pid = sc.nextInt();
	    String hql = "from Product where id=?1";//select * from product_table
	    
	    Query<Product> qry = session.createQuery(hql, Product.class);
	    qry.setParameter(1, pid);
	    
	    Product p = qry.getSingleResultOrNull();
	    
	    if(p!=null)
	    {
	    	//we can use getter method to print every every propert of Product object(p)
	    	System.out.println(p.toString());
	    }
	    else
	    {
	    	System.out.println("Product ID Not Found");
	    }
	    //sc.close();
	    session.close();
	    sf.close();
	}
	//display product by id using named params

	public void displayproductbyidusingnamedparams()
	{
		Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    
	    SessionFactory sf = configuration.buildSessionFactory();
	    Session session = sf.openSession();
	    
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter ProductID:");
	    int pid = sc.nextInt();
	    String hql = "from Product where id=:v";//select * from product_table
	    
	    Query<Product> qry = session.createQuery(hql, Product.class);
	    qry.setParameter("v", pid);
	    
	    Product p = qry.getSingleResultOrNull();
	    
	    if(p!=null)
	    {
	    	//we can use getter method to print every every propert of Product object(p)
	    	System.out.println(p.toString());
	    }
	    else
	    {
	    	System.out.println("Product ID Not Found");
	    }
	    //sc.close();
	    session.close();
	    sf.close();
	}
	// display products based on category and stock
	public void displayproducts()
	{
		Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    
	    SessionFactory sf = configuration.buildSessionFactory();
	    Session session = sf.openSession();
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter Product Category:");
	    String pcategory = sc.next(); 
	    System.out.println("Enter Product Category:");
	    int pstock = sc.nextInt(); 
	    
	    String hql = "from Product where category=?1 and stock>=?2";
	    
	    Query<Product> qry = session.createQuery(hql, Product.class);
	    qry.setParameter(1, pcategory);
	    qry.setParameter(2, pstock);
	    List<Product> productlist = qry.getResultList();
	    System.out.println("Total Products="+productlist.size());
	    
	    for(Product p : productlist)
	    {
	    	System.out.println("ID:"+p.getId());
	    	System.out.println("Category:"+p.getCategory());
	    	System.out.println("Name:"+p.getName());
	    	System.out.println("Cost:"+p.getCost());
	    	System.out.println("Quntity:"+p.getStock());
	    	System.out.println("Status:"+p.isStatus());
	    }
	    session.close();
	    sf.close();
	}
	
	//pagination
	  public void paginationdemo()
	  {
		  Configuration configuration = new Configuration();
		  configuration.configure("hibernate.cfg.xml");
	         
		  SessionFactory sf = configuration.buildSessionFactory();
		  Session session = sf.openSession();
	         
		  String hql = "from Product"; // select * from product_table
	         
		  Query<Product> qry = session.createQuery(hql, Product.class);
		  qry.setFirstResult(1);
		  qry.setMaxResults(3);
		  List<Product> productlist =  qry.getResultList();
	         
		  System.out.println("Total Products="+productlist.size());
	         
		  for( Product p : productlist) 
		  {
			  System.out.println(p.toString());
		  }
	          
		  session.close();
		  sf.close();
	   }
	
	
	
	

}







