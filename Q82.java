package logicalCoding;

public class Q82 {

	public static void main(String[] args) {
		for(int i = 1; i <= 30; i++)
		{
			if(i % 3 == 0)
			{
				System.out.println("Hello");
			}
			if(i % 4 == 0)
			{
				System.out.println("Hai");
			}
			if(i % 3 == 0 && i % 4 ==0)
			{
				System.out.println("mornimg");
			}
		}
	}
}

/*
Hello
Hai
Hello
Hai
Hello
Hello
Hai
mornimg
Hello
Hai
Hello
Hai
Hello
Hello
Hai
mornimg
Hello
Hai
Hello
*/