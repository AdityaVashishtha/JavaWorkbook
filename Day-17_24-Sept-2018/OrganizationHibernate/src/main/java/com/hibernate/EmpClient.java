package com.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class EmpClient {
	public static Session session;
	
	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		Address address = new Address(1, "Bhawarkua", "Indore", "MP", "452015");
		Name name = new Name("ABHINAV", "KUMAR", "JAIN");
		Name name2 = new Name("SURAJ", "KUMAR", "JAIN");
		
		Area area1 = new Area(1, "Indore", "MP");
		Area area2 = new Area(2,"Bhopal","MP");		
		
		Product p1 = new Product(1, "LAPPY", 45000, "DELL");
		Product p2 = new Product(2, "TAB", 15000, "LENOVO");
		session.save(p1);
		session.save(p2);
		
		Branch branch = new Branch(1, "BHAWARKUA", address);
		session.save(branch);		
		
		Emp emp = new Emp();
		emp.setAddress(address);
		emp.getArea().add(area1);
		emp.setBranch(branch);
		emp.setEmpno(1);
		emp.setEname(name);
		emp.getProducts().add(p1);
		emp.getProducts().add(p2);
		session.save(emp);
		
		Emp emp2 = new Emp();
		emp2.setAddress(address);
		emp2.getArea().add(area2);
		emp2.setBranch(branch);
		emp2.setEmpno(2);
		emp2.setEname(name2);
		emp2.getProducts().add(p1);
		emp2.getProducts().add(p2);
		session.save(emp2);
		t.commit();
		
		//FETCHING EMPLOYEE DETAILS BY ID
		fetchEmployeeDetails(1);
		
		//FETCH MULTIPLE EMPLOYEE DETAILS
		fetchAllEmployeeDetails();
		
		//FETCH EMPLOYEES WITH ORDER BY
		fetchEmployeesWithOrderBY();
		
		//FETCH EMPLOYEES WITH PROJECTION
		filterEmployees();
	}
	
	
	public static void fetchEmployeeDetails(int empno) {
		Emp e = session.get(Emp.class, empno);
		System.out.println("EMPLOYEE DETAILS WITH ENO "+1+" IS ::");		
		System.out.println(e);
		System.out.println("_______________________________________");
	}
	
	public static void fetchAllEmployeeDetails() {
		Criteria cr = session.createCriteria(Emp.class);
		List<Emp> emps = cr.list();
		for (Emp emp : emps) {
			System.out.println(emp);
		}
	}
	
	public static void fetchEmployeesWithOrderBY() {
		Criteria cr = session.createCriteria(Emp.class);
		Order order = Order.desc("empno");
		cr.addOrder(order);
		List<Emp> emps = cr.list();
		for (Emp emp : emps) {
			System.out.println(emp);
		}
	}
	
	public static void filterEmployees() {
		Criteria cr = session.createCriteria(Emp.class);
		Order order = Order.desc("empno");
		Criterion criterion = Restrictions.gt("empno", 1);
		cr.add(criterion);		
		cr.addOrder(order);
		List<Emp> emps = cr.list();
		for (Emp emp : emps) {
			System.out.println(emp);
		}
	}

}
