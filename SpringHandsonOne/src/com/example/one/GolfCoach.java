package com.example.one;

public class GolfCoach implements Coach {
	private FortuneService fs;
	public void setFs(FortuneService fs) {
		this.fs = fs;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do 1000 runs daily";
	}
	@Override
	public String getDailyFortune() {
		return fs.getFortune();
	}
}
