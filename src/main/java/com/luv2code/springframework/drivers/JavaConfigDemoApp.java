package com.luv2code.springframework.drivers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springframework.Coach;
import com.luv2code.springframework.javaConfig.SportConfig;

public class JavaConfigDemoApp {
  public static void main(String[] args) {
	  //load and read java config class 
	  AnnotationConfigApplicationContext context=
			  new AnnotationConfigApplicationContext(SportConfig.class);
	  
	  //get bean from the container
	  Coach theCoach=context.getBean("tennisCoach",Coach.class);
	  
	  //call a method on the bean
	  System.out.println(theCoach.getDailyWorkOut());
	  
	  //call method to get the daily fortune
	  System.out.println(theCoach.getDailyFortune());
	  
	  //close the context
	  context.close();
}
}
