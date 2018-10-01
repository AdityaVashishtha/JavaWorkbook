package com.empLaptop;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddEmployee {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Address address1 = new Address(1, "Bhawarkua", "Indore");
		Address address2 = new Address(2,"Rajwada","Indore");
		Employee emp = new Employee(1,"Abhinav",2500,address1);
		Employee e1 = new Employee(2,"Suraj",3500,address1);
		Employee e2 = new Employee(3,"Ashish",4000,address2);
		Employee e3 = new Employee(4,"Aditya",4000,address1);
		Laptop l1 = new Laptop("Dell","SOMEMODE-0",45000);
		Laptop l2 = new Laptop("Lenovo","320P",45000);	
		e1.getLaptops().add(l1);
		e2.getLaptops().add(l2);
		e3.getLaptops().add(l1);
		session.save(l1);
		session.save(l2);
		session.save(e1);
		session.save(e2);		
		session.save(e3);		
		Employee fetchedEmp = session.get(Employee.class, 2);
		System.out.println("_____________________________________________-");
		System.out.println(fetchedEmp);
		
		transaction.commit();		
	}

}
