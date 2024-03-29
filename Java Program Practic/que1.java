////WAJP its Chake a prime number return int type data 

import java.util.Scanner;
class que1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
		j1(num);
		
	}
	
	public static void j1(int a)
	{
		int c=0;
		for (int i=1;i<=a;i++)
		{
			if (a%i==0)
			{
				c=c+1;
			}
		}
		if (c==2)
		{
			System.out.println("It Is a Prime Number ");
		}
		else
		{
		System.out.println("Not A Prime Number ");
		}
	}
}
