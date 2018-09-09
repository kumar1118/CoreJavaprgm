package Array;
class Loop1to10 
{
	static void print(int i)
		{
		System.out.println(i);
		i++;
		if(i <=10)
			{
			print(i);//calling and assigning i
			}
		}
	public static void main(String[] args) 
	{
		print(1);//calling and assigning i
	}
}