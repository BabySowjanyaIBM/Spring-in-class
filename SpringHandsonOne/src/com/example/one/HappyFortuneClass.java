package com.example.one;

public class HappyFortuneClass implements FortuneService {
	
	@Override
	public String getFortune() {
		String arr[]= {"Wear white today","Wear black today","Wear grey today","Wear red today"};
		String toreturn=arr[(int) (Math.random()*arr.length)];
		return toreturn;
	}

}
