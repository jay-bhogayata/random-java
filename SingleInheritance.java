class A
{
	void m1()
	{
		System.out.println("Hello");
	}
}

class B extends A
{
	void m2()
	{
		System.out.println("Namste");
	}
}

class SingleInc
{
	public static void main(String args[])
	{
		B obj = new B();
		obj.m1();
		obj.m2();
	}
}