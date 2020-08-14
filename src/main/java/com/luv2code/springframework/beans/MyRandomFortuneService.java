package com.luv2code.springframework.beans;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class MyRandomFortuneService implements FortuneService {
	@Value("${foo.myRandom.fotunes}")
	private String[] fortunes;

	private Random myRandom=new Random();
	@Override
	public String getFortune() {
		int index=myRandom.nextInt(fortunes.length);
		return fortunes[index];
	}

}
