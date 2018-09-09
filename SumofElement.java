//Sum of elements of given array.
package Array;
import java.util.Arrays;

public class SumofElement {

	public static void main(String[] args) {
		int[] x = {10,3,20,8,40,18,29,25};
		System.out.println("given array:"+ Arrays.toString(x));
		int sum = 0;
		for(int i : x)
		{
			sum += i;
		}
		System.out.println("sum:"+ sum);
	}
}