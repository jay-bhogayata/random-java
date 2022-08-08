class Animal
{
	String color = "White";
}

class Dog extends Animal
{
	String color = "Black";
	
	void showColor()
	{
		System.out.println(color);
		System.out.println(super.color);	
		
	}
}

class abcd
{
	public static void main(String args[])
	{
		Dog obj = new Dog();
		obj.showColor();
	}
}