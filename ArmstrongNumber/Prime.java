import java.util.Scanner;
class Prime
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number to check Prime or Not...");
  int n=sc.nextInt();

  if(n%2==0)
  {
    System.out.println(n+ " is Prime.");
  }
  else
  {
    System.out.println(n+ " is Not a Prime.");
  }
 }
}