package com.example.annotaitonDemoOne;

import org.springframework.stereotype.Component;

@Component
public class NewFortune implements Fortune {

	@Override
	public String getdailyFortune() {
		// TODO Auto-generated method stub
		return "this is  new fortune";
	}

}
