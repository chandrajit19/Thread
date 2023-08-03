// if the child thread never enters sleeping state there is no effect of interrupt
class Multi extends Thread 
{
	public void run() 
	{
			for(int i=1; i<=5; i++)
			{
				System.out.println("child thread");	 
			}
			
          //there no sleep method here 
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
