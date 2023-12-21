class ArmstrongLambda
{
 public static void main(String args[])
 {
  // public static boolean isArmstrong(int num)
  //{
  //return num == getArmstrongSum(num);
  //}
  
  //public static int getArmstrongSum(int num)
  //{
  int num,sum;
  int pow=String.valueOf(num, i -> i/10)
                .limit(pow)
				.map(i -> (int)Math.pow(i%10, pow))
				.sum();
  
  System.out.println(sum);
  //System.out.println(getArmstrong(370));
  //System.out.println(isArmstrong(370));
 }
}