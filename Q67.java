package logicalCoding;
public class Q67 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int i,j;
		int temp=0;
		System.out.println("Enter any num: ");
		j = num;
		while(num > 0)
		{
			i = num % 10;
			num =num / 10;
			temp=temp*10+i;
		}
		if(temp== j)
			{
			System.out.println("Palindrome");
			}
		else
			{
			System.out.println("not Palindrome");
			}
		}
		}