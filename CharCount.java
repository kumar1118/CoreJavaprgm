package com.dev1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount
{
	public static void countChar(String s1)
	{
		char[] ch = s1.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < ch.length; i++)
		{
			if(map.containsKey(ch[i]))
			{
				map.put(ch[i], map.get(ch[i])+1);
			}
			else
			{
				map.put(ch[i], 1);
			}
		}
		System.out.println(map);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.next();
		countChar(s);
	//	System.out.println(ch);
	}
}
