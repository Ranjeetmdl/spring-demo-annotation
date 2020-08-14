package com.luv2code.springframework.drivers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springframework.Coach;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load the config file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the beans from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//compare the beans(ie check if they are same)
		boolean result=(theCoach==alphaCoach);
		
		System.out.println("\nBoth pointing to same object :"+result);
		
		System.out.println("\nMemory location of theCoach :"+theCoach);
		System.out.println("\nMemory location of alphaCoach :"+alphaCoach);
		
		//close the context
		context.close();
		

	}

}
