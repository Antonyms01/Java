//1) create a multi-threaded application by using Thread pool.create 2 threads. each thread should display 
//characters from A to J. [ make sure while one thread executes , other thread should not interfere ]

import java.util.concurrent.*;
	class myclass implements Runnable
	{
		synchronized static void disp()
		{
			for(char i='A';i<='J';i++)
			{
				System.out.println(i);
			}
		}

		@Override
		public void run() {
			disp();
			}	
	}
	
	public class Q1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService ex=Executors.newFixedThreadPool(2);
		for (int i=0;i<2;i++)
		{
			ex.execute(new myclass());
		}
		
	}

}