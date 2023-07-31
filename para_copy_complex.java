class complex
{
	int r,i;
	complex(int a, int b)
	{
		r=a;
		i=b;
	}
	complex(complex obj)
	{
		r=obj.r;
		i=obj.i;
	}
	void add(complex obj)
	{
		
		obj.r+=r;
		obj.i+=i;
	}
}
class para_copy_complex
{
	public static void main(String args[])
	{
		complex o1=new complex(3,4);
		complex o2=new complex(o1);
		System.out.println("1st Complex Number:"+o1.r+"+"+o1.i+"i.(Parameterized Values)");
		System.out.println("2nd Complex Numbers:"+o2.r+"+"+o2.i+"i.(Copied Values)");
		o2.add(o1);
		System.out.println("Addition of Complex Numbers:"+o1.r+"+"+o1.i+"i");
	}
}