package designpattern.structural.abstractfactory.dto;

public class Windows implements Computer {
	private String os;

	public Windows() {
		super();
		this.os = "Windows";
	}

	@Override
	public String geInformation() {
		return this.os;
	}

}
