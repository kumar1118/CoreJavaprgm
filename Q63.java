//fibonacci series of 300 in reverse order
package logicalCoding;

public class Q63 {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		int k = i+j;
		while((i+j) <= 300)
		{
			k  = i+j;
//			System.out.print(k+",");
			i = j;
			j = k;
		}
		j = i;
		System.out.print(k+",");
		System.out.print(j+",");
		while((k - j) > 0)
		{
			i = k - j;
			System.out.print(i+",");
			k = j;
			j = i;
		}
	}
}
//233,144,89,55,34,21,13,8,5,3,2,1,1,