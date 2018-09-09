//Descending Order
package Array;
import java.util.Arrays;
public class DescendingOrder {

	public static void main(String[] args) {

		int[] x = {4,1,3,5,2,6,8,0,2};
		System.out.println("initial array:"+ Arrays.toString(x));
		int temp;
		for(int i = 0; i < x.length; i++)
		{
			for(int j = 0 ; j < x.length - i - 1; j++)
			{
				if(x[j] < x[j+1])
				{
					temp = x[j];
					x[j] = x[j+1];
					x[j+1]= temp;
				}	
			}
		}
		System.out.println("final array:"+ Arrays.toString(x));
		}
}