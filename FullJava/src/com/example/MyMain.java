package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MyMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportsConfig.class);
		TennisCoach myTennisCoach=context.getBean("tennisCoach", TennisCoach.class);
		System.out.println(myTennisCoach.getMyDailyWorkout());
		System.out.println(myTennisCoach.getMyDailyFortune());
		
		context.close();
		
		

	}

}
