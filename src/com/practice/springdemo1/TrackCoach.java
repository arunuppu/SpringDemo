package com.practice.springdemo1;

public class TrackCoach implements Coach {
	
/*	String name;
	int id;
	
	public TrackCoach(String name, int id){
		this.name = name;
		this.id = id;
	}*/
	private FortuneService fortuneService;
	public TrackCoach(){
	
	}
		
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run hard 5k";
	}

/*	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}*/


	@Override
	public String getDailyFortune() {
		
		return "From TrackCoach" +fortuneService.getFortune();
	}
	//add an init method
	public void doMyStartupStuff(){
		System.out.println("TrackCoach:from method doMyStartupStuff");
	}
	//add a destroy method
	public void doMyCleanupStuffYoYo(){
		System.out.println("TrackCoach:from method doMyCleanupStuffYoYo");
	}

}
