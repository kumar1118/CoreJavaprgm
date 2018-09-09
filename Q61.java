package logicalCoding;

public class Q61 {

	public static void main(String[] args) 
	{
		int i = 1;
		int j = 1;
		int k = i+j;
		int sum= i+j;
		while((i+j) < 45)
		{
			k  = i+j;
			sum += k;
			System.out.print(k+",");
			i = j;
			j = k;
		}
		System.out.println("sum:"+sum);
	}
}
		