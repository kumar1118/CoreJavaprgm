package logicalCoding;

public class Q78 {

	public static void main(String[] args) {
		int cube=1;
		int sum=0;
		for(int i = 1; i <= 10; i++)
		{
			System.out.print("cube of:"+i+"=");
			cube = i*i*i;
			System.out.println(cube+",");
			sum += cube;
		}
		System.out.println("sum:"+sum);
	}

}
/*
cube of:1=1,
cube of:2=8,
cube of:3=27,
cube of:4=64,
cube of:5=125,
cube of:6=216,
cube of:7=343,
cube of:8=512,
cube of:9=729,
cube of:10=1000,
sum:3025
*/