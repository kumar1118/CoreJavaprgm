package logicalCoding;

public class Q85 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 120; i <= 220; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i+",");
			}
			sum += i;
			}
		System.out.println("sum:"+sum);
	}
}

/*
120,122,124,126,128,130,132,134,136,138,140,142,144,146,148,150,152,154,156,158,160,162,164,
166,168,170,172,174,176,178,180,182,184,186,188,190,192,194,196,198,200,202,204,206,
208,210,212,214,216,218,220,
sum:17170
*/
