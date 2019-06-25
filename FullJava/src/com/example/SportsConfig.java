package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan(basePackages = "com.example")
public class SportsConfig {
	
	@Bean
	public Fortune fortune() {
		return new SadFortuneService();
	}
	
	@Bean
	public TennisCoach tennisCoach(){
		return new TennisCoach(fortune());
	}
	
	
}
