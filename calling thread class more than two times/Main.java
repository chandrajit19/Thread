class Multi extends Thread 
{
	public  void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("child thread");
		}
	}
}
class Main
{  
	public static void main(String a[])
	{
		Multi t1=new Multi();
		Multi t2=new Multi();
		t1.start();
		t2.start();
		//t1.start(); // exception

        for(int i=1; i<=10; i++)
		{
			System.out.println("main thread");
		}
	}

}