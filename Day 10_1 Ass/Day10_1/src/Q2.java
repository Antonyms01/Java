//2) create a multi-threaded application by using Thread pool.create 2 threads. each thread should display
//numbers from 1 to 10. [ make sure while one thread executes , other thread should not interfere ]
//Also when first thread displays nos. from 1 to 5 it should released the lock and allow other thread to 
//display nos. from 1 to 5 and then previous thread will display nos. from 6 to 10 and so on.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class myclass1 implements Runnable
{
	
	synchronized public void disp()
	{
	
		for(int i=0;i<=10;i++)
	{
		if(i==6)
			try
			{
			wait();
				
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
			
		System.out.println(i);
		notifyAll();
		
	  }
	
	}

	@Override
	public void run() {
		disp();
		
	}	
}



public class Q2 {
 
	public static void main(String[] args) {
		ExecutorService ex=Executors.newFixedThreadPool(2);
		myclass1 m=new myclass1();
		for(int i=0;i<2;i++)
		{
			ex.execute(m);
		}
		ex.shutdown();
		

	}

}
