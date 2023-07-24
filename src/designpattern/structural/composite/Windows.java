package designpattern.structural.composite;

public class Windows implements Computer {

	private String os;
	private String administrator;

	private Windows() {
		super();
		this.os = "Windows";
	}

	public Windows(String administrator) {
		this();
		this.administrator = administrator;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getAdministrator() {
		return administrator;
	}

	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}

	@Override
	public String toString() {
		return "Windows [os=" + os + ", administrator=" + administrator + "]";
	}

	@Override
	public String geInformation() {
		 return this.toString();

	}
}
