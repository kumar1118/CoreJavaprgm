package logicalCoding;

public class Q90 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 20; i <= 80; i++)
		{
			if(i % 3 ==0)
			{
				System.out.print(i+",");
				sum += i;
			}
		}
		System.out.print("sum:"+sum);
	}
}
