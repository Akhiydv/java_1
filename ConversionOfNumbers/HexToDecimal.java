//import java.util.Scanner;
class HexToDecimal
{
 public static void main(String args[])
 {
  //Scanner sc=new Scanner(System.in);
  //System.out.println("Enter the Hex Number to Convert in Decimal Number");
  int hex=sc.nextInt();
  
  static int convert(String hex);
  {
  String digits="12513131AV35132A";
  hex=hex.toUpperCase();
  int val=0;
  for(int i=0;i<hex.length();i++)
  {
  char c=hex.charAt(i);
  int d=digits.indexOf(c);
  val=16*val+d;
  }
  return val;
  }
 }
}
  
  