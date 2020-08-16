package com.luv2code.springframework.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.luv2code.springframework.Coach;
import com.luv2code.springframework.beans.FortuneService;
import com.luv2code.springframework.beans.SadFortuneService;
import com.luv2code.springframework.beans.SwimCoach;

@Configuration
//@ComponentScan("com.luv2code.springframework")
@PropertySource("classpath:sports.properties")
public class SportConfig {
	//define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
	}
	
	//define bean for swim coach and inject the dependency
	@Bean
	public Coach getSwimCoach(){
		return new SwimCoach(sadFortuneService());
	}

}
