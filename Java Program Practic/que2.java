////WAJP chake its ia a perfect Number 
class que2 
{
	public static void main(String[] args) 
	{
	
		
		j2(150);
	}

	public static void j2(int a)
	{
		int sum=0;
		for (int i=1;i<=a;i++)
		{
			if (a%i==0)
			{
				sum=sum+i;
			}
		}
		if (sum==a)
		{
			System.out.println("Perfect Number ");
		}
		else {
			System.out.println("It Is Not Perfect Number");
		}
	}
}
