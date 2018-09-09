//Minimum value of given array.
package Array;
import java.util.Arrays;
public class Minimum {

	public static void main(String[] args) {
		int[] x= {10,20,4,30,8,25,6,22};
		System.out.println("given array:"+ Arrays.toString(x));
		int min = x[0];
		for(int i = 1; i < x.length; i++)
		{
			if(x[i] < min)
			{

				min =  x[i];
			}
		}
		System.out.println("min value:"+ min);
	}
}