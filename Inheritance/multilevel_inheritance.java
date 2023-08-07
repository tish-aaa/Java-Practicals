class grandparent
{
	String grandpa;
	grandparent(String a)
	{
		grandpa=a;
	}
}
class parent extends grandparent
{
	String dad;
	parent(String a, String b)
	{
		super(a);
		dad=b;
	}
}
class child extends parent
{
	String son;
	child(String a, String b, String c)
	{
		super(a,b);
		son=c;
	}
	void disp()
	{
		System.out.println("Grandparent: "+grandpa+"\nParent: "+dad+"\nChild: "+son);
	}
}
class multilevel_inheritance
{
	public static void main(String args[])
	{
		child obj=new child("Grandma","Mom","Daughter");
		obj.disp();
	}
}

