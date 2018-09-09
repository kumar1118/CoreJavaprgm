package com.dev1;

import java.util.Arrays;

public class ArrayIndexEqui 
{
	public static int equiIndex(int []x, int n)
	{
		int leftSum, rightSum;
		for(int i = 0; i < x.length; i++)
		{
			leftSum = 0;
			rightSum= 0;
			for(int j = 0; j < i; j++)
			{
				leftSum += x[j];
			}
			for(int j = i+1; j < n; j++)
			{
				rightSum += x[j];
			}
			if(leftSum == rightSum)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int [] x = {1, 2, 6, 0, 4, 5};
		System.out.println(Arrays.toString(x));
		int length = x.length;
		System.out.println(equiIndex(x, length));
	}
}
