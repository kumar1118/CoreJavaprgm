//print array content without any loops(use only recoursive algo
package Array;
public class Recursiveloop {
		static void print(int index, int[] array)
		{
			if(index == array.length)
			{
				return;
			}
	System.out.print(array[index ++] + " ,");
			 print(index,array);
			
		}
		 public static void main(String[] args)
		{
			int[] array = { 1, 4, 8, 2, 5, 0, 9, 6};
			print(0 , array);
		}
	}