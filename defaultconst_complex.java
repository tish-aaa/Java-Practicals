class complex
{
	int a,b;
	complex()
	{
		a=5;
		b=5;
	}
	void add(complex obj)
	{
		
		obj.a+=a;
		obj.b+=b;
	}

}
class defaultconst_complex
{
	public static void main(String args[])
	{
		complex o1=new complex();
		complex o2=new complex();
		o2.a=Integer.parseInt(args[0]);
		o2.b=Integer.parseInt(args[1]);
		System.out.println("1st Complex Number:"+o1.a+"+"+o1.b+"i.(Default Values)");
		System.out.println("2nd Complex Numbers:"+o2.a+"+"+o2.b+"i.(User-defined Values)");
		o2.add(o1);
		System.out.println("Addition of Complex Numbers:"+o1.a+"+"+o1.b+"i");
	}
}