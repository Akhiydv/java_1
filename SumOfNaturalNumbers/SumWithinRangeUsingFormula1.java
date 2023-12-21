import java.util.Scanner;
class SumWithinRangeUsingFormula1
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Start range...");
  int n1=sc.nextInt();
  System.out.println("Enter the End range...");
  int n2=sc.nextInt();
  
  int sum = ((n2*(n2+1)/2)-(n1*(n1+1)/2)+n1);
  System.out.println("The Sum within given range is " +sum);
 }
}