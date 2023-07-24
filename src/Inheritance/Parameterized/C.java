package Inheritance.Parameterized;

public interface C 
{
	default String defaultMethod(String s) {
		return s;
	}
	static String staticMethod(String s) {
		return s;
	}
}