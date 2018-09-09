package logicalCoding;

public class Q65 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int i = num;
		int sum = 0;
		while(i != 0)
		{
			sum += i%10;
			i = i/10;
		}
		System.out.println("sum of all digits in:"+num+"is"+ sum);
	}
}
