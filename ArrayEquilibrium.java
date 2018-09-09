package com.dev2;

import java.util.Arrays;

public class ArrayEquilibrium
{
	public static int equilibrium(int [] array, int length)
	{
		int leftSum, rightSum;
		for(int i = 0; i < array.length; i++)
		{
			leftSum = 0;
			rightSum = 0;
			for(int j = 0; j < i; j++)
			{
				leftSum += array[j];
			}
			for(int j = i+1; j < length; j++)
			{
				rightSum += array[j];
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
		int [] array = {1, 4, 2, 10,5, 4, -2};
		System.out.println(Arrays.toString(array));
		int length = array.length;
		System.out.println(equilibrium(array, length));
	}
}
