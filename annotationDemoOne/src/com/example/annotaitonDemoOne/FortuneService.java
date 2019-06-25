package com.example.annotaitonDemoOne;

import org.springframework.stereotype.Component;

@Component
public class FortuneService implements Fortune {
	
	@Override
	public String getdailyFortune() {
		// TODO Auto-generated method stub
		return "wear red today";
	}

}
