package Array;

import java.util.Arrays;
import java.util.Scanner;
public class Manager3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size = sc.nextInt();
		int[] x = new int[size];
		for(int i = 0; i <x.length; i++)
		{
		System.out.println("enter an int values for" + i + "index");
		x[i] = sc.nextInt();
		}
		System.out.println("array content:"+ Arrays.toString(x));
	}
} 