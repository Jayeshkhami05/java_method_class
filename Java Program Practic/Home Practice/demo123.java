class demo123
{
	int a=10;
	static
	{
		System.out.println("hello");
			demo123 d1=new demo123();
	}
	{
		System.out.println("non static blocks1");
	}
	{
		
		System.out.println("non static blocks2");
	}
	{
		
		System.out.println("non static blocks3");
	}


	
	public static void main(String[] args) 
	{
		System.out.println("hello jayesh");
	}
		static 
	{
			System.out.println("bye bye");
	}
}
