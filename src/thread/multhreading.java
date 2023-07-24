package thread;

public class multhreading 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new threading(),"thread-1");
		Thread t2 = new Thread(new threading(),"thread-2");
		Thread t3 = new Thread(new threading(),"thread-3");
		Thread t4 = new Thread(new threading(),"thread-4");
		Thread t5 = new Thread(new threading(),"thread-5");
		Thread t6 = new Thread(new threading(),"thread-6");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t6.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t6.start();	
		t5.start();	
		
	}
}

class threading implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("run by : " + Thread.currentThread().getName());	
		for(int i =0 ; i<10 ; i++)
			System.out.println(i + " " + Thread.currentThread().getName());
	}
	
}