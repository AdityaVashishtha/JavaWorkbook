package com.springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CardClient {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		CreditCard card = (CreditCard) context.getBean("card");
		RewardCalculator calc = (RewardCalculator) context.getBean("rcalc");
		calc.calculate(5000);
	}
}
