package com.luv2code.springframework.beans;

import org.springframework.beans.factory.annotation.Value;
import com.luv2code.springframework.Coach;

public class SwimCoach implements Coach {
	@Value("${foo.swim.name}")
	private String name;
	
	@Value("${foo.swim.email}")
	private String email;
	
	@Value("${foo.swim.team}")
	private String team;
	
	@Value("${foo.swim.city}")
	private String city;
	
	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice daily 1000m swimming as warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void getCoachInfo(){
		System.out.println("\nCoach Details :");
		System.out.println("Name  :"+name);
		System.out.println("Email  :"+email);
		System.out.println("Team  :"+team);
		System.out.println("City  :"+city);
	}
	

}
