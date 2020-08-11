package com.luv2code.springframework.drivers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springframework.Coach;

public class AnnotationDemoApp {
  public static void main(String[] args) {
	  //load and read config file
	  ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	  
	  //get bean from the container
	  Coach theCoach=context.getBean("theSillyCoach",Coach.class);
	  
	  //call a method on the bean
	  System.out.println(theCoach.getDailyWorkOut());
	  //close the context
	  context.close();
}
}
