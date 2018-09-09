package com.dev1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram
{
	public static void isAnagram(String s1, String s2)
	{
		String st1 = s1.replaceAll("\\s", "");
		String st2 = s2.replaceAll("\\s", "");
		boolean flag = true;
		if(st1.length() != st2.length())
		{
			flag = false;
		}
		else
		{
			char[] ch1 = st1.toLowerCase().toCharArray();
			char[] ch2 = st2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			flag = Arrays.equals(ch1, ch2);
		}
		if(flag)
		{
			System.out.println(st1+" and "+st2+" is Anagram");
		}
		else
		{
			System.out.println(st1+" and "+st2+" is not Anagram");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two String for checking anagram");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		isAnagram(s1, s2);
	}
}

















