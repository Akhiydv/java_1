import java.util.Scanner;
class BinaryToDecimal
{
 public static void main(String args[])
 { 
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Binary Number to Decimal...");
 int binary=sc.nextInt();
 
 int decimal = 0;
 int n=0;
 
 while(binary>0)
 {
 int temp=binary%10;
 decimal += temp*Math.pow(2,n);
 binary = binary/10;
 //i++;
 }
 System.out.println("Decimal Number :"+decimal);
 //sc.close();
 }
}