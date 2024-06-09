/*5) create 2 threads
	one thread will display 1 to 50
	second thread will display 50 to 1
both the threads should start simultaneously.
*/

public class Q5 implements Runnable {

	synchronized public void run()
	{
		if(Thread.currentThread().getName().equalsIgnoreCase("First"))
		{
		for(int i=1;i<=50;i++)
		{
			System.out.println(i);
		}
		}
		if(Thread.currentThread().getName().equalsIgnoreCase("two"))
		for(int i=50;i>=0;i--)
		{
			System.err.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		Q5 ref=new Q5();
		Thread th=new Thread(ref);
		th.setName("First");
		Thread th1=new Thread(ref);
		th1.setName("Two");
		th.start();
		th1.start();
		

	}

}
