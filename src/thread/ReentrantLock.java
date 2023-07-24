package thread;

public class ReentrantLock {

	public static void main(String[] args) throws InterruptedException {
		
	Log l = new Log();
	
	/*
	 * thread t1 and t2 are calling non-locking method
	 */
	Thread t1 = new Thread(() -> {
		for(int i=1;i<=5000;i++)
		{
			l.increaseWithoutLock();
		}
	});
	
	Thread t2 = new Thread(() -> {
		for(int i=1;i<=5000;i++)
		{
			l.increaseWithoutLock();
		}
	});	
	/*
	 * thread t3 and t4 are calling locking method
	 */
	Thread t3 = new Thread(() -> {
		for(int i=1;i<=5000;i++)
		{
			l.increaseWithLocking();
		}
	});
	
	Thread t4 = new Thread(() -> {
		for(int i=1;i<=5000;i++)
		{
			l.increaseWithLocking();
		}
	});	
	t1.start();
	t2.start();

	t3.start();
	t4.start();
	
	t1.join();
	t2.join();
	t3.join();
	t4.join();
		
	System.out.println("Expected Count : 10000" );
	System.out.println("Withot Lock : " + Log.countWithoutLock);	
	System.out.println("With Lock : " + Log.countWithLock);	
	
	}
	
}

class Log
{
	private static java.util.concurrent.locks.ReentrantLock lock = new java.util.concurrent.locks.ReentrantLock();
	static int countWithoutLock;
	static int countWithLock;
	
	/*
	 * increase count without locking
	 */
	void increaseWithoutLock()
	{
		countWithoutLock++;
	}
	/*
	 * increase count with locking
	 */
	void increaseWithLocking()
	{
		lock.lock();
		countWithLock++;
		lock.unlock();
	}	
}
