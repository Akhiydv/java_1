import java.util.Scanner;
class HexadecimalToDecimal
{
  public static void main (String[]args)
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Hexadecimal Number to Convert in Decimal Number...");
    String hex=sc.nextLine();
	//String hex = "C9";
    System.out.println(convert (hex));
  }
  
  static int convert(String hex){  
    String digits = "0123456789ABCDEF";  
             hex = hex.toUpperCase();  
             int val = 0;  
             for (int i = 0; i < hex.length(); i++)  
             {  
                 char c = hex.charAt(i);  
                 int d = digits.indexOf(c);  
                 val = 16*val + d;  
             }  
             return val;  
  }  
}