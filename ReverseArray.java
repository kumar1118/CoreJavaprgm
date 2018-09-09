package com.dev2;

import java.util.Arrays;

public class ReverseArray
{
	public static void main(String[] args) 
	{
		int []x = {10, 20, 30, 40};
		System.out.println(Arrays.toString(x));
		for(int i = 0; i < x.length/2; i++)
		{
			int temp = x[x.length-i-1];
			x[x.length-i-1] = x[i];
			x[i] = temp;
		}
		System.out.println(Arrays.toString(x));
	}
}
