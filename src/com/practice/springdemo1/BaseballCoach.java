package com.practice.springdemo1;

public class BaseballCoach implements Coach {
	//define private field for dependency 
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	private String message;
	private TrackCoach tc;
	@Override
	public String getDailyWorkout(){
		return "spend 30 min on practice";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public TrackCoach getTc() {
		return tc;
	}
	public void setTc(TrackCoach tc) {
		this.tc = tc;
	}
	@Override
	public String getDailyFortune() {
		//use my fortuneservice to get the message
		return fortuneService.getFortune();
	}

}
