package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		FootballCoach fc1=context.getBean("footballCoach", FootballCoach.class);
		System.out.println(fc1.getDailyWorkout());
		System.out.println(fc1.getDailyFortune());
	}

}
