package com.lara;

import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter th number to check palidrome");
		int num = sc.nextInt();
		int reminder, reverse = 0;
		int num1 = num;
		while(num > 0)
		{
			reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;
		}
		if(reverse == num1)
		{
			System.out.println("Entered number is Palidrome");
		}
		else
		{
			System.out.println("Entered number is Not a Palidrome");
		}
	}
}
