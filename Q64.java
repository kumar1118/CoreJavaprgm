//find out given no is in the fibinacci series or not?
package logicalCoding;
public class Q64 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int i = 1;
		int j = 1;
		int k = i+j;
		if(num == 1 || num == 2)
		{
			System.out.println(num+"is in the fibonacci series");
			return;
		}
		while((i + j) <= num)
		{
			k = i+j;
			i = j;
			j = k;
		}
		if (k == num)
		{
			System.out.println(num+"in fibonacci series");
		}
		else
		{
			System.out.println(num+"not in fibonacci series");
		}
	}
}