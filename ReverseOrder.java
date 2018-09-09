//Read an array content in the reverse order.
package Array;
import java.util.Arrays;

public class ReverseOrder {

	public static void main(String[] args) {

		int[] x ={ 1,4,9,10,6,20,15};
		for(int i = x.length -1; i >= 0; i--)
		{
		System.out.print(x[i] +",");
		}
		System.out.println();
		System.out.println(Arrays.toString(x));
	}
}
