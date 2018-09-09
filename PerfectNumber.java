package com.dev2;

import java.util.Scanner;

public class PerfectNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer");
		int num = sc.nextInt();
		int temp = 0;
		for(int i = 1; i <= num/2; i++)
		{
			temp += i;
		}
		if(temp == num)
		{
			System.out.println(num+" is a perfect number");
		}
		else
		{
			System.out.println(num+" is not a perfect number");
		}
	}
}
