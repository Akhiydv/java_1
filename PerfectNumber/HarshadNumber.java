//Harshad number is a number or an integer in base 10 which is completely divisible by sum of its digits.
import java.util.Scanner;
class HarshadNumber
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Number to check whether it is Harshad Number or Not...");
  int n = sc.nextInt();
  int result = 0;
  
  while(n != 0)
   {
   int pick_last = n % 10;
   result = result + pick_last;
   n = n / 10;
   }
  
  if(n%result == 0)
  System.out.println("Harshad Number");
  else
  System.out.println("Not a Harshad Number");
 }
}


  