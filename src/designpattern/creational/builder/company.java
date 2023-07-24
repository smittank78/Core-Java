package designpattern.creational.builder;

public class company {

	/*
	 * Creational Design Pattern
	 */
	
	public static void main(String[] args) {
		Windows windows = new WindowsBuilder().setAdministrator("root").setRam("4GB").setPrice("100000")
				.setStorage("5TB").setIp("1.1.1.1.1.1.1.127").setVersion("windows10").create();

		System.out.println(windows.toString());

	}
}
