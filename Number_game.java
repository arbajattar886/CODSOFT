package com.sunbeam.info;

import java.util.Random;
import java.util.Scanner;

public class Number_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int chances=7;
		boolean playagain=true;
		int final_score=0;
		System.out.println("Welcome To Game!!!");
		System.out.println("Hey Buddy you have about "+ chances+" to win the Game");
		
		while(playagain)
		{
			int ramdom=getrandNum(1,100);
			boolean guess=false;
			for(int i=0;i<chances;i++)
			{
				System.out.println("Chance "+(i+1)+" Enter your Guess: ");
				int user=sc.nextInt();
				if(user==ramdom)
				{
					guess=true;
					final_score+=1;
					System.out.println("You Won It..");
					break;
				}
				else if(user>ramdom) 
				{
					System.out.println("Too High...");
				}
				else
				{
					System.out.println("Too Low...");
				}
			}
			
			if(guess==false)
			{
				System.out.println("Sorry Buddy...You lost the chance...The number is "+ramdom);
			}
			
			System.out.println("Do you want to play again(Y/N)");
			String pA=sc.next();
			playagain=pA.equalsIgnoreCase("Y");
			
		}
		System.out.println("That's it....Hope you have enjoyed Game...");
		System.out.println("Here is your score "+final_score);
		
		
		
				
		
	}
	// For getting random number from 1 to 100 
			public static int getrandNum(int min,int max)
			{
				return (int)(Math.random()*(max-min+1)+min);
			}

}
