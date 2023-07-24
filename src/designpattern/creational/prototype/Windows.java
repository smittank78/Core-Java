package designpattern.creational.prototype;

public class Windows implements Cloneable{
	private String os;
	private String features;

	public Windows() {
		super();
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getFeatures() {
		return features;
	}

	public void loadFeatures() throws InterruptedException {
		System.out.println("features loading....");
		
		Thread.sleep(10000);
		this.features = "All Features Available now...";
		System.out.println("Features Loaded...");
	}

	@Override
	protected Windows clone() throws CloneNotSupportedException {
		return (Windows)super.clone();
	}
	
}
