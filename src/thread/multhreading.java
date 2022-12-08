package thread;

public class multhreading 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new threading());
		Thread t2 = new Thread(new threading());
		Thread t3 = new Thread(new threading());
		
		System.out.println("-->" + t1.getName());
		t1.start();
		System.out.println("-->" + t2.getName());
		t2.start();
		System.out.println("-->" + t3.getName());
		t3.start();
	}
}

class threading implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("run by : ");	
	}
}