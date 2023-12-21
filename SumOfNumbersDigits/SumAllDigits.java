import java.util.Scanner;
class SumAllDigits
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the numbers line to get Sum of All Digits...");
  int n=sc.nextInt();
  
  int sum=0;
  int r;
  while(n != 0)
  {
	  r=n%10;
	  sum=sum+r;
	  n=n/10;
  }
  System.out.println("The Sum of All Digits is = "+sum);
 }
}
  