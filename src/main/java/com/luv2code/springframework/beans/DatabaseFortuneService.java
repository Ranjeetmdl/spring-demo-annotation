package com.luv2code.springframework.beans;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "your DB is up & running and in healthy condition!";
	}

}
