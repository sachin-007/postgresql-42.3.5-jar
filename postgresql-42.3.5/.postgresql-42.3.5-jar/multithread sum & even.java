class even extends Thread
{
	int a;
	even(int a)
	{
		this.a=a;
	}	
		public void run()
		{
			System.out.println("First even numbers"+a+"are as");
			for(int i=0;i<=a;i+=2)
			System.out.println(+i);
		}
}


class sum extends Thread
{
	int a;
	public int s;
	sum(int a)
	{
		this.a=a;
	}	
		public void run()
		{
			System.out.println("sum of "+a+"integers are as");
			for(int i=a;i>=0;i--)
				
			s=s+i;
			System.out.println(s);
		}
}
	

class demothread
{
	public static void main(String args[])throws Exception
	{
		even t1=new even(50);
		t1.start();
		sum t2=new sum(10);
		t2.start();
		
	}
}										
				
	
