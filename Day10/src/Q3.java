//3) create 3 threads in such a way that while one thread is executing, 2 threads cannot interfere. they should display output "Exec  0" to "Exec 5".

public class Q3 implements Runnable {

	
	synchronized public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.err.println("Exec"+i);
		}
	}
	public static void main(String[] args) {
		Q3 ref=new Q3();
		/*Thread th[]=new Thread[3];
		th[0]= new Thread(ref);
		th[1]= new Thread(ref);
		th[2]= new Thread(ref);
		for(int i=0;i<=2;i++)
			th[i].start(); */
		
		Q3 th=new Q3();
		Thread th1=new Thread(th);
		Thread th2=new Thread(th);
		Thread th3=new Thread(th);
		th1.start();
		th2.start();
		th3.start();
		
		
		

	}

}








