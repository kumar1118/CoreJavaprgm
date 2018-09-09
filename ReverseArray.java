package com.lara;

import java.util.Arrays;

public class ReverseArray
{
	public static void main(String[] args) 
	{
		int x[] = {54, 20, 36, 10, 0, 25, 50};
		String y[] = {"Ankita", "Sunita", "Mangal", "Zayara"};
		System.out.println(Arrays.toString(x));
		int temp;
		for(int i = 0; i < x.length/2+1; i++)
		{
			temp = x[i];
			x[i] = x[x.length - i - 1];
			x[x.length - i - 1] = temp;
		}
		System.out.println(Arrays.toString(x));
		String temp1;
		System.out.println(Arrays.toString(y));
		for(int i = 0; i < y.length/2+1; i++)
		{
			temp1 = y[i];
			y[i] = y[y.length - i - 1];
			y[y.length - i - 1] = temp1;
		}
		System.out.println(Arrays.toString(y));
	}
}
