package com.dev1;

import java.util.Scanner;

class AgeException extends Exception
{
	public AgeException(String age)
	{
		super(age);
	}
}
public class CustomException
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		if(age > 18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			try
			{
				throw new AgeException("Not eligible for voting");
			}
			catch(AgeException e)
			{
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
		}
	}
}
