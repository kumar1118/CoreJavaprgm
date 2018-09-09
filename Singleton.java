package com.dev3;

public class Singleton 
{
	public static Singleton singlton;
	private Singleton()
	{
		
	}
	public static Singleton getSingleton()
	{
		if(singlton == null)
		{
			singlton = new Singleton();
		}
		return singlton;
	}
}
