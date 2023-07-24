package designpattern.creational.factory;

class Linux implements Computer{

	private String os;
	
	Linux() {
		super();
		this.os = "Linux";
	}

	@Override
	public String toString() {
		return "Linux [os=" + os + "]";
	}
	
	
	
}
