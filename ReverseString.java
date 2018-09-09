package com.lara;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String s1 = "WELCOME-to-INDIA";
		char[] c1 = s1.toCharArray();
		System.out.println(s1);
		for(int i = c1.length - 1; i >= 0; i--)
		{
			System.out.print(c1[i]);
		}
	}
}
/*
WELCOME-to-INDIA
AIDNI-ot-EMOCLEW
*/