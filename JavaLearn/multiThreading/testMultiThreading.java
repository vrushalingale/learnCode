package multiThreading;

public class testMultiThreading extends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		System.out.println(i);
		}
	}
		public static void main(String args[])
		{
			testMultiThreading t1=new testMultiThreading();
			testMultiThreading t2=new testMultiThreading();
			
			t1.start();
			t2.start();
		}
}


/* Multithreading in java is a process of executing multiple threads simultaneously.
   Threads share the same address space.
   Thread is lightweight.
   Cost of communication between the thread is low.
 

 * Thread Lifecycle
• start(): Ready to Run
• run(): We have to override run method and we need to
provide business logic in run method
• sleep(): We have to provide sleep time. It will pause
execution. When sleep time expires it will automatically go to
Ready to Run i.e Start method
• stop(): Dead state (Deprecated now)
• States of thread
• Born -> Ready to Start - > Running - > Sleep - > Dead state*/