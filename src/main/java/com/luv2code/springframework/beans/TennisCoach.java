package com.luv2code.springframework.beans;

import org.springframework.stereotype.Component;

import com.luv2code.springframework.Coach;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		return "practice daily backhand volley";
	}

}
