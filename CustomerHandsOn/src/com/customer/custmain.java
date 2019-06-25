package com.customer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class custmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CustomerConfig.class);
		Customer cust1=context.getBean("customer", Customer.class);
		System.out.println(cust1.getHuman());
		
		context.close();
	}

}
