package com.dev1;

import java.util.Arrays;

public class MergeTwoArrays 
{
	public static int[] merge(int []x1, int [] x2)
	{
		int length1 = x1.length;
		int length2 = x2.length;
		int [] result = new int[length1+length2];
		int i = 0, j = 0;
		for(int k = 0; k < result.length; k++)
		{
			if(i >= length1)
			{
				result[k] = x2[j];
				j++;
			}
			else if(j >= length2)
			{
				result[k] = x1[i];
				i++;
			}
			else
			{
				if(x1[i] < x2[j])
				{
					result[k] = x1[i];
					i++;
				}
				else
				{
					result[k] = x2[j];
					j++;
				}
			}
		}
		return result;
	}
	public static void main(String[] args)
	{
		int []x1 = {10, 20, 30, 40};
		int [] x2 = {5, 15, 25, 35};
		int [] result = merge(x1, x2);
		/*for(int i = 0; i < result.length; i++)
		{
			System.out.print(result[i]+", ");
		}*/
		System.out.println(Arrays.toString(result));
	}
}

















