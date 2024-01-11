class MaxElementOneDArray
{
 public static void main(String args[])
 {
  int array[]={9,3,7,11,17};
  int max=array[0];
  
  for(int i=0; i<array.length; i++)
  {
   if(array[i] > max)
   {
    max=array[i];
   }
  }
  System.out.println("Maximum Element of the Array is : "+max);
 }
}
