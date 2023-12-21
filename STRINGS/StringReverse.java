import java.util.Scanner;
class StringReverse
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter theString to print in Reverse Order...");
  String str=sc.nextLine();
  
  StringBuilder sb=new StringBuilder();
  sb.append(str);
  System.out.println("String is : "+sb);
  sb.reverse();
  System.out.println("Reversed String is : "+sb);
 }
}