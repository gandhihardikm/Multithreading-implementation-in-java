package com.sjsu.javamultithreading;

public class Racer implements Runnable {
	private static boolean isRaceWon=false;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		for (int distance = 0;distance<=100;distance=distance+10){
			System.out.println(Thread.currentThread().getName() + " completed " + distance + "%.");
			if(distance==100)
			{
				isRaceWon=true;
				System.out.println("Winner is : " + Thread.currentThread().getName());
			}
			if(isRaceWon)
				break;
		}	
	}
}


