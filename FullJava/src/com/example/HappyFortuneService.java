package com.example;

import org.springframework.stereotype.Component;


public class HappyFortuneService implements Fortune {
	
	@Override
	public String getdailyFortune() {
		// TODO Auto-generated method stub
		return "great day today";
	}

}
