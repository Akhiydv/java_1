import java.util.Scanner;
class LeapYear2
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Year to check whether the Entered Year is Leap Year or Not...");
  int year=sc.nextInt();
  
  int flag=((year%400==0) || (year%4==0) && (year%100 != 0)) ? 1:0;
  
  if(flag==1)
  {
  System.out.println(year + " is a Leap Year");
  }
  else
  {
  System.out.println(year + " is Not a Leap Year");
  }
 }
}