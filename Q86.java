package logicalCoding;

import java.util.Scanner;

public class Q86 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x and y");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("x="+x);
		System.out.println("y="+y);
		x = x+y;
		y = x- y;
		x =  x - y;
		System.out.println("value of x and y after swapping");
		System.out.println("x="+x);
		System.out.println("y="+y);
		
	}

}
/*
enter the value of x and y
1
2
x=1
y=2
value of x and y after swapping
x=2
y=1
*/