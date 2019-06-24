package testPKG;

public class HappyFortuneClass implements FortuneService {
	public HappyFortuneClass() {
		System.out.println("HappyFortuneClass created");
	}
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is ur lucky day";
	}

}
