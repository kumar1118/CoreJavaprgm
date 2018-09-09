//Left Rotate by one in the given array.
package Array;
import java.util.Arrays;
public class LeftRotate {
	public static void main(String[] args) {
		int[] x = {10,3,20,5,11,23,15};
		System.out.println("given array:"+ Arrays.toString(x));
		int temp = x[0];
		for(int i = 0; i < x.length - 1; i++)
		{
			x[i] = x[i+1];
		}		
		x[x.length - 1] = temp;
		System.out.println("after left rotate:"+ Arrays.toString(x));
	}
}