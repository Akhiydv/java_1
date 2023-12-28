import java.util.Scanner;
class Quadrant
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("To Check Quadrant enter the value for x and y co-ordinates...");
  int x=s.nextInt();
  int y=s.nextInt();
  
  if(x<0 && y>0)
	  System.out.println("First Quadrant");
  
  else if(x>0 && y>0)
	  System.out.println("Second Quadrant");
  
  else if(x>0 && y<0)
	  System.out.println("Third Quadrant");
  
  else if(x<0 && y<0)
	  System.out.println("Fourth Quadrant");
  
  else if(x==0 && y>0)
	  System.out.println("Lies on Y Axis");
  
  else if(x>0 && y==0)
	  System.out.println("Lies on X Axis");
  
  else if(y<0 && x==0)
	  System.out.println("Lies on -Y Axis");
  
  else if(y==0 && x<0)
	  System.out.println("Lies on -X Axis");
 }
}