//import java.util.concurrent.*;
////class myapp implements Runnable
////{
////	public void run()
////	{
////		perform();
////	}
////	void perform()
////	{
////	for(int i=0;i<5;i++)
////	{
////		System.out.println("Hello\t"+i+"\t"+Thread.currentThread());
////		try
////		{
////			Thread.sleep(100);
////		}
////		catch(InterruptedException ie)
////		{
////			System.out.println(ie);
////		}
////	}
////	}
////}
////public class Demo
////{
////	public static void main(String args[])
////	{
////		ExecutorService exec=Executors.newCachedThreadPool();
////
////		for(int i=0;i<3;i++)
////		{
////			exec.execute(new myapp());
////		}
////System.out.println("After submitting tasks");
////
////
////		System.out.println("After for loop");
////		exec.execute(new myapp());
////
/////*
////shutdown() prevents new tasks from being submitted to that Executor. The current thread ( e.g. main thread  ) will continue to run all tasks submitted before shutdown() was called. 
////*/
////		exec.shutdown(); // if u don't invoke, then jvm will not shutdown
////		System.out.println("done");
////		// exec.execute(new myapp()); don't give any task after shutdown
////		
////		
////	}
////}		
//
//
//
///*
//a FixedThreadPool uses a limited set of threads to execute the submitted tasks.
//*/
//import java.util.concurrent.*;
//class myapp implements Runnable
//{
//	public void run()
//	{
//		perform();
//	}
//	void perform()
//	{
//		for(int i=0;i<5;i++)
//		{
//			System.out.println("Hello\t"+i+"\t"+Thread.currentThread());
//		}
//	}
//}
//public class Demo
//{
//	public static void main(String args[])
//	{
//		ExecutorService exec=Executors.newFixedThreadPool(2);
//
//
//		for(int i=0;i<3;i++)
//		{
//			exec.execute(new myapp());
//		}
//System.out.println("After submitting tasks");
//
//	//exec.execute(new myapp());
//		exec.shutdown();
//	}
//}			





/*
with class lock
*/
//import java.util.concurrent.*;
//class myapp implements Runnable
//{
//	synchronized static void disp()
//	{
//		for(int i=0;i<5;i++)
//		{
//			System.out.println("Hello\t"+i+"\t"+Thread.currentThread());
//		}
//	}
//
//	public void run()
//	{
//		disp();
//	}
//}
//public class Demo
//{
//	public static void main(String args[])
//	{
//		//myapp m=new myapp();
//		ExecutorService exec=Executors.newFixedThreadPool(2);
//		for(int i=0;i<3;i++)
//		{
//			//exec.execute(m);
//			exec.execute(new myapp());
//		}
//		exec.shutdown();
//	}
//}			






//import java.util.concurrent.locks.*;
//public class Demo implements Runnable
//{
//	ReentrantLock mylock=new ReentrantLock();
//	public void run()
//	{
//		mylock.lock();
//		for(int i=0;i<5;i++)
//		{	
//			System.out.println("Hello"+i);
//			try
//			{
//				Thread.sleep(10);
//			}
//			catch(InterruptedException ie)
//			{
//				System.out.println(ie);
//			}
//		}
//		mylock.unlock();
//	}
//	public static void main(String args[])
//	{
//		Demo ob=new Demo();
//		Thread t1=new Thread(ob);
//		Thread t2=new Thread(ob);
//		t1.start();
//		t2.start();
//	}
//}



// Lock will not be effective as two threads are not sharing same object 
import java.util.concurrent.locks.*;
public class Demo implements Runnable
{
	ReentrantLock mylock=new ReentrantLock();
	public void run()
	{
		mylock.lock();
		for(int i=0;i<5;i++)
		{	
			System.out.println("Hello"+i);
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
		mylock.unlock();
	}
	public static void main(String args[])
	{
		Demo ob1=new Demo();
		Demo ob2=new Demo();
		Thread t1=new Thread(ob1);
		Thread t2=new Thread(ob2);
		t1.start();
		t2.start();
	}
}