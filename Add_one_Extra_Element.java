package Array;
import java.util.Scanner;

public class Add_one_Extra_Element {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no of elements: ");
		int p = scan.nextInt();
		int[]x = new int[p+1];
		System.out.print("Enter elements in ascending order: ");
		
		for(int i = 0; i < p; i++)
		x[i] = scan.nextInt();
		System.out.print("Enter new no to be added: ");
		
		int i, no = scan.nextInt();
		System.out.print("The original array is:\n ");
		for(i = 0; i < p; i++)
		
		System.out.print(x[i]+" ");
		for(i = p-1; i >= 0; i--)
		if(x[i] > no)
		x[i+1] = x[i];
		else break;
		x[i+1] = no;
		System.out.print("\nThe new array is:\n ");
		for(i = 0; i <= p; i++)
		System.out.print(x[i]+" ");
		}
		}