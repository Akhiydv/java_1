import java.util.Scanner;
class GreatestNumberThree
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the First number...");
  int n1=sc.nextInt();
  System.out.println("Enter the Second number...");
  int n2=sc.nextInt();
  System.out.println("Enter the Third number...");
  int n3=sc.nextInt();
  
  if(n1>=n2 && n1>=n3)
  {
  System.out.println(n1 + " is Greater");
  }
  else if(n2>=n1 && n2>=n3)
  {
  System.out.println(n2 + " is Greater");
  }
  else if(n3>=n1 && n3>=n2)
  {
  System.out.println(n3 + " is Greater");
  }
 }
}
  