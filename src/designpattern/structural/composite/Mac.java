package designpattern.structural.composite;

public class Mac implements Computer {
	private String os;
	private String rootUser;

	private Mac() {
		this.os = "Mac";
	}

	public Mac(String rootUser) {
		this();
		this.rootUser = rootUser;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getRootUser() {
		return rootUser;
	}

	public void setRootUser(String rootUser) {
		this.rootUser = rootUser;
	}

	@Override
	public String toString() {
		return "Mac [os=" + os + ", rootUser=" + rootUser + "]";
	}

	@Override
	public String geInformation() {
		 return this.toString();

	}

}
