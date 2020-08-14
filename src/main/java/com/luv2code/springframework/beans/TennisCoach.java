package com.luv2code.springframework.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.luv2code.springframework.Coach;

@Component
@Scope("prototype")
public class TennisCoach implements Coach, DisposableBean {
	@Autowired
	@Qualifier("myRandomFortuneService")
	private FortuneService fortuneService;
    
	public TennisCoach() {
		System.out.println("<<TennisCoach-inside default constructor!!");
	}
	
	/*@Autowired
	public TennisCoach(@Qualifier("randomFortuneService")FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}*/
	
	/*@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("<<TennisCoach-inside doSomeCrazyStuff() method");
		this.fortuneService = fortuneService;
	}*/
	
	/*@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("<<TennisCoach-inside setFortuneService() method");
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWorkOut() {
		return "practice daily backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	//add my init method
	@PostConstruct
	public void doMyStartUpStuff(){
		System.out.println(">> TennisCoach: inside doMyStartUpStuff()");
	}
	
	//add my destroy method
	@PreDestroy
	public void doMyCleanUpStuff(){
		System.out.println(">>TennisCoach : inside doMyCleanUpStuff()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(">>TennisCoach : inside destory()");
		
	}
}
