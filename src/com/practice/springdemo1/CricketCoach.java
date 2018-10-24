package com.practice.springdemo1;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	//add new fields
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		System.out.println("I am inside CricketCoach Setter method- setEmailAddress");
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
		System.out.println("I am inside CricketCoach Setter method- setTeam");

	}
	//no-arg constructor
	public CricketCoach(){
		System.out.println("I am inside CricketCoach no-arg Constructor");
	}
	//Setter method to injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("I am inside CricketCoach Setter method- setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice 15 min of Bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
