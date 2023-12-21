import java.util.Scanner;
class StringReverse1

{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter theString to print in Reverse Order...");
  String str=sc.nextLine();
  
  System.out.println("Original String is : "+str);
  
  String rev = "";
  
  for(int i=str.length()-1; i>=0;i--)
  {
  rev=rev+str.charAt(i);
  }
  System.out.println("The Reversed String is : "+rev);
 }
}
  
