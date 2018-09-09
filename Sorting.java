//Sorting/ascending elements of the given array.(bubble sort)
package Array;
import java.util.Arrays;
public class Sorting {

	public static void main(String[] args) {
		int[] x = {4,1,3,5,2,6,8,0,2};
		System.out.println("initial array:"+ Arrays.toString(x));
		int temp;
		for(int i = 0; i < x.length; i++)
		{
			for(int j = 1 ; j < x.length; j++)
			{
				if(x[j-1] > x[j])
				{
					temp = x[j - 1];
					x[j-1] = x[j];
					x[j]= temp;
				}	
			}
		}
		System.out.println("final array:"+ Arrays.toString(x));
			
	}

}