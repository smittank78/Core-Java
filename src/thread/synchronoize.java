package thread;

public class synchronoize {
	public static void main(String[] args) throws InterruptedException {
//		aSignleTon obje1 = aSignleTon.getInstance();
		aSynchronised obje2 = new aSynchronised();
		aSimpleClass obje3 = new aSimpleClass();

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				aSignleTon obje1 = aSignleTon.getInstance();

				for (int i = 0; i < 500; i++) {
					obje1.increase();
					try {
						obje2.increase();

						obje3.increase();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				aSignleTon obje1 = aSignleTon.getInstance();

				for (int i = 0; i < 500; i++) {
					obje1.increase();
					try {
						obje2.increase();

						obje3.increase();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("count from singleton class " + aSignleTon.count);
		System.out.println("count from synchronised method " + obje2.count);
		System.out.println("count from simple method " + obje3.count);
	}
}

class aSignleTon {
	private static aSignleTon a1 = new aSignleTon();

	private aSignleTon() {
		// TODO Auto-generated constructor stub
	}

	public static aSignleTon getInstance() {
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return a1;
	}

	static int count;

	public void increase() {
		count++;
	}
}

class aSynchronised {
	int count;

	public synchronized void increase() throws InterruptedException {
		count++;
	}
}

class aSimpleClass {
	int count;

	public void increase() throws InterruptedException {
		count++;
	}
}