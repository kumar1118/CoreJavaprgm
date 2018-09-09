package com.dev2;

import java.util.Arrays;

public class ArrayElementCount
{
	static void count(int []x, int n)
	{
		int length = x.length;
		int counter=0;
		for(int i = 0; i < length; i++)
		{
			counter++;
		}
		System.out.println(counter);
	}
	public static void main(String[] args)
	{
		int []x = {10, 20, 30, 40};
		System.out.println(Arrays.toString(x));
		count(x, x.length);
	}
}
