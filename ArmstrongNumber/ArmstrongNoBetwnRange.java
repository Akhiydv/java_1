//Java program to print armstrong numbers between two intervals
import java.util.Scanner;

public class ArmstrongNoBetwnRange 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Lower Range... ");
        int low = sc.nextInt();
		System.out.println("Enter Upper Range...");
        int high = sc.nextInt();

        System.out.println("Armstrong numbers between "+ low + " and " + high + " are... ");

        // loop for finding and printing all armstrong numbers between given range
        for(int num = low ; num <= high ; num++)
        {
            int sum = 0, temp, digit, len;

            len = getOrder(num);
            temp = num;
            // loop to extract digit, find ordered power of digits & add to sum
            while(temp != 0)
            {
                // extract digit
                digit = temp % 10;

                // add power to sum
                sum = sum + (int) Math.pow(digit,len);
                temp /= 10;
            };

            if(sum == num)
                System.out.print(num + " ");
        }

    }

    private static int getOrder(int num) {
            int len = 0;
            while (num!=0)
            {
                len++;
                num = num/10;
            }
            return len;
    }
}