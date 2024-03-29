import java.util.Scanner;
class questions1 
{
	public static void main(String[] args) 
	{
		
			method();
	
	}

		public static int method()
		{

		   Scanner sc=new Scanner(System.in);

			System.out.println("Enter A Number");

			int newnum=sc.nextInt();

			int num=newnum;
			int sum=0;

			int s=1;
			while(s<newnum)
				{

				if(num%s==0)
					{
					sum=sum+s;
					
					}
					s++;
				}
						if(sum==num)
						{
							System.out.print("True");
						}
						else
							{
							System.out.print("false");
							}

							System.out.println();
				return sum;

				}}


				
				