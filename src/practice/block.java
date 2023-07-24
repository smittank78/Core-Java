package practice;

public class block 
{
	private static int a;
	public block() {
		System.out.println("constructor called...");
	}
	static {
		System.out.println("static block ....");
	}
	{
		a = 1;
		System.out.println("instance block ....");
	}
	
	public static int getA() {
		return a;
	}

	public static void setA(int a) {
		block.a = a;
	}

	public static void main(String[] args) 
	{
		System.out.println("main method executed");
		block a = new block();
		System.out.println("main method a : " + getA());
		
	}
}