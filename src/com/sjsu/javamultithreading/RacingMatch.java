package com.sjsu.javamultithreading;

public class RacingMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Racer race = new Racer();
		Thread biker1 = new Thread(race,"biker1");
		Thread biker2 = new Thread(race,"biker2");
		
		biker1.start();
		biker2.start();
	}
}
