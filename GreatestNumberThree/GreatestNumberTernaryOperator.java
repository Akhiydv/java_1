import java.util.Scanner;
class GreatestNumberTernaryOperator
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
  
  int temp, result;
  
  temp = n1>n2 ? n1:n2; 
  result = temp>n3 ? temp:n3;
  
  System.out.println(result + " is Greater");
 }
}

  