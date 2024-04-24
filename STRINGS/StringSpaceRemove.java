import java.util.Scanner;
import java.util.*;
class StringSpaceRemove
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  String s = "Akhilesh Kumar Yadav";
  char[] c = s.toCharArray();
  StringBuffer sb = new StringBuffer();
  for(int i=0;i<c.length;i++)
  {
  if((c[i] != ' ') && (c[i] != '\t'))
  {
  sb.append(c[i]);
  }
  }
 System.out.println("String after removing spaces : "+sb);
 }
}

