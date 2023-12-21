class FibonacciSeries2 
{
	public static void main(String[] args)
	{
		int n=10;
		int f=0;
		int s=1;
		System.out.println(f);
		System.out.println(s);
		for(int i=1; i<=n; i++)
		{
			int r=f+s;
			f=s;
			s=r;
			System.out.println(r);
		}
	}
}