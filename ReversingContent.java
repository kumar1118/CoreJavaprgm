//Reversing Array Content
package Array;
import java.util.Arrays;
public class ReversingContent {

	public static void main(String[] args) {
		int[] x = {10,3,20,5,11,23,15};
		System.out.println("given array:"+ Arrays.toString(x));
		
		for(int i = 0; i < x.length/2; i++)
		{
			int temp = x[i];
			x[i] = x[x.length - 1 - i];
			x[x.length - 1 - i] = temp;
		}		
		System.out.println("final array:"+ Arrays.toString(x));
	}
}