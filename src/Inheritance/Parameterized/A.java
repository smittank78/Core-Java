package Inheritance.Parameterized;

public class A 
{
	int a;	
	static {
		System.out.println("static block of class a");
	}
	public A(int a) {
		this.a = a;
	System.out.println("A constructor : " + a);
	}
	void a()
	{		
		System.out.println("a");
	}
}