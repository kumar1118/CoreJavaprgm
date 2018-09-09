//Average value of  elements of given array.
package Array;

import java.util.Arrays;

public class Average {

	public static void main(String[] args) {
		int[] x = {10,12,14,16,18,15,20};
		System.out.println("given array:"+ Arrays.toString(x));
		int sum = 0;
		for(int i =0;i <x.length; i++)
		{
			sum +=x[i];
		}
		double avg = sum/ x.length;
		System.out.println("avg value:"+ avg);
	}
}
