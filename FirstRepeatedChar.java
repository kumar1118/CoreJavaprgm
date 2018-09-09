package com.dev1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class FirstRepeatedChar
{
	static Character repeatedChar(String s1)
	{
		Character ch;
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for(int i = 0; i < s1.length(); i++)
		{
			ch = s1.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		for(int i = 0; i < s1.length(); i++)
		{
			ch =s1.charAt(i);
			if(map.get(ch)== 1)
			{
				return ch;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		char ch = repeatedChar(s1);
		System.out.println(ch);
	}
}
