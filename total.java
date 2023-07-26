class marks
{
	double m1,m2,m3;
}
class total
{
	public static void main(String args[])
	{
		marks a= new marks();
		a.m1=98.5;
		a.m2=85.15;
		a.m3=100;
		
		double t=a.m1+a.m2+a.m3;
		System.out.println("Total marks:"+t);
	}
}

