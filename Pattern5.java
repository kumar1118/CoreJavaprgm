package com.dev2;

import java.util.Scanner;

public class Pattern5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int rows = sc.nextInt();
		for(int i = 1; i <= rows; i++)
		{
			for(int j = 1; j <= rows; j++)
			{
				if(j == 1)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(i+1);
				}
			}
			System.out.println();
		}
	}
}
/*
12222
23333
34444
45555
56666
*/
