import java.util.Scanner;
public class Replaces0By1
{
 public static void main(String args[])
 {
        Scanner s=new Scanner(System.in);		
		System.out.print("Enter the number : ");		
		int number=s.nextInt();
		//convert the number to string and then calculate its length
		String str=Integer.toString(number);
		int len=str.length();
		String str1="";
		//use the logic to replace all 0's with 1 in a given integer
		for(int i=0 ; i<len; i++)
		{
			if(str.charAt(i) == '0')
				str1 = str1 + '1';
			else
				str1 = str1 + str.charAt(i);	
		}
		System.out.println("Converted number is: "+str1);
        //sc.close();
 }
}