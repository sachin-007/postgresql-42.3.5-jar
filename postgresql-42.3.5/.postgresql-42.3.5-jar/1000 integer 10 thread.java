import java.util.*;
class dthread implements Runnable
{
	Thread t;
	int i,no,sum;
	int a[]=new int[1000];
	dthread(String s,int n)
	{
		Random rs=new Random();
		t=new Thread(this,s);
		no=n;
		int j=0;
		for(i=1;i<=1000;i++)
		{
			a[j]=rs.nextInt()%100;;
			j++;
		}
		t.start();
	}
	 public void run()
	 {
	 	for(i=0;i<=100;i++)
	 	{
	 		sum=sum+a[no];
	 		no++;
	 	}
	 	System.out.println("Sum="+sum);
	 	System.out.println("Avg="+sum/100);
	 }
}
public class threaddemo2
{
	public static void main(String args[])throws InterruptedException
	{
		dthread t1=new  dthread("g",1);
		t1.t.join();
		dthread t2=new  dthread("r",100);
		t2.t.join();
		dthread t3=new  dthread("s",200);
		t3.t.join();
		dthread t4=new  dthread("t",300);
		t4.t.join();
		dthread t5=new  dthread("p",400);
		t5.t.join();
		dthread t6=new  dthread("p",500);
		t5.t.join();
		dthread t7=new  dthread("p",600);
		t5.t.join();
		dthread t8=new  dthread("p",700);
		t5.t.join();
		dthread t9=new  dthread("p",800);
		t5.t.join();
		dthread t10=new  dthread("p",900);
		t5.t.join();
	}
}		
			 				
