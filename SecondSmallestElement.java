package com.dev2;

import java.util.Arrays;

public class SecondSmallestElement
{
	public static void main(String[] args) {
		int [] x = {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(x));
		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for(int i = 0; i < x.length; i++)
		{
			if(x[i] < firstSmallest)
			{
				secondSmallest = firstSmallest;
				firstSmallest = x[i];
			}
			else if(x[i] < secondSmallest)
			{
				secondSmallest = x[i];
			}
		}
		System.out.println("First Smallest :"+firstSmallest);
		System.out.println("Second Smallest :"+secondSmallest);
	}
}
