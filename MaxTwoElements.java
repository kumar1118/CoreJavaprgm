package com.dev1;

import java.util.Arrays;

public class MaxTwoElements 
{
	public static void main(String[] args) 
	{
		int []x = {10, 20, 30, 40};
		System.out.println(Arrays.toString(x));
		int maxOne = 0;
		int maxTwo = 0;
		for(int i = 0; i < x.length; i++)
		{
			if(x[i] > maxOne)
			{
				maxTwo = maxOne;
				maxOne = x[i];
			}
			else if(x[i] > maxTwo)
			{
				maxTwo = x[i];
			}
		}
		System.out.println("first:"+maxOne);
		System.out.println("Second :"+maxTwo);
	}
}
