//
//4) create a multi-threaded application by using Thread pool and ReentrantLock.create 2 threads. each thread should display numbers from 1 to 10. 
//[ make sure while one thread executes , other thread should not interfere ]
//Also when first thread displays nos. from 1 to 5 it should released the lock and allow other thread to display nos. from 1 to 5 and then
//previous thread will display nos. from 6 to 10 and so on.

//public class Q4 {
//
//	public static void main(String[] args) {
//		
//
//	}
//
//}



public class Q4 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread());
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello"+i);
		}
	}
	public static void main(String args[])
	{
		System.out.println(Thread.currentThread());
		Q4 t1=new Q4();
		t1.setName("first");
		t1.start();
	}
}