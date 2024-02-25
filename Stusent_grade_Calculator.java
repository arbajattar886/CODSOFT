package com.sunbeam;

import java.util.Scanner;

public class Stusent_grade_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		boolean flag=true;
		
		while(flag)
		{
			double percentage;
			int sum=0,max=100;
			System.out.println("Enter number of subjects :");
			int num=sc.nextInt();
			if(num<=0)
			{
				System.out.println("Please enter valid number of subjects....");
				return;
			}
			
			//Sum up the marks obtained in all subjects
			for(int i=1;i<=num;i++)
			{
				System.out.println("Enter marks obtained in subject "+i+" out of 100");
				int marks=sc.nextInt();
				if(marks<0|| marks>max)
				{
					System.out.println("Please enter marks in the range of 0-100");
					i--;
				}
				else
				{
					sum+=marks;
				}
			}
			
			//Divide the total marks by the total number of subjects to get the average percentage.
			double div=num*max;
			percentage=(sum/div)*100;
			
			//Assign grades based on the average percentage achieved.
			
			if(percentage>=90)
			{
				System.out.println("Student Achived :Grade A");
			}
			else if (percentage<90 && percentage>=80) 
			{
				System.out.println("Student Achived :Grade B");
			}
			else if (percentage<80 && percentage>=70) 
			{
				System.out.println("Student Achived :Grade C");
			}
			else if (percentage<70 && percentage>=60) 
			{
				System.out.println("Student Achived :Grade D");
			}
			else if (percentage<60) 
			{
				System.out.println("Student Achived :Grade F");
			}
			
			//Show the total marks, average percentage, and the corresponding grade to the user
			
			System.out.println("Total number of marks: "+sum);
			System.out.println("Average percentage: "+percentage);
			
			System.out.println("For countinue press: 1 && For Exit press: Any number key");
			int status=sc.nextInt();
			if(status==1)
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
			
		
		}
		System.out.println("Thank you For chosing this app......");
			
	}

}
