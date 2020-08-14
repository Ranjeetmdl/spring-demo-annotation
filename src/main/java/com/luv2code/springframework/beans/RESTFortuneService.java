package com.luv2code.springframework.beans;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Your REST api will gonna be effective ones!";
	}

}
