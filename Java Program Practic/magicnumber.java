import java.util.Scanner;
class magicnumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;

		System.out.println(isMagic(num,sum));
	}

		public static int isMagic(int a,int b)
		{int num=0;
			while (a>9)
			{
				int rem=0;
				b=0;
				while (a>0)
				{
					rem=a%10;
					b=b+rem;
					a=a/10;
				}
				a=b;

			}
			if (a==1)
			{
				num=1;
			}
		return num;
		 }
}
