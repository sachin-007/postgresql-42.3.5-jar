class table extends Thread
{
	int a;
	table(int a)
	{
		this.a=a;
	}
	public void run()
	{
		System.out.println("Table of"+a);
		for(int i=1;i<=10;i++)
		{
			int b;
			b=a*i;
			System.out.println(b);
		}
	}
}
class Fibo extends Thread
{
	int a;
	Fibo(int a)
	{
		this.a=a;
	}
	public void run()
	{
		
		int f1=3;
		int f2=5;
		int f3=6;
		System.out.println("Fibo"+a);
		System.out.println(f1);
		System.out.println(f2);
		a=a-2;
		while(a>0)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			System.out.println(f3);
			a=a-1;
		}
	}
}
class cube extends Thread
{
	int x;
	cube(int n)
	{
		x=n;
	}
	public void run()
	{
		int cub=x*x*x;
		System.out.println("cube of "+cub);
	}
}
class MultiThread
{
public static void main(String args[])
{
	table t1=new table(2);
	t1.start();
	Fibo f1=new Fibo(5);
	f1.start();
	cube c1=new cube(5);
	c1.start();

}
}