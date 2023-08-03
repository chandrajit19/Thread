// programm withpiut inter thread communication
class MyThread extends Thread 
{  int sum=0;
    
	public void run()
	{   
		
		for(int i=1; i<=100; i++)
		{
			sum=sum+i;
		}
		
	} 
	
}
class Test
{  public static void main(String a[])  // throws InterruptedException
	{
		MyThread t=new MyThread();
		        t.start();
			//	t.join();  // join method is also not ideal solution , main thread would wait to finish child thread
			//	Thread.sleep(100);    // sleep method is not ideal solution
				System.out.println("Sum is = "+ t.sum);
				  
	}
}
	
