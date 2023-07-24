package Inheritance.Parameterized;

public class B extends A implements C{
	int a;
	public B(int a) {
		super(a);
		System.out.println("B constructor : " + a);
	}
	void b()
	{
		System.out.println(C.super.defaultMethod("class-b called default method of interface-c"));
		System.out.println("b" + super.a);
	}
	public static void main(String[] args) {
		B b1 = new B(1);
		b1.b();
		b1.a();		
	}
}
