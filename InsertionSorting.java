package Array;
import java.util.Arrays;
public class InsertionSorting {

	public static void main(String[] args) {
		int[] x = {7,4,3,8,9,0,2,3,1,4,5};
		System.out.println("given array:"+ Arrays.toString(x));
		int temp;
		for(int i = 1; i < x.length; i++)
		{
			
			for(int j = i; j > 0; j--)
			{
				if(x[j] < x[j - 1])
				{
					
				temp = x[j];
				x[j] = x[j - 1];
				x[j - 1] = temp;
				}
			}
		}
		System.out.println("final array:"+ Arrays.toString(x));
	}
}
