package com.example.annotaitonDemoOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		TennisCoach myTennisCoach=context.getBean("MyTennisCoach", TennisCoach.class);
		System.out.println(myTennisCoach.getMyDailyWorkout());
		
		FootballCOach myFootballCoach=context.getBean("footballCOach",FootballCOach.class);
		System.out.println(myFootballCoach.getMyDailyWorkout());
		System.out.println(myFootballCoach.getDailyFortune());
		System.out.println(myFootballCoach.getEmail());
		
		ALLcaps myallcaps=context.getBean("ALLcaps", ALLcaps.class);
		System.out.println(myallcaps.getMyDailyWorkout());
		context.close();
		
		

	}

}
