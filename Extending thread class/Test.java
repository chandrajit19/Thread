// Extending thread class
class MyThread implements Runnable 
{
 	
public  void run() 
	{   
		for(int i=1; i<=100; i++)
		{
          System.out.println("Child thread");
		}
		
	}
}
class Test
{
	public static void main(String args[])
	{
		MyThread m=new MyThread();
		Thread t=new Thread(m);

                t.start();      // implicitly call run()
		for(int i=1; i<=100; i++)
		{
			System.out.println("Main Thread");
		}

	}
}