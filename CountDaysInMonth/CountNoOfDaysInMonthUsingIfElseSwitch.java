import java.util.Scanner;
class CountNoOfDaysInMonthUsingIfElseSwitch
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the Month..."); 
  int month=s.nextInt();
  System.out.println("Enter the Year... ");
  int year=s.nextInt();
  
  switch(month)
  {
   //case for 31 days
   case 1:
   case 3:
   case 5:
   case 7:
   case 8:
   case 10:
   case 12:
   System.out.println("Number of Days are 31");
   break;
   
   //case for 30 days
   case 4:
   case 6:
   case 9:
   case 11:
   System.out.println("Number of days are 30");
   break;
   
   //case for 28/29 days
   case 2:
   if((year%400==0) || ((year%100 != 0) && (year%4==0)))
   System.out.println("Number of days are 29");
   else
   System.out.println("Number of days are 28");
   break;
   
   default:
   System.out.println("Invalid Month");
   break;
  }
 }
}