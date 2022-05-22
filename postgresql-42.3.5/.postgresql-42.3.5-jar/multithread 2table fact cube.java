import java.util.Random;
class table2 extends Thread
{
 int x; 
 x = 2;

 public void run()
 {
    for(int i=1; i <= 10; i++)  
    {  
    //prints table of the entered number      
    tablef2=(num*i);  
    }  
 System.out.println("table of 2" + tablef2 );
 }
}


class Cube extends Thread
{
 int x;
 Cube(int n)
 {x = n;
 }
 public void run()
 {
 int cub = x * x * x;
 System.out.println("Cube of " + x + " = " + cub );
 }
}

class fact extends Thread
{
 int x;
 fact(int n)
 {x = n;
 }
 public void run()
 int i,fact=1;  
  int x=5;
  for(i=1;i<=x;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}


public class Thr {
 public static void main(String args[])
 {
 Number n = new Number();
 n.start();
 }
}
