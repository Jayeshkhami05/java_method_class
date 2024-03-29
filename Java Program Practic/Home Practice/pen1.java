import java.util.Scanner;
class phone 
{
	String name;
	double price;
	String sim;
	String color;
	static
	{
		System.out.println("Enetr A name and price And sim name and colour");
	}
	{
		System.out.println("Enter a name And price And Sim name and colour");
	}
	public phone(String s1,double p1,String s2,String s3)
	{

			name=s1;
			price=p1;
			sim=s2;
			color=s3;
	}

	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			phone p1=new phone(sc.next(),sc.nextdouble(),sc.next(),sc.next());
			phone p2=new phone(sc.next(),sc.nextdouble(),sc.next(),sc.next());
			phone p3=new phone(sc.next(),sc.nextdouble(),sc.next(),sc.next());
			phone p4=new phone(sc.next(),sc.nextdouble(),sc.next(),sc.next());
			phone p5=new phone(sc.next(),sc.nextdouble(),sc.next(),sc.next());
			System.out.println("Name"+"\t"+"price"+"\t"+"sim"+"\t"+"color");

			System.out.println(p1.name+"\t"+p1.price+"\t"+p1.sim+"\t"+p1.color);
			System.out.println(p2.name+"\t"+p2.price+"\t"+p2.sim+"\t"+p2.color);
			System.out.println(p3.name+"\t"+p3.price+"\t"+p3.sim+"\t"+p3.color);
			System.out.println(p4.name+"\t"+p4.price+"\t"+p4.sim+"\t"+p4.color);
			System.out.println(p5.name+"\t"+p5.price+"\t"+p5.sim+"\t"+p5.color);

	}
}
