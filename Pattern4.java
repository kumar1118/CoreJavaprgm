package com.dev2;

import java.util.Scanner;

public class Pattern4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		int rows = num;
		int cols = num;
		for(int i = 1; i <= rows; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i = 1; i <= rows; i++)
		{
			for(int j = cols; j >= i; j--)
			{
				System.out.print(num);
			}
			num--;
			System.out.println();
		}
	}
}

/*
Enter num
4
1
22
333
4444
4444
333
22
1

*/