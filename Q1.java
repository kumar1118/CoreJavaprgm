package logicalCoding;
class Q1
{
	public static void main(String[] args) 
	{
		int i = Integer.parseInt(args[0]);
		int digitsCount = 0;
		int j = i;

		while(j != 0)
		{
			digitsCount ++;
			j = j/10;
		}
			System.out.println("digits count in"+i+"is"+digitsCount);
		
	}
}
