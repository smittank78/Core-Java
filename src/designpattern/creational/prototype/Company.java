package designpattern.creational.prototype;

public class Company {

	/*
	 * Creational Design Pattern
	 */

	public static void main(String[] args) throws InterruptedException {
		Windows windows = new Windows();
		System.out.println("creating object ");
		windows.setOs("Windows");
		windows.loadFeatures();

		System.out.println("object created");

		try {
			Windows clonedObject = windows.clone();
			System.out.println("object cloned");
		}catch (Exception e) {
			// TODO: handle exception
		}

	}
}
