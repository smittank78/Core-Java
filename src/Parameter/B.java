package Parameter;

public class B extends A {
	public B(int a) {
		super(a);
		System.out.println("B constructor : " + a);
	}
	void b()
	{
		System.out.println("b");
	}
	public static void main(String[] args) {
		B b1 = new B(1);
		b1.b();
		b1.a();		
	}
}
