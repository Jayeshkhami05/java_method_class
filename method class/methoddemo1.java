class methoddemo1 
{
	public static void main(String[] args) 
	{
		System.out.println("main Starts ");
		m1(100,100.0f);
		System.out.println("main Ends");
	}
	public static void m1(int a,float f1)
	{
		System.out.println("m1 Starts");
		m2(true);
		System.out.println("m1 Ends");
	}
	public static void m2(boolean b1)
	{
		System.out.println("m2 Starts");
		System.out.println("m2 Ends");
	}

}

