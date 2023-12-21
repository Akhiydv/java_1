import java.util.Scanner;
class ReverseNumberWhileLoop
{
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number to get Revrese...");
  int num=sc.nextInt();
  
  int reverse = 0, rem;
  
  while(num != 0)
        {
         rem = num % 10;
         reverse = reverse * 10 + rem;
         num /= 10;
        };

  System.out.println ("Reversed Number : " + reverse);
 }
}