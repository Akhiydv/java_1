import java.util.Scanner;
class OctalToDecimal
{
 public static void main(String args[])
 { 
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Octal Number to convert into Decimal...");
 int octal=sc.nextInt();
 
 int decimal=0;
 int n=0;

 while(octal>0)
 {
 int temp=octal%10;
 decimal += temp*Math.pow(2,n);
 octal = octal/10;
 //i++;
 }
 System.out.println("Decimal Number is : "+decimal);
 //sc.close();
 }
}