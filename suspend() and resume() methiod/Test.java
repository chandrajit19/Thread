// suspend and resume method
class MyThread extends Thread
   {
	 public void run()
	   {
		 try
		 {
			for(int i=1; i<=10; i++)
			 {
				System.out.println("Child thread");
				Thread.sleep(1000);
			 }
		 }
		 catch (Exception e)
		 {
			 System.out.println("Exception is caught ");
		 }
	   }
}
 class Test
 { public static void main(String args[])
	 {
	 MyThread t=new MyThread();
	         t.start();
			  t.suspend();
			  for(int i=1; i<=10; i++)
			   {
				System.out.println("Main thraed");
				
			   }
			  t.resume();
			 //  t.stop();
	 }

 }