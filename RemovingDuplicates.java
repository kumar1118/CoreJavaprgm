//Removing Duplicates of the given array.
package Array;
import java.util.Arrays;
public class RemovingDuplicates {

	public static void main(String[] args) {
		int[] x = {10,20,3,3,6,5,2,2,15};
		System.out.println("given array:"+ Arrays.toString(x));
		int size = x.length;
		for(int i = 0; i < size; i++)
		{
			for(int j = i +1; j < size; j++)
			{
				if(x[i] == x[j])
				{
					for(int k = j; k < size-1; k++)
					{
						x[k] = x[k+1];
					}
				j--;
				size--;
				}
			}
		}
		System.out.println("final array:"+ Arrays.toString(x));
		int[] y = new int[size];
		for(int i = 0; i< size; i++)
		{

			y[i] = x[i];
		}
		System.out.println("final array:"+ Arrays.toString(y));	
	}

}
