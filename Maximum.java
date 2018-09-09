// Find out max int value from a given int array.
package Array;
import java.util.Arrays;
class Maximum
{
	public static void main(String[] args) 
	{
		int[] x= {10,20,4,30,8,25,6,22};
		System.out.println("given array:"+ Arrays.toString(x));
		int max = x[0];
		for(int i = 1; i < x.length; i++)
		{
			if(x[i] > max)
			{

				max =  x[i];
			}
		}
		System.out.println("max value:"+ max);
	}
}