package com.example.annotaitonDemoOne;

import org.springframework.stereotype.Component;

@Component("MyTennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getMyDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do 100 back head daily";
	}

}
