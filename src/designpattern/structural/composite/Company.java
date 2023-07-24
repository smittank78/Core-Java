package designpattern.structural.composite;

public class Company {

	public static void main(String[] args) {
		Systems systems = new Systems();
		
		Windows windows = new Windows("smit");
		Linux linux = new Linux("root-smit", "smit");
		Mac mac = new Mac("root");
		
		systems.add(windows);
		systems.add(linux);
		systems.add(mac);
		
		systems.findAll();
	}
}
