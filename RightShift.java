//Right Shift by one in the given array.
package Array;
import java.util.Arrays;
public class RightShift {

	public static void main(String[] args) {
		int[] x = {10,3,20,5,11,23,15};
		System.out.println("given array:"+ Arrays.toString(x));
		for(int i = x.length - 1; i > 0 ; i--)
		{
			x[i] = x[i-1];
		}		
		
		System.out.println("after right shift:"+ Arrays.toString(x));
	}
}