package logicalCoding;

import java.util.Scanner;

public class Q77 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter month name");
		String month =sc.nextLine();
		//char c = month.charAt(0);
		if(month.equals("JAN") || month.equals("FEB") || month.equals("MARCH"))
		{
			System.out.println("Q1");
		}
		else if(month.equals("APRIL")||month.equals("MAY") || month.equals("JUNE"))
		{
			System.out.println("Q2");
		}
		else if(month.equals("JULY") || month.equals("AUGUST") || month.equals("SEP"))
		{
			System.out.println("Q3");
		}
		else if(month.equals("OCTOBER") || month.equals("NOV") || month.equals("DEC"))
		{
			System.out.println("Q4");
		}
		else{
			System.out.println("Please Try Again!");
		}
	}
}
