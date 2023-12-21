//import java.util.Scanner;
class Factorial
{
 public static int factorial(int n)
 {
  int res=1,i;
  for(i=2; i<=n; i++)
  
   res *= i;
   return res;
  
 
 }
  public static void main(String args[])
  {
  //Scanner sc=new Scanner(System.in);
  //System.out.println("Enter the Number to get Factorial...");
  //int num=sc.nextInt();
  int num=6;
  System.out.println("Factorial of "+num+" is "+factorial(num));
  }
}

