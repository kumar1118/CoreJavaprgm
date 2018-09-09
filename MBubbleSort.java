package com.lara;

import java.util.Arrays;

public class MBubbleSort
{
	public static void main(String[] args)
	{
		int x[] = {34, 25, 18, 10, 8, 3, 0, 73, 11};
		System.out.println(Arrays.toString(x));
		int temp;
		for(int i = 0; i < x.length; i++)
		{
			for(int j = 1; j < x.length; j++)
			{
				if(x[j] < x[j-1])
				{
					temp = x[j];
					x[j] = x[j-1];
					x[j-1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(x));
	}
}
