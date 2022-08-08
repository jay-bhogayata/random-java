class Demo
{
	void area(int l)
	{
		System.out.println("Area of square is : "+ l*l);
	}
	
	void area(int l , int b)
	{
		System.out.println("Area of rectangle is : " + l*b);
	}
	
	void area(double r)
	{
		System.out.println("Area of circle  is : " + 3.14*r*r);
	}
}

class MethodOver
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		
		d1.area(10);
		d2.area(10,20);
		d3.area(3.14);
	}
}