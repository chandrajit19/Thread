//Implementing runnable interface 
class MyThread implements Runnable 
{
	
public  void run() 
	{   
		for(int i=1; i<=10; i++)
		{
          System.out.println("Child thread");
		}
		
	}
}
class App
{
	public static void main(String args[])
	{
		MyThread m=new MyThread();
		Thread t=new Thread(m);
                 t.start();      // implicitly call run()
		for(int i=1; i<=10; i++)
		{
			System.out.println("Main Thread");
		}

	}
}