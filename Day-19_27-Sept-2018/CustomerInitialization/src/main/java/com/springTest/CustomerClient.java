package com.springTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerClient {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Customer customerUsingSetter = (Customer) context.getBean("customerUsingSetter");
		Customer customerUsingConstructor = (Customer) context.getBean("customerUsingConstructor");
		System.out.println("Customer From Setter");
		System.out.println(customerUsingSetter);
		System.out.println("Customer From Constructor");
		System.out.println(customerUsingConstructor);
	}
}
