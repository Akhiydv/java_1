import java.util.Scanner;
class DecimalToOctal
{
 public static void main(String args[]);
 {
  Scanner sc=new Scanner("System.in");
  System.out.println("Enter the Octal Number to convert in Decimal Number...");
  int octal=sc.nextInt();
  //int octal[]=new int(20);
  int i=0;

  while(decimal>0)
  {
  int r = decimal%8;
  octal[i++] = r;
  decimal =deciml/8;
  }  
  System.out.println("Octal Number : ");
  for(int j=i-1; j>=0; j--)
  System.out.println(octal[j]);
  sc.close();
 }
}