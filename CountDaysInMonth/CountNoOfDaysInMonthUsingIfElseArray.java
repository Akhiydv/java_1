import java.util.Scanner;
class CountNoOfDaysInMonthUsingIfElseArray
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the Month..."); 
  int month=s.nextInt();
  System.out.println("Enter the Year... ");
  int year=s.nextInt();
  
  int arr[] = {31,28,31,30,31,30,31,31,30,31,30,31};
  //int month = 12, year = 2012; 
  
  if((month==2) && ((year%400==0)|| ((year%100!=0) && (year%4==0))))
	  System.out.println("Number of days are "+arr[month-1]+1);
  else
	  System.out.println("Number of days are "+arr[month-1]);
 }
}