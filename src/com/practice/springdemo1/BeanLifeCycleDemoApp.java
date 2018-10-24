package com.practice.springdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		//load Spring Config file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class); 
		
		//Check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		//print the results
		System.out.println("Pointing to the same object: "+result);
		System.out.println("memory location of the coach: "+theCoach);
		System.out.println("memory location of the alphaCoach: "+alphaCoach);

		//close the context
		context.close();
	}

}
