package com.springTest;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {
	@Autowired
	SessionFactory sessionFactory;
	
	public void addCustomer(Customer customer) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		session.save(customer);
		t.commit();
	}
}
