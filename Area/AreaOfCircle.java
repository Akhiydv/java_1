import java.util.Scanner;
class AreaOfCircle
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the radius value...");
  double radius=s.nextDouble();
  //double radius=7;
  double area=3.14*radius*radius;
  System.out.println(area);
 }
}