package logicalCoding;

public class Q83 {

	public static void main(String[] args) {
		for(int i = 1; i <= 200; i++)
		{
			if(i % 5 == 0)
			{
				System.out.print(i+",");
			}
		}
	}
}

/*
  5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100,105,110,115,120,125,130,135,
  140,145,150,155,160,165,170,175,180,185,190,195,200,
 */