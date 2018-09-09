package com.dev2;

import java.util.Scanner;

public class RecursiveReverseString 
{
	public static void reverse(String s)
	{
		if(s == null || s.length() <= 1)
		{
			System.out.println(s);
		}
		else
		{
			System.out.print(s.charAt(s.length()-1));
			reverse(s.substring(0, s.length()-1));
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		reverse(s1);
	}
}
