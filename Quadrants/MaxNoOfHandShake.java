import java.util.Scanner;
class MaxNoOfHandShake
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the Persons to Calculate possible Handshakes...");
  int n=s.nextInt();
  //int n=10;
  int total=n*(n-1)/2;
  System.out.println("Maximum possible Handshakes are "+total+" for Total "+n+" Persons");
 }
}