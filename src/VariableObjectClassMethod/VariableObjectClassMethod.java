package VariableObjectClassMethod;

import java.io.File;

public class VariableObjectClassMethod 
{
	int a = 10;   // instance
	static short b = 1;  //static variable
	public static void main(String[] args) 
	{
		float c = 19.56f;	// local variable
		System.out.println("Hit code :");
		System.out.println("local variable c : " + c);
		System.out.println("static variable b : " + b);
		
		VariableObjectClassMethod object = new VariableObjectClassMethod();  //object of class
		System.out.println("Instance variable a : " + object.a);
		
		File f = new File("/OppsPrograms/src/pattern/Pattern.java");
		System.out.println(f.exists());
	}
}