class MinElementOneDArray
{
 public  static void main(String args[])
 {
 int array[]={2,8,1,9,10,15};
 int min=array[0];

 for(int i=0; i<array.length; i++)
  {
  if(array[i] < min)
   {
    min=array[i];
   }
  }
 System.out.println("Minimum element of the array is : "+min);
 }
}