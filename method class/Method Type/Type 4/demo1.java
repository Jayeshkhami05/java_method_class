import java.util.Scanner;
class demo1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");         //user type a number
		int number=sc.nextInt();


		System.out.println("Enter The Power");             //user type a power
		int power=sc.nextInt();


		int res=powerofNumber(number,power);           //own method output will be store in this int


		System.out.println(res);          //output will be show
	}

	public static int powerofNumber(int number,int power)
	{
		int data=1;
		for (int i=1;i<=power;i++)
		{
			data=data*number;      //multiplications of data*number //(2*2=4)
		}
		return data;
	}
}
