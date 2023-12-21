import java.util.Scanner;
class EvenOddTernary
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number to check Even or Odd...");
  int n=sc.nextInt();
  
  //Ternary Operator
  String status=n%2==0 ? " is Even":" is Odd";
  System.out.println(n + status);
 }
}
