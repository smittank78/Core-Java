package thread;

public class lambda 
{
	public static void main(String[] args) 
	{
		
		Thread t1 = new Thread(() -> {
			for(int i=0;i<5;i++)
			{
				System.out.println("thread-1");
			}
		},"first-Thread");
	
		Thread t2 = new Thread(() -> {
			for(int i=0;i<5;i++)
			{
				System.out.println("thread-2");
			}
		},"second-Thread");
		
		/* set thread name
		t1.setName("thread-t1");
		t2.setName("thread-t2");
		*/
		System.out.println("t1 thread name : " + t1.getName());
		System.out.println("t2 thread name : " + t2.getName());

		/*default Priority = 5
			1 - least Priority
			2 - highest Priority
		*/
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("t1 thread Priority : " + t1.getPriority());
		System.out.println("t2 thread Priority : " + t2.getPriority());

		
		t1.start();
		t2.start();
				
		for(int i=0;i<5;i++)
		{
			System.out.println("thread-main");
		}
	}
}