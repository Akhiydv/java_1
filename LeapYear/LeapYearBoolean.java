import java.util.Scanner;
class LeapYearBoolean
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Year to check whether the Entered Year is Leap Year or Not...");
  int year=sc.nextInt();
  
  boolean leap;
  
  if(year%400==0)
  {
   leap=true;
  }
  else if(year%4==0 && year%100 != 0)
  {
  leap=true;
  }
  else
  {
  leap=false;
  }
  if(leap)
  {
  System.out.println(year + " is a Leap Year");
  }
  else
  {
  System.out.println(year + " is Not a Leap Year");  
  }
 }
}
