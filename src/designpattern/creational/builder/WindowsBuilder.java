package designpattern.creational.builder;

public class WindowsBuilder {

	String version;
	String ram;
	String storage;
	String price;
	String ip;
	String administrator;

	public WindowsBuilder setVersion(String version) {
		this.version = version;
		return this;
	}

	public WindowsBuilder setRam(String ram) {
		this.ram = ram;
		return this;
	}

	public WindowsBuilder setStorage(String storage) {
		this.storage = storage;
		return this;
	}

	public WindowsBuilder setPrice(String price) {
		this.price = price;
		return this;
	}

	public WindowsBuilder setIp(String ip) {
		this.ip = ip;
		return this;
	}

	public WindowsBuilder setAdministrator(String administrator) {
		this.administrator = administrator;
		return this;
	}

	public Windows create() {
		return new Windows(this);
	}

}
