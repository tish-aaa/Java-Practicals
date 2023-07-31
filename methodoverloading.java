/*
Demonstration of Method Overloading.
*/	

class dist
{
	int add(int a, int b)
	{
		return a+b;
	}
	double add(double a, double b)
	{
		return a+b;
	}
	double add(double a,double b,double c)
	{
		return a+b+c;
	}
}
class methodoverloading
{
	public static void main(String args[])
	{
		dist obj=new dist();
		int z=obj.add(10,20);
		double y=obj.add(12.5,10.7);
		double x=obj.add(13.6,11.6,11.11);
		System.out.println("Demonstration of Method Overloading:");
		System.out.println("Method with 2 integer parameters:"+z);
		System.out.println("Method with 2 double parameters:"+y);
		System.out.println("Method with 3 parameters:"+x);
	}
}

