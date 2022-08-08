interface pritable{
	
	void print();
}

class thirty implements pritable
{
	public void print()
	{
		System.out.println("Hello");
	}
	
	public static void main (String args[])
	{
		thirty obj = new thirty();
		obj.print();
	}
}