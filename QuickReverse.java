package Array;
import java.util.Arrays;
public class QuickReverse {
	static void reverse(int index, int[] array)
			{
				 if(index >= array.length/2)
				{
					return ;
				}
				int temp = array[index];
				 array[index] = array[array.length - index - 1 ];
				 array[array.length - index - 1] = temp;
				 reverse(++index, array);
		         
			}
			public static void main(String[] args) 
			{
				int[] array = {1, 4, 8, 2, 5, 0, 9, 6, 80};
				
				System.out.println("initial:" + Arrays.toString(array));
				reverse(0, array);
		         System.out.println("Reverse:" + Arrays.toString(array));
			}
		}