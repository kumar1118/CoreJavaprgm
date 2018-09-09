package logicalCoding;

public class Q62 {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		int k = i+j;
		while((i+j) < 900)
		{
			k  = i+j;
			if(k >=100 && k < 900)
			{
			System.out.print(k+",");
			}
			i = j;
			j = k;
		}
	}
}
		