package designpattern.structural.composite;

public class Linux implements Computer {

	private String os;
	private String rootUser;
	private String user;

	private Linux(String rootUser) {
		super();
		this.os = "Linux";
		this.rootUser = rootUser;
	}

	public Linux(String rootUser, String user) {
		this(rootUser);
		this.user = user;
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

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Linux [os=" + os + ", rootUser=" + rootUser + ", user=" + user + "]";
	}
	@Override
	public String geInformation() {
		 return this.toString();

	}

}
