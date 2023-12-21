//The last digit of the squares of any number is equal to the number itself is known as an Automorphic Number.
import java.util.Scanner;
class AutomorphicNumber
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Number to check whether it is Automorphic or Not...");
  int x=sc.nextInt();
  
  int y=x*x;
  if(x%10==y%10)
  {
  System.out.println("Number is Automorphic");
  }
  else
  {
  System.out.println("Number is Not Automorphic");
  }
 }
}
