import java.util.Scanner;
class SumWithinRangeUsingFormula
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Start Range...");  
  int n1=sc.nextInt();
  System.out.println("Enter the End Range..."); 
  int n2=sc.nextInt();
  int sum = 0;
  for(int i=n1; i<=n2; i++)
  {
  sum = sum+i;
  }
  System.out.println("The Sum within given Range is " + sum);
 }
}
  