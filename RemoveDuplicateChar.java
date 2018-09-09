package com.dev1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateChar 
{
	public static Character removeChar(String s)
	{
		char[] ch = s.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i = 0; i < ch.length; i++)
		{
			set.add(ch[i]);
		}
		for(Character c : set)
		{
			System.out.print(c);
		}
		return null;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String  s1 = sc.nextLine();
		removeChar(s1);
	}
}
