package com.luv2code.springframework.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	private Random myRandom=new Random();

	private String[] data = { 
			"Beware of wolf's in clothes", 
			"A faithful friend is a strong defense",
			"A beautiful, smart, and loving person will be coming into your life",
			"A friend asks only for your time not your money" 
			};

	@Override
	public String getFortune() {
		int index=myRandom.nextInt(data.length);
		String fortune=data[index];
		return fortune;
	}

}
