//The Sum of square roots of the number is equal to the number is known as a Perfect Square.
import java.util.Scanner;
class PerfectSquare
{
	static boolean isPerfectSquare(int x)
	{
		if(x >= 0) 
		{
		int sr = (int)Math.sqrt(x);
		return((sr * sr) == x);
		}
		return false;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to check whether it is Perfect Number or Not...");
		int x=sc.nextInt();
		//int x = 84;
		if (isPerfectSquare(x))
			System.out.print("True");
		else
			System.out.print("False");
	}
}