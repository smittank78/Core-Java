public class block 
{
	private static int a;
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
		block a = new block();
		System.out.println("main method ...." + getA());
	}
}