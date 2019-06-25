package com.example;

import org.springframework.stereotype.Component;


public class TennisCoach implements Coach {
	private Fortune myFortune;
	
	public TennisCoach() {
		super();
	}

	public TennisCoach(Fortune myFortune) {
		super();
		this.myFortune = myFortune;
	}

	@Override
	public String getMyDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do 100 back head daily";
	}
	
	public String getMyDailyFortune() {
		return myFortune.getdailyFortune();
	}
}
