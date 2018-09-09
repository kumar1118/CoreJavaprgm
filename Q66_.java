package logicalCoding;

public class Q66_ {

	public static void main(String[] args) {
		long num = Long.parseLong(args[0]);
		long i = num;
		long j = i;
		long sum = 0;
		while(i != 0)
		{
			sum += i%10;
			i = i/10;
			if(i == 0 && sum > 9)
			{
				System.out.println("for"+j+"sum is:"+ sum);
				i = sum;
				sum = 0;
			}
		}		
		//System.out.println("sum of all digits in:"+num+"is"+ sum);
			
			i = sum;
			j = sum;
			sum= 0;
		}
}
