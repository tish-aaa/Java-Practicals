/* Demonstration of Default Constructor and Parameterized Constructor by Swapping 2 Numbers*/

class swap
{
	int a,b;
	swap()
	{
		a=0;
		b=0;
	}
	swap(int x, int y)
	{
		a=x;
		b=y;
	}
	void swapping()
	{
		System.out.println("Before Swapping");
		System.out.println("1st Number:"+a);
		System.out.println("2nd Number:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println("1st Number:"+a);
		System.out.println("2nd Number:"+b);
	}
}
class const_overloading_swap
{
	public static void main(String args[])
	{
	swap y=new swap();
	System.out.println("Default Constructor Values:"+y.a+y.b);	
	swap z=new swap(5,11);
		z.swapping();
	}
}
		
