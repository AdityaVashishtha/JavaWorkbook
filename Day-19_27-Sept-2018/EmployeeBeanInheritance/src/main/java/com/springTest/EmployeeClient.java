package com.springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp1);
		Employee empAbstract = (Employee) context.getBean("empAbstract");
		System.out.println(empAbstract);
	}

}
