package com.luv2code.springframework.drivers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springframework.Coach;
import com.luv2code.springframework.beans.SwimCoach;
import com.luv2code.springframework.javaConfig.SportConfig;

public class SwimJavaConfigDemoApp {
  public static void main(String[] args) {
	  //load and read java config class 
	  AnnotationConfigApplicationContext context=
			  new AnnotationConfigApplicationContext(SportConfig.class);
	  
	  //get bean from the container
	  SwimCoach theCoach=context.getBean("getSwimCoach",SwimCoach.class);
	  
	  //call a method on the bean
	  System.out.println(theCoach.getDailyWorkOut());
	  
	  //call method to get the daily fortune
	  System.out.println(theCoach.getDailyFortune());
	  
	  theCoach.getCoachInfo();
	  
	  //close the context
	  context.close();
}
}
