package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
	@Autowired
	Fortune fortuneObject;
	
	@Override
	public String getDailyWorkout() {
		
		return "do 90 pushups today";
	}
	public String getDailyFortune() {
		return fortuneObject.getFortune();
	}
	

}
