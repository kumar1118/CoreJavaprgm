package com.dev2;

import java.util.Arrays;

public class ArrayAscDesc
{
	public static void order(int []x, int n)
	{
		Arrays.sort(x);
		for(int i = 0; i < n/2; i++)
		{
			System.out.print(x[i]+", ");
		}
		for(int i = n- 1; i >=n/2; i--)
		{
			System.out.print(x[i]+", ");
		}
	}
	public static void main(String[] args) 
	{
		int [] x = {2, 8, 4, 6, 10, 30, 20};
		System.out.println(Arrays.toString(x));
		order(x, x.length);
	}
}
