class Animal
{
	void eat()
	{
		System.out.println("Eating ...");
	}
	
	
}

class dog1 extends Animal
{
	void bark()
	{
		System.out.println("Barking");
	}
}

class Human extends Animal
{
	void speak()
	{
		System.out.println("Speaking...");
	}
	public static void main(String args[])
	{
		Human h1 = new Human();
		h1.speak();
		h1.eat();
	}
}