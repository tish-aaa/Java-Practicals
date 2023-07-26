class circle
{
	public static void main(String args[])
	{
		double r=Integer.parseInt(args[0]);
		double pi=3.14;
		double area=pi*(r*r);
		double peri=2*pi*r;

		System.out.println("Perimeter="+peri);
		System.out.println("Area="+area);
	}
}