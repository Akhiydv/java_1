import java.util.Scanner;
public class LCM1
{
  public static void main (String args[])
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any two number to get LCM...");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	int lcm=0;
    //int num1=36, num2=60, lcm=0;
    int max=(num1>num2) ? num1:num2;
	
    for(int i=max; i<=num1*num2; i++)
    {
     if(i%num1==0 && i%num2==0)
        {
         lcm=i;
         break;
        }
    }
    System.out.println ("The LCM is : " + lcm);
  }
}