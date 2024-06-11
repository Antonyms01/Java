//3) create a multi-threaded application by using Thread pool and ReentrantLock (explicit locking) .
//create 2 threads. each thread should display characters from A to J. [ make sure while one thread 
//executes , other thread should not interfere ]



import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;
//
//ReentrantLock l=new ReentrantLock();
//	
//	public class myclass2 implements Runnable{
//		
//		public void run() {
//			disp();
//			
//			
//		}
//		
//		
// void disp()
//{
//	ReentrantLock l=new ReentrantLock();
//	l.lock();
//	for(char i='A';i<='j';i++)
//	{
//		System.out.println(i);
//	}
//	
//	l.unlock();

//}
//
// 
// public class Q3 {
//	public static void main(String[] args) {
//		
//		ExecutorService ex=Executors.newFixedThreadPool(2);
//	
//		myclass2 m2=new myclass2();
//		for(int i=0;i<2;i++)
//		{
//		ex.execute(m2);
//		}
//		ex.shutdown();
//	}
//}
//}




import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;
class myapp implements Runnable
{
	ReentrantLock lock=new ReentrantLock();
	public void run()
	{
		lock.lock();
		perform();
		lock.unlock();
	}
	void perform()
	{
		for(char ch='A';ch<='J';ch++)
		{
			System.out.println(ch);
		}
		System.out.println("*************************");
	}
}
public class myclass2
{
	public static void main(String args[])
	{
		ExecutorService exec=Executors.newFixedThreadPool(2);

		myapp m=new myapp();
		for(int i=0;i<2;i++)
		{
			exec.execute(m);
		}

		exec.shutdown();
	}
}			
