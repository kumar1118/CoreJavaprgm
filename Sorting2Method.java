package Array;
import java.util.Arrays;
public class Sorting2Method {
	public static void main(String[] args) {
		int[] x = {4,1,3,5,2,6,8,0,2};
		System.out.println("initial array:"+ Arrays.toString(x));
		int temp;
		for(int i = 0; i < x.length-1; i++)
		{
			int index = i;
			for(int j = i+1 ; j < x.length; j++)
			{
				if(x[j] < x[index])
				{
					index = j;
				}	
			}
			int smallerNumber = x[index];
			x[index] = x[i];
			x[i] = smallerNumber;
		}
		System.out.println("final array:"+ Arrays.toString(x));
			
	}
}