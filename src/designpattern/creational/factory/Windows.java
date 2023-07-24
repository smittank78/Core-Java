package designpattern.creational.factory;

public class Windows implements Computer {


private String os;
	
	Windows() {
		super();
		this.os = "Windows";
	}

	@Override
	public String toString() {
		return "Windows [os=" + os + "]";
	}
}
