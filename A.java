package com.dev1;
/*
@kumar1118
*
*/
public class A  
{
	int data;
	A ref;
	static A head;
	static A tail;
	A(int data)
	{
		this.data = data;
	}
	static void add(int data)
	{
		A obj = new A(data);
		if(head == null)
		{
			head = obj;
			tail = obj;
		}
		else
		{
			tail.ref = obj;
			tail = tail.ref;
		}
	}
	static void print()
	{
		A current = head;
		while(current != null)
		{
			System.out.print(current.data+", ");
			current = current.ref;
		}
		System.out.println();
	}
	
	static boolean contains(int data)
	{
		A current = head;
		boolean flag = false;
		while(current != null)
		{
			if(current.data == data)
			{
				flag  = true;
				break;
			}
			current = current.ref;
		}
		return flag;
	}
	static int indexOf(int data)
	{
		A current = head;
		int index = -1; 
		int occurance = -1;
		boolean flag = false;
		while(current != null)
		{
			index++;
			if(current.data == data)
			{
				flag = true;
				break;
			}
			current = current.ref;
		}
		if(! flag)
		{
			index = occurance;
		}
		return index;
	}
	static boolean remove(int data)
	{
		A current = head, prev = head;
		boolean flag = false;
		if(head.data == data)
		{
			head = head.ref;
			flag = true;
		}
		while(current != null)
		{
			if(current.data == data)
			{
				prev.ref = current.ref;
				flag = true;
			}
			prev = current;
			current = current.ref;
		}			
		return flag;
	}
	public static int removeAtIndex(int index) {
		A current = head, prev = head;
		int currentInddex = 0;
		int data = 0;
		boolean flag = false;
		if(index == currentInddex)
		{
			data = head.data;
			head = head.ref;
			return data;
		}
		currentInddex++;
		prev = current;
		current = current.ref;
		while(current != null)
		{
			if(index == currentInddex)
			{
				data = current.data;
				prev.ref = current.ref;
				break;
			}
			currentInddex++;
			prev = current;
			current = current.ref;
		}
		return data;
	}
	public static void main(String[] args) 
	{
		add(10);
		add(20);
		add(30);
		add(40);
		add(50);
		add(60);
		add(70);
		add(80);
		print();
//		System.out.println(contains(10));
//		System.out.println(contains(1000));
//		System.out.println(indexOf(30));
//		System.out.println(indexOf(1000));
//		System.out.println(removeAtIndex(2));
//		System.out.println(removeAtIndex(10));
		System.out.println(remove(10));
		print();
		System.out.println(remove(100));
		print();
	}
}













