package thread;

public class synchronoize 
{
	public static void main(String[] args) throws InterruptedException 
	{
		a obje1 = new a();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
			  for (int i = 0; i < 500; i++) {
				obje1.increase();
			}	
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
			  for (int i = 0; i < 500; i++) {
				obje1.increase();
			}	
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("count : " + obje1.count);
	}
}

class a 
{
	int count;
	public void increase()
	{
		count++;
	}
	/* try this also
	public synchronized void increase()
	{
		count++;
	}
	*/
}