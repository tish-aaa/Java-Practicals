class marks
{
	double m1,m2,m3;
	double percent(double a,double b,double c)
	{
		m1=a;
		m2=b;
		m3=c;
		double p=((m1+m2+m3)/300)*100;
		return p;
	}
}
class result
{
	public static void main(String args[])
	{
		marks a= new marks();
		double res=a.percent(98.5,85,100);
		System.out.println("Percentage:"+res+"%");
	}
}
