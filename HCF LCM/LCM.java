import java.util.Scanner;
class LCM
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any two number to get LCM...");
  int n1 = sc.nextInt();
  int n2 = sc.nextInt();
  
  int hcf=1;
  for(int i=1; i<=n1 || i<=n2; i++)
  {
   if(n1%i==0 && n2%i==0)
    {
      hcf=i;
    }  
  }
  int lcm=(n1*n2)/hcf;
  System.out.println("The LCM of Given Numbers is "+lcm);
 }
}
 