package com.dev2;

import java.util.Scanner;

public class Factorial 
{
	static int factorial(int num)
	{
		if(num == 0)
		{
			return 1;
		}
		else
		{
			return num*factorial(num-1);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int i = factorial(num);
		System.out.println(i);
	}
}
