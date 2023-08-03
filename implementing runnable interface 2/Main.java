// implementing runnable interface
import java.util.*;
class Task1 implements Runnable
{
	public  void run()
	{
		System.out.println("Task 1");
		for(int i=0; i<=10; i++)
		{
			System.out.println(" + ");
		}
		System.out.println("Task 1 finished");
	}
}
class Task2 implements Runnable
	{   public  void run()
		{
		System.out.println("Task 2");
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr the number");
		int n=s.nextInt();
		if(n%2==0)
		{
			System.out.println(n + " is even number ");
		}
		else
		{
			System.out.println(n + " is odd number ");
		}
		System.out.println("Task 2 finished ");
		}
	}
class Task3 implements Runnable
{
        public  void run()

	{
		System.out.println("Task 3 ");

        for(int i=0; i<=10; i++)
		{
			System.out.println(" * ");
		}
		System.out.println("Task 3 finished");
	}
}

class Main
{
	public static void main(String args[])
	{
		Task1 t1=new Task1();
		Task2 t2=new Task2();
		Task3 t3=new Task3();
		Thread a=new Thread(t1);
		Thread b=new Thread(t2);
		Thread c=new Thread(t3);
		a.start();
		b.start();
		c.start();

	}
}

