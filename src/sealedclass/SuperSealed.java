package sealedclass;

public sealed class SuperSealed permits Sub1,Sub2,Sub3
{
	public void superSealed() 
	{
		System.out.println("super sealed class");
	}
}