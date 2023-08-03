// programm  inter thread communication
class MyThread extends Thread 
{  int sum=0;
    
	public void run()
	{   
	synchronized(this)
		{  System.out.println("child thread begins execution");
		   for(int i=1; i<=100; i++)
		    {
			sum=sum+i;
	     	}
			System.out.println("child thread wants to give notification");
			this.notify();

		}
		
	} 
	
}
class Test
{  public static void main(String a[])  throws InterruptedException
	{
		MyThread t=new MyThread();
		        t.start();
         synchronized(t)
		{
		 System.out.println("main thread call wait");
		 t.wait();
		 System.out.println("main thread receive notification");	
		 System.out.println("Total is = "+t.sum);
		}
		
	}
}
	

