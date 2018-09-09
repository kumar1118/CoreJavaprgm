package com.lara;

import java.util.Scanner;

public class Fabbonacci 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Series");
		int series = sc.nextInt();
		int first = 1, second = 2, next;
		for(int i = 1; i <= series; i++)
		{
			System.out.println(first);
			next = first + second;
			first = second;
			second = next;
		}
	}
}
