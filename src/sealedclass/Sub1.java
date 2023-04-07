package sealedclass;

public sealed class Sub1 extends SuperSealed permits Sub4
{
	/*
	 * sealed and permits
	 * sealed : class must be extended by specified classes only
	 * permits : provide subclass name
	 * Restrict all classes to extend
	 * child classes must be sealed,non-sealed,final
	 */
	public void subSealed1() 
	{
		System.out.println("sub sealed - 1");
	}
}