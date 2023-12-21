import java.util.Scanner;
class PalindromeNumber
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number to check Palindrome or Not...");
  int num=sc.nextInt();
  
  int reverse=0,rem, temp;
  temp=num;
  
  while(temp != 0)
  {
  rem=temp%10;
  reverse=reverse*10+rem;
  temp /= 10;
  };
  
  if(num == reverse)
  {
  System.out.println(num + " is a Palindrome Number");
  }
  else
  {
  System.out.println(num + " is Not a Palindrome Number");
  }
 }
}
  