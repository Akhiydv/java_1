public class StringRemoveSpaces
 {
    public static void main(String[] args)
    {
    StringBuffer sb = new StringBuffer();
	String s = "Akhilesh Kumar Yadav";
	String[] s1 = s.split("[\\s]");
	for (String string : s1)
	{
	sb.append(string);
	}
    System.out.println(sb);
    }
}	