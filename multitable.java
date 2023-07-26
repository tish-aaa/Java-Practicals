class multitable
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		for(int i=1;i<=10;i++)
		{
			int mul=n*i;
			System.out.println(n+"x"+i+"="+mul);
		}
	}
}