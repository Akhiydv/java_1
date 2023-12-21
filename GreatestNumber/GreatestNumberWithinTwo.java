import java.util.Scanner;
class GreatestNumberWithinTwo
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Start range...");
  int n1=sc.nextInt();
  System.out.println("Enter the End range...");
  int n2=sc.nextInt();
  
  if(n1 == n2)
  {
  System.out.println("Both Numbere are Equals");
  }
  else if(n1 > n2)
  {
  System.out.println(n1 + " is Greater");
  }
  else
  {  
  System.out.println(n2 + " is Greater");
  }
 }
}
  