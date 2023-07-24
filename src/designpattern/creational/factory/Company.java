package designpattern.creational.factory;

public class Company {

	/*
	 * Creational Design Pattern
	 */
	
	public static void main(String[] args) {
		Systems systems = new Systems();
		
		Windows windows = (Windows) new Provider().getInstance("Windows");
		Linux linux = (Linux) new Provider().getInstance("Linux");
		Mac mac = (Mac) new Provider().getInstance("Mac");
		
		systems.add(windows);
		systems.add(linux);
		systems.add(mac);
		
		systems.findAll();
	}
}
