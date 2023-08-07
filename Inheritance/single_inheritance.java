/*
Demonstration of Singlelevel Inheritance.
*/

class add
{
	double i,j;
	double show(double a, double b)
	{
		i=a;
		j=b;
		System.out.println("1st Number: "+i+" and 2nd Number: "+j); 
		return 0;
	}
}
class total extends add
{
	double t;
	void disp()
	{
		t=i+j;
		System.out.println("Sum of the 2 numbers: "+t);
	}
}
class single_inheritance
{
	public static void main(String args[])
	{
		total obj=new total();
		obj.show(1.2,4.5);
		obj.disp();
	}
}
