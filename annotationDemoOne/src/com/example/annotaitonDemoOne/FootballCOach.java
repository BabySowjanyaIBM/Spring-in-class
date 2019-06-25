package com.example.annotaitonDemoOne;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:coach.property")
public class FootballCOach implements Coach {
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;

	// property level dependency injection
	@Autowired
	@Qualifier("newFortune")
	//@Qualifier("fortuneService")
	private Fortune myFortuneService;

	public FootballCOach() {
		super();
	}
	// COnstructor level dependency injection
//	@Autowired
//	public FootballCOach(Fortune myFortuneService) {
//		super();
//		this.myFortuneService = myFortuneService;
//	}

	// setter level dependency injection
//	@Autowired
//	public void setMyFortuneService(Fortune myFortuneService) {
//		this.myFortuneService=myFortuneService;
//	}

	// custom method dependency injection
//	@Autowired
//	public void customInjection(Fortune myFortuneServiceCustom) {
//		this.myFortuneService=myFortuneServiceCustom;
//	}

	@PostConstruct
	public void doMyInitStuff() {
		System.out.println("this is doMyInitStuff()");
	}

	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("thisis from myCleauStuff()");
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getMyDailyWorkout() {
		// TODO Auto-generated method stub
		return "do running daily";
	}

	public String getDailyFortune() {
		return this.myFortuneService.getdailyFortune();
	}
}
