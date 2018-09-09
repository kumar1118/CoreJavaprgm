package logicalCoding;
public class Q60 {
	public static void main(String[] args)
	{
		int i = 1;
		int j = 1;
		int k = i+j;
		System.out.println(i+",");
		System.out.println(j+",");
		while((i+j) < 50)
		{
			k  = i+j;
			
			System.out.println(k+",");
			i = j;
			j = k;
		}
	}
}
		