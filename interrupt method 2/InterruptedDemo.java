// it would wait to enetr sleeping state and then would interrupt
class Multi extends Thread 
{
	public void run() 
	{
			for(int i=1; i<=10000; i++)
			{
				System.out.println("child thread");	 
			}
			System.out.println("child wants to sleep");
             try
             {
				Thread.sleep(1000);  // 1000ms=1s
             }
		    catch (InterruptedException e)
		     {
			    System.out.println("child got interrupted ");
		     }
	}   
}

class InterruptedDemo
{
	public static void main(String a[])
	{
		Multi t=new Multi();
		t.start();
		t.interrupt(); //  here child is intetrrupted 

		for(int i=1; i<=5; i++)
			{
				System.out.println("main thread ");
			}
	}

}
