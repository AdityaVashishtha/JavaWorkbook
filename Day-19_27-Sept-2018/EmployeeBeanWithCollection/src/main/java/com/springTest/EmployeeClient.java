package com.springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		 Employee emp = (Employee) context.getBean("employee");
		 System.out.println(emp);

	}

}
