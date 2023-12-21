import java.util.Scanner;
class GreatestNumberTernaryOperator
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Start range...");
  int n1=sc.nextInt();
  System.out.println("Enter the End range...");
  int n2=sc.nextInt();
  int temp;
  
  if(n1 == n2)
  {
  System.out.println("Both Numbere are Equals");
  }
  else
  {
  temp = n1>n2 ? n1:n2; 
  System.out.println(temp + " is Greater");
  }
 }
}
  