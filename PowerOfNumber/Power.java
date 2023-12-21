import java.util.Scanner;
class Power 
{
	public static void main(String args[]) 
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the value of a:- ");
	 int a=sc.nextInt();
	 System.out.println("Enter the value of b:- ");
	 int b=sc.nextInt();	
		
	 int x=b;
	 int power=1;
	 for(int i=0;b!=0;b--)
	 {
		 power=power*a;
	 }
	 System.out.println("The value of "+a+" to the power of "+x+ " is = "+power);
	}
}
	 