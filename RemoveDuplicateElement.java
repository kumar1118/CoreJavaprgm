package com.dev2;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateElement 
{
	public static void removeDuplicate(int []x, int n)
	{
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for(int i = 0; i < x.length; i++)
		{
			set.add(x[i]);
		}
		System.out.println(set);
	}
	public static void main(String[] args)
	{
		int [] x = {1, 5, 2, 4, 2, 1, 5, 20, 10, 20, 10};
		System.out.println(Arrays.toString(x));
		removeDuplicate(x, x.length);
	}
}
