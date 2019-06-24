package testPKG;

public class BaseballCoach implements Coach {
	private String email;
	private String team;
	private FortuneService fs;

	

	public BaseballCoach() {
		super();
		System.out.println("BaseballCoach: default cons");
	}

//	public BaseballCoach(FortuneService fs1) {
//		super();
//		this.fs = fs1;
//		System.out.println("BaseballCoach: paramaterized cons");
//	}

	public void setFs(FortuneService fs) {
		System.out.println("dependency injection performed..");
		this.fs = fs;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "do 500 pushups daily";
	}
	
	@Override
	public String getDailyFortuneService() {
		return fs.getFortune();
	}
}
