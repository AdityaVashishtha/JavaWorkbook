package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpClient {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		Address address = new Address(1, "Bhawarkua", "Indore", "MP", "452015");
		Area area = new Area(1, "Indore", "MP");
		Area areab = new Area(2,"Bhopal","MP");
		session.save(area);
		session.save(areab);
		Name name = new Name("ABHINAV", "KUMAR", "JAIN");
		Product p1 = new Product(1, "LAPPY", 45000, "DELL");
		Product p2 = new Product(2, "TAB", 15000, "LENOVO");
		session.save(p1);
		session.save(p2);
		Branch branch = new Branch(1, "BHAWARKUA", address);
		session.save(branch);		
		Emp emp = new Emp();
		emp.setAddress(address);
		emp.setArea(area);
		emp.setBranch(branch);
		emp.setEmpno(1);
		emp.setEname(name);
		emp.getProducts().add(p1);
		emp.getProducts().add(p2);
		session.save(emp);
		emp = new Emp();
		emp.setAddress(address);
		emp.setArea(area);
		emp.setBranch(branch);
		emp.setEmpno(2);
		emp.setEname(name);
		emp.getProducts().add(p1);
		emp.getProducts().add(p2);
		session.save(emp);
		t.commit();
	}

}
