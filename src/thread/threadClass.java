package thread;

public class threadClass 
{
	public static void main(String[] args) 
	{
		Thread t1 = new hi();
		Thread t2 = new hello();
		
		t1.start();
		t2.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("thread-main");
		}
	}
}

class hi extends Thread
{
	@Override
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("thread-1");
		}
	}
}

class hello extends Thread
{
	@Override
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("thread-2");
		}
	}
}
