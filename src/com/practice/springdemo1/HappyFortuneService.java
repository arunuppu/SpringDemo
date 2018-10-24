package com.practice.springdemo1;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Message from HappyFortueService";
	}

}
