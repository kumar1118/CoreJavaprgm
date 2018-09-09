//*Finding out digits count in a given number. (use recursive algo)
package Array;
import java.util.Scanner;
class RecursiveCount
{
	static int countDigits(int num)
	{
		if(num == 0)
		{
			return 0;
		}
		return 1 + countDigits(num/10);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int digits = countDigits(num);
		System.out.println(digits+"digits in"+num);
	}
}
