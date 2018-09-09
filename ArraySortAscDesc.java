package com.dev1;

import java.util.Arrays;

public class ArraySortAscDesc
{
	static void order(int []x, int n)
	{
		Arrays.sort(x);
		for(int i = 0; i < n/2; i++)
		{
			System.out.print(x[i]+", ");
		}
		for(int i = n-1; i> n/2; i--)
		{
			System.out.print(x[i]+", ");
		}
	}
	public static void main(String[] args)
	{
		int [] x = {10, 20, 30, 5, 15, 25, 35, 40};
		System.out.println(Arrays.toString(x));
		int length = x.length;
		order(x, length);
	}
}
