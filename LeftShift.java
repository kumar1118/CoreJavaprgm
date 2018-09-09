//Left Shift by one in the given array.
package Array;
import java.util.Arrays;
public class LeftShift {
	public static void main(String[] args) {
		int[] x = {10,3,20,5,11,23,15};
		System.out.println("given array:"+ Arrays.toString(x));
		for(int i = 0; i < x.length - 1; i++)
		{
			x[i] = x[i+1];
		}		
		
		System.out.println("after left shift:"+ Arrays.toString(x));
	}
}