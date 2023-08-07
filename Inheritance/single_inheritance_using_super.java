/*
Demonstration of Singlelevel Inheritance using super().
*/
class superclass
{
	double i,j;
	superclass(double a,double b)
	{
		i=a;
		j=b;
	}
	void show()
	{
		System.out.println("1st Number: "+i+" and 2nd Number: "+j+" (using Superclass)");
	}
}
class subclass extends superclass
{
	double k;
	subclass(double a,double b,double c)
	{
		super(a,b);
		k=c;
	}
	void disp()
	{
		System.out.println("3rd Number: "+k+" (using Subclass)");
		System.out.println("Product of the 3 numbers: "+i*j*k);
	}
}
class single_inheritance_using_super
{
	public static void main(String args[])
	{
		subclass obj=new subclass(2,3,4.5);
		obj.show();
		obj.disp();
	}
}
