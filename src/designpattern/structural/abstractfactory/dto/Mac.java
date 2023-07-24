package designpattern.structural.abstractfactory.dto;

public class Mac implements Computer {
	private String os;

	public Mac() {
		super();
		this.os = "Mac";
	}

	@Override
	public String geInformation() {
		return this.os;
	}


}
