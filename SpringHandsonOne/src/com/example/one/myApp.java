package com.example.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class myApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Coach myGolfCoach=context.getBean("myGolfCoach", Coach.class);
		System.out.println(myGolfCoach.getDailyWorkout());
		System.out.println(myGolfCoach.getDailyFortune());
	}

}
