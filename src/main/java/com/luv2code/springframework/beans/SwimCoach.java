package com.luv2code.springframework.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.luv2code.springframework.Coach;

@Component
public class SwimCoach implements Coach {
	@Value("${foo.swim.name}")
	private String name;
	
	@Value("${foo.swim.email}")
	private String email;
	
	@Value("${foo.swim.team}")
	private String team;
	
	@Value("${foo.swim.city}")
	private String city;
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkOut() {
		return "Practice backside up swimming for 15 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void coachInfo(){
		System.out.println("Name  :"+name);
		System.out.println("Email  :"+email);
		System.out.println("Team  :"+team);
		System.out.println("City  :"+city);
	}
	

}
