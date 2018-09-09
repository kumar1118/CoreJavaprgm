package com.lara;

import org.omg.Messaging.SyncScopeHelper;

public class StringReverse 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Welcome-To-ALL");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}

/*
Welcome-To-ALL
LLA-oT-emocleW
*/