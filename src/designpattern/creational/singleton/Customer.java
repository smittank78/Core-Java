package designpattern.creational.singleton;

import java.util.List;

public class Customer {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("executing....");
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				Data data1 = new Data(1, "a");
				Data data2 = new Data(2, "aa");
				Data data3 = new Data(3, "aaa");
				Data data4 = new Data(4, "aaa");
				Data data5 = new Data(5, "aaaa");
				Data data6 = new Data(6, "a");
				Data data7 = new Data(7, "aa");
				Data data8 = new Data(8, "aaa");
				Data data9 = new Data(9, "aaa");
				Data data0 = new Data(0, "aaaa");

				List<Data> data = List.of(data1, data2, data3, data4, data5, data6, data7, data8, data9, data0);

				Mideator instance = Mideator.getInstance();
				instance.setData(data);
			}
		});
		t1.start();
		t1.join();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				Mideator.getInstance().data("first");
				;
			}
		});
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				Mideator.getInstance().data("second");
			}
		});
		Thread t4 = new Thread(new Runnable() {

			@Override
			public void run() {
				Mideator.getInstance().data("third");
			}
		});
		
		t2.start();
		t3.start();
		t4.start();
	}

}
