import java.util.Scanner;
class FindNoOfDigitsInNumberByFormula
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the Number to Count Digits...");
  int number=s.nextInt();
  
  int digit=(int)(Math.log10(number))+1;
  System.out.println("In the given Number Count of Digits are : "+digit);
 }
}