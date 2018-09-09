package logicalCoding;

import java.util.Scanner;
class Q68
{
   public static void main(String args[])
   {
      int n;
      int status = 1;
      int num = 3;
      Scanner sc = new Scanner(System.in); //For capturing the value of n
      System.out.println("Enter the value of n:");
      n = sc.nextInt();						//The entered value is stored in the var n
      if (n >= 1)
      {
         System.out.print("First "+n+" prime numbers are:");
          System.out.print(2+",");			 //2 is a known prime number
      }
      for ( int i = 2 ; i <=n ;  )
      {
         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
         {
            if ( num%j == 0 )
            {
               status = 0;
               break;
            }
         }
         if ( status != 0 )
         {
            System.out.print(num+",");
            i++;
         }
         status = 1;
         num++;
      }         
   }
}