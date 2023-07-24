package designpattern.structural.abstractfactory.dto;

public class Linux implements Computer {

	private String os;

	public Linux() {
		super();
		this.os = "Linux";
	}

	@Override
	public String geInformation() {
		return this.os;
	}

	

}
