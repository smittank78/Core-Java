package designpattern.creational.builder;

public class Windows {

	private String version;
	private String ram;
	private String storage;
	private String price;
	private String ip;
	private String administrator;
	
	public Windows(WindowsBuilder builder) {
		super();
		this.version = builder.version;
		this.ram = builder.ram;
		this.storage = builder.storage;
		this.price = builder.price;
		this.ip = builder.ip;
		this.administrator = builder.administrator;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getAdministrator() {
		return administrator;
	}
	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}
	@Override
	public String toString() {
		return "Windows [version=" + version + ", ram=" + ram + ", storage=" + storage + ", price=" + price + ", ip="
				+ ip + ", administrator=" + administrator + "]";
	}
	
	
	
	
	
}
