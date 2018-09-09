//Right Rotate by one in the given array
package Array;
import java.util.Arrays;
public class RightRotate {

	public static void main(String[] args) {
		int[] x = {10,3,20,5,11,23,15};
		System.out.println("given array:"+ Arrays.toString(x));
		int temp = x[x.length-1];
		for(int i = x.length - 1; i > 0; i--)
		{
			x[i] = x[i-1];
		}		
		x[0] = temp;
		System.out.println("after right rotate:"+ Arrays.toString(x));
	}
}