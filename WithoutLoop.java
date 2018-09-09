package com.dev2;

import java.util.Scanner;

public class WithoutLoop 
{
	static int count;
	static void print(String s)
	{
		while(count < 20)
		{
			System.out.println(s);
			count++;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		print(s1);
	}
}
