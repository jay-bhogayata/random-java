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

class C extends B
{
	void m3()
	{
		System.out.println("Bonjor");
	}
}

class MultiInh
{
	public static void main(String args[])
	{
		C obj = new C();
		obj.m1();
		obj.m2();
		obj.m3();
	}
}