import java.util.Scanner;
class Prime2
{
 public static void main(String args[])
 {
 
  int n1=1;
  int n2=10;

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