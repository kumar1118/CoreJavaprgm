package Array;

public class SumofArrayelememt {
		static int sum(int index, int[] array)
		{
			 
			if(index == array.length)
			{
				return 0;
			}
			int sum = index;
			System.out.println(sum);
			return array[ index ++] + sum(index, array);
	         
		}
		public static void main(String[] args) 
		{
			int[] array = {1, 4, 8, 2, 5, 0, 9, 6};
			int sum = sum(0, array);
			System.out.println(sum);
		}
	}
