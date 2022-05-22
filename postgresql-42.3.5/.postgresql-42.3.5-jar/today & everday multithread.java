import java.util.*;
import java.io.*;

class printtextthread extends Thread
{
	private Thread t;
	private String msg="";
	int n;
	printtextthread(String msg,int n)
	{
		this.msg=msg;
		this.n=n;
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=n;i++)
			{
				System.out.println(msg+" "+i+"times");
			}
			System.out.println();
		}
		
		catch(Exception e)
		{
			System.out.println("Exception occured");
		}
	}
	}
		class threaddemo
		{
			public static void main(String args[])
			{
				printtextthread t1=new printtextthread("Everyday i am better than before ",10);
				t1.start();
				printtextthread t2=new printtextthread("i am commited to my personal growth",20);
				t2.start();
				printtextthread t3=new printtextthread("today and everyday I am blessed",30);
				t3.start();
			}
		}
									
