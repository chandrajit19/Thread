// Example of  Synchronized block 
class Table 
{
   void printTable(int n)
	{  
	   // 100 lines of code 
synchronized(this){
	try
		{
			for(int i=1; i<=5; i++)
		{
			System.out.println(n+"*"+i+"="+(n*i)+ Thread.currentThread().getName());

			Thread.sleep(1000);
		}
		}
		catch (Exception e)
		{
			System.out.println(" exception is caught");
		}
	// 100 lines of code	
	}
	}
}
class MyThread extends Thread
{
	Table t;
	MyThread(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class SyncDemo
{
	public static void main(String args[])
	{
		Table t=new Table();
		MyThread t1=new MyThread(t);
		MyThread t2=new MyThread(t);
		         t1.start();
				 t2.start();
	}
}

