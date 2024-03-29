import java.util.Scanner;
class que3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		j3(num);
	}

	public static void j3(int a)
	{
		int sum=0;
		int digit=0;
		int temp=a*a;

		while (temp>0)
		{
			digit=temp%10;
			sum=sum+digit;
			temp/=10;

		}
		if (sum==a)
		{
			System.out.println("neon Number");
		}
		else
		{
			System.out.println("It Ia A Not Neon Number");
		}
	}
}
