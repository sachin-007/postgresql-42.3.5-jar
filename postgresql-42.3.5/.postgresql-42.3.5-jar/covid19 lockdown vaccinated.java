class  fir extends Thread
{
public void run()
{
	for(int i=0;i<=10;i++)
	{
		
		
			System.out.println("COVID-19");
		
	}
}
}
class  sec extends Thread
{
public void run()
{
	for(int i=0;i<=20;i++)
	{
			System.out.println("LOCK-DOWN");
	}
}
}
class  thi extends Thread
{
public void run()
{
	for(int i=0;i<=30;i++)
	{
			System.out.println("Vaccinated");
		
	}
}
}
class covid
{
public static void main(String args[])
{
	fir t1=new fir();
	t1.start();
	sec t2=new sec();
	t2.start();
	thi t3=new thi();
	t3.start();
	}
}