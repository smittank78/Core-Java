package sealedclass;

public final class Sub5 extends Sub2
{
	public void subSealed3() 
	{
		superSealed();
		System.out.println("sub sealed - 3");
	}
	
	public static void main(String[] args) {
		new Sub5().subSealed3();
	}
}