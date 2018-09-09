package logicalCoding;

public class Q65_ {

	public static void main(String[] args) 
	{
		int num = Integer.parseInt(args[0]);
		int i = num;
		int sum = 0;
		while(i != 0)
		{
			sum += i%10;
			i = i/10;
			if(i == 0 && sum > 9)
			{
				i = sum;
				sum = 0;
			}
		}
		System.out.println("sum of all digits in:"+num+"is"+ sum);
	}
}
