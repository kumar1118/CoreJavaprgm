package com.dev2;

import java.util.Scanner;

public class MaxPossibleNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer");
		String s1 = sc.nextLine();
		char[] ch1 = s1.toCharArray();
		for(int i = 0; i < ch1.length; i++)
		{
			for(int j = i+1; j < ch1.length; j++)
			{
				if(ch1[i] < ch1[j])
				{
					char temp = ch1[j];
					ch1[j] = ch1[i];
					ch1[i]  = temp;
				}
			}
		}
		System.out.println(ch1);
	}
}
