package logicalCoding;

public class Q89 {

	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
		
		if(k % i == 0 && k % j == 0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("not divisible");
		}
				
	}

}
