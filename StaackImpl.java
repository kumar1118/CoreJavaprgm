package com.lara;

import java.util.Stack;

public class StaackImpl 
{
	static void add(Stack stack, int i)
	{
		stack.push(new Integer(i));
		System.out.println("Push("+ i +")");
		System.out.println("Stack :"+stack);
	}
	static void remove(Stack stack)
	{
		System.out.println("Popped ->");
		Integer a = (Integer) stack.pop();
		System.out.println(a);
		System.out.println("Stack :"+stack);
	}
	public static void main(String[] args) 
	{
		Stack st = new Stack();
		add(st, 10);
		add(st, 20);
		add(st, 30);
		add(st, 40);
		remove(st);
		remove(st);
		remove(st);
		remove(st);
		System.out.println("done");
	}
}

/*
Push(10)
Stack :[10]
Push(20)
Stack :[10, 20]
Push(30)
Stack :[10, 20, 30]
Push(40)
Stack :[10, 20, 30, 40]
Popped ->
40
Stack :[10, 20, 30]
Popped ->
30
Stack :[10, 20]
Popped ->
20
Stack :[10]
Popped ->
10
Stack :[]
done
*/