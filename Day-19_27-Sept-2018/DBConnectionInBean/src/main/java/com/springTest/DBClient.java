package com.springTest;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DBClient {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		AbstractApplicationContext abContext = (AbstractApplicationContext) context;
		abContext.registerShutdownHook();
		DatabaseConnection dbCon = (DatabaseConnection) context.getBean("dbCon");
		Connection con = dbCon.getCon();
	}
}
