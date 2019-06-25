package com.example.annotaitonDemoOne;

import org.springframework.stereotype.Component;

@Component
public class ALLcaps implements Coach {

	@Override
	public String getMyDailyWorkout() {
		// TODO Auto-generated method stub
		return "All caps so bean is same as class name";
	}

}
