import java.util.Scanner;
class Prime1
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Starting range to check Prime or Not...");
  int n1=sc.nextInt();
  System.out.println("Enter the Ending range to check Prime or Not...");
  int n2=sc.nextInt();

for(int i=n1;i<=n2;i++)
{
  if(i%2==0)
  {
    System.out.println(i+ " is a Prime.");
  }
  else
  {
    System.out.println(i+ " is Not a Prime.");
  }
}
}
}