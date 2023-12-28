import java.util.Scanner;
class FindNoOfDigitsInNumberByLoop
{
 public static void main(String args[])
 { 
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the Number to Count Digit...");
  int n=s.nextInt();
  
  int digit=0;
  
  while(n != 0)
  {
   int last=n%10;
   digit++;
   n=n/10;
  }
  System.out.println("In the given Number Digits are : "+digit);
 }
}
  