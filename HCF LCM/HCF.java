import java.util.Scanner;
class HCF
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the First Number");
  int n1 = sc.nextInt();
  System.out.println("Enter the Second Number");
  int n2 = sc.nextInt();
  
  int hcf=0;
  for(int i=1; i<=n1 || i<=n2; i++)
  {
   if(n1%i==0 && n2%i==0)
   {
   hcf=i;
   }
  }
  System.out.println("The HCf is "+hcf);
 }
}
