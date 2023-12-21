//Number that is smaller than the sum of all it's factors except the number itself is known as an Abundant number.
import java.util.Scanner;
class AbundantNumber
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Number to check wether Number is Abundant or Not...");
  int n=sc.nextInt();
  
  int sum=0;
  
  for(int i=1;i<n; i++)
  {
   if(n%i==0)
   {
   sum = sum=i;
   }
   else if(sum>n)
   {
   System.out.println(n+" is Abundant Number");
   }
   else
   {
   System.out.println(n+ " is Not Abundant Number");	   
   }
  }
 }
}
