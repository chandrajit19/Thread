class Multi extends Thread 
{
	public void run() 
	{  
		for(int i=1; i<=10; i++)
		{
		  System.out.println("Child thread");
		}
	}
	public void start()
	{
        for(int i=1; i<=10; i++)
		{
		  System.out.println("Started");
		}
	}
}

class Demo
{ 
	public static void main(String args[])
	{
		Multi t=new Multi();
		t.start();  // not multithreading
		
        
		 for(int i=1; i<=10; i++)
		{
		  System.out.println("main thread");
		}
	}
}