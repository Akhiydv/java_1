import java.util.Scanner;
class CountNoOfDaysInMonthUsingIfElseLadder
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the Month..."); 
  int month=s.nextInt();
  System.out.println("Enter the Year... ");
  int year=s.nextInt();
  
  if(month==2)
	  System.out.println("Number of Days are 28");
  
  else if((month==2) && ((year%4==0) || ((year%100!=0) && (year%400==0))))
	  System.out.println("Number of Days are 29");
  
  else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
	  System.out.println("Number of Days are 31");
  
  else
      System.out.println("Number of Daysa are 30");
 }
}
	  
  
  