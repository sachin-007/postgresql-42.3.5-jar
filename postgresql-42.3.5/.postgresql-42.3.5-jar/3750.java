import java.util.Random;


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


class odd extends Thread
{
   int a;
   odd(int a)
   {
      this.a=a;
   }  
      public void run()
      {
         System.out.println("First even numbers"+a+"are as");
         for(int i=1;i<=a;i+=2)
         System.out.println(+i);
      }
}


class 3750
{
      public static void main(String args[])
      {
         table t1=new table(3);
         t1.start();
         table t2=new table(7);
         t2.start();

         odd f1=new odd(50);
         f1.start();




         

      }
}