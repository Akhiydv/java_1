class Factor
{
 public static void main(String args[])
 {
  int n=9;
  System.out.println("The below are the Factors of "+n);
  for(int i=1; i<=n; i++)
  {
   if(n%i==0)
  //System.out.println("Factor of "+n+" is ");   
  System.out.println(i+" ");
  }
  //System.out.println("The above are the Factors of "+n);
 }
}
