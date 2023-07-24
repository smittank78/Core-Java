package designpattern.creational.factory;

class Mac implements Computer
{
private String os;
	
	Mac() {
		super();
		this.os = "Mac";
	}

	@Override
	public String toString() {
		return "Mac [os=" + os + "]";
	}
	
}
