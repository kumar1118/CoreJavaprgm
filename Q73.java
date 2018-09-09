package logicalCoding;

public class Q73 {

	public static void main(String[] args) {
		int num =Integer.parseInt(args[0]);
		 	int c=0,arms,temp;  
		    //int num = 153;	//It is the number to check armstrong  
		    temp = num;  
		    while(num > 0)  
		    {  
		    arms = num % 10;  
		    num = num / 10;  
		    c=c+(arms*arms*arms);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   
		   }  
		}  