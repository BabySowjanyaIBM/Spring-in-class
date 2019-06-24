package testPKG;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		BaseballCoach mybaseballCoach=context.getBean("MyBaseballCoach", BaseballCoach.class);
//		System.out.println(mybaseballCoach.getEmail());
//		System.out.println(mybaseballCoach.getTeam());
//		System.out.println(mybaseballCoach.getDailyWorkout());
//		System.out.println(mybaseballCoach.getDailyFortuneService());
		
		ClassPathXmlApplicationContext context1=new ClassPathXmlApplicationContext("propertiesApplicationContext.xml");
		TennisCoach myTennisCoach1=context1.getBean("myTennisCoach", TennisCoach.class);
		//System.out.println(myTennisCoach1.getEmail());
		
		//ClassPathXmlApplicationContext context2=new ClassPathXmlApplicationContext("propertiesApplicationContext.xml");
		TennisCoach myTennisCoach2=context1.getBean("myTennisCoach", TennisCoach.class);
		
		boolean result=(myTennisCoach1==myTennisCoach2);
		System.out.println("both objects are the same"+result);
		System.out.println("mytenniscoach1 memory location"+myTennisCoach1);
		System.out.println("mytenniscoach2 memory location"+myTennisCoach2);
		
	}

}
