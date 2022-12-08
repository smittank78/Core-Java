package thread;

public class anonymous {

	public static void main(String[] args) throws InterruptedException 
	{
		Thread t1 = new Thread(){
			public void run() 
			{
				for(int i=0;i<5;i++)
				{
					System.out.println("thread-1");
				}
			}
		} ;
		
		Thread t2 = new Thread() {
			public void run() 
			{
				for(int i=0;i<5;i++)
				{
					System.out.println("thread-2");
				}
			}
		} ;
		
		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println("thread one alive : " + t1.isAlive() + "  thread two alive : " + t2.isAlive());
		System.out.println("thread-completed");
	}
}