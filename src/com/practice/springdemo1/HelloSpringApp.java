package com.practice.springdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		/*BaseballCoach ch = new BaseballCoach();
		ch.setMessage("spend 50 min on practice");
			
		TrackCoach tc = new TrackCoach("name1",10);
		ch.setTc(tc);*/
		// TODO Auto-generated method stub
		//load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		//BaseballCoach theCoach= context.getBean("myCoach",BaseballCoach.class);
		Coach theCoach= context.getBean("myCoach",Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
//		System.out.println(theCoach.getMessage());
//		System.out.println(theCoach.getTc().getName());
		
		//call methods from FortuneService
		System.out.println(theCoach.getDailyFortune());
		
		//close context
		context.close();
	}

}
