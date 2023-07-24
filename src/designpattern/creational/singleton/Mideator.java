package designpattern.creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;


public class Mideator {

	private static List<Data> data = new ArrayList<>();
	
	private static Mideator mideator = null;
	
	private ReentrantLock lock = new ReentrantLock();
	
	private Mideator() {
		super();
	}
	static Mideator getInstance(){
		System.out.println(mideator);
		if(mideator == null)
		{
			System.out.println("instance created");
			mideator = new Mideator();
			return mideator;
		}
		else
		{
			System.out.println("instance returned");
			return mideator;
		}
		
	}
	public void setData(List<Data> data) {
		this.data.addAll(data);
		System.out.println(data.size());
	}
	void data(String id)
	{
		lock.lock();
		this.data.forEach(a -> {
			System.out.println(	Thread.currentThread().getName() + " executed " + a.getNumber() + " - " + a.getName());
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.getMessage();
			}
		});
		lock.unlock();
	}
}
