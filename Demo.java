class Box
{
	double len , width , height;
	
	Box()
	{
		len = width = height = 0;
	}
	
	Box(double l)
	{
		len = width = height = l;
	}
	
	Box(double l , double h , double w)
	{
		len = l;
		height = h;
		width = w;
	}
	
	double volume()
	{
		return len*height*width;
	}
} 


class Demo
{
	
	public static void main(String args[])
	{
		Box b1 = new Box(12);
		
		Box b2 = new Box(10,20,30);
		
		Box b3 = new Box();
		
		double vol;
		
		vol = b1.volume();
		System.out.println("vol of box 1 is : " + vol);
		
		vol = b2.volume();
		System.out.println("vol of box 2 is : " + vol);
	
		vol = b3.volume();
		System.out.println("vol of box 3 is : " + vol);
	
	}	
}