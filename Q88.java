package logicalCoding;

public class Q88 {

	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);//23
		int j = Integer.parseInt(args[1]);//53
		int m = i % 10;
		i = i / 10;
		int n = i % 10;

		int p = j % 10;
		j = j / 10;
		int q = j % 10;

		if(m == p || m == q || n == p || m == q)
		{
		System.out.println("true");
		}
		else
		{
		System.out.println("no common digits");
		}
	}
}
