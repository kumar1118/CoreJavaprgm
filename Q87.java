package logicalCoding;

public class Q87 {

	public static void main(String[] args) {
		for(int i  = 1; i <= 10; i++)
		{
			if(i % 2 == 0)
			{
				for(int j = 1; j <=5; j++)
				{
				System.out.print("Yellow,");
				}
			}
			else
			{
				for(int j = 1; j <=5; j++)
				{
				System.out.print("Green,");
				}
			}
			System.out.println();
		}
	}

}

/*
 Green,Green,Green,Green,Green,
Yellow,Yellow,Yellow,Yellow,Yellow,
Green,Green,Green,Green,Green,
Yellow,Yellow,Yellow,Yellow,Yellow,
Green,Green,Green,Green,Green,
Yellow,Yellow,Yellow,Yellow,Yellow,
Green,Green,Green,Green,Green,
Yellow,Yellow,Yellow,Yellow,Yellow,
Green,Green,Green,Green,Green,
Yellow,Yellow,Yellow,Yellow,Yellow,
*/
